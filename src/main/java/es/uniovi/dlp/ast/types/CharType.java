package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class CharType extends AbstractType implements Type {
    private static final int CHAR_SIZE = 1;
    public CharType(int line, int column) {
        super(line, column);
    }


    @Override
    public Type cast(Type from) {
        if (from instanceof IntType || from instanceof CharType)
            return from;
        return null;
    }

    @Override
    public Type arithmetic(Type type) {
        if (type instanceof CharType || type instanceof IntType)
            return type;
        return super.arithmetic(type);
    }

    @Override
    public Type comparison(Type leftType) {
        if (leftType instanceof IntType || leftType instanceof CharType || leftType instanceof DoubleType)
            return new IntType(line,column);
        return null;
    }

    public Type assignment(Type type) {
        if(type instanceof CharType)
            return type;
        return null;
    }

    @Override
    public int getNumberOfBytes() {
        return CHAR_SIZE;
    }

    @Override
    public String sufixCode() {
        return "b";
    }

    @Override
    public String getName() {
        return "char";
    }

    @Override
    public Type promotableTo(Type to) {
        if(to instanceof FuncType){
            if(((FuncType) to).getReturnType() instanceof CharType)
                return ((FuncType) to).getReturnType();
        }
        if (to instanceof CharType)
            return to;
        return null;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this, param);
    }
}
