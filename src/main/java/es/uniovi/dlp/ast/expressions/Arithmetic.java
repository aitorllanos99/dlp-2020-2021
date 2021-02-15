package es.uniovi.dlp.ast.expressions;

public class Arithmetic extends AbstractExpression {
    private String operation;
    private Expression leftExpression;
    private Expression rightExpression;

    public Arithmetic(int line, int column, String operation, Expression leftExpression, Expression rightExpression) {
        super(line, column);
        this.operation = operation;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
