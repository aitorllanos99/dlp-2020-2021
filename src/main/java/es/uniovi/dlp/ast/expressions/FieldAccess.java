package es.uniovi.dlp.ast.expressions;



public class FieldAccess extends AbstractExpression {
    private Expressions expression1;
    private Expressions property;

    public FieldAccess(int line, int column, Expressions expressions1 , Expressions expressions2) {
        super(line, column);
        this.expression1 = expressions1;
        this.property = expressions2;

    }
}
