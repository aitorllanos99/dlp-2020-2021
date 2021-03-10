package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ErrorManager;

import java.util.List;

public class RecordType extends AbstractType implements Type {
    public List<RecordField> fields;

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        this.fields = fields;

        for(RecordField f: fields)
               if(fields.stream().filter(e -> f.name.equals(e.name)).count() > 1)
                    ErrorManager.getInstance().addError(new ErrorType(f.line, f.column, "Fields with same name"));


    }

}
