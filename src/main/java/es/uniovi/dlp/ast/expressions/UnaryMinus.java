package es.uniovi.dlp.ast.expressions;

public class UnaryMinus extends AbstractExpression {
    private Expressions expression;

    public UnaryMinus(int line, int column, Expressions expressions) {
        super(line, column);
        this.expression = expressions;
    }
}
