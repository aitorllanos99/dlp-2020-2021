package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.types.Type;

public class VarDefinition extends DefinitionAbstract {
    private Statements statements;
    public VarDefinition(int line, int column, Type type, String name, Statements statements) {
        super(line, column);
        this.type = type;
        this.name = name;
        this.statements = statements;
    }
}
