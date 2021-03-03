package es.uniovi.dlp.ast.expressions;

public class Logical extends AbstractExpression implements Expression{
    private String operation;
    private Expression leftExpression;
    private Expression rightExpression;

    public Logical(int line, int column, Expression rightExpression , Expression leftExpression,String operation) {
        super(line, column);
        this.operation = operation;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
