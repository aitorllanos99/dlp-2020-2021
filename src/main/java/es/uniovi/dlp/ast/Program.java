package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.definitions.Definition;

import java.util.ArrayList;
import java.util.List;

public class Program implements ASTNode {
    int line;
    int column;
    List<Definition> definitions = new ArrayList<Definition>();

    public Program(int line, int column, List<Definition> definitions) {
        this.line = line;
        this.column = column;
        this.definitions = definitions;
        ErrorManager.getInstance().print();

    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
