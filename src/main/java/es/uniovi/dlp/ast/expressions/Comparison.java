package es.uniovi.dlp.ast.expressions;

public class Comparison extends AbstractExpression implements Expression{
    public Expression expression1;
    public Expression expression2;
    public String operator;

    public Comparison(int line, int column, Expression expressions1, Expression expressions2, String operator) {
        super(line, column);
        this.expression1 = expressions1;
        this.expression2 = expressions2;
        this.operator = operator;
    }
}

