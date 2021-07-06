package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Arithmetic;
import es.uniovi.dlp.ast.expressions.FieldAccess;
import es.uniovi.dlp.ast.expressions.Indexing;
import es.uniovi.dlp.ast.expressions.Invocation;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.FuncType;
import es.uniovi.dlp.ast.types.RecordField;
import es.uniovi.dlp.ast.types.RecordType;
import es.uniovi.dlp.ast.types.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

/* -------Comentario Examen --------
Se ha añadido una plantilla de codigo en el ejecutar visitor, para la sentencia añadida previamente RegisterAssignment.
Esta hace las siguientes funciones:
  - Inlcuye la linea en la que se encuentra
  - Añade un comentario diciendo que se va a hacer un registerAssignment (para verlo en el mp mas facilmente, se puede eliminar)
  - Para cada campo que debe igualar, es decir para cada campo que tiene que poner el valor de otra estructura:
     - Hace un acceso a ese campo de donde obtiene la direccion a la cual acceder, estructura s
     - Hace un acceso al campo de la estructura r para obtener el valor a almacenar
     - Almacena el valor de r en s


 */
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

        generator.comment("' Invocation to the main function");
        generator.call("main");
        generator.halt();
        for (var def : program.getDefinitions()) {
            if (def instanceof FuncDefinition) {
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
        if (!(((FuncType)invocation.getType()).getReturnType() instanceof VoidType))
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
        super.visit(assignment, param);
        generator.line(assignment.getLine());
        assignment.getLeftExpression().accept(addressVisitor, param); //Sacamos direccion de la izquierda
        assignment.getRightExpression().accept(valueVisitor, param); // Sacamos valor de la derecha
        generator.promoteTo(assignment.getLeftExpression().getType(), assignment.getRightExpression().getType());
        generator.promoteTo(assignment.getRightExpression().getType(), assignment.getRightExpression().getType());
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

    @Override
    public Object visit(RegisterAssignment assignment, Object param) {
        generator.line(assignment.getLine());
        generator.comment("' Register Assignment");

        RecordType r = (RecordType) assignment.getRightExpression().getType();

        for(var fieldToSeek: r.getFields()){
            //Direction
            FieldAccess left = new FieldAccess(assignment.getLine(), assignment.getColumn(), assignment.getLeftExpression(), fieldToSeek.getName());
            left.setType(fieldToSeek.getType());
            left.accept(addressVisitor, param);

            //Value
            FieldAccess right = new FieldAccess(assignment.getLine(), assignment.getColumn(), assignment.getRightExpression(), fieldToSeek.getName());
            right.setType(fieldToSeek.getType());
            right.accept(valueVisitor, param);

            generator.store(left.getType().sufixCode());
        }
        return null;
    }
}
