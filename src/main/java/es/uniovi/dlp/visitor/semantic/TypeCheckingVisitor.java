package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.ErrorManager;

import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

    @Override
    public Type visit(VarDefinition varDefinition, Type param) {
        varDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public Type visit(FuncDefinition funcDefinition, Type param) {
        funcDefinition.getType().accept(this, param);
        funcDefinition.getBodyVarDefinitions().forEach(var -> var.accept(this, param));
        funcDefinition.getParameters().forEach(var -> var.accept(this, param));
        funcDefinition.getStatementsList().forEach(var -> var.accept(this, param));
        return null;
    }

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        arithmetic.getLeftExpression().accept(this, param);
        arithmetic.getRightExpression().accept(this, param);
        arithmetic.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(Cast cast, Type param) {
        cast.getType().accept(this, param);
        cast.getExpression().accept(this, param);
        cast.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        charLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(Comparison comparison, Type param) {
        comparison.getLeftExpression().accept(this, param);
        comparison.getRightExpression().accept(this, param);
        comparison.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(DoubleLiteral doubleLiteral, Type param) {
        doubleLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(FieldAccess fieldAccess, Type param) {
        fieldAccess.getExpression1().accept(this, param);
        fieldAccess.getProperty().accept(this, param);
        fieldAccess.setLvalue(true);
        return null;
    }

    @Override
    public Type visit(Indexing indexing, Type param) {
        indexing.getArray().accept(this, param);
        indexing.getIndex().accept(this, param);
        indexing.setLvalue(true);
        return null;
    }

    @Override
    public Type visit(IntLiteral intLiteral, Type param) {
        intLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(Invocation invocation, Type param) {
        invocation.getArguments().forEach(i -> i.accept(this, param));
        invocation.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(Logical logical, Type param) {
        logical.getLeftExpression().accept(this, param);
        logical.getRightExpression().accept(this, param);
        logical.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(RealLiteral realLiteral, Type param) {
        realLiteral.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        unaryMinus.getExpression().accept(this, param);
        unaryMinus.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(UnaryNot unaryNot, Type param) {
        unaryNot.getExpression().accept(this, param);
        unaryNot.setLvalue(false);
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        variable.setLvalue(true);
        return null;
    }

    @Override
    public Type visit(Assignment assignment, Type param) {
        assignment.getLeftExpression().accept(this, param);
        assignment.getRightExpression().accept(this, param);

        if (!assignment.getLeftExpression().getLValue())
            ErrorManager.getInstance().addError(new Location(assignment.getLine(), assignment.getColumn()), ErrorReason.LVALUE_REQUIRED);

        return null;
    }

    @Override
    public Type visit(IfElse ifElse, Type param) {
        ifElse.getIfStatements().forEach(i -> i.accept(this, param));
        ifElse.getElseStatements().forEach(i -> i.accept(this, param));
        ifElse.getCondition().accept(this, param);
        return null;
    }

    @Override
    public Type visit(Read read, Type param) {
        read.getExpression().accept(this, param);
        if (!read.getExpression().getLValue())
            ErrorManager.getInstance().addError(new Location(read.getLine(), read.getColumn()), ErrorReason.LVALUE_REQUIRED);
        return null;
    }

    @Override
    public Type visit(Return returnStatement, Type param) {
        returnStatement.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Type visit(While whileStatement, Type param) {
        whileStatement.getStatements().forEach(w -> w.accept(this, param));
        whileStatement.getCondition().accept(this, param);
        return null;
    }

    @Override
    public Type visit(Write write, Type param) {
        write.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Type visit(ArrayType arrayType, Type param) {
        arrayType.getArrayOf().accept(this, param);
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
        funcType.getReturnType().accept(this, param);
        funcType.getParameters().forEach(p -> p.accept(this, param));
        return null;
    }

    @Override
    public Type visit(IntType intType, Type param) {
        return null;
    }

    @Override
    public Type visit(RecordField recordField, Type param) {
        recordField.getType().accept(this, param);
        return null;
    }

    @Override
    public Type visit(RecordType recordType, Type param) {
        recordType.getFields().forEach(rf -> rf.accept(this, param));
        return null;
    }

    @Override
    public Type visit(VoidType voidType, Type param) {
        return null;
    }
}
