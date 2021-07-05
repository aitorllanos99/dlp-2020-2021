package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor {
    private AddressCGVisitor addressVisitor;
    private ValueCGVisitor valueVisitor;
    private CodeGenerator generator;

    public ExecuteCGVisitor(CodeGenerator generator) {
        this.generator = generator;
        this.addressVisitor = new AddressCGVisitor(generator);
        this.valueVisitor = new ValueCGVisitor(generator);
        addressVisitor.setValueCGVisitor(valueVisitor);
        valueVisitor.setAddressCGVisitor(addressVisitor);
    }

    @Override
    public Object visit(Program program, Object param) {
        int fileName = param.toString().split("/").length - 1;
        generator.source(param.toString().split("/")[fileName]);
        for (var def : program.getDefinitions())
            if (def instanceof VarDefinition) def.accept(this, param);

        for (var def : program.getDefinitions()) {
            if (def instanceof FuncDefinition) {
                generator.comment("' Invocation to the " + def.getName() + " function");
                generator.call(def.getName());
                if (def.getName().equals("main")) generator.halt();
                def.accept(this, param);
            }
        }

        return null;
    }

    @Override
    public Object visit(VarDefinition varDefinition, Object param) {
        super.visit(varDefinition, param);
        generator.comment("' " + varDefinition.getName() + " :: " + varDefinition.getType().getName()
                + "( offset " + varDefinition.getOffset() + " )");

        return null;
    }

    @Override
    public Object visit(Invocation invocation, Object param) {
        generator.line(invocation.getLine());
        valueVisitor.visit(invocation, param);
        if (!(invocation.getType() instanceof VoidType))
            generator.pop(""); //Sino corrompe la memoria, no tiene tipo es void
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDefinition, Object param) {
        generator.line(funcDefinition.getLine());
        generator.id(funcDefinition.getName());
        generator.comment("' Parameters");
        for (var params : funcDefinition.getParameters())
            params.accept(this, null);
        generator.comment("' Local variables");
        for (var params : funcDefinition.getBodyVarDefinitions())
            params.accept(this, null);
        generator.enter(funcDefinition.getLocalBytes());
        for (var stats : funcDefinition.getStatementsList())
            stats.accept(this, funcDefinition.getType());

        generator.ret(funcDefinition.getType().getNumberOfBytes(), funcDefinition.getLocalBytes(), funcDefinition.getParamBytes());
        return null;
    }

    @Override
    public Object visit(Assignment assignment, Object param) {
        generator.line(assignment.getLine());
        //Exam ex1
        if (assignment.getLeftExpression() instanceof Variable && assignment.getRightExpression() instanceof Variable &&
                ((Variable) assignment.getLeftExpression()).getDefinition().getType() instanceof RecordType &&
                ((Variable) assignment.getRightExpression()).getDefinition().getType() instanceof RecordType) {
            RecordType address = (RecordType) ((Variable) assignment.getLeftExpression()).getDefinition().getType();
            RecordType value = (RecordType) ((Variable) assignment.getRightExpression()).getDefinition().getType();

            for (var f : address.getFields()) {
                //Direction
                FieldAccess left = new FieldAccess(assignment.getLine(), assignment.getColumn(), assignment.getLeftExpression(), f.getName());
                left.setType(f.getType());
                left.accept(addressVisitor, param);

                //Value
                FieldAccess right = new FieldAccess(assignment.getLine(), assignment.getColumn(), assignment.getRightExpression(), f.getName());
                right.setType(f.getType());
                right.accept(valueVisitor, param);


                generator.promoteTo(left.getType(), right.getType());
                generator.store(left.getType().sufixCode());
            }
            return null;
        }
        assignment.getLeftExpression().accept(addressVisitor, param); //Sacamos direccion de la izquierda
        assignment.getRightExpression().accept(valueVisitor, param); // Sacamos valor de la derecha
        generator.promoteTo(assignment.getLeftExpression().getType(), assignment.getRightExpression().getType());
        generator.store(assignment.getLeftExpression().getType().sufixCode());

        return null;
    }

    @Override
    public Object visit(Read read, Object param) {
        generator.line(read.getLine());
        generator.comment("' Read");
        read.getExpression().accept(addressVisitor, param); //Sacamos el valor a imprimir
        generator.in(read.getExpression().getType().sufixCode());
        generator.store(read.getExpression().getType().sufixCode());
        return null;
    }

    @Override
    public Object visit(Write write, Object param) {
        super.visit(write, param);
        generator.line(write.getLine());
        generator.comment("' Write");
        //Exam ex3
        if(write.getExpression() instanceof Variable &&
                ((Variable) write.getExpression()).getDefinition().getType() instanceof ArrayType &&
                ((ArrayType)((Variable) write.getExpression()).getDefinition().getType()).getArrayOf() instanceof CharType){
            for(int i=0; i<((ArrayType)((Variable) write.getExpression()).getDefinition().getType()).getSize();i++){
                IntLiteral index = new IntLiteral(write.getLine(), write.getColumn(), i);
                index.setType(new IntType(write.getLine(), write.getColumn()));

                Indexing ind = new Indexing(write.getLine(),write.getColumn(), write.getExpression(), index);
                ind.setType(new CharType(write.getLine(), write.getColumn()));
                ind.accept(valueVisitor,param);

                generator.out(ind.getType().sufixCode());
            }
            return null;
        }
        write.getExpression().accept(valueVisitor, param); //Sacamos el valor a imprimir
        generator.out(write.getExpression().getType().sufixCode());
        return null;
    }


    @Override
    public Object visit(IfElse ifElse, Object param) {
        generator.line(ifElse.getLine());
        generator.comment("' If statement");

        ifElse.getCondition().accept(valueVisitor, param);


        int labelElse = generator.getLabel();
        int labelFinElse = generator.getLabel();
        generator.jz(labelElse);
        generator.comment("'Body of the if branch");
        ifElse.getIfStatements().forEach(c -> c.accept(this, param));

        generator.jmp(labelFinElse);

        generator.id("label" + labelElse);
        generator.comment("' Body of the else branch");
        ifElse.getElseStatements().forEach(c -> c.accept(this, param));

        generator.id("label" + labelFinElse);

        return null;
    }

    @Override
    public Object visit(While whileStatement, Object param) {
        generator.line(whileStatement.getLine());
        generator.comment("' While statement");

        int whileLabel = generator.getLabel();
        int finWhileLabel = generator.getLabel();
        generator.id("label" + whileLabel);
        whileStatement.getCondition().accept(valueVisitor, param);
        generator.jz(finWhileLabel);

        generator.comment("'Body of the while branch");
        whileStatement.getStatements().forEach(c -> c.accept(this, param));
        generator.jmp(whileLabel);

        generator.id("label" + finWhileLabel);

        return null;
    }

    @Override
    public Object visit(Return returnStatement, Object param) {
        generator.line(returnStatement.getLine());
        generator.comment("' Return");

        returnStatement.getExpression().accept(valueVisitor, param);

        FuncType f = (FuncType) param; //Hay que ver si hay que hacer conversion implicita
        generator.promoteTo(f.getReturnType(), returnStatement.getExpression().getType());

        return null;
    }
}
