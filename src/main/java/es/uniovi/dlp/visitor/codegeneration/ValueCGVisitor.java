package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.types.FuncType;
import es.uniovi.dlp.visitor.AbstractVisitor;


public class ValueCGVisitor extends AbstractVisitor {
    private CodeGenerator generator;
    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator generator) {
        this.generator = generator;
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object param) {
        arithmetic.getLeftExpression().accept(this, param);
        generator.promoteTo(arithmetic.getLeftExpression().getType(), arithmetic.getType());
        arithmetic.getRightExpression().accept(this, param);
        generator.promoteTo(arithmetic.getRightExpression().getType(), arithmetic.getType());
        generator.arithmetic(arithmetic.getOperator(), arithmetic.getType().sufixCode());
        return null;
    }

    @Override
    public Object visit(Cast cast, Object param) {
        super.visit(cast, param);
        generator.promoteTo(cast.getExpression().getType(), cast.getTypeToCast());
        return null;
    }


    @Override
    public Object visit(CharLiteral charLiteral, Object param) {
        generator.push(charLiteral.getType().sufixCode(), charLiteral.getValue());
        return null;
    }

    @Override
    public Object visit(DoubleLiteral doubleLiteral, Object param) {
        generator.push(doubleLiteral.getType().sufixCode(), doubleLiteral.getValue());
        return null;
    }

    @Override
    public Object visit(IntLiteral intLiteral, Object param) {
        generator.push(intLiteral.getType().sufixCode(), intLiteral.getValue());
        return null;
    }

    @Override
    public Object visit(Comparison comparison, Object param) {
        super.visit(comparison, param);
        generator.comparison(comparison.getOperator(), comparison.getType().sufixCode());
        return null;
    }

    @Override
    public Object visit(Indexing indexing, Object param) {
        indexing.accept(addressCGVisitor,param);
        generator.load(indexing.getType().sufixCode());
        return null;
    }

    @Override
    public Object visit(Invocation invocation, Object param) {
       int contador = 0;
        for (var e : invocation.getArguments()) {
            e.accept(this, param);
            generator.promoteTo(((FuncType) invocation.getName().getType()).getParameters().get(contador).getType(),e.getType());
            contador++;
        }
        generator.call(invocation.getName().getIdent());
        return null;
    }
    @Override
    public Object visit(FieldAccess fieldAccess, Object param) {
        fieldAccess.accept(addressCGVisitor,param);
        generator.promoteTo(fieldAccess.getExpression1().getType(),fieldAccess.getType());
        generator.load(fieldAccess.getType().sufixCode());
        return null;
    }
    @Override
    public Object visit(Logical logical, Object param) {
        super.visit(logical, param);
        generator.logic(logical.getOperation());
        generator.promoteTo(logical.getType(),logical.getRightExpression().getType());
        return null;
    }

    @Override
    public Object visit(UnaryMinus unaryMinus, Object param) {
        super.visit(unaryMinus, param);
        generator.arithmetic(unaryMinus.getOperator(), unaryMinus.getType().sufixCode());
        return null;
    }

    @Override
    public Object visit(UnaryNot unaryNot, Object param) {
        super.visit(unaryNot, param);
        generator.logic(unaryNot.getOperator());
        return null;
    }

    @Override
    public Object visit(Variable variable, Object param) {
        super.visit(variable, param);
        variable.accept(addressCGVisitor, param);
        generator.load(variable.getType().sufixCode());
        return null;
    }
}
