package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expressions;

import java.util.List;

public class While extends AbstractStatement {

    private List<Statements> statements;
    private Expressions condition;
    public While(int line, int column, List<Statements> statements,  Expressions condition) {
        super(line, column);
        this.statements = statements;
        this.condition = condition;
    }
}
