package es.uniovi.dlp.semantic;

import es.uniovi.dlp.compiler.Compiler;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LvalueTest {

    @Test
    void errorLvalueInRead() {
        runCompiler("examples/errors/lvalue/read.xana");
        assertFoundErrors(Arrays.asList(
            new Error(4, 8, ErrorReason.LVALUE_REQUIRED)
        ));
    }

    @Test
    void errorLvalueAssignment() {
        runCompiler("examples/errors/lvalue/arithmetic.xana");
        assertFoundErrors(Arrays.asList(
                new Error(4, 5, ErrorReason.LVALUE_REQUIRED)
        ));
    }

    @Test
    void correctLvalue() {
        runCompiler("examples/errors/valid_examples/lvalue.xana");
        assertFoundErrors(new ArrayList<>());
    }

    private static void assertFoundErrors(List<Error> errors) {
        var foundErrors = ErrorManager.getInstance().getErrors();
        assertIterableEquals(foundErrors, errors);
    }

    private static void runCompiler(String file) {
        try {
            var compiler = new Compiler(file);
            compiler.setReportErrors(false);
            compiler.run();
        } catch (IOException e) {
            fail(e);
        }
    }
}
