package es.uniovi.dlp.ast.expressions;

public class CharLiteral extends AbstractExpression{

    private Character value;


    public CharLiteral(int line, int column, Character value) {
        super(line, column);
        this.value = value;
    }
}
