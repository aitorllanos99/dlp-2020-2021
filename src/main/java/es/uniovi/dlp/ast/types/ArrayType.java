package es.uniovi.dlp.ast.types;

public class ArrayType extends AbstractType implements Type{
    public Type arrayOf;
    public int size;

    public ArrayType(int line, int column, Type arrayOf, int size) {
        super(line, column);
        this.arrayOf = arrayOf;
        this.size = size;
    }
}
