package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.Type;

public interface Definitions extends ASTNode {

    public Type getType();
    public String getName();
}
