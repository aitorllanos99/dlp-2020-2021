package es.uniovi.dlp.ast.expressions;

public class IntLiteral extends AbstractExpression{

    private Integer value;


    public IntLiteral(int line, int column, Integer value) {
        super(line, column);
        this.value = value;
    }
}
