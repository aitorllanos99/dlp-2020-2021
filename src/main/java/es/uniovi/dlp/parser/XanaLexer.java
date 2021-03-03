// Generated from D:/1Escritorio/Informatica/Uni/Cuarto Curso/Segundo Cuatrimestre/DLP/Compiler/src/main/antlr4\Xana.g4 by ANTLR 4.9.1

package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XanaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "WHITESPACE", "INT_CONSTANT", 
			"REAL_CONSTANT", "ELEVATION", "EXPONENTIAL", "COMMENTS", "COMMENTSBIGGER", 
			"ID", "CHAR_CONSTANT"
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


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u018a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u00e6\n(\r(\16(\u00e7\3(\3(\3)\6)\u00ed\n"+
		")\r)\16)\u00ee\3*\5*\u00f2\n*\3*\3*\3*\3*\3*\5*\u00f9\n*\3*\3*\5*\u00fd"+
		"\n*\3+\3+\3+\3+\3+\5+\u0104\n+\3+\3+\3+\3+\3+\5+\u010b\n+\5+\u010d\n+"+
		"\3,\3,\3,\3,\3,\5,\u0114\n,\3,\3,\3,\5,\u0119\n,\3,\3,\3,\3,\5,\u011f"+
		"\n,\3,\3,\3,\3,\3,\5,\u0126\n,\3,\3,\5,\u012a\n,\3,\3,\3,\3,\3,\3,\3,"+
		"\5,\u0133\n,\3,\3,\3,\5,\u0138\n,\3,\3,\3,\3,\5,\u013e\n,\3,\3,\3,\3,"+
		"\3,\5,\u0145\n,\3,\3,\5,\u0149\n,\3,\3,\5,\u014d\n,\3-\3-\7-\u0151\n-"+
		"\f-\16-\u0154\13-\3-\5-\u0157\n-\3-\3-\3.\3.\3.\3.\3.\7.\u0160\n.\f.\16"+
		".\u0163\13.\3.\3.\3.\3.\3.\3.\3/\5/\u016c\n/\3/\3/\3/\7/\u0171\n/\f/\16"+
		"/\u0174\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0189\n\60\4\u0152\u0161\2\61"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\b\5\2\13\f\17\17\"\"\3"+
		"\2\62;\4\2--//\3\3\f\f\5\2C\\aac|\4\2C\\c|\2\u01ab\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5f\3\2\2\2\7h\3"+
		"\2\2\2\tj\3\2\2\2\13m\3\2\2\2\rp\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23{\3"+
		"\2\2\2\25\u0082\3\2\2\2\27\u0085\3\2\2\2\31\u008a\3\2\2\2\33\u0090\3\2"+
		"\2\2\35\u0093\3\2\2\2\37\u0098\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%"+
		"\u009e\3\2\2\2\'\u00a0\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3"+
		"\2\2\2/\u00a9\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2"+
		"\2\67\u00b1\3\2\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00b9\3\2\2\2?\u00bc"+
		"\3\2\2\2A\u00bf\3\2\2\2C\u00c2\3\2\2\2E\u00c5\3\2\2\2G\u00ca\3\2\2\2I"+
		"\u00ce\3\2\2\2K\u00d3\3\2\2\2M\u00da\3\2\2\2O\u00e5\3\2\2\2Q\u00ec\3\2"+
		"\2\2S\u00fc\3\2\2\2U\u010c\3\2\2\2W\u014c\3\2\2\2Y\u014e\3\2\2\2[\u015a"+
		"\3\2\2\2]\u016b\3\2\2\2_\u0188\3\2\2\2ab\7f\2\2bc\7g\2\2cd\7h\2\2de\7"+
		"\"\2\2e\4\3\2\2\2fg\7*\2\2g\6\3\2\2\2hi\7+\2\2i\b\3\2\2\2jk\7<\2\2kl\7"+
		"<\2\2l\n\3\2\2\2mn\7f\2\2no\7q\2\2o\f\3\2\2\2pq\7g\2\2qr\7p\2\2rs\7f\2"+
		"\2s\16\3\2\2\2tu\7.\2\2u\20\3\2\2\2vw\7o\2\2wx\7c\2\2xy\7k\2\2yz\7p\2"+
		"\2z\22\3\2\2\2{|\7t\2\2|}\7g\2\2}~\7v\2\2~\177\7w\2\2\177\u0080\7t\2\2"+
		"\u0080\u0081\7p\2\2\u0081\24\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084\7"+
		"h\2\2\u0084\26\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u0089\7g\2\2\u0089\30\3\2\2\2\u008a\u008b\7y\2\2\u008b\u008c"+
		"\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f"+
		"\32\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092\34\3\2\2\2\u0093"+
		"\u0094\7r\2\2\u0094\u0095\7w\2\2\u0095\u0096\7v\2\2\u0096\u0097\7u\2\2"+
		"\u0097\36\3\2\2\2\u0098\u0099\7?\2\2\u0099 \3\2\2\2\u009a\u009b\7]\2\2"+
		"\u009b\"\3\2\2\2\u009c\u009d\7_\2\2\u009d$\3\2\2\2\u009e\u009f\7\60\2"+
		"\2\u009f&\3\2\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7u\2\2\u00a2(\3\2\2\2"+
		"\u00a3\u00a4\7/\2\2\u00a4*\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6,\3\2\2\2\u00a7"+
		"\u00a8\7,\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\60\3\2\2\2\u00ab"+
		"\u00ac\7\'\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7-\2\2\u00ae\64\3\2\2\2\u00af"+
		"\u00b0\7@\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7@\2\2\u00b2\u00b3\7?\2\2\u00b3"+
		"8\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8"+
		"\7?\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7#\2\2\u00ba\u00bb\7?\2\2\u00bb>\3"+
		"\2\2\2\u00bc\u00bd\7?\2\2\u00bd\u00be\7?\2\2\u00be@\3\2\2\2\u00bf\u00c0"+
		"\7(\2\2\u00c0\u00c1\7(\2\2\u00c1B\3\2\2\2\u00c2\u00c3\7~\2\2\u00c3\u00c4"+
		"\7~\2\2\u00c4D\3\2\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8"+
		"\7k\2\2\u00c8\u00c9\7f\2\2\u00c9F\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc"+
		"\7p\2\2\u00cc\u00cd\7v\2\2\u00cdH\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0"+
		"\7j\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7t\2\2\u00d2J\3\2\2\2\u00d3\u00d4"+
		"\7f\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7d\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9L\3\2\2\2\u00da\u00db\7f\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2"+
		"\u00df\u00e0\7t\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3N\3\2\2\2\u00e4\u00e6\t\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\b(\2\2\u00eaP\3\2\2\2\u00eb\u00ed\t\3\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efR\3\2\2\2"+
		"\u00f0\u00f2\5Q)\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f4\7\60\2\2\u00f4\u00fd\5Q)\2\u00f5\u00f6\5Q)\2\u00f6"+
		"\u00f8\7\60\2\2\u00f7\u00f9\5Q)\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fd\3\2\2\2\u00fa\u00fd\5U+\2\u00fb\u00fd\5W,\2\u00fc\u00f1"+
		"\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"T\3\2\2\2\u00fe\u00ff\5Q)\2\u00ff\u0100\7g\2\2\u0100\u0101\5Q)\2\u0101"+
		"\u010d\3\2\2\2\u0102\u0104\5Q)\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2"+
		"\2\u0104\u0105\3\2\2\2\u0105\u0106\7g\2\2\u0106\u010d\5Q)\2\u0107\u0108"+
		"\5Q)\2\u0108\u010a\7g\2\2\u0109\u010b\5Q)\2\u010a\u0109\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u00fe\3\2\2\2\u010c\u0103\3\2"+
		"\2\2\u010c\u0107\3\2\2\2\u010dV\3\2\2\2\u010e\u010f\5Q)\2\u010f\u0110"+
		"\7\60\2\2\u0110\u0111\5Q)\2\u0111\u0113\7G\2\2\u0112\u0114\t\4\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\5Q"+
		")\2\u0116\u014d\3\2\2\2\u0117\u0119\5Q)\2\u0118\u0117\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\60\2\2\u011b\u011c\5Q)\2\u011c"+
		"\u011e\7G\2\2\u011d\u011f\t\4\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\5Q)\2\u0121\u014d\3\2\2\2\u0122\u0123"+
		"\5Q)\2\u0123\u0125\7\60\2\2\u0124\u0126\5Q)\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\7G\2\2\u0128\u012a\t\4"+
		"\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\5Q)\2\u012c\u014d\3\2\2\2\u012d\u012e\5Q)\2\u012e\u012f\7\60\2"+
		"\2\u012f\u0130\5Q)\2\u0130\u0132\7G\2\2\u0131\u0133\t\4\2\2\u0132\u0131"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\5S*\2\u0135"+
		"\u014d\3\2\2\2\u0136\u0138\5Q)\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2"+
		"\2\u0138\u0139\3\2\2\2\u0139\u013a\7\60\2\2\u013a\u013b\5Q)\2\u013b\u013d"+
		"\7G\2\2\u013c\u013e\t\4\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\5S*\2\u0140\u014d\3\2\2\2\u0141\u0142\5Q)\2"+
		"\u0142\u0144\7\60\2\2\u0143\u0145\5Q)\2\u0144\u0143\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\7G\2\2\u0147\u0149\t\4\2\2\u0148"+
		"\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\5S"+
		"*\2\u014b\u014d\3\2\2\2\u014c\u010e\3\2\2\2\u014c\u0118\3\2\2\2\u014c"+
		"\u0122\3\2\2\2\u014c\u012d\3\2\2\2\u014c\u0137\3\2\2\2\u014c\u0141\3\2"+
		"\2\2\u014dX\3\2\2\2\u014e\u0152\7%\2\2\u014f\u0151\13\2\2\2\u0150\u014f"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\t\5\2\2\u0156\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b-\2\2\u0159Z\3\2\2\2\u015a\u015b"+
		"\7$\2\2\u015b\u015c\7$\2\2\u015c\u015d\7$\2\2\u015d\u0161\3\2\2\2\u015e"+
		"\u0160\13\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u0162\3"+
		"\2\2\2\u0161\u015f\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0165\7$\2\2\u0165\u0166\7$\2\2\u0166\u0167\7$\2\2\u0167\u0168\3\2\2"+
		"\2\u0168\u0169\b.\2\2\u0169\\\3\2\2\2\u016a\u016c\t\6\2\2\u016b\u016a"+
		"\3\2\2\2\u016c\u0172\3\2\2\2\u016d\u0171\t\7\2\2\u016e\u0171\5Q)\2\u016f"+
		"\u0171\7a\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2"+
		"\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"^\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7)\2\2\u0176\u0177\13\2\2\2"+
		"\u0177\u0189\7)\2\2\u0178\u0179\7)\2\2\u0179\u017a\7^\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017c\5Q)\2\u017c\u017d\7)\2\2\u017d\u0189\3\2\2\2\u017e"+
		"\u017f\7)\2\2\u017f\u0180\7^\2\2\u0180\u0181\7p\2\2\u0181\u0182\3\2\2"+
		"\2\u0182\u0189\7)\2\2\u0183\u0184\7)\2\2\u0184\u0185\7^\2\2\u0185\u0186"+
		"\7v\2\2\u0186\u0187\3\2\2\2\u0187\u0189\7)\2\2\u0188\u0175\3\2\2\2\u0188"+
		"\u0178\3\2\2\2\u0188\u017e\3\2\2\2\u0188\u0183\3\2\2\2\u0189`\3\2\2\2"+
		"\35\2\u00e7\u00ee\u00f1\u00f8\u00fc\u0103\u010a\u010c\u0113\u0118\u011e"+
		"\u0125\u0129\u0132\u0137\u013d\u0144\u0148\u014c\u0152\u0156\u0161\u016b"+
		"\u0170\u0172\u0188\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}