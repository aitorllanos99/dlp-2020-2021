// Generated from Xana.g4 by ANTLR 4.9.1

package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		WHITESPACE=39, INT_CONSTANT=40, REAL_CONSTANT=41, ELEVATION=42, EXPONENTIAL=43, 
		COMMENTS=44, COMMENTSBIGGER=45, ID=46, CHAR_CONSTANT=47;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_funcDefinition = 2, RULE_mainFunction = 3, 
		RULE_varDefinition = 4, RULE_statements = 5, RULE_expression = 6, RULE_type = 7, 
		RULE_functionTypes = 8, RULE_voidType = 9, RULE_primitiveType = 10, RULE_complexType = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "funcDefinition", "mainFunction", "varDefinition", 
			"statements", "expression", "type", "functionTypes", "voidType", "primitiveType", 
			"complexType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def '", "'('", "'::'", "','", "')'", "'do'", "'end'", "'main'", 
			"'return'", "'if'", "'else'", "'while'", "'in'", "'puts'", "'='", "'['", 
			"']'", "'.'", "'as'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", 
			"'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'void'", "'int'", 
			"'char'", "'double'", "'defstruct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WHITESPACE", "INT_CONSTANT", "REAL_CONSTANT", "ELEVATION", 
			"EXPONENTIAL", "COMMENTS", "COMMENTSBIGGER", "ID", "CHAR_CONSTANT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public List<DefinitionsContext> definitions() {
			return getRuleContexts(DefinitionsContext.class);
		}
		public DefinitionsContext definitions(int i) {
			return getRuleContext(DefinitionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					definitions();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(30);
			mainFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionsContext extends ParserRuleContext {
		public List<Definition> ast;
		public VarDefinitionContext varDefinition;
		public FuncDefinitionContext funcDefinition;
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public FuncDefinitionContext funcDefinition() {
			return getRuleContext(FuncDefinitionContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((DefinitionsContext)_localctx).varDefinition = varDefinition();
				_localctx.ast.addAll(((DefinitionsContext)_localctx).varDefinition.ast);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				((DefinitionsContext)_localctx).funcDefinition = funcDefinition();
				_localctx.ast.addAll(((DefinitionsContext)_localctx).funcDefinition.ast);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public FunctionTypesContext functionTypes() {
			return getRuleContext(FunctionTypesContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			match(ID);
			setState(42);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(43);
				match(ID);
				setState(44);
				match(T__2);
				setState(45);
				type();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(46);
					match(T__3);
					setState(47);
					match(ID);
					setState(48);
					match(T__2);
					setState(49);
					type();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(57);
			match(T__4);
			setState(58);
			match(T__2);
			setState(59);
			functionTypes();
			setState(60);
			match(T__5);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(61);
					statements();
					}
					break;
				case 2:
					{
					setState(62);
					varDefinition();
					}
					break;
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFunctionContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__0);
			setState(71);
			match(T__7);
			setState(72);
			match(T__1);
			setState(73);
			match(T__4);
			setState(74);
			match(T__5);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(75);
					statements();
					}
					break;
				case 2:
					{
					setState(76);
					varDefinition();
					}
					break;
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefinitionContext extends ParserRuleContext {
		public VarDefinition ast;
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(85);
				match(T__3);
				setState(86);
				match(ID);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(T__2);
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				{
				setState(93);
				primitiveType();
				}
				break;
			case T__15:
			case T__37:
				{
				setState(94);
				complexType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public Statement st;
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(ID);
				setState(98);
				match(T__1);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(99);
					expression(0);
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(100);
						match(T__3);
						setState(101);
						expression(0);
						}
						}
						setState(106);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(109);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(T__8);
				setState(111);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(T__9);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(113);
					expression(0);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__5);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(120);
					statements();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(126);
					match(T__10);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						{
						setState(127);
						statements();
						}
						}
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(135);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(T__11);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(137);
					expression(0);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(T__5);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(144);
					statements();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(T__12);
				{
				setState(152);
				expression(0);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(153);
					match(T__3);
					setState(154);
					expression(0);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(T__13);
				{
				setState(161);
				expression(0);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(162);
					match(T__3);
					setState(163);
					expression(0);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				((StatementsContext)_localctx).left = expression(0);
				setState(170);
				match(T__14);
				setState(171);
				((StatementsContext)_localctx).right = expression(0);
				 ((StatementsContext)_localctx).st =  new Assignment((((StatementsContext)_localctx).left!=null?(((StatementsContext)_localctx).left.start):null).getLine(), (((StatementsContext)_localctx).left!=null?(((StatementsContext)_localctx).left.start):null).getCharPositionInLine() +1 , ((StatementsContext)_localctx).left.ast ,  ((StatementsContext)_localctx).right.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext left;
		public ExpressionContext exp;
		public ExpressionContext expression;
		public Token i;
		public Token c;
		public Token r;
		public Token id;
		public ExpressionContext right;
		public Token op;
		public TypeContext tc;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(XanaParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(XanaParser.REAL_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(177);
				match(ID);
				setState(178);
				match(T__1);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(179);
					((ExpressionContext)_localctx).expression = expression(0);
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(180);
						match(T__3);
						setState(181);
						((ExpressionContext)_localctx).expression = expression(0);
						}
						}
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(189);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(190);
				((ExpressionContext)_localctx).i = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).i.getLine(), ((ExpressionContext)_localctx).i.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null)));
				}
				break;
			case 3:
				{
				setState(192);
				((ExpressionContext)_localctx).c = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).c.getLine(), ((ExpressionContext)_localctx).c.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null)));
				}
				break;
			case 4:
				{
				setState(194);
				((ExpressionContext)_localctx).r = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).r.getLine(), ((ExpressionContext)_localctx).r.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).r!=null?((ExpressionContext)_localctx).r.getText():null)));
				}
				break;
			case 5:
				{
				setState(196);
				((ExpressionContext)_localctx).id = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).id.getLine(), ((ExpressionContext)_localctx).id.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null));
				}
				break;
			case 6:
				{
				setState(198);
				match(T__1);
				setState(199);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(200);
				match(T__4);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 7:
				{
				setState(203);
				match(T__15);
				setState(204);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(205);
				match(T__16);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 8:
				{
				setState(208);
				match(T__19);
				setState(209);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).exp.ast);
				}
				break;
			case 9:
				{
				setState(212);
				match(T__20);
				setState(213);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(5);
				((ExpressionContext)_localctx).ast =  new UnaryNot((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).exp.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(219);
						match(T__17);
						setState(220);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(9);
						((ExpressionContext)_localctx).ast =  new FieldAccess((((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getLine(), (((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getCharPositionInLine() +1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(224);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(5);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getLine(), (((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(229);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(4);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getLine(), (((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(234);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(3);
						((ExpressionContext)_localctx).ast =  new Comparison((((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getLine(), (((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(239);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(240);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(2);
						((ExpressionContext)_localctx).ast =  new Logical((((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getLine(), (((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(244);
						match(T__15);
						setState(245);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(246);
						match(T__16);
						((ExpressionContext)_localctx).ast =  new Indexing((((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getLine(), (((ExpressionContext)_localctx).left!=null?(((ExpressionContext)_localctx).left.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).right.ast);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(250);
						match(T__18);
						setState(251);
						((ExpressionContext)_localctx).tc = type();
						((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).tc.t. ((ExpressionContext)_localctx).exp.ast);
						}
						break;
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public PrimitiveTypeContext p;
		public VoidTypeContext v;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((TypeContext)_localctx).p = primitiveType();
				_localctx.t = p.t
				}
				break;
			case T__15:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				complexType();
				_localctx.t = c.t
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				((TypeContext)_localctx).v = voidType();
				_localctx.t = v.t
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypesContext extends ParserRuleContext {
		public Type t;
		public PrimitiveTypeContext p;
		public VoidTypeContext v;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public FunctionTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypes; }
	}

	public final FunctionTypesContext functionTypes() throws RecognitionException {
		FunctionTypesContext _localctx = new FunctionTypesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionTypes);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((FunctionTypesContext)_localctx).p = primitiveType();
				_localctx.t = p.t
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				((FunctionTypesContext)_localctx).v = voidType();
				_localctx.t = v.t
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidTypeContext extends ParserRuleContext {
		public Type t;
		public Token v;
		public VoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidType; }
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((VoidTypeContext)_localctx).v = match(T__33);
			((VoidTypeContext)_localctx).t =  new VoidType(((VoidTypeContext)_localctx).v.getLine(), ((VoidTypeContext)_localctx).v.getCharPositionInLine() + 1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type t;
		public Token i;
		public Token c;
		public Token d;
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primitiveType);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((PrimitiveTypeContext)_localctx).i = match(T__34);
				((PrimitiveTypeContext)_localctx).t =  new IntType(((PrimitiveTypeContext)_localctx).i.getLine(), ((PrimitiveTypeContext)_localctx).i.getCharPositionInLine() +1);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((PrimitiveTypeContext)_localctx).c = match(T__35);
				((PrimitiveTypeContext)_localctx).t =  new CharType(((PrimitiveTypeContext)_localctx).c.getLine(), ((PrimitiveTypeContext)_localctx).c.getCharPositionInLine() + 1);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				((PrimitiveTypeContext)_localctx).d = match(T__36);
				((PrimitiveTypeContext)_localctx).t =  new DoubleType(((PrimitiveTypeContext)_localctx).d.getLine(), ((PrimitiveTypeContext)_localctx).d.getCharPositionInLine() +1) ;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexTypeContext extends ParserRuleContext {
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(XanaParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(XanaParser.INT_CONSTANT, i);
		}
		public List<TerminalNode> CHAR_CONSTANT() { return getTokens(XanaParser.CHAR_CONSTANT); }
		public TerminalNode CHAR_CONSTANT(int i) {
			return getToken(XanaParser.CHAR_CONSTANT, i);
		}
		public List<TerminalNode> REAL_CONSTANT() { return getTokens(XanaParser.REAL_CONSTANT); }
		public TerminalNode REAL_CONSTANT(int i) {
			return getToken(XanaParser.REAL_CONSTANT, i);
		}
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_complexType);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(T__37);
				setState(290);
				match(T__5);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(291);
					varDefinition();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(T__6);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(T__15);
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(299);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(302); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(304);
				match(T__2);
				setState(305);
				type();
				setState(306);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0139\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"\65\n\4\f\4\16\48\13\4\5\4:\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16"+
		"\4E\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\6\5\6b\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\5\7n\n\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7u\n\7\f\7\16\7x\13\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\7\3\7\7\7"+
		"\u0083\n\7\f\7\16\7\u0086\13\7\5\7\u0088\n\7\3\7\3\7\3\7\7\7\u008d\n\7"+
		"\f\7\16\7\u0090\13\7\3\7\3\7\7\7\u0094\n\7\f\7\16\7\u0097\13\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3\7\3\7\3\7\3\7\7\7\u00a7"+
		"\n\7\f\7\16\7\u00aa\13\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b1\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc\13\b\5\b\u00be\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00db\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0101\n\b\f\b\16\b"+
		"\u0104\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u010f\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0117\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0122\n\f\3\r\3\r\3\r\7\r\u0127\n\r\f\r\16\r\u012a\13\r\3\r\3\r\3"+
		"\r\6\r\u012f\n\r\r\r\16\r\u0130\3\r\3\r\3\r\3\r\5\r\u0137\n\r\3\r\2\3"+
		"\16\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\3\2\30\32\4\2\26\26\33\33\3\2"+
		"\34!\3\2\"#\4\2*+\61\61\2\u015f\2\35\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\bH"+
		"\3\2\2\2\nV\3\2\2\2\f\u00b0\3\2\2\2\16\u00da\3\2\2\2\20\u010e\3\2\2\2"+
		"\22\u0116\3\2\2\2\24\u0118\3\2\2\2\26\u0121\3\2\2\2\30\u0136\3\2\2\2\32"+
		"\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		" \3\2\2\2\37\35\3\2\2\2 !\5\b\5\2!\3\3\2\2\2\"#\5\n\6\2#$\b\3\1\2$)\3"+
		"\2\2\2%&\5\6\4\2&\'\b\3\1\2\')\3\2\2\2(\"\3\2\2\2(%\3\2\2\2)\5\3\2\2\2"+
		"*+\7\3\2\2+,\7\60\2\2,9\7\4\2\2-.\7\60\2\2./\7\5\2\2/\66\5\20\t\2\60\61"+
		"\7\6\2\2\61\62\7\60\2\2\62\63\7\5\2\2\63\65\5\20\t\2\64\60\3\2\2\2\65"+
		"8\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\29-\3\2\2"+
		"\29:\3\2\2\2:;\3\2\2\2;<\7\7\2\2<=\7\5\2\2=>\5\22\n\2>C\7\b\2\2?B\5\f"+
		"\7\2@B\5\n\6\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FG\7\t\2\2G\7\3\2\2\2HI\7\3\2\2IJ\7\n\2\2JK\7\4\2\2KL\7"+
		"\7\2\2LQ\7\b\2\2MP\5\f\7\2NP\5\n\6\2OM\3\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\t\2\2U\t\3\2\2\2V[\7\60\2\2W"+
		"X\7\6\2\2XZ\7\60\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2"+
		"\2][\3\2\2\2^a\7\5\2\2_b\5\26\f\2`b\5\30\r\2a_\3\2\2\2a`\3\2\2\2b\13\3"+
		"\2\2\2cd\7\60\2\2dm\7\4\2\2ej\5\16\b\2fg\7\6\2\2gi\5\16\b\2hf\3\2\2\2"+
		"il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2me\3\2\2\2mn\3\2\2\2"+
		"no\3\2\2\2o\u00b1\7\7\2\2pq\7\13\2\2q\u00b1\5\16\b\2rv\7\f\2\2su\5\16"+
		"\b\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y}\7\b"+
		"\2\2z|\5\f\7\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0087\3\2\2"+
		"\2\177}\3\2\2\2\u0080\u0084\7\r\2\2\u0081\u0083\5\f\7\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u00b1\7\t\2\2\u008a\u008e\7\16\2\2\u008b"+
		"\u008d\5\16\b\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0095\7\b\2\2\u0092\u0094\5\f\7\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u00b1\7\t\2\2\u0099\u009a\7\17\2\2\u009a\u009f\5"+
		"\16\b\2\u009b\u009c\7\6\2\2\u009c\u009e\5\16\b\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00b1\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a8\5\16\b\2\u00a4"+
		"\u00a5\7\6\2\2\u00a5\u00a7\5\16\b\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b1\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\5\16\b\2\u00ac\u00ad\7\21\2\2\u00ad\u00ae\5"+
		"\16\b\2\u00ae\u00af\b\7\1\2\u00af\u00b1\3\2\2\2\u00b0c\3\2\2\2\u00b0p"+
		"\3\2\2\2\u00b0r\3\2\2\2\u00b0\u008a\3\2\2\2\u00b0\u0099\3\2\2\2\u00b0"+
		"\u00a2\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b3\b\b\1\2"+
		"\u00b3\u00b4\7\60\2\2\u00b4\u00bd\7\4\2\2\u00b5\u00ba\5\16\b\2\u00b6\u00b7"+
		"\7\6\2\2\u00b7\u00b9\5\16\b\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00db\7\7\2\2\u00c0\u00c1\7*\2\2\u00c1\u00db\b\b\1\2\u00c2\u00c3\7\61"+
		"\2\2\u00c3\u00db\b\b\1\2\u00c4\u00c5\7+\2\2\u00c5\u00db\b\b\1\2\u00c6"+
		"\u00c7\7\60\2\2\u00c7\u00db\b\b\1\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\5"+
		"\16\b\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc\b\b\1\2\u00cc\u00db\3\2\2\2\u00cd"+
		"\u00ce\7\22\2\2\u00ce\u00cf\5\16\b\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1"+
		"\b\b\1\2\u00d1\u00db\3\2\2\2\u00d2\u00d3\7\26\2\2\u00d3\u00d4\5\16\b\b"+
		"\u00d4\u00d5\b\b\1\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\7\27\2\2\u00d7\u00d8"+
		"\5\16\b\7\u00d8\u00d9\b\b\1\2\u00d9\u00db\3\2\2\2\u00da\u00b2\3\2\2\2"+
		"\u00da\u00c0\3\2\2\2\u00da\u00c2\3\2\2\2\u00da\u00c4\3\2\2\2\u00da\u00c6"+
		"\3\2\2\2\u00da\u00c8\3\2\2\2\u00da\u00cd\3\2\2\2\u00da\u00d2\3\2\2\2\u00da"+
		"\u00d6\3\2\2\2\u00db\u0102\3\2\2\2\u00dc\u00dd\f\n\2\2\u00dd\u00de\7\24"+
		"\2\2\u00de\u00df\5\16\b\13\u00df\u00e0\b\b\1\2\u00e0\u0101\3\2\2\2\u00e1"+
		"\u00e2\f\6\2\2\u00e2\u00e3\t\2\2\2\u00e3\u00e4\5\16\b\7\u00e4\u00e5\b"+
		"\b\1\2\u00e5\u0101\3\2\2\2\u00e6\u00e7\f\5\2\2\u00e7\u00e8\t\3\2\2\u00e8"+
		"\u00e9\5\16\b\6\u00e9\u00ea\b\b\1\2\u00ea\u0101\3\2\2\2\u00eb\u00ec\f"+
		"\4\2\2\u00ec\u00ed\t\4\2\2\u00ed\u00ee\5\16\b\5\u00ee\u00ef\b\b\1\2\u00ef"+
		"\u0101\3\2\2\2\u00f0\u00f1\f\3\2\2\u00f1\u00f2\t\5\2\2\u00f2\u00f3\5\16"+
		"\b\4\u00f3\u00f4\b\b\1\2\u00f4\u0101\3\2\2\2\u00f5\u00f6\f\13\2\2\u00f6"+
		"\u00f7\7\22\2\2\u00f7\u00f8\5\16\b\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa"+
		"\b\b\1\2\u00fa\u0101\3\2\2\2\u00fb\u00fc\f\t\2\2\u00fc\u00fd\7\25\2\2"+
		"\u00fd\u00fe\5\20\t\2\u00fe\u00ff\b\b\1\2\u00ff\u0101\3\2\2\2\u0100\u00dc"+
		"\3\2\2\2\u0100\u00e1\3\2\2\2\u0100\u00e6\3\2\2\2\u0100\u00eb\3\2\2\2\u0100"+
		"\u00f0\3\2\2\2\u0100\u00f5\3\2\2\2\u0100\u00fb\3\2\2\2\u0101\u0104\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\17\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0105\u0106\5\26\f\2\u0106\u0107\b\t\1\2\u0107\u010f\3\2\2\2"+
		"\u0108\u0109\5\30\r\2\u0109\u010a\b\t\1\2\u010a\u010f\3\2\2\2\u010b\u010c"+
		"\5\24\13\2\u010c\u010d\b\t\1\2\u010d\u010f\3\2\2\2\u010e\u0105\3\2\2\2"+
		"\u010e\u0108\3\2\2\2\u010e\u010b\3\2\2\2\u010f\21\3\2\2\2\u0110\u0111"+
		"\5\26\f\2\u0111\u0112\b\n\1\2\u0112\u0117\3\2\2\2\u0113\u0114\5\24\13"+
		"\2\u0114\u0115\b\n\1\2\u0115\u0117\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0113"+
		"\3\2\2\2\u0117\23\3\2\2\2\u0118\u0119\7$\2\2\u0119\u011a\b\13\1\2\u011a"+
		"\25\3\2\2\2\u011b\u011c\7%\2\2\u011c\u0122\b\f\1\2\u011d\u011e\7&\2\2"+
		"\u011e\u0122\b\f\1\2\u011f\u0120\7\'\2\2\u0120\u0122\b\f\1\2\u0121\u011b"+
		"\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011f\3\2\2\2\u0122\27\3\2\2\2\u0123"+
		"\u0124\7(\2\2\u0124\u0128\7\b\2\2\u0125\u0127\5\n\6\2\u0126\u0125\3\2"+
		"\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0137\7\t\2\2\u012c\u012e\7\22"+
		"\2\2\u012d\u012f\t\6\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\5"+
		"\2\2\u0133\u0134\5\20\t\2\u0134\u0135\7\23\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0123\3\2\2\2\u0136\u012c\3\2\2\2\u0137\31\3\2\2\2\"\35(\669ACOQ[ajm"+
		"v}\u0084\u0087\u008e\u0095\u009f\u00a8\u00b0\u00ba\u00bd\u00da\u0100\u0102"+
		"\u010e\u0116\u0121\u0128\u0130\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}