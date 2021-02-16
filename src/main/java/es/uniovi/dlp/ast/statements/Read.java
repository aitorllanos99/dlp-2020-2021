package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expressions;

import java.util.List;

public class Read extends  AbstractStatement {

    private List<Expressions> readExpression;
    public Read(int line, int column, List<Expressions> readExpression) {
        super(line, column);
        this.readExpression = readExpression;
    }
}
