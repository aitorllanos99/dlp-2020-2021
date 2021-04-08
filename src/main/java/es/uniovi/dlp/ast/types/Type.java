package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public interface Type {
    <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) ;
    Type dot(String field);
    Type cast(Type from);
    Type indexing(Type indexingType);
    Type comparison(Type leftType);
    Type logical(Type type);
    Type arithmetic(Type type);
    Type promotableTo(Type to);
    Type assignment(Type type);
    boolean isLogical();
    Type parenthesis(List<Expression> args);
    boolean isIndexable();
    Type isReturnable(Type funcType);
    boolean isArithmetic();


}
