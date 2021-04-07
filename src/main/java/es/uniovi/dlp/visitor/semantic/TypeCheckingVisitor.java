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
        if (!(indexing.getArray().getType() instanceof ArrayType)) {
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
    public Type visit(CharLiteral charLiteral, Type param) {
        super.visit(charLiteral, param);
        charLiteral.setType(new CharType(charLiteral.getLine(), charLiteral.getColumn()));
        return null;
    }

    @Override
    public Type visit(Comparison comparison, Type param) {
        super.visit(comparison, param);
        comparison.setType(comparison.getLeftExpression().getType().comparison(comparison.getRightExpression().getType()));
        if (comparison.getType() == null)
            ErrorManager.getInstance().addError(new Location(comparison.getLine(), comparison.getColumn()), ErrorReason.INVALID_COMPARISON);

        return null;
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
    public Type visit(Logical logical, Type param) {
        super.visit(logical, param);
        logical.setType(logical.getLeftExpression().getType().logical(logical.getRightExpression().getType()));
        if(logical.getType() == null)
            ErrorManager.getInstance().addError(new Location(logical.getLine(), logical.getColumn()), ErrorReason.NOT_LOGICAL);

        return null;
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        super.visit(unaryMinus, param);
        if (!unaryMinus.getExpression().getType().isArithmetic())
            ErrorManager.getInstance().addError(new Location(unaryMinus.getLine(), unaryMinus.getColumn()), ErrorReason.INVALID_ARITHMETIC);

        return null;
    }

    @Override
    public Type visit(UnaryNot unaryNot, Type param) {
        super.visit(unaryNot, param);
        if (!unaryNot.getExpression().getType().isLogical())
            ErrorManager.getInstance().addError(new Location(unaryNot.getLine(), unaryNot.getColumn()), ErrorReason.NOT_LOGICAL);

        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        super.visit(variable, param);
        variable.setType(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        super.visit(arithmetic, param);
        arithmetic.setType(arithmetic.getLeftExpression().getType().arithmetic(arithmetic.getRightExpression().getType()));
        if (arithmetic.getType() == null)
            ErrorManager.getInstance().addError(new Location(arithmetic.getLine(), arithmetic.getColumn()), ErrorReason.INVALID_ARITHMETIC);
        return null;
    }

    @Override
    public Type visit(Assignment assignment, Type param) {
        super.visit(assignment, param);
        if (!assignment.getLeftExpression().getLValue())
            ErrorManager.getInstance().addError(new Location(assignment.getLine(), assignment.getColumn()), ErrorReason.LVALUE_REQUIRED);
        if (assignment.getLeftExpression().getType().promotableTo(assignment.getRightExpression().getType()) == null)
            ErrorManager.getInstance().addError(new Location(assignment.getLine(), assignment.getColumn()), ErrorReason.INCOMPATIBLE_TYPES);

        return null;
    }

    @Override
    public Type visit(IfElse ifElse, Type param) {
        super.visit(ifElse, param);
        if (!ifElse.getCondition().getType().isLogical())
            ErrorManager.getInstance().addError(new Location(ifElse.getLine(), ifElse.getColumn()), ErrorReason.NOT_LOGICAL);

        return null;
    }

    @Override
    public Type visit(Read read, Type param) {
        super.visit(read, param);
        if (!read.getExpression().getLValue())
            ErrorManager.getInstance().addError(new Location(read.getLine(), read.getColumn()), ErrorReason.LVALUE_REQUIRED);
        return null;
    }

    @Override
    public Type visit(Return returnStatement, Type param) {
        super.visit(returnStatement, param);
        if (returnStatement.getExpression().getType().isReturnable(param) == null)
            ErrorManager.getInstance().addError(new Location(returnStatement.getLine(), returnStatement.getColumn()), ErrorReason.INVALID_RETURN_TYPE);

        return null;
    }

    @Override
    public Type visit(While whileStatement, Type param) {
        super.visit(whileStatement, param);
        if (!whileStatement.getCondition().getType().isLogical())
            ErrorManager.getInstance().addError(new Location(whileStatement.getLine(), whileStatement.getColumn()), ErrorReason.NOT_LOGICAL);

        return null;
    }
}
