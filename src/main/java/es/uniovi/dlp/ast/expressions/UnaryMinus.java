package es.uniovi.dlp.ast.expressions;

public class UnaryMinus extends AbstractExpression implements Expression{
    public Expression expression;

    public UnaryMinus(int line, int column, Expression expressions) {
        super(line, column);
        this.expression = expressions;
    }
}
