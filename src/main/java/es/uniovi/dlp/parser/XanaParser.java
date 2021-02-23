// Generated from Xana.g4 by ANTLR 4.9.1

package es.uniovi.dlp.parser;

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
		RULE_varDefinition = 4, RULE_statements = 5, RULE_expression = 6, RULE_type = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "funcDefinition", "mainFunction", "varDefinition", 
			"statements", "expression", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def '", "'('", "'::'", "','", "')'", "'do'", "'end'", "'main'", 
			"'return'", "'if'", "'else'", "'while'", "'in'", "'puts'", "'='", "'['", 
			"']'", "'.'", "'as'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", 
			"'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'int'", "'char'", 
			"'double'", "'defstruct'", "'void'"
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
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(16);
					definitions();
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(22);
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
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				varDefinition();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				funcDefinition();
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
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
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
			setState(28);
			match(T__0);
			setState(29);
			match(ID);
			setState(30);
			match(T__1);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(31);
				match(ID);
				setState(32);
				match(T__2);
				setState(33);
				type();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(34);
					match(T__3);
					setState(35);
					match(ID);
					setState(36);
					match(T__2);
					setState(37);
					type();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(45);
			match(T__4);
			setState(46);
			match(T__2);
			setState(47);
			type();
			setState(48);
			match(T__5);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(49);
				statements();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(57);
			match(T__0);
			setState(58);
			match(T__7);
			setState(59);
			match(T__1);
			setState(60);
			match(T__4);
			setState(61);
			match(T__5);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(62);
				statements();
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(70);
			match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(71);
				match(T__3);
				setState(72);
				match(ID);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__2);
			setState(79);
			type();
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
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(ID);
				setState(82);
				match(T__1);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(83);
					expression(0);
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(84);
						match(T__3);
						setState(85);
						expression(0);
						}
						}
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(93);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				varDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__8);
				setState(96);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(T__9);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(98);
					expression(0);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(T__5);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(105);
					statements();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(111);
					match(T__10);
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						{
						setState(112);
						statements();
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(120);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(T__11);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(122);
					expression(0);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__5);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(129);
					statements();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(T__6);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(T__12);
				{
				setState(137);
				expression(0);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(138);
					match(T__3);
					setState(139);
					expression(0);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(T__13);
				{
				setState(146);
				expression(0);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(147);
					match(T__3);
					setState(148);
					expression(0);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				expression(0);
				setState(155);
				match(T__14);
				setState(156);
				expression(0);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(161);
				match(ID);
				setState(162);
				match(T__1);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					setState(163);
					expression(0);
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(164);
						match(T__3);
						setState(165);
						expression(0);
						}
						}
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(173);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(174);
				match(INT_CONSTANT);
				}
				break;
			case 3:
				{
				setState(175);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(176);
				match(REAL_CONSTANT);
				}
				break;
			case 5:
				{
				setState(177);
				match(ID);
				}
				break;
			case 6:
				{
				setState(178);
				match(T__1);
				setState(179);
				expression(0);
				setState(180);
				match(T__4);
				}
				break;
			case 7:
				{
				setState(182);
				match(T__15);
				setState(183);
				expression(0);
				setState(184);
				match(T__16);
				}
				break;
			case 8:
				{
				setState(186);
				match(T__19);
				setState(187);
				expression(6);
				}
				break;
			case 9:
				{
				setState(188);
				match(T__20);
				setState(189);
				expression(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(193);
						match(T__17);
						setState(194);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(196);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(199);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(200);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(202);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(205);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						expression(2);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(208);
						match(T__15);
						setState(209);
						expression(0);
						setState(210);
						match(T__16);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(213);
						match(T__18);
						setState(214);
						type();
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(T__36);
				setState(224);
				match(T__5);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(225);
					varDefinition();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(T__6);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(T__15);
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(233);
					expression(0);
					}
					}
					setState(236); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0) );
				setState(238);
				match(T__2);
				setState(239);
				type();
				setState(240);
				match(T__16);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(T__37);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00f8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n"+
		"\2\f\2\16\2\27\13\2\3\2\3\2\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\5\4.\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f"+
		"\5\16\5E\13\5\3\5\3\5\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\5\7^\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3"+
		"\7\7\7t\n\7\f\7\16\7w\13\7\5\7y\n\7\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081"+
		"\13\7\3\7\3\7\7\7\u0085\n\7\f\7\16\7\u0088\13\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u008f\n\7\f\7\16\7\u0092\13\7\3\7\3\7\3\7\3\7\7\7\u0098\n\7\f\7\16"+
		"\7\u009b\13\7\3\7\3\7\3\7\3\7\5\7\u00a1\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00a9\n\b\f\b\16\b\u00ac\13\b\5\b\u00ae\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c1\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00da\n\b\f\b\16\b\u00dd\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00e5\n\t\f\t\16\t\u00e8\13\t\3\t\3\t\3\t\6\t\u00ed\n\t\r\t\16\t\u00ee"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00f6\n\t\3\t\2\3\16\n\2\4\6\b\n\f\16\20\2\6"+
		"\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\2\u011f\2\25\3\2\2\2\4\34\3"+
		"\2\2\2\6\36\3\2\2\2\b;\3\2\2\2\nH\3\2\2\2\f\u00a0\3\2\2\2\16\u00c0\3\2"+
		"\2\2\20\u00f5\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\31\5\b\5\2\31\3"+
		"\3\2\2\2\32\35\5\n\6\2\33\35\5\6\4\2\34\32\3\2\2\2\34\33\3\2\2\2\35\5"+
		"\3\2\2\2\36\37\7\3\2\2\37 \7\60\2\2 -\7\4\2\2!\"\7\60\2\2\"#\7\5\2\2#"+
		"*\5\20\t\2$%\7\6\2\2%&\7\60\2\2&\'\7\5\2\2\')\5\20\t\2($\3\2\2\2),\3\2"+
		"\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*\3\2\2\2-!\3\2\2\2-.\3\2\2\2./\3\2"+
		"\2\2/\60\7\7\2\2\60\61\7\5\2\2\61\62\5\20\t\2\62\66\7\b\2\2\63\65\5\f"+
		"\7\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\2"+
		"8\66\3\2\2\29:\7\t\2\2:\7\3\2\2\2;<\7\3\2\2<=\7\n\2\2=>\7\4\2\2>?\7\7"+
		"\2\2?C\7\b\2\2@B\5\f\7\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FG\7\t\2\2G\t\3\2\2\2HM\7\60\2\2IJ\7\6\2\2JL\7\60\2\2KI"+
		"\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\5\2\2Q"+
		"R\5\20\t\2R\13\3\2\2\2ST\7\60\2\2T]\7\4\2\2UZ\5\16\b\2VW\7\6\2\2WY\5\16"+
		"\b\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]U\3"+
		"\2\2\2]^\3\2\2\2^_\3\2\2\2_\u00a1\7\7\2\2`\u00a1\5\n\6\2ab\7\13\2\2b\u00a1"+
		"\5\16\b\2cg\7\f\2\2df\5\16\b\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hj\3\2\2\2ig\3\2\2\2jn\7\b\2\2km\5\f\7\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2ox\3\2\2\2pn\3\2\2\2qu\7\r\2\2rt\5\f\7\2sr\3\2\2\2tw\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xq\3\2\2\2xy\3\2\2\2yz\3\2\2\2"+
		"z\u00a1\7\t\2\2{\177\7\16\2\2|~\5\16\b\2}|\3\2\2\2~\u0081\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0086\7\b\2\2\u0083\u0085\5\f\7\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u00a1\7\t\2\2\u008a\u008b\7\17\2\2\u008b\u0090\5"+
		"\16\b\2\u008c\u008d\7\6\2\2\u008d\u008f\5\16\b\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u00a1\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\20\2\2\u0094\u0099\5\16\b\2\u0095"+
		"\u0096\7\6\2\2\u0096\u0098\5\16\b\2\u0097\u0095\3\2\2\2\u0098\u009b\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a1\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009d\5\16\b\2\u009d\u009e\7\21\2\2\u009e\u009f\5"+
		"\16\b\2\u009f\u00a1\3\2\2\2\u00a0S\3\2\2\2\u00a0`\3\2\2\2\u00a0a\3\2\2"+
		"\2\u00a0c\3\2\2\2\u00a0{\3\2\2\2\u00a0\u008a\3\2\2\2\u00a0\u0093\3\2\2"+
		"\2\u00a0\u009c\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a3\b\b\1\2\u00a3\u00a4"+
		"\7\60\2\2\u00a4\u00ad\7\4\2\2\u00a5\u00aa\5\16\b\2\u00a6\u00a7\7\6\2\2"+
		"\u00a7\u00a9\5\16\b\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00a5\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00c1\7\7"+
		"\2\2\u00b0\u00c1\7*\2\2\u00b1\u00c1\7\61\2\2\u00b2\u00c1\7+\2\2\u00b3"+
		"\u00c1\7\60\2\2\u00b4\u00b5\7\4\2\2\u00b5\u00b6\5\16\b\2\u00b6\u00b7\7"+
		"\7\2\2\u00b7\u00c1\3\2\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\5\16\b\2\u00ba"+
		"\u00bb\7\23\2\2\u00bb\u00c1\3\2\2\2\u00bc\u00bd\7\26\2\2\u00bd\u00c1\5"+
		"\16\b\b\u00be\u00bf\7\27\2\2\u00bf\u00c1\5\16\b\7\u00c0\u00a2\3\2\2\2"+
		"\u00c0\u00b0\3\2\2\2\u00c0\u00b1\3\2\2\2\u00c0\u00b2\3\2\2\2\u00c0\u00b3"+
		"\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00db\3\2\2\2\u00c2\u00c3\f\n\2\2\u00c3\u00c4\7\24"+
		"\2\2\u00c4\u00da\5\16\b\13\u00c5\u00c6\f\6\2\2\u00c6\u00c7\t\2\2\2\u00c7"+
		"\u00da\5\16\b\7\u00c8\u00c9\f\5\2\2\u00c9\u00ca\t\3\2\2\u00ca\u00da\5"+
		"\16\b\6\u00cb\u00cc\f\4\2\2\u00cc\u00cd\t\4\2\2\u00cd\u00da\5\16\b\5\u00ce"+
		"\u00cf\f\3\2\2\u00cf\u00d0\t\5\2\2\u00d0\u00da\5\16\b\4\u00d1\u00d2\f"+
		"\13\2\2\u00d2\u00d3\7\22\2\2\u00d3\u00d4\5\16\b\2\u00d4\u00d5\7\23\2\2"+
		"\u00d5\u00da\3\2\2\2\u00d6\u00d7\f\t\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00da"+
		"\5\20\t\2\u00d9\u00c2\3\2\2\2\u00d9\u00c5\3\2\2\2\u00d9\u00c8\3\2\2\2"+
		"\u00d9\u00cb\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d6"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\17\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00f6\7$\2\2\u00df\u00f6\7%\2\2"+
		"\u00e0\u00f6\7&\2\2\u00e1\u00e2\7\'\2\2\u00e2\u00e6\7\b\2\2\u00e3\u00e5"+
		"\5\n\6\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00f6\7\t"+
		"\2\2\u00ea\u00ec\7\22\2\2\u00eb\u00ed\5\16\b\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\7\5\2\2\u00f1\u00f2\5\20\t\2\u00f2\u00f3\7\23\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f6\7(\2\2\u00f5\u00de\3\2\2\2\u00f5\u00df\3\2"+
		"\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00e1\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\21\3\2\2\2\34\25\34*-\66CMZ]gnux\177\u0086\u0090"+
		"\u0099\u00a0\u00aa\u00ad\u00c0\u00d9\u00db\u00e6\u00ee\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}