package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class TernaryOperator extends AbstractExpression implements Expression {
    private Expression condition;
    private Expression expressionTrue;
    private Expression expressionFalse;

    public TernaryOperator(int line, int column, Expression condition, Expression expressionTrue, Expression expressionFalse) {
        super(line, column);
        this.condition = condition;
        this.expressionTrue = expressionTrue;
        this.expressionFalse = expressionFalse;
    }

    public Expression getCondition() {
        return condition;
    }

    public Expression getExpressionTrue() {
        return expressionTrue;
    }

    public Expression getExpressionFalse() {
        return expressionFalse;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public void setExpressionTrue(Expression expressionTrue) {
        this.expressionTrue = expressionTrue;
    }

    public void setExpressionFalse(Expression expressionFalse) {
        this.expressionFalse = expressionFalse;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this, param);
    }
}
