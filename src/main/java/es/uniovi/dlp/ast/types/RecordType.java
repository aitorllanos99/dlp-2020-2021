package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ErrorManager;
import es.uniovi.dlp.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class RecordType extends AbstractType implements Type {
    private List<RecordField> fields;

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        this.fields = fields;
    }

    public List<RecordField> getFields() {
        return new ArrayList<>(fields);
    }

    @Override
    public Type dot(String field) {
        for (RecordField f : fields)
            if (f.getName().equals(field))
                return f.getType();
        return null;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this, param);
    }
}
