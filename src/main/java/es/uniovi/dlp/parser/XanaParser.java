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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					((ProgramContext)_localctx).d = definitions();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(44);
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((DefinitionsContext)_localctx).varDefinition = varDefinition();
				_localctx.ast.addAll(((DefinitionsContext)_localctx).varDefinition.ast);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((DefinitionsContext)_localctx).funcDefinition = funcDefinition();
				_localctx.ast.add(((DefinitionsContext)_localctx).funcDefinition.ast);
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
			setState(55);
			match(T__0);
			setState(56);
			((FuncDefinitionContext)_localctx).id = match(ID);
			setState(57);
			match(T__1);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(58);
				((FuncDefinitionContext)_localctx).fp = funcParameters();
				}
			}

			setState(61);
			match(T__2);
			setState(62);
			match(T__3);
			setState(63);
			((FuncDefinitionContext)_localctx).ft = functionTypes();
			setState(64);
			match(T__4);
			setState(65);
			((FuncDefinitionContext)_localctx).fb = funcBody();
			setState(66);
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
			setState(69);
			((FuncParametersContext)_localctx).id1 = match(ID);
			setState(70);
			match(T__3);
			setState(71);
			((FuncParametersContext)_localctx).t1 = type();
			_localctx.ast.add(new VarDefinition(((FuncParametersContext)_localctx).id1.getLine(), ((FuncParametersContext)_localctx).id1.getCharPositionInLine() +1, (((FuncParametersContext)_localctx).id1!=null?((FuncParametersContext)_localctx).id1.getText():null), ((FuncParametersContext)_localctx).t1.t));
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(73);
				match(T__6);
				setState(74);
				((FuncParametersContext)_localctx).id2 = match(ID);
				setState(75);
				match(T__3);
				setState(76);
				((FuncParametersContext)_localctx).t2 = type();
				_localctx.ast.add(new VarDefinition(((FuncParametersContext)_localctx).id2.getLine(), ((FuncParametersContext)_localctx).id2.getCharPositionInLine() +1, (((FuncParametersContext)_localctx).id2!=null?((FuncParametersContext)_localctx).id2.getText():null), ((FuncParametersContext)_localctx).t2.t));
				}
				}
				setState(83);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(84);
					((FuncBodyContext)_localctx).s = statements();
					_localctx.stat.addAll(((FuncBodyContext)_localctx).s.st);
					}
					break;
				case 2:
					{
					setState(87);
					((FuncBodyContext)_localctx).v = varDefinition();
					_localctx.varDef.addAll(((FuncBodyContext)_localctx).v.ast);
					}
					break;
				}
				}
				setState(94);
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
			setState(95);
			match(T__0);
			setState(96);
			((MainFunctionContext)_localctx).id = match(T__7);
			setState(97);
			match(T__1);
			setState(98);
			match(T__2);
			setState(99);
			match(T__4);
			setState(100);
			((MainFunctionContext)_localctx).fb = funcBody();
			setState(101);
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
			setState(104);
			((VarDefinitionContext)_localctx).mid = moreIdentDefinitions();
			setState(105);
			match(T__3);
			setState(106);
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((VarTypesContext)_localctx).p = primitiveType();
				((VarTypesContext)_localctx).t =  ((VarTypesContext)_localctx).p.t;
				}
				break;
			case T__15:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
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
			setState(117);
			((MoreIdentDefinitionsContext)_localctx).id1 = match(ID);
			_localctx.ast.add((((MoreIdentDefinitionsContext)_localctx).id1!=null?((MoreIdentDefinitionsContext)_localctx).id1.getText():null));
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(119);
				match(T__6);
				setState(120);
				((MoreIdentDefinitionsContext)_localctx).id2 = match(ID);
				_localctx.ast.add((((MoreIdentDefinitionsContext)_localctx).id2!=null?((MoreIdentDefinitionsContext)_localctx).id2.getText():null));
				}
				}
				setState(126);
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
		public MoreStatementsContext ms;
		public MoreStatementsContext ms2;
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
		public List<MoreStatementsContext> moreStatements() {
			return getRuleContexts(MoreStatementsContext.class);
		}
		public MoreStatementsContext moreStatements(int i) {
			return getRuleContext(MoreStatementsContext.class,i);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				((StatementsContext)_localctx).ID = match(ID);
				setState(128);
				match(T__1);
				setState(129);
				((StatementsContext)_localctx).mp = moreParameters();
				setState(130);
				match(T__2);
				_localctx.st.add(new Invocation(((StatementsContext)_localctx).ID.getLine(), ((StatementsContext)_localctx).ID.getCharPositionInLine(), new Variable(((StatementsContext)_localctx).ID.getLine(), ((StatementsContext)_localctx).ID.getCharPositionInLine() + 1, (((StatementsContext)_localctx).ID!=null?((StatementsContext)_localctx).ID.getText():null)), ((StatementsContext)_localctx).mp.ast));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__8);
				setState(134);
				((StatementsContext)_localctx).expression = expression(0);
				_localctx.st.add(new Return ((((StatementsContext)_localctx).expression!=null?(((StatementsContext)_localctx).expression.start):null).getLine(), (((StatementsContext)_localctx).expression!=null?(((StatementsContext)_localctx).expression.start):null).getCharPositionInLine() +1 , ((StatementsContext)_localctx).expression.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__9);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					((StatementsContext)_localctx).ex = expression(0);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0) );
				setState(143);
				match(T__4);
				setState(144);
				((StatementsContext)_localctx).ms = moreStatements();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(145);
					match(T__10);
					setState(146);
					((StatementsContext)_localctx).ms2 = moreStatements();
					}
				}

				setState(149);
				match(T__5);
				_localctx.st.add(new IfElse((((StatementsContext)_localctx).ex!=null?(((StatementsContext)_localctx).ex.start):null).getLine(), (((StatementsContext)_localctx).ex!=null?(((StatementsContext)_localctx).ex.start):null).getCharPositionInLine()+1, ((StatementsContext)_localctx).ex.ast, ((StatementsContext)_localctx).ms.ast,((StatementsContext)_localctx).ms2.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(T__11);
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					((StatementsContext)_localctx).ex = expression(0);
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0) );
				setState(158);
				match(T__4);
				setState(159);
				((StatementsContext)_localctx).ms = moreStatements();
				setState(160);
				match(T__5);
				_localctx.st.add(new While((((StatementsContext)_localctx).ex!=null?(((StatementsContext)_localctx).ex.start):null).getLine(), (((StatementsContext)_localctx).ex!=null?(((StatementsContext)_localctx).ex.start):null).getCharPositionInLine()+1, ((StatementsContext)_localctx).ms.ast, ((StatementsContext)_localctx).ex.ast));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(T__12);
				setState(164);
				((StatementsContext)_localctx).me = moreExpressions();
				((StatementsContext)_localctx).me.ast.stream().map(e-> _localctx.st.add(new Read((((StatementsContext)_localctx).me!=null?(((StatementsContext)_localctx).me.start):null).getLine(), (((StatementsContext)_localctx).me!=null?(((StatementsContext)_localctx).me.start):null).getCharPositionInLine() +1, e)));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(T__13);
				setState(168);
				((StatementsContext)_localctx).me = moreExpressions();
				((StatementsContext)_localctx).me.ast.stream().map(e-> _localctx.st.add(new Write((((StatementsContext)_localctx).me!=null?(((StatementsContext)_localctx).me.start):null).getLine(), (((StatementsContext)_localctx).me!=null?(((StatementsContext)_localctx).me.start):null).getCharPositionInLine() +1, e)));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				((StatementsContext)_localctx).left = expression(0);
				setState(172);
				match(T__14);
				setState(173);
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
			setState(178);
			((MoreExpressionsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((MoreExpressionsContext)_localctx).e1.ast);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(180);
				match(T__6);
				setState(181);
				((MoreExpressionsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((MoreExpressionsContext)_localctx).e2.ast);
				}
				}
				setState(188);
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
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(189);
				((MoreStatementsContext)_localctx).stat = statements();
				}
				}
				setState(194);
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
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(197);
				((MoreParametersContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((MoreParametersContext)_localctx).e1.ast);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(199);
					match(T__6);
					setState(200);
					((MoreParametersContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((MoreParametersContext)_localctx).e2.ast);
					}
					}
					setState(207);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(211);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(212);
				match(T__1);
				setState(213);
				((ExpressionContext)_localctx).mp = moreParameters();
				setState(214);
				match(T__2);
				((ExpressionContext)_localctx).ast =  new Invocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine(), new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)), ((ExpressionContext)_localctx).mp.ast);
				}
				break;
			case 2:
				{
				setState(217);
				((ExpressionContext)_localctx).i = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).i.getLine(), ((ExpressionContext)_localctx).i.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null)));
				}
				break;
			case 3:
				{
				setState(219);
				((ExpressionContext)_localctx).c = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).c.getLine(), ((ExpressionContext)_localctx).c.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null)));
				}
				break;
			case 4:
				{
				setState(221);
				((ExpressionContext)_localctx).r = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).r.getLine(), ((ExpressionContext)_localctx).r.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).r!=null?((ExpressionContext)_localctx).r.getText():null)));
				}
				break;
			case 5:
				{
				setState(223);
				((ExpressionContext)_localctx).id = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).id.getLine(), ((ExpressionContext)_localctx).id.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null));
				}
				break;
			case 6:
				{
				setState(225);
				match(T__1);
				setState(226);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(227);
				match(T__2);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 7:
				{
				setState(230);
				match(T__15);
				setState(231);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(232);
				match(T__16);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 8:
				{
				setState(235);
				match(T__19);
				setState(236);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinus((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).exp.ast);
				}
				break;
			case 9:
				{
				setState(239);
				match(T__20);
				setState(240);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(5);
				((ExpressionContext)_localctx).ast =  new UnaryNot((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine() + 1, ((ExpressionContext)_localctx).exp.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(246);
						match(T__17);
						setState(247);
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
						setState(250);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(251);
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
						setState(252);
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
						setState(255);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(256);
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
						setState(257);
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
						setState(260);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(261);
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
						setState(262);
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
						setState(265);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(266);
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
						setState(267);
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
						setState(270);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(271);
						match(T__15);
						setState(272);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
						setState(273);
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
						setState(276);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(277);
						match(T__18);
						setState(278);
						((ExpressionContext)_localctx).tc = type();
						((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).tc.t, ((ExpressionContext)_localctx).exp.ast);
						}
						break;
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				((TypeContext)_localctx).p = primitiveType();
				((TypeContext)_localctx).t =  ((TypeContext)_localctx).p.t;
				}
				break;
			case T__15:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				((TypeContext)_localctx).c = complexType();
				((TypeContext)_localctx).t =  ((TypeContext)_localctx).c.t;
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
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
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				((FunctionTypesContext)_localctx).p = primitiveType();
				((FunctionTypesContext)_localctx).t =  ((FunctionTypesContext)_localctx).p.t;
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
			setState(305);
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
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				((PrimitiveTypeContext)_localctx).i = match(T__34);
				((PrimitiveTypeContext)_localctx).t =  new IntType(((PrimitiveTypeContext)_localctx).i.getLine(), ((PrimitiveTypeContext)_localctx).i.getCharPositionInLine() +1);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				((PrimitiveTypeContext)_localctx).c = match(T__35);
				((PrimitiveTypeContext)_localctx).t =  new CharType(((PrimitiveTypeContext)_localctx).c.getLine(), ((PrimitiveTypeContext)_localctx).c.getCharPositionInLine() + 1);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
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
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(T__37);
				setState(317);
				match(T__4);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(318);
					varDefinition();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(T__5);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(T__15);
				setState(326);
				match(INT_CONSTANT);
				setState(327);
				match(T__3);
				setState(328);
				type();
				setState(329);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0150\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5R\n\5\f\5\16\5U"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tv"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u008e\n\13\r\13\16\13"+
		"\u008f\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\13\3\13\3\13\3\13\3\13\6"+
		"\13\u009d\n\13\r\13\16\13\u009e\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00bb\n\f\f\f\16\f\u00be\13\f\3\r\7\r\u00c1\n"+
		"\r\f\r\16\r\u00c4\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ce"+
		"\n\16\f\16\16\16\u00d1\13\16\5\16\u00d3\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00f6\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u011c\n\17"+
		"\f\17\16\17\u011f\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u012a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0132\n\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u013d\n\23\3\24\3\24\3\24\7\24"+
		"\u0142\n\24\f\24\16\24\u0145\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u014e\n\24\3\24\2\3\34\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&\2\6\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\2\u0167\2+\3\2\2\2"+
		"\4\67\3\2\2\2\69\3\2\2\2\bG\3\2\2\2\n^\3\2\2\2\fa\3\2\2\2\16j\3\2\2\2"+
		"\20u\3\2\2\2\22w\3\2\2\2\24\u00b2\3\2\2\2\26\u00b4\3\2\2\2\30\u00c2\3"+
		"\2\2\2\32\u00d2\3\2\2\2\34\u00f5\3\2\2\2\36\u0129\3\2\2\2 \u0131\3\2\2"+
		"\2\"\u0133\3\2\2\2$\u013c\3\2\2\2&\u014d\3\2\2\2(*\5\4\3\2)(\3\2\2\2*"+
		"-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\5\f\7\2/\60\b\2\1"+
		"\2\60\3\3\2\2\2\61\62\5\16\b\2\62\63\b\3\1\2\638\3\2\2\2\64\65\5\6\4\2"+
		"\65\66\b\3\1\2\668\3\2\2\2\67\61\3\2\2\2\67\64\3\2\2\28\5\3\2\2\29:\7"+
		"\3\2\2:;\7\60\2\2;=\7\4\2\2<>\5\b\5\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@"+
		"\7\5\2\2@A\7\6\2\2AB\5 \21\2BC\7\7\2\2CD\5\n\6\2DE\7\b\2\2EF\b\4\1\2F"+
		"\7\3\2\2\2GH\7\60\2\2HI\7\6\2\2IJ\5\36\20\2JS\b\5\1\2KL\7\t\2\2LM\7\60"+
		"\2\2MN\7\6\2\2NO\5\36\20\2OP\b\5\1\2PR\3\2\2\2QK\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2T\t\3\2\2\2US\3\2\2\2VW\5\24\13\2WX\b\6\1\2X]\3\2\2\2"+
		"YZ\5\16\b\2Z[\b\6\1\2[]\3\2\2\2\\V\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_\13\3\2\2\2`^\3\2\2\2ab\7\3\2\2bc\7\n\2\2cd\7\4\2\2de\7"+
		"\5\2\2ef\7\7\2\2fg\5\n\6\2gh\7\b\2\2hi\b\7\1\2i\r\3\2\2\2jk\5\22\n\2k"+
		"l\7\6\2\2lm\5\20\t\2mn\b\b\1\2n\17\3\2\2\2op\5$\23\2pq\b\t\1\2qv\3\2\2"+
		"\2rs\5&\24\2st\b\t\1\2tv\3\2\2\2uo\3\2\2\2ur\3\2\2\2v\21\3\2\2\2wx\7\60"+
		"\2\2x~\b\n\1\2yz\7\t\2\2z{\7\60\2\2{}\b\n\1\2|y\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\23\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\60"+
		"\2\2\u0082\u0083\7\4\2\2\u0083\u0084\5\32\16\2\u0084\u0085\7\5\2\2\u0085"+
		"\u0086\b\13\1\2\u0086\u00b3\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5"+
		"\34\17\2\u0089\u008a\b\13\1\2\u008a\u00b3\3\2\2\2\u008b\u008d\7\f\2\2"+
		"\u008c\u008e\5\34\17\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\7\2\2\u0092"+
		"\u0095\5\30\r\2\u0093\u0094\7\r\2\2\u0094\u0096\5\30\r\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\b\2\2\u0098"+
		"\u0099\b\13\1\2\u0099\u00b3\3\2\2\2\u009a\u009c\7\16\2\2\u009b\u009d\5"+
		"\34\17\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\5\30"+
		"\r\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\b\13\1\2\u00a4\u00b3\3\2\2\2\u00a5"+
		"\u00a6\7\17\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\b\13\1\2\u00a8\u00b3"+
		"\3\2\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\5\26\f\2\u00ab\u00ac\b\13\1"+
		"\2\u00ac\u00b3\3\2\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\7\21\2\2\u00af"+
		"\u00b0\5\34\17\2\u00b0\u00b1\b\13\1\2\u00b1\u00b3\3\2\2\2\u00b2\u0081"+
		"\3\2\2\2\u00b2\u0087\3\2\2\2\u00b2\u008b\3\2\2\2\u00b2\u009a\3\2\2\2\u00b2"+
		"\u00a5\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3\25\3\2\2"+
		"\2\u00b4\u00b5\5\34\17\2\u00b5\u00bc\b\f\1\2\u00b6\u00b7\7\t\2\2\u00b7"+
		"\u00b8\5\34\17\2\u00b8\u00b9\b\f\1\2\u00b9\u00bb\3\2\2\2\u00ba\u00b6\3"+
		"\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\27\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\5\24\13\2\u00c0\u00bf\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\b\r\1\2\u00c6\31\3\2\2"+
		"\2\u00c7\u00c8\5\34\17\2\u00c8\u00cf\b\16\1\2\u00c9\u00ca\7\t\2\2\u00ca"+
		"\u00cb\5\34\17\2\u00cb\u00cc\b\16\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c9"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00c7\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\b\17\1\2\u00d5\u00d6\7\60\2\2\u00d6"+
		"\u00d7\7\4\2\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9\7\5\2\2\u00d9\u00da\b"+
		"\17\1\2\u00da\u00f6\3\2\2\2\u00db\u00dc\7*\2\2\u00dc\u00f6\b\17\1\2\u00dd"+
		"\u00de\7\61\2\2\u00de\u00f6\b\17\1\2\u00df\u00e0\7+\2\2\u00e0\u00f6\b"+
		"\17\1\2\u00e1\u00e2\7\60\2\2\u00e2\u00f6\b\17\1\2\u00e3\u00e4\7\4\2\2"+
		"\u00e4\u00e5\5\34\17\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\b\17\1\2\u00e7"+
		"\u00f6\3\2\2\2\u00e8\u00e9\7\22\2\2\u00e9\u00ea\5\34\17\2\u00ea\u00eb"+
		"\7\23\2\2\u00eb\u00ec\b\17\1\2\u00ec\u00f6\3\2\2\2\u00ed\u00ee\7\26\2"+
		"\2\u00ee\u00ef\5\34\17\b\u00ef\u00f0\b\17\1\2\u00f0\u00f6\3\2\2\2\u00f1"+
		"\u00f2\7\27\2\2\u00f2\u00f3\5\34\17\7\u00f3\u00f4\b\17\1\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00d4\3\2\2\2\u00f5\u00db\3\2\2\2\u00f5\u00dd\3\2\2\2\u00f5"+
		"\u00df\3\2\2\2\u00f5\u00e1\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f5\u00e8\3\2"+
		"\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\u011d\3\2\2\2\u00f7"+
		"\u00f8\f\n\2\2\u00f8\u00f9\7\24\2\2\u00f9\u00fa\5\34\17\13\u00fa\u00fb"+
		"\b\17\1\2\u00fb\u011c\3\2\2\2\u00fc\u00fd\f\6\2\2\u00fd\u00fe\t\2\2\2"+
		"\u00fe\u00ff\5\34\17\7\u00ff\u0100\b\17\1\2\u0100\u011c\3\2\2\2\u0101"+
		"\u0102\f\5\2\2\u0102\u0103\t\3\2\2\u0103\u0104\5\34\17\6\u0104\u0105\b"+
		"\17\1\2\u0105\u011c\3\2\2\2\u0106\u0107\f\4\2\2\u0107\u0108\t\4\2\2\u0108"+
		"\u0109\5\34\17\5\u0109\u010a\b\17\1\2\u010a\u011c\3\2\2\2\u010b\u010c"+
		"\f\3\2\2\u010c\u010d\t\5\2\2\u010d\u010e\5\34\17\4\u010e\u010f\b\17\1"+
		"\2\u010f\u011c\3\2\2\2\u0110\u0111\f\13\2\2\u0111\u0112\7\22\2\2\u0112"+
		"\u0113\5\34\17\2\u0113\u0114\7\23\2\2\u0114\u0115\b\17\1\2\u0115\u011c"+
		"\3\2\2\2\u0116\u0117\f\t\2\2\u0117\u0118\7\25\2\2\u0118\u0119\5\36\20"+
		"\2\u0119\u011a\b\17\1\2\u011a\u011c\3\2\2\2\u011b\u00f7\3\2\2\2\u011b"+
		"\u00fc\3\2\2\2\u011b\u0101\3\2\2\2\u011b\u0106\3\2\2\2\u011b\u010b\3\2"+
		"\2\2\u011b\u0110\3\2\2\2\u011b\u0116\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\35\3\2\2\2\u011f\u011d\3\2\2"+
		"\2\u0120\u0121\5$\23\2\u0121\u0122\b\20\1\2\u0122\u012a\3\2\2\2\u0123"+
		"\u0124\5&\24\2\u0124\u0125\b\20\1\2\u0125\u012a\3\2\2\2\u0126\u0127\5"+
		"\"\22\2\u0127\u0128\b\20\1\2\u0128\u012a\3\2\2\2\u0129\u0120\3\2\2\2\u0129"+
		"\u0123\3\2\2\2\u0129\u0126\3\2\2\2\u012a\37\3\2\2\2\u012b\u012c\5$\23"+
		"\2\u012c\u012d\b\21\1\2\u012d\u0132\3\2\2\2\u012e\u012f\5\"\22\2\u012f"+
		"\u0130\b\21\1\2\u0130\u0132\3\2\2\2\u0131\u012b\3\2\2\2\u0131\u012e\3"+
		"\2\2\2\u0132!\3\2\2\2\u0133\u0134\7$\2\2\u0134\u0135\b\22\1\2\u0135#\3"+
		"\2\2\2\u0136\u0137\7%\2\2\u0137\u013d\b\23\1\2\u0138\u0139\7&\2\2\u0139"+
		"\u013d\b\23\1\2\u013a\u013b\7\'\2\2\u013b\u013d\b\23\1\2\u013c\u0136\3"+
		"\2\2\2\u013c\u0138\3\2\2\2\u013c\u013a\3\2\2\2\u013d%\3\2\2\2\u013e\u013f"+
		"\7(\2\2\u013f\u0143\7\7\2\2\u0140\u0142\5\16\b\2\u0141\u0140\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u014e\7\b\2\2\u0147\u0148\7\22\2\2\u0148"+
		"\u0149\7*\2\2\u0149\u014a\7\6\2\2\u014a\u014b\5\36\20\2\u014b\u014c\7"+
		"\23\2\2\u014c\u014e\3\2\2\2\u014d\u013e\3\2\2\2\u014d\u0147\3\2\2\2\u014e"+
		"\'\3\2\2\2\32+\67=S\\^u~\u008f\u0095\u009e\u00b2\u00bc\u00c2\u00cf\u00d2"+
		"\u00f5\u011b\u011d\u0129\u0131\u013c\u0143\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}