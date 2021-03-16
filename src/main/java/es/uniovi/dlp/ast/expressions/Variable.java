package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class Variable extends AbstractExpression implements Expression{

    public String ident;


    public Variable(int line, int column, String value) {
        super(line, column);
        this.ident = value;
    }

    @Override
    public boolean getLValue() {
        return true;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return null;
    }
}
