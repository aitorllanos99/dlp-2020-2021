package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class ArrayType extends AbstractType implements Type{
    private Type arrayOf;
    private int size;

    public ArrayType(int line, int column, Type arrayOf, int size) {
        super(line, column);
        this.arrayOf = arrayOf;
        this.size = size;
    }

    public void setArrayOf(Type arrayOf) {
        this.arrayOf = arrayOf;
    }

    public Type getArrayOf() {
        return arrayOf;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Type indexing(Type indexingType) {
        if(indexingType instanceof IntType)
            return arrayOf;
        return super.indexing(indexingType);
    }

    @Override
    public boolean isArithmetic() {
        return false;
    }

    @Override
    public int getNumberOfBytes() {
        return arrayOf.getNumberOfBytes() * size;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
