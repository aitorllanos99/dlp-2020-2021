package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.Variable;

import java.util.List;

public class Invocation extends AbstractStatement {
    private Variable name;
    private List<Expression> arguments;

    public Invocation(int line, int column, Variable name, List<Expression> arguments) {
        super(line, column);
        this.name = name;
        this.arguments = arguments;
    }
}
