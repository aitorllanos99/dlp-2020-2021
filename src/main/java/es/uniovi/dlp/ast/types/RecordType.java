package es.uniovi.dlp.ast.types;

import java.util.List;

public class RecordType extends AbstractType {
    private List<RecordField> fields;

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        this.fields = fields;
    }
}
