package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class While extends AbstractStatement implements Statement{

    public List<Statement> statements;
    public Expression condition;
    public While(int line, int column, List<Statement> statements,  Expression condition) {
        super(line, column);
        this.statements = statements;
        this.condition = condition;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return null;
    }
}
