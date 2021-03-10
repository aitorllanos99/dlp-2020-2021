package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ErrorManager;

import java.util.List;

public class RecordType extends AbstractType implements Type {
    public List<RecordField> fields;

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        this.fields = fields;

        for(RecordField f: fields)
            for(RecordField f2: fields)
                if(f.name.equals(f2.name))
                    ErrorManager.getInstance().addError(new ErrorType(f2.line, f2.column, "Fields with same name"));

    }

}
