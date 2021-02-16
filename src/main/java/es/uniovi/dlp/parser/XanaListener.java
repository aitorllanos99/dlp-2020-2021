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
}