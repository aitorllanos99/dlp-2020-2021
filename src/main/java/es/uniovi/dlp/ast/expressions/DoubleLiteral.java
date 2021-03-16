package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class DoubleLiteral extends AbstractExpression implements Expression{

    public Double value;


    public DoubleLiteral(int line, int column, Double  value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public boolean getLValue() {
        return false;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return null;
    }
}
