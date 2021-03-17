package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class IfElse extends AbstractStatement implements Statement{
    private Expression condition;
    private List<Statement> ifStatements;
    private List<Statement> elseStatements;

    public IfElse(int line, int column, Expression condition, List<Statement> ifStatements, List<Statement> elseStatements) {
        super(line, column);
        this.condition = condition;
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getIfStatements() {
        return new ArrayList<>(ifStatements);
    }

    public List<Statement> getElseStatements() {
        return new ArrayList<>(elseStatements);
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
