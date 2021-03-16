package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public interface Type {
    <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) ;

}
