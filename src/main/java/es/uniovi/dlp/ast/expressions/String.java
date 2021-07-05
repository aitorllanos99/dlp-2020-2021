package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class String extends AbstractExpression implements Expression{

    private String value;

    public String(int line, int column, String value) {
        super(line, column);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
