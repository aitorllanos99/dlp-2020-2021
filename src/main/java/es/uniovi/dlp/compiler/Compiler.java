package es.uniovi.dlp.compiler;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.parser.XanaLexer;
import es.uniovi.dlp.parser.XanaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import es.uniovi.dlp.visitor.semantic.TypeCheckingVisitor;

import java.io.IOException;

public class Compiler {
    private final String file;
    private Program program;

    public Compiler(String file) {
        this.file = file;
    }

    public void run() throws IOException {
        program = parse(file);
        assignType();
        checkErrors();
    }

    private void checkErrors() {
        ErrorManager errorManager = ErrorManager.getInstance();

        if (errorManager.hasErrors()) {
            errorManager.getErrors().forEach(System.err::println);
            System.exit(-1);
        }
    }

    public Program getProgram() {
        return program;
    }

    private Program parse(String file) throws IOException {
        CharStream input = CharStreams.fromFileName(file);
        XanaLexer lexer = new XanaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XanaParser parser = new XanaParser(tokens);

        return parser.program().ast;
    }

    private void assignType() {
        TypeCheckingVisitor typeCheckingVisitor = new TypeCheckingVisitor();
        typeCheckingVisitor.visit(program, null);
    }
}

