package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ErrorManager;

public class ErrorType extends AbstractType implements Type{
    private String message;
    public ErrorType(int line, int column,String message) {
        super(line, column);
        this.message = message;
        ErrorManager.getInstance().addError(this);
    }

    @Override
    public String toString(){
        return message + " [" + line + ":" + column+"]";
    }

}
