package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {
    private int scope;
    public AbstractDefinition(int line, int column) {
        super(line, column);
    }


    public int getScope(){
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }
}
