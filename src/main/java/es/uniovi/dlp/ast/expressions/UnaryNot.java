package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class UnaryNot extends AbstractExpression implements Expression {
    private Expression expression;

    public UnaryNot(int line, int column, Expression expressions) {
        super(line, column);
        this.expression = expressions;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getOperator() {
        return "!";
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this, param);
    }
}
