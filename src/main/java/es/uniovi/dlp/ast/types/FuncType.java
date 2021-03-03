package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.VarDefinition;

import java.util.List;

public class FuncType extends AbstractType implements Type{
    public List<VarDefinition> parameters;
    public Type returnType;

    public FuncType(int line, int column, List<VarDefinition> parameters, Type returnType) {
        super(line, column);
        this.parameters = parameters;
        this.returnType = returnType;
    }
}
