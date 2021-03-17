package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.Visitor;

public class Cast extends AbstractExpression implements Expression{
    private Expression expression;
    private Type type;

    public Cast(int line, int column, Type typeToCast, Expression expression) {
        super(line, column);
        this.type = typeToCast;
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public Type getType() {
        return type;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
