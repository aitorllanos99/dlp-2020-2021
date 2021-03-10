// Generated from D:/1Escritorio/Informatica/Uni/Cuarto Curso/Segundo Cuatrimestre/DLP/Compiler/src/main/antlr4\Xana.g4 by ANTLR 4.9.1

package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.*;

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
	 * Enter a parse tree produced by {@link XanaParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void enterFuncParameters(XanaParser.FuncParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#funcParameters}.
	 * @param ctx the parse tree
	 */
	void exitFuncParameters(XanaParser.FuncParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(XanaParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(XanaParser.FuncBodyContext ctx);
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
	 * Enter a parse tree produced by {@link XanaParser#varTypes}.
	 * @param ctx the parse tree
	 */
	void enterVarTypes(XanaParser.VarTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#varTypes}.
	 * @param ctx the parse tree
	 */
	void exitVarTypes(XanaParser.VarTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#moreIdentDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterMoreIdentDefinitions(XanaParser.MoreIdentDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#moreIdentDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitMoreIdentDefinitions(XanaParser.MoreIdentDefinitionsContext ctx);
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
	 * Enter a parse tree produced by {@link XanaParser#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void enterMoreExpressions(XanaParser.MoreExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void exitMoreExpressions(XanaParser.MoreExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#moreParameters}.
	 * @param ctx the parse tree
	 */
	void enterMoreParameters(XanaParser.MoreParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#moreParameters}.
	 * @param ctx the parse tree
	 */
	void exitMoreParameters(XanaParser.MoreParametersContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link XanaParser#functionTypes}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypes(XanaParser.FunctionTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#functionTypes}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypes(XanaParser.FunctionTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#voidType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(XanaParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#voidType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(XanaParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(XanaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(XanaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XanaParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(XanaParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XanaParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(XanaParser.ComplexTypeContext ctx);
}