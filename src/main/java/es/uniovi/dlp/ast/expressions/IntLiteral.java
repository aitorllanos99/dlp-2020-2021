package es.uniovi.dlp.ast.expressions;

public class IntLiteral extends AbstractExpression implements Expression{
    public int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }
}
