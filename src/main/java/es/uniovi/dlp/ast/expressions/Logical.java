package es.uniovi.dlp.ast.expressions;

public class Logical extends AbstractExpression implements Expression{
    public String operation;
    public Expression leftExpression;
    public Expression rightExpression;

    public Logical(int line, int column, Expression rightExpression , Expression leftExpression,String operation) {
        super(line, column);
        this.operation = operation;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
