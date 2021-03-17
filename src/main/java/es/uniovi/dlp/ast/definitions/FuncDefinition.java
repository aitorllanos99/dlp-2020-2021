package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class FuncDefinition extends AbstractDefinition implements Definition {
    public List<Statement> statementsList;
    public List<VarDefinition> parameters;
    public List<VarDefinition> bodyVarDefinitions;
    public String name;
    public Type type;

    public FuncDefinition(int line, int column, List<Statement> statementsList, List<VarDefinition> parameters, List<VarDefinition> bodyVarDefinitions, Type type, String name) {
        super(line, column);
        this.statementsList = statementsList;
        this.parameters = parameters;
        this.type = type;
        this.name = name;
        this.bodyVarDefinitions = bodyVarDefinitions;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
