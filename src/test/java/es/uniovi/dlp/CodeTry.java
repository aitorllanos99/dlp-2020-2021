package es.uniovi.dlp;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorReason;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static es.uniovi.dlp.TestHelpers.assertFoundErrors;
import static es.uniovi.dlp.TestHelpers.runCompiler;

public class CodeTry {

    @Test
    void identificationErrors() {
        runCompiler("examples/codegeneration/simple.xana");

    }
}
