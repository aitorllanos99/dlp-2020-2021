package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.statements.Read;
import es.uniovi.dlp.ast.statements.Write;
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
                generator.halt();
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
        super.visit(read, param);
        generator.line(read.getLine());
        generator.comment("' Read");
        read.getExpression().accept(valueVisitor, param); //Sacamos el valor a imprimir
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
}
