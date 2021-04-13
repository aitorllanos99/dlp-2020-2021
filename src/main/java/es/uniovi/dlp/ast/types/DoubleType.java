package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class DoubleType extends AbstractType implements Type {
    private static final int DOUBLE_SIZE = 4;
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
        if(to instanceof FuncType){
            if(((FuncType) to).getReturnType() instanceof DoubleType)
                return ((FuncType) to).getReturnType();
        }
        if (to instanceof DoubleType)
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
    public Type assignment(Type type) {
        if (type instanceof DoubleType || type instanceof CharType || type instanceof IntType)
            return type;
        return null;
    }

    @Override
    public int getNumberOfBytes() {
        return DOUBLE_SIZE;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this, param);
    }
}
