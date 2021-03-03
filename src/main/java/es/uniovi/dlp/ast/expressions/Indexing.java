package es.uniovi.dlp.ast.expressions;

public class Indexing extends AbstractExpression implements Expression{
    private Expression array;
    private Expression index;

    public Indexing(int line, int column, Expression array, Expression index) {
        super(line, column);
        this.array = array;
        this.index = index;
    }
}
