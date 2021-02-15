package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statements.Statement;

import java.util.List;

public class Invocation extends AbstractExpression implements Statement {
    private Variable name;
    private List<Expression> arguments;

    public Invocation(int line, int column, Variable name, List<Expression> arguments) {
        super(line, column);
        this.name = name;
        this.arguments = arguments;
    }
}
