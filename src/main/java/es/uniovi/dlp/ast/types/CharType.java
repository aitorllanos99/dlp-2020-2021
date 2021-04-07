package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class CharType extends AbstractType implements Type{
    public CharType(int line, int column) {
        super(line, column);
    }


    @Override
    public Type cast(Type from) {
        if(from instanceof IntType ||from instanceof CharType)
            return from;
        return null;
    }

    @Override
    public Type arithmetic(Type type) {
        if(type instanceof CharType)
            return type;
        return super.arithmetic(type);
    }

    @Override
    public Type promotableTo(Type to) {
        if(to instanceof CharType)
            return to;
        return null;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
