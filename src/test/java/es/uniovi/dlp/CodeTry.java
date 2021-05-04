package es.uniovi.dlp;


import org.junit.jupiter.api.Test;
import static es.uniovi.dlp.TestHelpers.runCompiler;

public class CodeTry {

    @Test
    void simpleGeneration() {
        runCompiler("examples/codegenerati" +
                "on/simple.xana");

    }
    @Test
    void ifGeneration() {
        runCompiler("examples/codegeneration/if.xana");
    }

    @Test
    void whileGeneration() {
        runCompiler("examples/codegeneration/while.xana");

    }
    @Test
    void  indexingGeneration() {
        runCompiler("examples/codegeneration/indexing.xana");
    }
    @Test
    void fieldAccessGeneration() {
        runCompiler("examples/codegeneration/field_access.xana");

    }
}
