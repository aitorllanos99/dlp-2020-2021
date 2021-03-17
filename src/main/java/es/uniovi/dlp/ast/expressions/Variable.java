package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class Variable extends AbstractExpression implements Expression{

    private String ident;


    public Variable(int line, int column, String value) {
        super(line, column);
        this.ident = value;
    }

    public String getIdent() {
        return ident;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
