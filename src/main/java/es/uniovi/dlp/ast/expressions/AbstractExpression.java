package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    private boolean Lvalue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
    public void setLvalue(boolean lvalue){
        this.Lvalue = lvalue;
    }

    public boolean getLValue() {
        return Lvalue;
    }
}
