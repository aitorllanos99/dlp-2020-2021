package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.Definition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private int scope = 0;
    private List<Map<String, Definition>> table = new ArrayList<>();
    // private List<Map<String, Definition>> table = new Stack<>();

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
        Map<String, Definition> lastScope = table.get(scope); //Cogemos el ambito
        if (!lastScope.containsKey(definition.getName())) {
            lastScope.put(definition.getName(), definition);
            definition.setScope(scope);
            return true;
        }
        return false;
    }

    public Definition find(String id) {
        for (int i = scope; i >= 0; i--)
            if (table.get(i).containsKey(id))
                return table.get(i).get(id);
        return null;
    }

    public Definition findInCurrentScope(String id) {
        if (table.get(scope).containsKey(id))
            return table.get(scope).get(id);
        return null;
    }

}
