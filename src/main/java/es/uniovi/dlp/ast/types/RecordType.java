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

        for(RecordField f: fields)
               if(fields.stream().filter(e -> f.getName().equals(e.getName())).count() > 1)
                    ErrorManager.getInstance().addError(new ErrorType(f.line, f.column, "Fields with same name"));


    }

    public List<RecordField> getFields() {
        return new ArrayList<>(fields);
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
