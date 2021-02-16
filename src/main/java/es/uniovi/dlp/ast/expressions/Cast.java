package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

public class Cast extends AbstractExpression {
    private Expressions expression;
    private Type type;
    public Cast(int line, int column, Type typeToCast, Expressions expression) {
        super(line, column);
        this.type = typeToCast;
        this.expression = expression;
    }
}
