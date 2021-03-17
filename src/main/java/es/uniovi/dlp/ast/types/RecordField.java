package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.Visitor;

public class RecordField extends AbstractASTNode implements Type{
    private String name;
    private Type type;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
