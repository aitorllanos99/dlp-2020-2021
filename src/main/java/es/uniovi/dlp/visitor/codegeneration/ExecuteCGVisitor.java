package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Arithmetic;
import es.uniovi.dlp.ast.expressions.FieldAccess;
import es.uniovi.dlp.ast.expressions.Indexing;
import es.uniovi.dlp.ast.expressions.Invocation;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.VoidType;
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
            generator.pop(invocation.getType().sufixCode());
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
            stats.accept(this, null);

        generator.ret(funcDefinition.getType().getNumberOfBytes(), funcDefinition.getLocalBytes(), funcDefinition.getParamBytes());
        return null;
    }

    @Override
    public Object visit(Assignment assignment, Object param) {
        super.visit(assignment, param);
        generator.line(assignment.getLine());
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
        write.getExpression().accept(valueVisitor, param); //Sacamos el valor a imprimir
        generator.out(write.getExpression().getType().sufixCode());
        return null;
    }


    @Override
    public Object visit(IfElse ifElse, Object param) {
        generator.line(ifElse.getLine());
        generator.comment("' If statement");

        ifElse.getCondition().accept(valueVisitor, param);
        generator.jz(generator.getLabel());
        generator.id("label" + (generator.getLabel() - 1));
        generator.comment("'Body of the if branch");
        ifElse.getIfStatements().forEach(c -> c.accept(this, param));

        generator.jmp(generator.getLabel());
        generator.id("label" + (generator.getLabel() - 1));
        generator.comment("' Body of the else branch");
        ifElse.getElseStatements().forEach(c -> c.accept(this, param));

        return null;
    }

    @Override
    public Object visit(While whileStatement, Object param) {
        generator.line(whileStatement.getLine());
        generator.comment("' While statement");

        whileStatement.getCondition().accept(valueVisitor, param);
        generator.jz(generator.getLabel());
        generator.id("label" + (generator.getLabel() - 1));
        generator.comment("'Body of the while branch");

        whileStatement.getStatements().forEach(c -> c.accept(this, param));
        generator.jmp(generator.getLabel());
        generator.id("label" + (generator.getLabel() - 1));

        return null;
    }


}
