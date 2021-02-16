package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.AbstractASTNode;

import java.util.ArrayList;
import java.util.List;

public class Program implements ASTNode {
    int line;
    int column;
    List<Definitions> definitions = new ArrayList<Definitions>();
    public Program(int line, int column, List<Definitions> definitions ) {
       this.line = line;
       this.column = column;
        this.definitions = definitions;
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
