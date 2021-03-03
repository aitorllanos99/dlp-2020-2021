package es.uniovi.dlp.ast.expressions;



public class FieldAccess extends AbstractExpression implements Expression{
    public Expression expression1;
    public Expression property;

    public FieldAccess(int line, int column, Expression expressions1 , Expression expressions2) {
        super(line, column);
        this.expression1 = expressions1;
        this.property = expressions2;

    }
}
