package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class IntType extends AbstractType implements Type {
    public IntType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type cast(Type from) {
        if (from instanceof IntType || from instanceof DoubleType || from instanceof CharType)
            return from;
        return null;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this, param);
    }
}
