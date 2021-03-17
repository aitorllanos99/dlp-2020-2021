package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FuncType extends AbstractType implements Type{
    private List<VarDefinition> parameters;
    private Type returnType;

    public FuncType(int line, int column, List<VarDefinition> parameters, Type returnType) {
        super(line, column);
        this.parameters = parameters;
        this.returnType = returnType;
    }

    public List<VarDefinition> getParameters() {
        return new ArrayList<>(parameters);
    }

    public Type getReturnType() {
        return returnType;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return returnTypeParamTypeAbstractVisitor.visit(this,param);
    }
}
