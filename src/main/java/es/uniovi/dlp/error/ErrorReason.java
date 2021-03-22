package es.uniovi.dlp.error;

public enum ErrorReason {
    LVALUE_REQUIRED("Lvalue required"),
    FIELD_ALREADY_DECLARED("Field already declared in struct"),
    VARIABLE_ALREADY_DECLARED("Variable already declared"),
    VARIABLE_NOT_DECLARED("Variable not declared"),
    FUNCTION_ALREADY_DECLARED("Function already declared"),
    FUNCTION_NOT_DECLARED("Function not declared"),
    ;

    private final String message;

    ErrorReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
