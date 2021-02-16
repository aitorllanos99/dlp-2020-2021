package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.program.VarDefinition;

import java.util.List;

public class FuncType implements Type {
    private List<VarDefinition> definitions;
    private Type funcType;
}
