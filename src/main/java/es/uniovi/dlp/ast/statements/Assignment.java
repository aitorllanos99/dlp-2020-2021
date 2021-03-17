package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

public class Assignment extends AbstractStatement implements Statement{

    public Expression expression1;
    public Expression expression2;
    public Assignment(int line, int column,Expression expression1,Expression expression2) {
        super(line, column);
        this.expression1 =  expression1;
        this.expression2 = expression2;
    }


    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }


    public Expression getLeftExpression() {
        return expression1;
    }


    public Expression getRightExpression() {
        return expression2;
    }


    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
