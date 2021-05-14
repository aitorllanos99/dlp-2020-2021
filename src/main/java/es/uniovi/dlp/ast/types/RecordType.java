package es.uniovi.dlp.ast.types;

import com.ibm.icu.text.PluralRules;
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
    public boolean isStructField(String field) {
        for (RecordField f : fields)
            if (f.getName().equals(field))
                return true;
        return false;
    }

    @Override
    public int getNumberOfBytes() {
        int total = 0;
        for (var f : fields)
            total += f.getType().getNumberOfBytes();
        return total;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this, param);
    }

    @Override
    public int propertyOffset(String property) {
        for (var f : fields)
            if (f.getName().equals(property))
                return f.getOffset();
        return -1024;
    }

    @Override
    public String sufixCode() {
        return "i";
    }

    @Override
    public String getName() {
        String name = "record(";
        for (int i = 0; i < fields.size(); i++) {
            var f = fields.get(i);
            name += "(" + f.getName() + " x " + f.getType().getName() + ")";
            if (i != fields.size() - 1)
                name += " x ";
        }
        return name + ")";
    }
}
