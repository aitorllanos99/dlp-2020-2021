package es.uniovi.dlp.ast.expressions;


import es.uniovi.dlp.visitor.Visitor;

public class FieldAccess extends AbstractExpression implements Expression{
    public Expression expression1;
    public Expression property;

    public FieldAccess(int line, int column, Expression expressions1 , Expression expressions2) {
        super(line, column);
        this.expression1 = expressions1;
        this.property = expressions2;

    }

    public Expression getExpression1() {
        return expression1;
    }

    public Expression getProperty() {
        return property;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
