package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class IntType extends AbstractType implements Type {
    private static final int INT_SIZE = 2;
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
        if(to instanceof FuncType){
            if(((FuncType) to).getReturnType() instanceof IntType)
                return ((FuncType) to).getReturnType();
        }
        if(to instanceof IntType)
            return to;
        return null;
    }

    @Override
    public Type comparison(Type leftType) {
        if(leftType instanceof IntType || leftType instanceof CharType || leftType instanceof DoubleType)
            return this;
        return null;
    }

    @Override
    public Type logical(Type type) {
        if(type instanceof IntType)
            return type;
        return null;
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public int getNumberOfBytes() {
        return INT_SIZE;
    }

    @Override
    public String sufixCode() {
        return "i";
    }

    @Override
    public Type assignment(Type type) {
        if(type instanceof IntType)
            return type;
        return null;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this, param);
    }
}
