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
        return varDefinition.accept(this, param);
    }

    @Override
    public ReturnType visit(FuncDefinition funcDefinition, ParamType param) {
        return funcDefinition.accept(this, param);
    }

    @Override
    public ReturnType visit(Arithmetic arithmetic, ParamType param) {
        return arithmetic.accept(this, param);
    }

    @Override
    public ReturnType visit(Cast cast, ParamType param) {
        return cast.accept(this, param);
    }

    @Override
    public ReturnType visit(CharLiteral charLiteral, ParamType param) {
        return charLiteral.accept(this, param);
    }

    @Override
    public ReturnType visit(Comparison comparison, ParamType param) {
        return comparison.accept(this, param);
    }

    @Override
    public ReturnType visit(DoubleLiteral doubleLiteral, ParamType param) {
        return doubleLiteral.accept(this, param);
    }

    @Override
    public ReturnType visit(FieldAccess fieldAccess, ParamType param) {
        return fieldAccess.accept(this, param);
    }

    @Override
    public ReturnType visit(Indexing indexing, ParamType param) {
        return indexing.accept(this, param);
    }

    @Override
    public ReturnType visit(IntLiteral intLiteral, ParamType param) {
        return intLiteral.accept(this, param);
    }

    @Override
    public ReturnType visit(Invocation invocation, ParamType param) {
        return invocation.accept(this, param);
    }

    @Override
    public ReturnType visit(Logical logical, ParamType param) {
        return logical.accept(this, param);
    }

    @Override
    public ReturnType visit(RealLiteral realLiteral, ParamType param) {
        return realLiteral.accept(this, param);
    }

    @Override
    public ReturnType visit(UnaryMinus unaryMinus, ParamType param) {
        return unaryMinus.accept(this, param);
    }

    @Override
    public ReturnType visit(UnaryNot unaryNot, ParamType param) {
        return unaryNot.accept(this, param);
    }

    @Override
    public ReturnType visit(Variable variable, ParamType param) {
        return variable.accept(this, param);
    }

    @Override
    public ReturnType visit(Assignment assignment, ParamType param) {
        return assignment.accept(this, param);
    }

    @Override
    public ReturnType visit(IfElse ifElse, ParamType param) {
        return ifElse.accept(this, param);
    }

    @Override
    public ReturnType visit(Read read, ParamType param) {
        return read.accept(this, param);
    }

    @Override
    public ReturnType visit(Return returnStatement, ParamType param) {
        return returnStatement.accept(this, param);
    }

    @Override
    public ReturnType visit(While whileStatement, ParamType param) {
        return whileStatement.accept(this,param);
    }

    @Override
    public ReturnType visit(Write write, ParamType param) {
        return write.accept(this,param);
    }

    @Override
    public ReturnType visit(ArrayType arrayType, ParamType param) {
        return arrayType.accept(this,param);
    }

    @Override
    public ReturnType visit(CharType charType, ParamType param) {
        return charType.accept(this,param);
    }

    @Override
    public ReturnType visit(DoubleType doubleType, ParamType param) {
        return doubleType.accept(this,param);
    }

    @Override
    public ReturnType visit(FuncType funcType, ParamType param) {
        return funcType.accept(this,param);
    }

    @Override
    public ReturnType visit(IntType intType, ParamType param) {
        return intType.accept(this,param);
    }

    @Override
    public ReturnType visit(RecordField recordField, ParamType param) {
        return recordField.accept(this,param);
    }

    @Override
    public ReturnType visit(RecordType recordType, ParamType param) {
        return recordType.accept(this,param);
    }

    @Override
    public ReturnType visit(VoidType voidType, ParamType param) {
        return voidType.accept(this,param);
    }
}
