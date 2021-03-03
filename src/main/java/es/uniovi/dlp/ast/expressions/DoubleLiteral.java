package es.uniovi.dlp.ast.expressions;

public class DoubleLiteral extends AbstractExpression implements Expression{

    private Double value;


    public DoubleLiteral(int line, int column, Double  value) {
        super(line, column);
        this.value = value;
    }
}
