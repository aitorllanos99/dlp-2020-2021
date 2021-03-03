package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.Variable;

import java.util.List;

public class Write extends AbstractStatement implements Statement{
    private Expression expression;

    public Write(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }
}
