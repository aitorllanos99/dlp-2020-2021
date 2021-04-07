package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public interface Type {
    <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) ;
    Type dot(String field);
    Type cast(Type from);
    Type indexing(Type indexingType);
    Type comparison(Type leftType);
    Type logical(Type type);
    Type arithmetic(Type type);
    Type promotableTo(Type to);
    boolean isLogical();
    Type parenthesis(Type type);
    boolean isIndexable();
    boolean isReturnable();
    boolean isArithmetic();


}
