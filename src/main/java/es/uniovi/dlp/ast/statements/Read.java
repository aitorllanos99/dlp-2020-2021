package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

public class Read extends AbstractStatement implements Statement{
    private Expression expression;

    public Read(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }
}
