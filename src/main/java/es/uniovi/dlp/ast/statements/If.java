package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expressions;

import java.util.List;

public class If extends AbstractStatement {

    private List<Statements> statementsIf;
    private List<Statements> statementsElse;
    private Expressions condition;
    public If(int line, int column,List<Statements> statementsIf,List<Statements> statementsElse, Expressions condition) {
        super(line, column);
        this.statementsIf = statementsIf;
        this.statementsElse = statementsElse;
        this.condition = condition;
    }
}
