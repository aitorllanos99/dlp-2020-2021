package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.types.ErrorType;

import java.util.ArrayList;
import java.util.List;

public class ErrorManager {
    private static ErrorManager instance;
    private List<ErrorType> errors = new ArrayList<>();
    public static ErrorManager getInstance(){
        if(instance == null) {
            instance = new ErrorManager();
        }
        return instance;
    }

    public void print(){
        errors.forEach(System.out::println);
    }

    public void addError(ErrorType errorType) {
        errors.add(errorType);
    }
}
