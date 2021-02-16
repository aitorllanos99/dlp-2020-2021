package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expressions;

import java.util.List;

public class Write extends  AbstractStatement {

    private List<Expressions> writeExpression;
    public Write(int line, int column, List<Expressions> writeExpression) {
        super(line, column);
        this.writeExpression = writeExpression;
    }
}
