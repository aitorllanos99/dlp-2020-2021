package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statements.Statement;

import java.util.List;

public class Invocation extends AbstractExpression implements Statement,Expression {
    public Variable name;
    public List<Expression> arguments;

    public Invocation(int line, int column, Variable name, List<Expression> arguments) {
        super(line, column);
        this.name = name;
        this.arguments = arguments;
    }
}
