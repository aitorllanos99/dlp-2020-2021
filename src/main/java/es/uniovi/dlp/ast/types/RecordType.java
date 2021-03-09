package es.uniovi.dlp.ast.types;

import java.util.List;

public class RecordType extends AbstractType implements Type {
    public List<RecordField> fields;

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        this.fields = fields;
        //fields.stream().forEach(System.out::println);
        fields.stream().forEach(f ->
        {
            if (fields.stream().filter(f2 -> f2.equals(f.name)).count() > 1)
                new ErrorType(line, column, "Fields with same name")
                        ;
        });
    }
}
