package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class While extends AbstractStatement implements Statement{

    public List<Statement> statements;
    public Expression condition;
    public While(int line, int column, List<Statement> statements,  Expression condition) {
        super(line, column);
        this.statements = statements;
        this.condition = condition;
    }
}
