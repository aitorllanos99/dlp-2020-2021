package es.uniovi.dlp.ast.expressions;

public class UnaryNot extends AbstractExpression implements Expression{
    public Expression expression;

    public UnaryNot(int line, int column, Expression expressions) {
        super(line, column);
        this.expression = expressions;
    }
}
