package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.statements.Statements;
import es.uniovi.dlp.ast.types.Type;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends DefinitionAbstract {
    private List<Statements> statementsList;
    private List<VarDefinition> parameters;


    public FuncDefinition(int line, int column, List<Statements> statementsList, List<VarDefinition> parameters, Type type, String name) {
        super(line, column);
        this.statementsList =statementsList;
        this.parameters = parameters;
        this.type = type;
        this.name = name;
    }
}
