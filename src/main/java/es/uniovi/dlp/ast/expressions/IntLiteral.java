package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class IntLiteral extends AbstractExpression implements Expression{
    public int value;


    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }


    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
