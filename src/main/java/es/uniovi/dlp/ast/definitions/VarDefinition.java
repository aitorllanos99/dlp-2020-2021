package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.types.Type;

public class VarDefinition extends AbstractDefinition implements Definition {
    public String name;
    public Type type;

    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }



    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
