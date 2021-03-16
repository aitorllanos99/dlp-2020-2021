package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;

public abstract class AbstractVisitor<ReturnType, ParamType> implements Visitor<ReturnType, ParamType> {

    @Override
    public ReturnType visit(Program program, ParamType param) {
        program.getDefinitions().forEach(definition -> definition.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(VarDefinition varDefinition, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(FuncDefinition funcDefinition, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Arithmetic arithmetic, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Cast cast, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(CharLiteral charLiteral, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Comparison comparison, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(DoubleLiteral doubleLiteral, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(FieldAccess fieldAccess, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Indexing indexing, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(IntLiteral intLiteral, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Invocation invocation, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Logical logical, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(RealLiteral realLiteral, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(UnaryMinus unaryMinus, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(UnaryNot unaryNot, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Variable variable, ParamType param) {
        return null;
    }

    public ReturnType visit(Assignment assignment, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(IfElse ifElse, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Read read, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Return returnStatement, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(While whileStatement, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Write write, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(ArrayType arrayType, ParamType param) {
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
        return null;
    }

    @Override
    public ReturnType visit(IntType intType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(RecordField recordField, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(RecordType recordType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(VoidType voidType, ParamType param) {
        return null;
    }
}
