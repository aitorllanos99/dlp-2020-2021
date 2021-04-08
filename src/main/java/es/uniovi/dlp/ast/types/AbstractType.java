package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

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
    public Type promotableTo(Type to) {
        return null;
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type parenthesis(List<Expression> args){
        return null;
    }
    @Override
    public boolean isIndexable() {
        return false;
    }

    @Override
    public Type isReturnable(Type funcType) {
        return null;
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }

    @Override
    public Type assignment(Type type) {
        return null;
    }
}
