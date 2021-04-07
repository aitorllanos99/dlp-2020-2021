package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
    private boolean Lvalue;
    private Type type;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
    public void setLvalue(boolean lvalue){
        this.Lvalue = lvalue;
    }

    public boolean getLValue() {
        return Lvalue;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
