package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractType extends AbstractASTNode implements Type {
    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type dot(String field) {
        return null;
    }

    @Override
    public Type cast(Type from) {
        return null;
    }

    @Override
    public Type indexing(Type indexingType) {
        return null;
    }

    @Override
    public Type comparison(Type leftType) {
        return null;
    }

    @Override
    public Type logical(Type type) {
        return null;
    }

    @Override
    public Type arithmetic(Type type) {
        return null;
    }

    @Override
    public boolean promotableTo(Type to) {
        return false;
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public boolean isArithmetic() {
        return false;
    }

    @Override
    public boolean allowDot() {
        return false;
    }

    @Override
    public boolean isIndexable() {
        return false;
    }
}
