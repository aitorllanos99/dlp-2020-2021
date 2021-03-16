package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

    @Override
    public Type visit(VarDefinition varDefinition, Type param) {
        return null;
    }

    @Override
    public Type visit(FuncDefinition funcDefinition, Type param) {
        return null;
    }

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        return null;
    }

    @Override
    public Type visit(Cast cast, Type param) {
        return null;
    }

    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        return null;
    }

    @Override
    public Type visit(Comparison comparison, Type param) {
        return null;
    }

    @Override
    public Type visit(DoubleLiteral doubleLiteral, Type param) {
        return null;
    }

    @Override
    public Type visit(FieldAccess fieldAccess, Type param) {
        return null;
    }

    @Override
    public Type visit(Indexing indexing, Type param) {
        return null;
    }

    @Override
    public Type visit(IntLiteral intLiteral, Type param) {
        return null;
    }

    @Override
    public Type visit(Invocation invocation, Type param) {
        return null;
    }

    @Override
    public Type visit(Logical logical, Type param) {
        return null;
    }

    @Override
    public Type visit(RealLiteral realLiteral, Type param) {
        return null;
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        return null;
    }

    @Override
    public Type visit(UnaryNot unaryNot, Type param) {
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        return null;
    }

    public Type visit(Assignment assignment, Type param) {
        if (!assignment.getLeftExpression().getLValue())
            ErrorManager.getInstance().addError(new Location(assignment.getLine(), assignment.getColumn()), ErrorReason.LVALUE_REQUIRED);
        return null;
    }

    @Override
    public Type visit(IfElse ifElse, Type param) {
        return null;
    }

    @Override
    public Type visit(Read read, Type param) {
        return null;
    }

    @Override
    public Type visit(Return returnStatement, Type param) {
        return null;
    }

    @Override
    public Type visit(While whileStatement, Type param) {
        return null;
    }

    @Override
    public Type visit(Write write, Type param) {
        return null;
    }

    @Override
    public Type visit(ArrayType arrayType, Type param) {
        return null;
    }

    @Override
    public Type visit(CharType charType, Type param) {
        return null;
    }

    @Override
    public Type visit(DoubleType doubleType, Type param) {
        return null;
    }

    @Override
    public Type visit(FuncType funcType, Type param) {
        return null;
    }

    @Override
    public Type visit(IntType intType, Type param) {
        return null;
    }

    @Override
    public Type visit(RecordField recordField, Type param) {
        return null;
    }

    @Override
    public Type visit(RecordType recordType, Type param) {
        return null;
    }

    @Override
    public Type visit(VoidType voidType, Type param) {
        return null;
    }
}
