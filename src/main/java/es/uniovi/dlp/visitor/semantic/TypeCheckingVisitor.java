package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
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
    public Type visit(Indexing indexing, Type param) {
        super.visit(indexing, param);
        Type arrayType = indexing.getArray().getType();
        Type indexType = indexing.getIndex().getType();
        indexing.setType(arrayType.indexing(indexType));
        if(!(indexing.getArray().getType() instanceof ArrayType)) {
            ErrorManager.getInstance().addError(new Location(indexing.getLine(), indexing.getColumn()), ErrorReason.INVALID_INDEXING);
            return null;
        }
        if (indexing.getType() == null)
            ErrorManager.getInstance().addError(new Location(indexing.getLine(), indexing.getColumn()), ErrorReason.INVALID_INDEX_EXPRESSION);

        return null;
    }

    @Override
    public Type visit(Cast cast, Type param) {
        super.visit(cast, param);
        cast.setType(cast.getExpression().getType().cast(cast.getTypeToCast()));
        if (cast.getType() == null)
            ErrorManager.getInstance().addError(new Location(cast.getLine(), cast.getColumn()), ErrorReason.INVALID_CAST);
        return null;
    }


    @Override
    public Type visit(Program program, Type param) {
        return super.visit(program, param);
    }

    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        return super.visit(charLiteral, param);
    }

    @Override
    public Type visit(DoubleLiteral doubleLiteral, Type param) {
        super.visit(doubleLiteral, param);
        doubleLiteral.setType(new DoubleType(doubleLiteral.getLine(), doubleLiteral.getColumn()));
        return null;
    }

    @Override
    public Type visit(IntLiteral intLiteral, Type param) {
        super.visit(intLiteral, param);
        intLiteral.setType(new IntType(intLiteral.getLine(), intLiteral.getColumn()));
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        super.visit(variable, param);
        variable.setType(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Type visit(Assignment assignment, Type param) {
        super.visit(assignment, param);
        if (!assignment.getLeftExpression().getLValue())
            ErrorManager.getInstance().addError(new Location(assignment.getLine(), assignment.getColumn()), ErrorReason.LVALUE_REQUIRED);
        return null;
    }

    @Override
    public Type visit(Read read, Type param) {
        super.visit(read, param);
        if (!read.getExpression().getLValue())
            ErrorManager.getInstance().addError(new Location(read.getLine(), read.getColumn()), ErrorReason.LVALUE_REQUIRED);
        return null;
    }


}
