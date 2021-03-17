package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class Invocation extends AbstractExpression implements Statement,Expression {
    private Variable name;
    private List<Expression> arguments;


    public Invocation(int line, int column, Variable name, List<Expression> arguments) {
        super(line, column);
        this.name = name;
        this.arguments = arguments;
    }

    public Variable getName() {
        return name;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
