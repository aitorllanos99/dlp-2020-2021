package es.uniovi.dlp.ast.expressions;

public class CharLiteral extends AbstractExpression implements Expression{

    public Character value;


    public CharLiteral(int line, int column, Character value) {
        super(line, column);
        this.value = value;
    }
}
