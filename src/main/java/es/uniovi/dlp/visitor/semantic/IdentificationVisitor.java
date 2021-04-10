package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Invocation;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.ErrorType;
import es.uniovi.dlp.ast.types.RecordField;
import es.uniovi.dlp.ast.types.RecordType;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.HashSet;

public class IdentificationVisitor extends AbstractVisitor<Type, Type> {
    private SymbolTable table = new SymbolTable();

    @Override
    public Type visit(VarDefinition varDefinition, Type param) {
        if (table.findInCurrentScope(varDefinition.getName()) == null) //Habria que buscar en el scope actual o solo en la tabla??
            table.insert(varDefinition);
        else
            ErrorManager.getInstance().addError(new Location(varDefinition.getLine(), varDefinition.getColumn()), ErrorReason.VARIABLE_ALREADY_DECLARED);
        super.visit(varDefinition, param);
        return null;
    }

    @Override
    public Type visit(FuncDefinition funcDefinition, Type param) {
        if (table.find(funcDefinition.getName()) == null)
            table.insert(funcDefinition);
        else
            ErrorManager.getInstance().addError(new Location(funcDefinition.getLine(), funcDefinition.getColumn()), ErrorReason.FUNCTION_ALREADY_DECLARED);
        //Hacemos el ambito de la funcion
        table.set();
        super.visit(funcDefinition, param);
        table.reset();
        return null;
    }

    @Override
    public Type visit(Invocation invocation, Type param) {
        if (table.find(invocation.getName().getIdent()) == null)
            ErrorManager.getInstance().addError(new Location(invocation.getLine(), invocation.getColumn()), ErrorReason.FUNCTION_NOT_DECLARED);
        super.visit(invocation, param);
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        if (table.find(variable.getIdent()) == null) {
            ErrorManager.getInstance().addError(new Location(variable.getLine(), variable.getColumn()), ErrorReason.VARIABLE_NOT_DECLARED);
            variable.setDefinition(new VarDefinition(variable.getLine(), variable.getColumn(),
                    "FAILURE", new ErrorType(variable.getLine(), variable.getColumn(), "Variable not declared")));
        } else
            variable.setDefinition(table.find(variable.getIdent()));
            super.visit(variable, param);
        return null;
    }


    @Override
    public Type visit(RecordType recordType, Type param) {
        var uniques = new HashSet<String>();
        for (RecordField f : recordType.getFields())
            if (!uniques.add(f.getName())) {
                ErrorManager.getInstance().addError(new Location(f.getLine(), f.getColumn()), ErrorReason.FIELD_ALREADY_DECLARED);
            }
        return null;
    }


}
