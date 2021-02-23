// Generated from D:/1Escritorio/Informatica/Uni/Cuarto Curso/Segundo Cuatrimestre/DLP/Compiler/src/main/antlr4\Xana.g4 by ANTLR 4.9.1

package es.uniovi.dlp.parser;

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
	 * Visit a parse tree produced by {@link XanaParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(XanaParser.StatementsContext ctx);
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
}