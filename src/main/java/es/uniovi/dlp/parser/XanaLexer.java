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
		T__38=39, WHITESPACE=40, INT_CONSTANT=41, REAL_CONSTANT=42, DECIMALPOINT=43, 
		ELEVATION=44, EXPONENTIAL=45, COMMENTS=46, COMMENTSBIGGER=47, ID=48, CHAR_CONSTANT=49;
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
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "WHITESPACE", "INT_CONSTANT", 
			"REAL_CONSTANT", "DECIMALPOINT", "ELEVATION", "EXPONENTIAL", "COMMENTS", 
			"COMMENTSBIGGER", "ID", "CHAR_CONSTANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def '", "'('", "')'", "'::'", "'do'", "'end'", "','", "'main'", 
			"'return'", "'if'", "'else'", "'while'", "'in'", "'puts'", "'='", "'<<'", 
			"'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", 
			"'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'void'", 
			"'int'", "'char'", "'double'", "'defstruct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WHITESPACE", "INT_CONSTANT", "REAL_CONSTANT", 
			"DECIMALPOINT", "ELEVATION", "EXPONENTIAL", "COMMENTS", "COMMENTSBIGGER", 
			"ID", "CHAR_CONSTANT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0168\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\6)\u00ed\n)\r)\16"+
		")\u00ee\3)\3)\3*\6*\u00f4\n*\r*\16*\u00f5\3+\3+\3+\5+\u00fb\n+\3,\5,\u00fe"+
		"\n,\3,\3,\3,\3,\3,\5,\u0105\n,\3,\3,\3,\3,\5,\u010b\n,\3-\3-\3-\3-\3-"+
		"\5-\u0112\n-\3-\3-\3-\3-\3-\5-\u0119\n-\5-\u011b\n-\3.\3.\3.\5.\u0120"+
		"\n.\3.\3.\3.\3.\3.\5.\u0127\n.\3.\3.\5.\u012b\n.\3/\3/\7/\u012f\n/\f/"+
		"\16/\u0132\13/\3/\5/\u0135\n/\3/\3/\3\60\3\60\3\60\3\60\3\60\7\60\u013e"+
		"\n\60\f\60\16\60\u0141\13\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\5\61\u014a"+
		"\n\61\3\61\3\61\3\61\7\61\u014f\n\61\f\61\16\61\u0152\13\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0167\n\62\4\u0130\u013f\2\63\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\b\5\2\13\f\17\17\"\"\3\2\62;\4\2"+
		"--//\3\3\f\f\5\2C\\aac|\4\2C\\c|\2\u017e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5"+
		"j\3\2\2\2\7l\3\2\2\2\tn\3\2\2\2\13q\3\2\2\2\rt\3\2\2\2\17x\3\2\2\2\21"+
		"z\3\2\2\2\23\177\3\2\2\2\25\u0086\3\2\2\2\27\u0089\3\2\2\2\31\u008e\3"+
		"\2\2\2\33\u0094\3\2\2\2\35\u0097\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2"+
		"\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3\2\2\2)\u00a7\3\2\2\2+\u00aa"+
		"\3\2\2\2-\u00ac\3\2\2\2/\u00ae\3\2\2\2\61\u00b0\3\2\2\2\63\u00b2\3\2\2"+
		"\2\65\u00b4\3\2\2\2\67\u00b6\3\2\2\29\u00b8\3\2\2\2;\u00bb\3\2\2\2=\u00bd"+
		"\3\2\2\2?\u00c0\3\2\2\2A\u00c3\3\2\2\2C\u00c6\3\2\2\2E\u00c9\3\2\2\2G"+
		"\u00cc\3\2\2\2I\u00d1\3\2\2\2K\u00d5\3\2\2\2M\u00da\3\2\2\2O\u00e1\3\2"+
		"\2\2Q\u00ec\3\2\2\2S\u00f3\3\2\2\2U\u00fa\3\2\2\2W\u010a\3\2\2\2Y\u011a"+
		"\3\2\2\2[\u012a\3\2\2\2]\u012c\3\2\2\2_\u0138\3\2\2\2a\u0149\3\2\2\2c"+
		"\u0166\3\2\2\2ef\7f\2\2fg\7g\2\2gh\7h\2\2hi\7\"\2\2i\4\3\2\2\2jk\7*\2"+
		"\2k\6\3\2\2\2lm\7+\2\2m\b\3\2\2\2no\7<\2\2op\7<\2\2p\n\3\2\2\2qr\7f\2"+
		"\2rs\7q\2\2s\f\3\2\2\2tu\7g\2\2uv\7p\2\2vw\7f\2\2w\16\3\2\2\2xy\7.\2\2"+
		"y\20\3\2\2\2z{\7o\2\2{|\7c\2\2|}\7k\2\2}~\7p\2\2~\22\3\2\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082\u0083\7w\2\2\u0083"+
		"\u0084\7t\2\2\u0084\u0085\7p\2\2\u0085\24\3\2\2\2\u0086\u0087\7k\2\2\u0087"+
		"\u0088\7h\2\2\u0088\26\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d\30\3\2\2\2\u008e\u008f\7y\2\2\u008f"+
		"\u0090\7j\2\2\u0090\u0091\7k\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2"+
		"\u0093\32\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\34\3\2\2"+
		"\2\u0097\u0098\7r\2\2\u0098\u0099\7w\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7u\2\2\u009b\36\3\2\2\2\u009c\u009d\7?\2\2\u009d \3\2\2\2\u009e\u009f"+
		"\7>\2\2\u009f\u00a0\7>\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7]\2\2\u00a2$\3"+
		"\2\2\2\u00a3\u00a4\7_\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6(\3"+
		"\2\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7u\2\2\u00a9*\3\2\2\2\u00aa\u00ab"+
		"\7/\2\2\u00ab,\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad.\3\2\2\2\u00ae\u00af\7"+
		",\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1\62\3\2\2\2\u00b2\u00b3"+
		"\7\'\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\66\3\2\2\2\u00b6\u00b7"+
		"\7@\2\2\u00b78\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9\u00ba\7?\2\2\u00ba:\3"+
		"\2\2\2\u00bb\u00bc\7>\2\2\u00bc<\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf"+
		"\7?\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c2\7?\2\2\u00c2@\3"+
		"\2\2\2\u00c3\u00c4\7?\2\2\u00c4\u00c5\7?\2\2\u00c5B\3\2\2\2\u00c6\u00c7"+
		"\7(\2\2\u00c7\u00c8\7(\2\2\u00c8D\3\2\2\2\u00c9\u00ca\7~\2\2\u00ca\u00cb"+
		"\7~\2\2\u00cbF\3\2\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf"+
		"\7k\2\2\u00cf\u00d0\7f\2\2\u00d0H\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3"+
		"\7p\2\2\u00d3\u00d4\7v\2\2\u00d4J\3\2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7"+
		"\7j\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7t\2\2\u00d9L\3\2\2\2\u00da\u00db"+
		"\7f\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7d\2\2\u00de"+
		"\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e0N\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7v\2\2"+
		"\u00e6\u00e7\7t\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea"+
		"\7v\2\2\u00eaP\3\2\2\2\u00eb\u00ed\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\b)\2\2\u00f1R\3\2\2\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6T\3\2\2\2"+
		"\u00f7\u00fb\5W,\2\u00f8\u00fb\5Y-\2\u00f9\u00fb\5[.\2\u00fa\u00f7\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fbV\3\2\2\2\u00fc\u00fe"+
		"\5S*\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\7\60\2\2\u0100\u010b\5S*\2\u0101\u0102\5S*\2\u0102\u0104\7\60\2"+
		"\2\u0103\u0105\5S*\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010b"+
		"\3\2\2\2\u0106\u0107\5S*\2\u0107\u0108\7\60\2\2\u0108\u0109\5S*\2\u0109"+
		"\u010b\3\2\2\2\u010a\u00fd\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0106\3\2"+
		"\2\2\u010bX\3\2\2\2\u010c\u010d\5S*\2\u010d\u010e\7g\2\2\u010e\u010f\5"+
		"S*\2\u010f\u011b\3\2\2\2\u0110\u0112\5S*\2\u0111\u0110\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7g\2\2\u0114\u011b\5S*\2\u0115"+
		"\u0116\5S*\2\u0116\u0118\7g\2\2\u0117\u0119\5S*\2\u0118\u0117\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u010c\3\2\2\2\u011a\u0111"+
		"\3\2\2\2\u011a\u0115\3\2\2\2\u011bZ\3\2\2\2\u011c\u011d\5W,\2\u011d\u011f"+
		"\7G\2\2\u011e\u0120\t\4\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\5S*\2\u0122\u012b\3\2\2\2\u0123\u0124\5W,\2"+
		"\u0124\u0126\7G\2\2\u0125\u0127\t\4\2\2\u0126\u0125\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5U+\2\u0129\u012b\3\2\2\2\u012a"+
		"\u011c\3\2\2\2\u012a\u0123\3\2\2\2\u012b\\\3\2\2\2\u012c\u0130\7%\2\2"+
		"\u012d\u012f\13\2\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0135\t\5\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b/"+
		"\2\2\u0137^\3\2\2\2\u0138\u0139\7$\2\2\u0139\u013a\7$\2\2\u013a\u013b"+
		"\7$\2\2\u013b\u013f\3\2\2\2\u013c\u013e\13\2\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7$\2\2\u0143\u0144\7$\2\2\u0144\u0145"+
		"\7$\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b\60\2\2\u0147`\3\2\2\2\u0148"+
		"\u014a\t\6\2\2\u0149\u0148\3\2\2\2\u014a\u0150\3\2\2\2\u014b\u014f\t\7"+
		"\2\2\u014c\u014f\5S*\2\u014d\u014f\7a\2\2\u014e\u014b\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151b\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7)\2\2\u0154"+
		"\u0155\13\2\2\2\u0155\u0167\7)\2\2\u0156\u0157\7)\2\2\u0157\u0158\7^\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\5S*\2\u015a\u015b\7)\2\2\u015b\u0167"+
		"\3\2\2\2\u015c\u015d\7)\2\2\u015d\u015e\7^\2\2\u015e\u015f\7p\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0167\7)\2\2\u0161\u0162\7)\2\2\u0162\u0163\7^\2"+
		"\2\u0163\u0164\7v\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7)\2\2\u0166\u0153"+
		"\3\2\2\2\u0166\u0156\3\2\2\2\u0166\u015c\3\2\2\2\u0166\u0161\3\2\2\2\u0167"+
		"d\3\2\2\2\26\2\u00ee\u00f5\u00fa\u00fd\u0104\u010a\u0111\u0118\u011a\u011f"+
		"\u0126\u012a\u0130\u0134\u013f\u0149\u014e\u0150\u0166\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}