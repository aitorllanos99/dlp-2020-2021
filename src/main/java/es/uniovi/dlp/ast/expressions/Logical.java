package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class Logical extends AbstractExpression implements Expression{
    private String operation;
    private Expression leftExpression;
    private Expression rightExpression;

    public Logical(int line, int column, Expression leftExpression , Expression rightExpression,String operation) {
        super(line, column);
        this.operation = operation;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public String getOperation() {
        return operation;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
