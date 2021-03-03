package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

public class Cast extends AbstractExpression implements Expression{
    private Expression expression;
    private Type type;
    public Cast(int line, int column, Type typeToCast, Expression expression) {
        super(line, column);
        this.type = typeToCast;
        this.expression = expression;
    }
}
