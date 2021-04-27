package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.FieldAccess;
import es.uniovi.dlp.ast.expressions.Indexing;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor {
    private CodeGenerator generator;
    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator generator) {
        this.generator = generator;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    @Override
    public Object visit(FieldAccess fieldAccess, Object param) {
        return super.visit(fieldAccess, param);
    }

    @Override
    public Object visit(Indexing indexing, Object param) {
        return super.visit(indexing, param);
    }

    @Override
    public Object visit(Variable variable, Object param) {
        super.visit(variable,param);
        //Variable puede ser una funcion o una varDef
        if (variable.getDefinition().getScope() == 0)
            generator.pusha(((VarDefinition) variable.getDefinition()).getOffset());
        else {
            generator.pushBp();
            generator.push(variable.getType().sufixCode(), ((VarDefinition) variable.getDefinition()).getOffset());
            generator.add(variable.getType().sufixCode());
        }
        return null;
    }
}