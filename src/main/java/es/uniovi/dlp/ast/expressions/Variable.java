package es.uniovi.dlp.ast.expressions;

public class Variable extends AbstractExpression{

    private String ident;


    public Variable(int line, int column, String value) {
        super(line, column);
        this.ident = value;
    }
}
