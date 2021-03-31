package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

public class RecordField extends AbstractASTNode implements Type{
    private String name;
    private Type type;
    private boolean alreadyDeclared;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
        alreadyDeclared = false;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setAlreadyDeclared(boolean alreadyDeclared) {
        this.alreadyDeclared = alreadyDeclared;
    }

    public boolean isAlreadyDeclared() {
        return alreadyDeclared;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
