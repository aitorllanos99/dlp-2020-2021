package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.ErrorManager;

import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.stream.Collectors;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {
    private SymbolTable table = new SymbolTable();

    @Override
    public Type visit(Assignment assignment, Type param) {
        super.visit(assignment,param);
        if (!assignment.getLeftExpression().getLValue())
            ErrorManager.getInstance().addError(new Location(assignment.getLine(), assignment.getColumn()), ErrorReason.LVALUE_REQUIRED);
        return null;
    }

    @Override
    public Type visit(Read read, Type param) {
        super.visit(read,param);
        if (!read.getExpression().getLValue())
            ErrorManager.getInstance().addError(new Location(read.getLine(), read.getColumn()), ErrorReason.LVALUE_REQUIRED);
        return null;
    }




}
