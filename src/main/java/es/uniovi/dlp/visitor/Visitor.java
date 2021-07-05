package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.expressions.String;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

import java.lang.reflect.Field;

public interface Visitor<ReturnType, ParamType> {
    ReturnType visit(Program program, ParamType param);

    ReturnType visit(VarDefinition varDefinition, ParamType param);
    ReturnType visit(FuncDefinition funcDefinition, ParamType param);

    ReturnType visit(Arithmetic arithmetic, ParamType param);
    ReturnType visit(Cast cast, ParamType param);
    ReturnType visit(CharLiteral charLiteral, ParamType param);
    ReturnType visit(Comparison comparison, ParamType param);
    ReturnType visit(DoubleLiteral doubleLiteral, ParamType param);
    ReturnType visit(FieldAccess fieldAccess, ParamType param);
    ReturnType visit(Indexing indexing, ParamType param);
    ReturnType visit(IntLiteral intLiteral, ParamType param);
    ReturnType visit(Invocation invocation, ParamType param);
    ReturnType visit(Logical logical, ParamType param);
    ReturnType visit(UnaryMinus unaryMinus, ParamType param);
    ReturnType visit(UnaryNot unaryNot, ParamType param);
    ReturnType visit(Variable variable, ParamType param);
    ReturnType visit(String string, ParamType param);

    ReturnType visit(Assignment assignment, ParamType param);
    ReturnType visit(IfElse ifElse, ParamType param);
    ReturnType visit(Read read, ParamType param);
    ReturnType visit(Return returnStatement, ParamType param);
    ReturnType visit(While whileStatement, ParamType param);
    ReturnType visit(Write write, ParamType param);

    ReturnType visit(ArrayType arrayType, ParamType param);
    ReturnType visit(CharType charType, ParamType param);
    ReturnType visit(DoubleType doubleType, ParamType param);
    ReturnType visit(FuncType funcType, ParamType param);
    ReturnType visit(IntType intType, ParamType param);
    ReturnType visit(RecordField recordField, ParamType param);
    ReturnType visit(RecordType recordType, ParamType param);
    ReturnType visit(VoidType voidType, ParamType param);

}
