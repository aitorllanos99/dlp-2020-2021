package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;


public abstract class AbstractVisitor<ReturnType, ParamType> implements Visitor<ReturnType, ParamType> {

    @Override
    public ReturnType visit(Program program, ParamType param) {
        program.getDefinitions().forEach(definition -> definition.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(VarDefinition varDefinition, ParamType param) {
        varDefinition.getType().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(FuncDefinition funcDefinition, ParamType param) {
        funcDefinition.getType().accept(this, param);
        funcDefinition.getBodyVarDefinitions().forEach(var -> var.accept(this, param));
        funcDefinition.getStatementsList().forEach(var -> var.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(Arithmetic arithmetic, ParamType param) {
        arithmetic.getLeftExpression().accept(this, param);
        arithmetic.getRightExpression().accept(this, param);
        arithmetic.setLvalue(false);
        return null;
    }

    @Override
    public ReturnType visit(Cast cast, ParamType param) {
        cast.getTypeToCast().accept(this, param);
        cast.getExpression().accept(this, param);
        cast.setLvalue(false);
        return null;
    }

    @Override
    public ReturnType visit(CharLiteral charLiteral, ParamType param) {
        charLiteral.setLvalue(false);
        return null;
    }

    @Override
    public ReturnType visit(Comparison comparison, ParamType param) {
        comparison.getLeftExpression().accept(this, param);
        comparison.getRightExpression().accept(this, param);
        comparison.setLvalue(false);
        return null;
    }

    @Override
    public ReturnType visit(DoubleLiteral doubleLiteral, ParamType param) {
        doubleLiteral.setLvalue(false);
        return null;
    }

    @Override
    public ReturnType visit(FieldAccess fieldAccess, ParamType param) {
        fieldAccess.getExpression1().accept(this, param);
        fieldAccess.getProperty().accept(this, param);
        fieldAccess.setLvalue(true);
        return null;
    }

    @Override
    public ReturnType visit(Indexing indexing, ParamType param) {
        indexing.getArray().accept(this, param);
        indexing.getIndex().accept(this, param);
        indexing.setLvalue(true);
        return null;
    }

    @Override
    public ReturnType visit(IntLiteral intLiteral, ParamType param) {
        intLiteral.setLvalue(false);
        return null;
    }

    @Override
    public ReturnType visit(Invocation invocation, ParamType param) {
        invocation.getArguments().forEach(i -> i.accept(this, param));
        invocation.setLvalue(false);
        return null;
    }

    @Override
    public ReturnType visit(Logical logical, ParamType param) {
        logical.getLeftExpression().accept(this, param);
        logical.getRightExpression().accept(this, param);
        logical.setLvalue(false);
        return null;
    }



    @Override
    public ReturnType visit(UnaryMinus unaryMinus, ParamType param) {
        unaryMinus.getExpression().accept(this, param);
        unaryMinus.setLvalue(false);
        return null;
    }

    @Override
    public ReturnType visit(UnaryNot unaryNot, ParamType param) {
        unaryNot.getExpression().accept(this, param);
        unaryNot.setLvalue(false);
        return null;
    }

    @Override
    public ReturnType visit(Variable variable, ParamType param) {
        variable.setLvalue(true);
        return null;
    }

    @Override
    public ReturnType visit(Assignment assignment, ParamType param) {
        assignment.getLeftExpression().accept(this, param);
        assignment.getRightExpression().accept(this, param);

        return null;
    }

    @Override
    public ReturnType visit(IfElse ifElse, ParamType param) {
        ifElse.getIfStatements().forEach(i -> i.accept(this, param));
        ifElse.getElseStatements().forEach(i -> i.accept(this, param));
        ifElse.getCondition().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Read read, ParamType param) {
        read.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Return returnStatement, ParamType param) {
        returnStatement.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(While whileStatement, ParamType param) {
        whileStatement.getStatements().forEach(w -> w.accept(this, param));
        whileStatement.getCondition().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Write write, ParamType param) {
        write.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(ArrayType arrayType, ParamType param) {
        arrayType.getArrayOf().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(CharType charType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(DoubleType doubleType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(FuncType funcType, ParamType param) {
        funcType.getReturnType().accept(this, param);
        funcType.getParameters().forEach(p -> p.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(IntType intType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(RecordField recordField, ParamType param) {
        recordField.getType().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(RecordType recordType, ParamType param) {
        recordType.getFields().forEach(rf -> rf.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(VoidType voidType, ParamType param) {
        return null;
    }
}
