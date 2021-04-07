package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class DoubleType extends AbstractType implements Type {
    public DoubleType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type cast(Type from) {
        if (from instanceof IntType || from instanceof DoubleType)
            return from;
        return null;
    }

    @Override
    public Type arithmetic(Type type) {
        if (type instanceof DoubleType || type instanceof IntType)
            return type;
        return null;
    }

    @Override
    public Type promotableTo(Type to) {
        if (to instanceof DoubleType || to instanceof CharType || to instanceof IntType)
            return to;
        return null;
    }

    @Override
    public Type comparison(Type leftType) {
        if (leftType instanceof IntType || leftType instanceof CharType || leftType instanceof DoubleType)
            return new IntType(line,column);
        return null;
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
