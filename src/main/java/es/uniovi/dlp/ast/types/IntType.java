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
    public Type arithmetic(Type type) {
        if (type instanceof IntType || type instanceof DoubleType || type instanceof CharType)
            return type;
        return null;
    }

    @Override
    public Type promotableTo(Type to) {
        if(to instanceof IntType)
            return to;
        return null;
    }

    @Override
    public boolean isIndexable() {
        return true;
    }

    @Override
    public boolean isReturnable() {
        return false;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this, param);
    }
}
