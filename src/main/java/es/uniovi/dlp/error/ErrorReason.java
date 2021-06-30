package es.uniovi.dlp.error;

public enum ErrorReason {
    LVALUE_REQUIRED("Lvalue required"),
    FIELD_ALREADY_DECLARED("Field already declared in struct"),
    VARIABLE_ALREADY_DECLARED("Variable already declared"),
    VARIABLE_NOT_DECLARED("Variable not declared"),
    FUNCTION_ALREADY_DECLARED("Function already declared"),
    FUNCTION_NOT_DECLARED("Function not declared"),
    INVALID_INDEX_EXPRESSION("Index expression is not valid"),
    INVALID_INDEXING("The expression doesn't support indexing"),
    INVALID_CAST("Invalid cast operation"),
    INVALID_ARITHMETIC("Invalid arithmetic operation"),
    NOT_LOGICAL("The expression must be able to be evaluated as logical"),
    INVALID_LOGICAL("Invalid logical operation"),
    INVALID_COMPARISON("Invalid comparison operation"),
    INVALID_DOT("The expression doesn't support field access"),
    NO_SUCH_FIELD("No such field in struct"),
    INCOMPATIBLE_TYPES("Incompatible types"),
    INVALID_RETURN_TYPE("Invalid return type"),
    INVALID_ARGS("Invalid arguments"),
    INVALID_INVOCATION("The expression is not a function"),

    EXAM_INVALID_ARRAY_ASSIGNMENT("The right array must be higher than the left"),
    EXAM_INVALID_PRINT_TYPE("The expression must be a character"),

    ;

    private final String message;

    ErrorReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
