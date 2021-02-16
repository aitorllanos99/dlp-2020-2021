package es.uniovi.dlp.ast.expressions;


public class Logical extends AbstractExpression {
    private String operation;
    private Expressions expression1;
    private Expressions expression2;
    public Logical(int line, int column,  Expressions expression1, Expressions expression2, String operation) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
        this.operation = operation;
    }
}
