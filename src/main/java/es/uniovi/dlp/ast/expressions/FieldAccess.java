package es.uniovi.dlp.ast.expressions;

public class FieldAccess extends AbstractExpression {
    private Expression expression;
    private String field;

    public FieldAccess(int line, int column, String field, Expression expression) {
        super(line, column);
        this.expression = expression;
        this.field = field;
    }
}
