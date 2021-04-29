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
        super.visit(fieldAccess, param);
        fieldAccess.getExpression1().getType().propertyOffset(fieldAccess.getProperty());
        generator.push(fieldAccess.getType().sufixCode(), fieldAccess.getExpression1().getType().propertyOffset(fieldAccess.getProperty()));
        generator.add(fieldAccess.getType().sufixCode());
        return null;
    }

    @Override
    public Object visit(Indexing indexing, Object param) {
        super.visit(indexing, param);
        indexing.getIndex().accept(valueCGVisitor,param);
        generator.push(indexing.getArray().getType().sufixCode(),indexing.getType().getNumberOfBytes());
        generator.mul("i");
        generator.add("i");
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        super.visit(variable, param);
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
