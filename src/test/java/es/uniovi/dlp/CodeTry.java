package es.uniovi.dlp;


import org.junit.jupiter.api.Test;
import static es.uniovi.dlp.TestHelpers.runCompiler;

public class CodeTry {

    @Test
    void simpleGeneration() {
        runCompiler("examples/codegeneration/simple.xana");

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
    void indexingGeneration() {
        runCompiler("examples/codegeneration/indexing.xana");
    }

    @Test
    void fieldAccessGeneration() {
        runCompiler("examples/codegeneration/field_access.xana");

    }
    @Test
    void input() {
        runCompiler("examples/codegeneration/complete/input.xana");


    }

    @Test
    void bigInput() {
        runCompiler("examples/codegeneration/complete/big_input.xana");


    }

    @Test
    void examE1() {
        runCompiler("examples/exams/exam1/exercise1.xana");
    }

    @Test
    void wtf() {
        runCompiler("examples/real_examples/insert_sort.xana");
    }
}
