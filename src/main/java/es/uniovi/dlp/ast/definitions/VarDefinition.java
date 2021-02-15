package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.types.Type;

public class VarDefinition extends AbstractDefinition {
    private String name;
    private Type type;

    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }
}
