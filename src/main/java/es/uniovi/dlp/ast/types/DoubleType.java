package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class DoubleType extends AbstractType implements Type{
    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
