package es.uniovi.dlp.parser;

import org.junit.jupiter.api.Test;


import static es.uniovi.dlp.TestHelpers.parserForProgram;
import static es.uniovi.dlp.TestHelpers.silentParserForProgram;
import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    /**
     * The program should not be valid if there is no main function
     */
    @Test
    void testEmptyFile() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/empty").program());
    }

    /**
     * The program should be valid if there is just the main function
     */
    @Test
    void testOnlyMain() {
        parserForProgram("parser/only_main").program();
    }

    /**
     * The main function should not have return type
     */
    @Test
    void testInvalidMain() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/main_with_return_type").program());
    }

    /**
     * A program should be valid if there is just the main function and is not formatted properly
     */
    @Test
    void testOnlyMainNoFormat() {
        parserForProgram("parser/only_main_no_format").program();
    }

    /**
     * The main function can have var definitions
     */
    @Test
    void testMainWithVarDefinitions() {
        parserForProgram("parser/main_with_var_definitions").program();
    }

    /**
     * The main function can have statements
     */
    @Test
    void testMainWithStatements() {
        parserForProgram("parser/main_with_statements").program();
    }

    /**
     * The main function can have a mixed function body
     */
    @Test
    void testMainWithBody() {
        parserForProgram("parser/main_with_body").program();
    }
}
