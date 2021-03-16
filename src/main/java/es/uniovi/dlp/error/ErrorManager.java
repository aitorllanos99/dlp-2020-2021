package es.uniovi.dlp.error;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorManager {
    private static final ErrorManager instance = new ErrorManager();

    private List<Error> errors = new ArrayList<>();

    private ErrorManager() {}

    public static ErrorManager getInstance() {
        return instance;
    }

    public void addError(Location location, ErrorReason reason) {
        Error error = new Error(location, reason);
        errors.add(error);
    }

    public void addError(Location location,  ErrorReason reason, String extraMessage) {
        Error error = new Error(location, reason, extraMessage);
        errors.add(error);
    }

    public List<Error> getErrors() {
        List<Error> errors = new ArrayList<>(this.errors);
        Collections.sort(errors);
        return errors;
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}
