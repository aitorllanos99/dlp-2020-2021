package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ErrorManager;
import es.uniovi.dlp.visitor.Visitor;

public class ErrorType extends AbstractType implements Type{
    private String message;
    public ErrorType(int line, int column,String message) {
        super(line, column);
        this.message = message;
    }

    @Override
    public <ParamType, ReturnType> ReturnType accept(Visitor<ReturnType, ParamType> returnTypeParamTypeAbstractVisitor, ParamType param) {
        return null;
    }

    @Override
    public int getNumberOfBytes() {
        return 0;
    }
}
