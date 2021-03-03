package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.definitions.AbstractDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;

import java.util.List;

public class FuncDefinition extends AbstractDefinition  implements Definition{
    private List<Statement> statementsList;
    private List<VarDefinition> parameters;
    private String name;
    private Type type;

    public FuncDefinition(int line, int column, List<Statement> statementsList, List<VarDefinition> parameters, Type type, String name) {
        super(line, column);
        this.statementsList =statementsList;
        this.parameters = parameters;
        this.type = type;
        this.name = name;
    }
}
