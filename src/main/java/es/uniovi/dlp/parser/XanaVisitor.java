// Generated from D:/1Escritorio/Informatica/Uni/Cuarto Curso/Segundo Cuatrimestre/DLP/Compiler/src/main/antlr4\Xana.g4 by ANTLR 4.9.1

package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XanaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XanaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XanaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(XanaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(XanaParser.DefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#funcDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefinition(XanaParser.FuncDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#funcParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameters(XanaParser.FuncParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(XanaParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(XanaParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(XanaParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#varTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarTypes(XanaParser.VarTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#moreIdentDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreIdentDefinitions(XanaParser.MoreIdentDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(XanaParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#moreExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExpressions(XanaParser.MoreExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#moreStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreStatements(XanaParser.MoreStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#moreParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreParameters(XanaParser.MoreParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(XanaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(XanaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#functionTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypes(XanaParser.FunctionTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#voidType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(XanaParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(XanaParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XanaParser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexType(XanaParser.ComplexTypeContext ctx);
}