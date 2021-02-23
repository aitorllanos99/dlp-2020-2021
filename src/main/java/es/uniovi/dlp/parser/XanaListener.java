// Generated from D:/1Escritorio/Informatica/Uni/Cuarto Curso/Segundo Cuatrimestre/DLP/Compiler/src/main/antlr4\Xana.g4 by ANTLR 4.9.1

package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XanaParser}.
 */
public interface XanaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XanaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(XanaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(XanaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#definitions}.
	 * @param ctx the parse tree
	 */
	void enterDefinitions(XanaParser.DefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#definitions}.
	 * @param ctx the parse tree
	 */
	void exitDefinitions(XanaParser.DefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefinition(XanaParser.FuncDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#funcDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefinition(XanaParser.FuncDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(XanaParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(XanaParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(XanaParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(XanaParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(XanaParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(XanaParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(XanaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(XanaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(XanaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(XanaParser.TypeContext ctx);
}