package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class While extends AbstractStatement {
    private Expression condition;
    private List<Statement> statements;

    public While(int line, int column, Expression condition, List<Statement> statements) {
        super(line, column);
        this.condition = condition;
        this.statements = statements;
    }
}
