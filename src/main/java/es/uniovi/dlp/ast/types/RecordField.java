package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;

public class RecordField extends AbstractASTNode {
    private String name;
    private Type type;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }
}
