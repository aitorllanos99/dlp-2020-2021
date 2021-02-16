package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

import java.util.ArrayList;
import java.util.List;

public class Invocation extends AbstractExpression {

    private List<Expressions> expressionsList = new ArrayList<Expressions>();
    private Variable variable; //Do we need to put the variable or not???
    private Type type;
    public Invocation(int line, int column, List<Expressions> expressions) {
        super(line, column);
        this.expressionsList = expressions;
    }
}
