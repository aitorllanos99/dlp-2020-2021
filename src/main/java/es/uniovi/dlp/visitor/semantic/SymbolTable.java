package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.Definition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private int scope = 0;
    private List<Map<String, Definition>> table = new ArrayList<>();

    public SymbolTable() {
        table.add(new HashMap<>());
    }

    public void set() {
        table.add(new HashMap<>());
        scope++;
    }

    public void reset() {
        table.remove(scope);
        scope--;
    }

    public boolean insert(Definition definition) {
        Map<String, Definition> toInsert = table.get(scope); //Cogemos el ultimo hueco
        if (!toInsert.containsKey(definition.getName())) {//Si no hay un simbolo que se llame igual entra
            toInsert.put(definition.getName(),definition);
            //TODO: Como meter el ambito??????
            return true;
        }
        return true;
    }

    public Definition find(String id) {
        return null;
    }

    public Definition findInCurrentScope(String id) {
        return null;
    }

}
