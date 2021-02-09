package es.uniovi.dlp.ast.expressions;

public class UnaryNot extends AbstractExpression {
    private Expressions expression;

    public UnaryNot(int line, int column, Expressions expressions) {
        super(line, column);
        this.expression = expressions;
    }
}
