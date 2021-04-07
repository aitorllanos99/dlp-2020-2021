package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.visitor.Visitor;

public class Variable extends AbstractExpression implements Expression{

    private String ident;
    private Definition definition;

    public Variable(int line, int column, String value) {
        super(line, column);
        this.ident = value;
    }

    public String getIdent() {
        return ident;
    }

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
