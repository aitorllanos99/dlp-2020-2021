// Generated from D:/1Escritorio/Informatica/Uni/Cuarto Curso/Segundo Cuatrimestre/DLP/Compiler/src/main/antlr4\Xana.g4 by ANTLR 4.9.1

package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.*;

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
		RULE_program = 0, RULE_definitions = 1, RULE_funcDefinition = 2, RULE_funcParameters = 3, 
		RULE_funcBody = 4, RULE_mainFunction = 5, RULE_varDefinition = 6, RULE_varTypes = 7, 
		RULE_moreIdentDefinitions = 8, RULE_statements = 9, RULE_moreExpressions = 10, 
		RULE_moreStatements = 11, RULE_moreParameters = 12, RULE_expression = 13, 
		RULE_type = 14, RULE_functionTypes = 15, RULE_voidType = 16, RULE_primitiveType = 17, 
		RULE_complexType = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "funcDefinition", "funcParameters", "funcBody", 
			"mainFunction", "varDefinition", "varTypes", "moreIdentDefinitions", 
			"statements", "moreExpressions", "moreStatements", "moreParameters", 
			"expression", "type", "functionTypes", "voidType", "primitiveType", "complexType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def '", "'('", "')'", "'::'", "'do'", "'end'", "','", "'main'", 
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
		public Program ast;
		public DefinitionsContext d;
		public MainFunctionContext mf;
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			((ProgramContext)_localctx).d = definitions();
			setState(39);
			((ProgramContext)_localctx).mf = mainFunction();
			((ProgramContext)_localctx).d.ast.add(((ProgramContext)_localctx).mf.ast); ((ProgramContext)_localctx).ast =  new Program((((ProgramContext)_localctx).d!=null?(((ProgramContext)_localctx).d.start):null).getLine(), (((ProgramContext)_localctx).d!=null?(((ProgramContext)_localctx).d.start):null).getCharPositionInLine() +1, ((ProgramContext)_localctx).d.ast);
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
		public List<Definition> ast = new ArrayList<Definition>();
		public VarDefinitionContext varDefinition;
		public FuncDefinitionContext funcDefinition;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<FuncDefinitionContext> funcDefinition() {
			return getRuleContexts(FuncDefinitionContext.class);
		}
		public FuncDefinitionContext funcDefinition(int i) {
			return getRuleContext(FuncDefinitionContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(48);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(42);
						((DefinitionsContext)_localctx).varDefinition = varDefinition();
						_localctx.ast.addAll(((DefinitionsContext)_localctx).varDefinition.ast);
						}
						break;
					case T__0:
						{
						setState(45);
						((DefinitionsContext)_localctx).funcDefinition = funcDefinition();
						_localctx.ast.add(((DefinitionsContext)_localctx).funcDefinition.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class FuncDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token id;
		public FuncParametersContext fp;
		public FunctionTypesContext ft;
		public FuncBodyContext fb;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public FunctionTypesContext functionTypes() {
			return getRuleContext(FunctionTypesContext.class,0);
		}
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public FuncParametersContext funcParameters() {
			return getRuleContext(FuncParametersContext.class,0);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterFuncDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitFuncDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			((FuncDefinitionContext)_localctx).id = match(ID);
			setState(55);
			match(T__1);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(56);
				((FuncDefinitionContext)_localctx).fp = funcParameters();
				}
			}

			setState(59);
			match(T__2);
			setState(60);
			match(T__3);
			setState(61);
			((FuncDefinitionContext)_localctx).ft = functionTypes();
			setState(62);
			match(T__4);
			setState(63);
			((FuncDefinitionContext)_localctx).fb = funcBody();
			setState(64);
			match(T__5);
			((FuncDefinitionContext)_localctx).ast =  new FuncDefinition(((FuncDefinitionContext)_localctx).id.getLine(), ((FuncDefinitionContext)_localctx).id.getCharPositionInLine()+1, ((FuncDefinitionContext)_localctx).fb.stat, ((FuncDefinitionContext)_localctx).fb.varDef, ((FuncDefinitionContext)_localctx).ft.t,(((FuncDefinitionContext)_localctx).id!=null?((FuncDefinitionContext)_localctx).id.getText():null));
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

	public static class FuncParametersContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token id1;
		public TypeContext t1;
		public Token id2;
		public TypeContext t2;
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
		public FuncParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterFuncParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitFuncParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitFuncParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParametersContext funcParameters() throws RecognitionException {
		FuncParametersContext _localctx = new FuncParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67);
			((FuncParametersContext)_localctx).id1 = match(ID);
			setState(68);
			match(T__3);
			setState(69);
			((FuncParametersContext)_localctx).t1 = type();
			_localctx.ast.add(new VarDefinition(((FuncParametersContext)_localctx).id1.getLine(), ((FuncParametersContext)_localctx).id1.getCharPositionInLine() +1, (((FuncParametersContext)_localctx).id1!=null?((FuncParametersContext)_localctx).id1.getText():null), ((FuncParametersContext)_localctx).t1.t));
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(71);
				match(T__6);
				setState(72);
				((FuncParametersContext)_localctx).id2 = match(ID);
				setState(73);
				match(T__3);
				setState(74);
				((FuncParametersContext)_localctx).t2 = type();
				_localctx.ast.add(new VarDefinition(((FuncParametersContext)_localctx).id2.getLine(), ((FuncParametersContext)_localctx).id2.getCharPositionInLine() +1, (((FuncParametersContext)_localctx).id2!=null?((FuncParametersContext)_localctx).id2.getText():null), ((FuncParametersContext)_localctx).t2.t));
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FuncBodyContext extends ParserRuleContext {
		public List<Statement> stat = new ArrayList<Statement>();
		public List<VarDefinition> varDef = new ArrayList<VarDefinition>();
		public StatementsContext s;
		public VarDefinitionContext v;
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
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(82);
					((FuncBodyContext)_localctx).s = statements();
					_localctx.stat.addAll(((FuncBodyContext)_localctx).s.st);
					}
					break;
				case 2:
					{
					setState(85);
					((FuncBodyContext)_localctx).v = varDefinition();
					_localctx.varDef.addAll(((FuncBodyContext)_localctx).v.ast);
					}
					break;
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MainFunctionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token id;
		public FuncBodyContext fb;
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__0);
			setState(94);
			((MainFunctionContext)_localctx).id = match(T__7);
			setState(95);
			match(T__1);
			setState(96);
			match(T__2);
			setState(97);
			match(T__4);
			setState(98);
			((MainFunctionContext)_localctx).fb = funcBody();
			setState(99);
			match(T__5);
			((MainFunctionContext)_localctx).ast =  new FuncDefinition(((MainFunctionContext)_localctx).id.getLine(), ((MainFunctionContext)_localctx).id.getCharPositionInLine()+1, ((MainFunctionContext)_localctx).fb.stat, ((MainFunctionContext)_localctx).fb.varDef, new VoidType(((MainFunctionContext)_localctx).id.getLine(), ((MainFunctionContext)_localctx).id.getCharPositionInLine()+1),(((MainFunctionContext)_localctx).id!=null?((MainFunctionContext)_localctx).id.getText():null));
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
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public MoreIdentDefinitionsContext mid;
		public VarTypesContext t;
		public MoreIdentDefinitionsContext moreIdentDefinitions() {
			return getRuleContext(MoreIdentDefinitionsContext.class,0);
		}
		public VarTypesContext varTypes() {
			return getRuleContext(VarTypesContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitVarDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((VarDefinitionContext)_localctx).mid = moreIdentDefinitions();
			setState(103);
			match(T__3);
			setState(104);
			((VarDefinitionContext)_localctx).t = varTypes();
			for(String s: ((VarDefinitionContext)_localctx).mid.ast) _localctx.ast.add(new VarDefinition((((VarDefinitionContext)_localctx).mid!=null?(((VarDefinitionContext)_localctx).mid.start):null).getLine(), (((VarDefinitionContext)_localctx).mid!=null?(((VarDefinitionContext)_localctx).mid.start):null).getCharPositionInLine() +1 , s, ((VarDefinitionContext)_localctx).t.t));
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

	public static class VarTypesContext extends ParserRuleContext {
		public Type t;
		public PrimitiveTypeContext p;
		public ComplexTypeContext c;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public VarTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterVarTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitVarTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitVarTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypesContext varTypes() throws RecognitionException {
		VarTypesContext _localctx = new VarTypesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varTypes);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((VarTypesContext)_localctx).p = primitiveType();
				((VarTypesContext)_localctx).t =  ((VarTypesContext)_localctx).p.t;
				}
				break;
			case T__15:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				((VarTypesContext)_localctx).c = complexType();
				((VarTypesContext)_localctx).t =  ((VarTypesContext)_localctx).c.t;
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

	public static class MoreIdentDefinitionsContext extends ParserRuleContext {
		public List<String> ast = new ArrayList<String>();
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public MoreIdentDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreIdentDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterMoreIdentDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitMoreIdentDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitMoreIdentDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreIdentDefinitionsContext moreIdentDefinitions() throws RecognitionException {
		MoreIdentDefinitionsContext _localctx = new MoreIdentDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moreIdentDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((MoreIdentDefinitionsContext)_localctx).id1 = match(ID);
			_localctx.ast.add((((MoreIdentDefinitionsContext)_localctx).id1!=null?((MoreIdentDefinitionsContext)_localctx).id1.getText():null));
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(117);
				match(T__6);
				setState(118);
				((MoreIdentDefinitionsContext)_localctx).id2 = match(ID);
				_localctx.ast.add((((MoreIdentDefinitionsContext)_localctx).id2!=null?((MoreIdentDefinitionsContext)_localctx).id2.getText():null));
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public List<Statement> st = new ArrayList<Statement>();
		public Token ID;
		public MoreParametersContext mp;
		public ExpressionContext expression;
		public ExpressionContext ex;
		public StatementsContext statements;
		public List<StatementsContext> ms = new ArrayList<StatementsContext>();
		public List<StatementsContext> ms2 = new ArrayList<StatementsContext>();
		public MoreExpressionsContext me;
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public MoreParametersContext moreParameters() {
			return getRuleContext(MoreParametersContext.class,0);
		}
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
		public MoreExpressionsContext moreExpressions() {
			return getRuleContext(MoreExpressionsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statements);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((StatementsContext)_localctx).ID = match(ID);
				setState(126);
				match(T__1);
				setState(127);
				((StatementsContext)_localctx).mp = moreParameters();
				setState(128);
				match(T__2);
				_localctx.st.add(new Invocation(((StatementsContext)_localctx).ID.getLine(), ((StatementsContext)_localctx).ID.getCharPositionInLine(), new Variable(((StatementsContext)_localctx).ID.getLine(), ((StatementsContext)_localctx).ID.getCharPositionInLine() + 1, (((StatementsContext)_localctx).ID!=null?((StatementsContext)_localctx).ID.getText():null)), ((StatementsContext)_localctx).mp.ast));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__8);
				setState(132);
				((StatementsContext)_localctx).expression = expression(0);
				_localctx.st.add(new Return ((((StatementsContext)_localctx).expression!=null?(((StatementsContext)_localctx).expression.start):null).getLine(), (((StatementsContext)_localctx).expression!=null?(((StatementsContext)_localctx).expression.start):null).getCharPositionInLine() +1 , ((StatementsContext)_localctx).expression.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__9);
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					((StatementsContext)_localctx).ex = expression(0);
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0) );
				setState(141);
				match(T__4);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(142);
					((StatementsContext)_localctx).statements = statements();
					((StatementsContext)_localctx).ms.add(((StatementsContext)_localctx).statements);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(148);
					match(T__10);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
						{
						{
						setState(149);
						((StatementsContext)_localctx).statements = statements();
						((StatementsContext)_localctx).ms2.add(((StatementsContext)_localctx).statements);
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(157);
				match(T__5);
				List<Statement> ifs = new ArrayList<Statement>();
				                                                                                               for(var s: ((StatementsContext)_localctx).ms) ifs.addAll(s.st);
				                                                                                               List<Statement> elses = new ArrayList<Statement>();
				                                                                                               for(var s: ((StatementsContext)_localctx).ms2) elses.addAll(s.st);
				                                                                                               _localctx.st.add(new IfElse((((StatementsContext)_localctx).ex!=null?(((StatementsContext)_localctx).ex.start):null).getLine(), (((StatementsContext)_localctx).ex!=null?(((StatementsContext)_localctx).ex.start):null).getCharPositionInLine()+1, ((StatementsContext)_localctx).ex.ast, ifs,elses));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__11);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					((StatementsContext)_localctx).ex = expression(0);
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0) );
				setState(166);
				match(T__4);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(167);
					((StatementsContext)_localctx).statements = statements();
					((StatementsContext)_localctx).ms.add(((StatementsContext)_localctx).statements);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(T__5);
				List<Statement> sts = new ArrayList<Statement>();
				                                                                   for(var s: ((StatementsContext)_localctx).ms) sts.addAll(s.st);_localctx.st.add(new While((((StatementsContext)_localctx).ex!=null?(((StatementsContext)_localctx).ex.start):null).getLine(), (((StatementsContext)_localctx).ex!=null?(((StatementsContext)_localctx).ex.start):null).getCharPositionInLine()+1, sts, ((StatementsContext)_localctx).ex.ast));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				match(T__12);
				setState(177);
				((StatementsContext)_localctx).me = moreExpressions();
				((StatementsContext)_localctx).me.ast.stream().map(e-> _localctx.st.add(new Read((((StatementsContext)_localctx).me!=null?(((StatementsContext)_localctx).me.start):null).getLine(), (((StatementsContext)_localctx).me!=null?(((StatementsContext)_localctx).me.start):null).getCharPositionInLine() +1, e)));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(T__13);
				setState(181);
				((StatementsContext)_localctx).me = moreExpressions();
				((StatementsContext)_localctx).me.ast.stream().map(e-> _localctx.st.add(new Write((((StatementsContext)_localctx).me!=null?(((StatementsContext)_localctx).me.start):null).getLine(), (((StatementsContext)_localctx).me!=null?(((StatementsContext)_localctx).me.start):null).getCharPositionInLine() +1, e)));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				((StatementsContext)_localctx).left = expression(0);
				setState(185);
				match(T__14);
				setState(186);
				((StatementsContext)_localctx).right = expression(0);
				_localctx.st.add(new Assignment((((StatementsContext)_localctx).left!=null?(((StatementsContext)_localctx).left.start):null).getLine(), (((StatementsContext)_localctx).left!=null?(((StatementsContext)_localctx).left.start):null).getCharPositionInLine() +1 , ((StatementsContext)_localctx).left.ast ,  ((StatementsContext)_localctx).right.ast));
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

	public static class MoreExpressionsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MoreExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterMoreExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitMoreExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitMoreExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreExpressionsContext moreExpressions() throws RecognitionException {
		MoreExpressionsContext _localctx = new MoreExpressionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_moreExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((MoreExpressionsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((MoreExpressionsContext)_localctx).e1.ast);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(193);
				match(T__6);
				setState(194);
				((MoreExpressionsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((MoreExpressionsContext)_localctx).e2.ast);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MoreStatementsContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementsContext stat;
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public MoreStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterMoreStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitMoreStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitMoreStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreStatementsContext moreStatements() throws RecognitionException {
		MoreStatementsContext _localctx = new MoreStatementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_moreStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(202);
				((MoreStatementsContext)_localctx).stat = statements();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			for(Statement s: ((MoreStatementsContext)_localctx).stat.st) _localctx.ast.add(s);
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

	public static class MoreParametersContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MoreParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterMoreParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitMoreParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitMoreParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreParametersContext moreParameters() throws RecognitionException {
		MoreParametersContext _localctx = new MoreParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_moreParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(210);
				((MoreParametersContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((MoreParametersContext)_localctx).e1.ast);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(212);
					match(T__6);
					setState(213);
					((MoreParametersContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((MoreParametersContext)_localctx).e2.ast);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext left;
		public ExpressionContext exp;
		public Token ID;
		public MoreParametersContext mp;
		public Token i;
		public Token c;
		public Token r;
		public Token id;
		public ExpressionContext expression;
		public ExpressionContext right;
		public Token op;
		public TypeContext tc;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public MoreParametersContext moreParameters() {
			return getRuleContext(MoreParametersContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(XanaParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(XanaParser.REAL_CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(224);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(225);
				match(T__1);
				setState(226);
				((ExpressionContext)_localctx).mp = moreParameters();
				setState(227);
				match(T__2);
				((ExpressionContext)_localctx).ast =  new Invocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine(), new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)), ((ExpressionContext)_localctx).mp.ast);
				}
				break;
			case 2:
				{
				setState(230);
				((ExpressionContext)_localctx).i = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).i.getLine(), ((ExpressionContext)_localctx).i.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null)));
				}
				break;
			case 3:
				{
				setState(232);
				((ExpressionContext)_localctx).c = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).c.getLine(), ((ExpressionContext)_localctx).c.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null)));
				}
				break;
			case 4:
				{
				setState(234);
				((ExpressionContext)_localctx).r = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).r.getLine(), ((ExpressionContext)_localctx).r.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).r!=null?((ExpressionContext)_localctx).r.getText():null)));
				}
				break;
			case 5:
				{
				setState(236);
				((ExpressionContext)_localctx).id = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).id.getLine(), ((ExpressionContext)_localctx).id.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null));
				}
				break;
			case 6:
				{
				setState(238);
				match(T__1);
				setState(239);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(240);
				match(T__2);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 7:
				{
				setState(243);
				match(T__15);
				setState(244);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(245);
				match(T__16);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 8:
				{
				setState(248);
				match(T__19);
				setState(249);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).exp.ast);
				}
				break;
			case 9:
				{
				setState(252);
				match(T__20);
				setState(253);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(5);
				((ExpressionContext)_localctx).ast =  new UnaryNot((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).exp.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(259);
						match(T__17);
						setState(260);
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
						setState(263);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(264);
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
						setState(265);
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
						setState(268);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(269);
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
						setState(270);
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
						setState(273);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(274);
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
						setState(275);
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
						setState(278);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(279);
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
						setState(280);
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
						setState(283);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(284);
						match(T__15);
						setState(285);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(286);
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
						setState(289);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(290);
						match(T__18);
						setState(291);
						((ExpressionContext)_localctx).tc = type();
						((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).tc.t, ((ExpressionContext)_localctx).exp.ast);
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public ComplexTypeContext c;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				((TypeContext)_localctx).p = primitiveType();
				((TypeContext)_localctx).t =  ((TypeContext)_localctx).p.t;
				}
				break;
			case T__15:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				((TypeContext)_localctx).c = complexType();
				((TypeContext)_localctx).t =  ((TypeContext)_localctx).c.t;
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				((TypeContext)_localctx).v = voidType();
				((TypeContext)_localctx).t =  ((TypeContext)_localctx).v.t;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterFunctionTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitFunctionTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitFunctionTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypesContext functionTypes() throws RecognitionException {
		FunctionTypesContext _localctx = new FunctionTypesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionTypes);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((FunctionTypesContext)_localctx).p = primitiveType();
				((FunctionTypesContext)_localctx).t =  ((FunctionTypesContext)_localctx).p.t;
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				((FunctionTypesContext)_localctx).v = voidType();
				((FunctionTypesContext)_localctx).t =  ((FunctionTypesContext)_localctx).v.t;
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primitiveType);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				((PrimitiveTypeContext)_localctx).i = match(T__34);
				((PrimitiveTypeContext)_localctx).t =  new IntType(((PrimitiveTypeContext)_localctx).i.getLine(), ((PrimitiveTypeContext)_localctx).i.getCharPositionInLine() +1);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				((PrimitiveTypeContext)_localctx).c = match(T__35);
				((PrimitiveTypeContext)_localctx).t =  new CharType(((PrimitiveTypeContext)_localctx).c.getLine(), ((PrimitiveTypeContext)_localctx).c.getCharPositionInLine() + 1);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
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
		public Type t;
		public Token id;
		public VarDefinitionContext varDefinition;
		public List<VarDefinitionContext> vd = new ArrayList<VarDefinitionContext>();
		public Token i;
		public TypeContext tp;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XanaListener ) ((XanaListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XanaVisitor ) return ((XanaVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_complexType);
		int _la;
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				((ComplexTypeContext)_localctx).id = match(T__37);
				setState(330);
				match(T__4);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(331);
					((ComplexTypeContext)_localctx).varDefinition = varDefinition();
					((ComplexTypeContext)_localctx).vd.add(((ComplexTypeContext)_localctx).varDefinition);
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(T__5);
				List<RecordField> rec = new ArrayList<RecordField>();
				                                                                                List<VarDefinition> vds = new ArrayList<VarDefinition>();
				                                                                                for(var v: ((ComplexTypeContext)_localctx).vd) vds.addAll(v.ast);
				                                                                                for(var v: vds) rec.add(new RecordField(v.getLine(),v.getColumn(),v.getName(),v.getType()));
				                                                                                ((ComplexTypeContext)_localctx).t =  new RecordType(((ComplexTypeContext)_localctx).id.getLine(), ((ComplexTypeContext)_localctx).id.getCharPositionInLine()+1, rec);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(T__15);
				setState(340);
				((ComplexTypeContext)_localctx).i = match(INT_CONSTANT);
				setState(341);
				match(T__3);
				setState(342);
				((ComplexTypeContext)_localctx).tp = type();
				setState(343);
				match(T__16);
				((ComplexTypeContext)_localctx).t =  new ArrayType(((ComplexTypeContext)_localctx).i.getLine(), ((ComplexTypeContext)_localctx).i.getCharPositionInLine()+1,((ComplexTypeContext)_localctx).tp.t,LexerHelper.lexemeToInt((((ComplexTypeContext)_localctx).i!=null?((ComplexTypeContext)_localctx).i.getText():null)));
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u015f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n"+
		"\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u008c\n\13\r\13\16\13\u008d\3\13"+
		"\3\13\7\13\u0092\n\13\f\13\16\13\u0095\13\13\3\13\3\13\7\13\u0099\n\13"+
		"\f\13\16\13\u009c\13\13\5\13\u009e\n\13\3\13\3\13\3\13\3\13\3\13\6\13"+
		"\u00a5\n\13\r\13\16\13\u00a6\3\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00c0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c8\n\f"+
		"\f\f\16\f\u00cb\13\f\3\r\7\r\u00ce\n\r\f\r\16\r\u00d1\13\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00db\n\16\f\16\16\16\u00de\13\16\5\16"+
		"\u00e0\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0103\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0129\n\17\f\17\16\17\u012c\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0137\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u013f\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u014a\n\23\3\24\3\24\3\24\7\24\u014f\n\24\f\24\16\24\u0152\13\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u015d\n\24\3\24\2\3"+
		"\34\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\30\32\4\2\26"+
		"\26\33\33\3\2\34!\3\2\"#\2\u0179\2(\3\2\2\2\4\64\3\2\2\2\6\67\3\2\2\2"+
		"\bE\3\2\2\2\n\\\3\2\2\2\f_\3\2\2\2\16h\3\2\2\2\20s\3\2\2\2\22u\3\2\2\2"+
		"\24\u00bf\3\2\2\2\26\u00c1\3\2\2\2\30\u00cf\3\2\2\2\32\u00df\3\2\2\2\34"+
		"\u0102\3\2\2\2\36\u0136\3\2\2\2 \u013e\3\2\2\2\"\u0140\3\2\2\2$\u0149"+
		"\3\2\2\2&\u015c\3\2\2\2()\5\4\3\2)*\5\f\7\2*+\b\2\1\2+\3\3\2\2\2,-\5\16"+
		"\b\2-.\b\3\1\2.\63\3\2\2\2/\60\5\6\4\2\60\61\b\3\1\2\61\63\3\2\2\2\62"+
		",\3\2\2\2\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3"+
		"\2\2\2\66\64\3\2\2\2\678\7\3\2\289\7\60\2\29;\7\4\2\2:<\5\b\5\2;:\3\2"+
		"\2\2;<\3\2\2\2<=\3\2\2\2=>\7\5\2\2>?\7\6\2\2?@\5 \21\2@A\7\7\2\2AB\5\n"+
		"\6\2BC\7\b\2\2CD\b\4\1\2D\7\3\2\2\2EF\7\60\2\2FG\7\6\2\2GH\5\36\20\2H"+
		"Q\b\5\1\2IJ\7\t\2\2JK\7\60\2\2KL\7\6\2\2LM\5\36\20\2MN\b\5\1\2NP\3\2\2"+
		"\2OI\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\t\3\2\2\2SQ\3\2\2\2TU\5\24"+
		"\13\2UV\b\6\1\2V[\3\2\2\2WX\5\16\b\2XY\b\6\1\2Y[\3\2\2\2ZT\3\2\2\2ZW\3"+
		"\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^\\\3\2\2\2_`\7\3\2"+
		"\2`a\7\n\2\2ab\7\4\2\2bc\7\5\2\2cd\7\7\2\2de\5\n\6\2ef\7\b\2\2fg\b\7\1"+
		"\2g\r\3\2\2\2hi\5\22\n\2ij\7\6\2\2jk\5\20\t\2kl\b\b\1\2l\17\3\2\2\2mn"+
		"\5$\23\2no\b\t\1\2ot\3\2\2\2pq\5&\24\2qr\b\t\1\2rt\3\2\2\2sm\3\2\2\2s"+
		"p\3\2\2\2t\21\3\2\2\2uv\7\60\2\2v|\b\n\1\2wx\7\t\2\2xy\7\60\2\2y{\b\n"+
		"\1\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\23\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7\60\2\2\u0080\u0081\7\4\2\2\u0081\u0082\5\32\16\2\u0082\u0083"+
		"\7\5\2\2\u0083\u0084\b\13\1\2\u0084\u00c0\3\2\2\2\u0085\u0086\7\13\2\2"+
		"\u0086\u0087\5\34\17\2\u0087\u0088\b\13\1\2\u0088\u00c0\3\2\2\2\u0089"+
		"\u008b\7\f\2\2\u008a\u008c\5\34\17\2\u008b\u008a\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0093\7\7\2\2\u0090\u0092\5\24\13\2\u0091\u0090\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009d\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u009a\7\r\2\2\u0097\u0099\5\24\13\2\u0098\u0097\3"+
		"\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\b\13\1\2\u00a1"+
		"\u00c0\3\2\2\2\u00a2\u00a4\7\16\2\2\u00a3\u00a5\5\34\17\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ac\7\7\2\2\u00a9\u00ab\5\24\13\2\u00aa\u00a9\3"+
		"\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\b\13"+
		"\1\2\u00b1\u00c0\3\2\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b4\5\26\f\2\u00b4"+
		"\u00b5\b\13\1\2\u00b5\u00c0\3\2\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\5"+
		"\26\f\2\u00b8\u00b9\b\13\1\2\u00b9\u00c0\3\2\2\2\u00ba\u00bb\5\34\17\2"+
		"\u00bb\u00bc\7\21\2\2\u00bc\u00bd\5\34\17\2\u00bd\u00be\b\13\1\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\177\3\2\2\2\u00bf\u0085\3\2\2\2\u00bf\u0089\3\2\2"+
		"\2\u00bf\u00a2\3\2\2\2\u00bf\u00b2\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00ba"+
		"\3\2\2\2\u00c0\25\3\2\2\2\u00c1\u00c2\5\34\17\2\u00c2\u00c9\b\f\1\2\u00c3"+
		"\u00c4\7\t\2\2\u00c4\u00c5\5\34\17\2\u00c5\u00c6\b\f\1\2\u00c6\u00c8\3"+
		"\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\5\24\13"+
		"\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\r\1\2\u00d3"+
		"\31\3\2\2\2\u00d4\u00d5\5\34\17\2\u00d5\u00dc\b\16\1\2\u00d6\u00d7\7\t"+
		"\2\2\u00d7\u00d8\5\34\17\2\u00d8\u00d9\b\16\1\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d6\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00d4\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\b\17\1\2\u00e2\u00e3\7\60"+
		"\2\2\u00e3\u00e4\7\4\2\2\u00e4\u00e5\5\32\16\2\u00e5\u00e6\7\5\2\2\u00e6"+
		"\u00e7\b\17\1\2\u00e7\u0103\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9\u0103\b\17"+
		"\1\2\u00ea\u00eb\7\61\2\2\u00eb\u0103\b\17\1\2\u00ec\u00ed\7+\2\2\u00ed"+
		"\u0103\b\17\1\2\u00ee\u00ef\7\60\2\2\u00ef\u0103\b\17\1\2\u00f0\u00f1"+
		"\7\4\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\b\17\1"+
		"\2\u00f4\u0103\3\2\2\2\u00f5\u00f6\7\22\2\2\u00f6\u00f7\5\34\17\2\u00f7"+
		"\u00f8\7\23\2\2\u00f8\u00f9\b\17\1\2\u00f9\u0103\3\2\2\2\u00fa\u00fb\7"+
		"\26\2\2\u00fb\u00fc\5\34\17\b\u00fc\u00fd\b\17\1\2\u00fd\u0103\3\2\2\2"+
		"\u00fe\u00ff\7\27\2\2\u00ff\u0100\5\34\17\7\u0100\u0101\b\17\1\2\u0101"+
		"\u0103\3\2\2\2\u0102\u00e1\3\2\2\2\u0102\u00e8\3\2\2\2\u0102\u00ea\3\2"+
		"\2\2\u0102\u00ec\3\2\2\2\u0102\u00ee\3\2\2\2\u0102\u00f0\3\2\2\2\u0102"+
		"\u00f5\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\u012a\3\2"+
		"\2\2\u0104\u0105\f\n\2\2\u0105\u0106\7\24\2\2\u0106\u0107\5\34\17\13\u0107"+
		"\u0108\b\17\1\2\u0108\u0129\3\2\2\2\u0109\u010a\f\6\2\2\u010a\u010b\t"+
		"\2\2\2\u010b\u010c\5\34\17\7\u010c\u010d\b\17\1\2\u010d\u0129\3\2\2\2"+
		"\u010e\u010f\f\5\2\2\u010f\u0110\t\3\2\2\u0110\u0111\5\34\17\6\u0111\u0112"+
		"\b\17\1\2\u0112\u0129\3\2\2\2\u0113\u0114\f\4\2\2\u0114\u0115\t\4\2\2"+
		"\u0115\u0116\5\34\17\5\u0116\u0117\b\17\1\2\u0117\u0129\3\2\2\2\u0118"+
		"\u0119\f\3\2\2\u0119\u011a\t\5\2\2\u011a\u011b\5\34\17\4\u011b\u011c\b"+
		"\17\1\2\u011c\u0129\3\2\2\2\u011d\u011e\f\13\2\2\u011e\u011f\7\22\2\2"+
		"\u011f\u0120\5\34\17\2\u0120\u0121\7\23\2\2\u0121\u0122\b\17\1\2\u0122"+
		"\u0129\3\2\2\2\u0123\u0124\f\t\2\2\u0124\u0125\7\25\2\2\u0125\u0126\5"+
		"\36\20\2\u0126\u0127\b\17\1\2\u0127\u0129\3\2\2\2\u0128\u0104\3\2\2\2"+
		"\u0128\u0109\3\2\2\2\u0128\u010e\3\2\2\2\u0128\u0113\3\2\2\2\u0128\u0118"+
		"\3\2\2\2\u0128\u011d\3\2\2\2\u0128\u0123\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\35\3\2\2\2\u012c\u012a\3\2\2"+
		"\2\u012d\u012e\5$\23\2\u012e\u012f\b\20\1\2\u012f\u0137\3\2\2\2\u0130"+
		"\u0131\5&\24\2\u0131\u0132\b\20\1\2\u0132\u0137\3\2\2\2\u0133\u0134\5"+
		"\"\22\2\u0134\u0135\b\20\1\2\u0135\u0137\3\2\2\2\u0136\u012d\3\2\2\2\u0136"+
		"\u0130\3\2\2\2\u0136\u0133\3\2\2\2\u0137\37\3\2\2\2\u0138\u0139\5$\23"+
		"\2\u0139\u013a\b\21\1\2\u013a\u013f\3\2\2\2\u013b\u013c\5\"\22\2\u013c"+
		"\u013d\b\21\1\2\u013d\u013f\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u013b\3"+
		"\2\2\2\u013f!\3\2\2\2\u0140\u0141\7$\2\2\u0141\u0142\b\22\1\2\u0142#\3"+
		"\2\2\2\u0143\u0144\7%\2\2\u0144\u014a\b\23\1\2\u0145\u0146\7&\2\2\u0146"+
		"\u014a\b\23\1\2\u0147\u0148\7\'\2\2\u0148\u014a\b\23\1\2\u0149\u0143\3"+
		"\2\2\2\u0149\u0145\3\2\2\2\u0149\u0147\3\2\2\2\u014a%\3\2\2\2\u014b\u014c"+
		"\7(\2\2\u014c\u0150\7\7\2\2\u014d\u014f\5\16\b\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7\b\2\2\u0154\u015d\b\24\1\2\u0155"+
		"\u0156\7\22\2\2\u0156\u0157\7*\2\2\u0157\u0158\7\6\2\2\u0158\u0159\5\36"+
		"\20\2\u0159\u015a\7\23\2\2\u015a\u015b\b\24\1\2\u015b\u015d\3\2\2\2\u015c"+
		"\u014b\3\2\2\2\u015c\u0155\3\2\2\2\u015d\'\3\2\2\2\35\62\64;QZ\\s|\u008d"+
		"\u0093\u009a\u009d\u00a6\u00ac\u00bf\u00c9\u00cf\u00dc\u00df\u0102\u0128"+
		"\u012a\u0136\u013e\u0149\u0150\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}