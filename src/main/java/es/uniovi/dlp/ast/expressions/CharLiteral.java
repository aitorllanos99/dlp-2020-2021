package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class CharLiteral extends AbstractExpression implements Expression{

    private Character value;



    public CharLiteral(int line, int column, Character value) {
        super(line, column);
        this.value = value;
    }

    public Character getValue() {
        return value;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
