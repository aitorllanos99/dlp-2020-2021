package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class DefinitionAbstract extends AbstractASTNode implements Definitions {
    int line;
    int column;
    String name;
    Type type;

    public DefinitionAbstract(int line, int column) {
        super(line, column);
    }


    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
