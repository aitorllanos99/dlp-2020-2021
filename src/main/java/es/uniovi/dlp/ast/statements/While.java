package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class While extends AbstractStatement implements Statement{

    private List<Statement> statements;
    private Expression condition;
    public While(int line, int column, List<Statement> statements,  Expression condition) {
        super(line, column);
        this.statements = statements;
        this.condition = condition;
    }

    public List<Statement> getStatements() {
        return new ArrayList<>(statements);
    }

    public Expression getCondition() {
        return condition;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
