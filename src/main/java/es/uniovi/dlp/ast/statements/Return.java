package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expressions;

import java.util.List;

public class Return extends  AbstractStatement {

    private Expressions expression;
    public Return(int line, int column, Expressions expression) {
        super(line, column);
        this.expression = expression;
    }
}
