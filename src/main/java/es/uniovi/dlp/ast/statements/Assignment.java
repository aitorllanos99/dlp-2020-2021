package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expressions;

public class Assignment extends AbstractStatement {

    private Expressions expression1;
    private Expressions expression2;
    public Assignment(int line, int column,Expressions expression1,Expressions expression2) {
        super(line, column);
        this.expression1 =  expression1;
        this.expression2 = expression2;
    }
}
