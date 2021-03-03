package es.uniovi.dlp.ast.expressions;



public class FieldAccess extends AbstractExpression implements Expression{
    private Expression expression1;
    private Expression property;

    public FieldAccess(int line, int column, Expression expressions1 , Expression expressions2) {
        super(line, column);
        this.expression1 = expressions1;
        this.property = expressions2;

    }
}
