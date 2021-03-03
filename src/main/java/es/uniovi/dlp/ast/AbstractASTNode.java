package es.uniovi.dlp.ast;

public abstract class AbstractASTNode implements ASTNode {
    public int line;
    public int column;

    public AbstractASTNode(int line, int column){
        this.line = line;
        this.column = column;
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
