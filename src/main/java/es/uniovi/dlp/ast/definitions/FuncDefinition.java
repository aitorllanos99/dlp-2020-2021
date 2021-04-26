package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends AbstractDefinition implements Definition {
    private List<Statement> statementsList;
    private List<VarDefinition> parameters;
    private List<VarDefinition> bodyVarDefinitions;
    private String name;
    private Type type;

    public FuncDefinition(int line, int column, List<Statement> statementsList, List<VarDefinition> parameters, List<VarDefinition> bodyVarDefinitions, Type type, String name) {
        super(line, column);
        this.statementsList = statementsList;
        this.parameters = parameters;
        this.type = type;
        this.name = name;
        this.bodyVarDefinitions = bodyVarDefinitions;
    }

    public List<Statement> getStatementsList() {
        return new ArrayList<>(statementsList);
    }

    public List<VarDefinition> getParameters() {
        return new ArrayList<>(parameters);
    }

    public List<VarDefinition> getBodyVarDefinitions() {
        return new ArrayList<>(bodyVarDefinitions);
    }

    public String getName() {
        return name;
    }

    public int getLocalBytes(){
        int suma = 0;
        for(var v: bodyVarDefinitions)
            suma += v.getType().getNumberOfBytes();
        return suma;
    }

    public int getParamBytes(){
        int suma = 0;
        for(var v: parameters)
            suma += v.getType().getNumberOfBytes();
        return suma;
    }

    public Type getType() {
        return type;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
