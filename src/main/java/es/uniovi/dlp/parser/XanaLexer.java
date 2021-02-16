// Generated from D:/1Escritorio/Informatica/Uni/Cuarto Curso/Segundo Cuatrimestre/DLP/Compiler/src/main/antlr4\Xana.g4 by ANTLR 4.9.1

package es.uniovi.dlp.parser;

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
		WHITESPACE=1, INT_CONSTANT=2, REAL_CONSTANT=3, ELEVATION=4, EXPONENTIAL=5, 
		COMMENTS=6, COMMENTSBIGGER=7, ID=8, CHAR_CONSTANT=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITESPACE", "INT_CONSTANT", "REAL_CONSTANT", "ELEVATION", "EXPONENTIAL", 
			"COMMENTS", "COMMENTSBIGGER", "ID", "CHAR_CONSTANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "INT_CONSTANT", "REAL_CONSTANT", "ELEVATION", "EXPONENTIAL", 
			"COMMENTS", "COMMENTSBIGGER", "ID", "CHAR_CONSTANT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3"+
		"\2\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\3\6\3\36\n\3\r\3\16\3\37\3\4\5\4#"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\5\4*\n\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\65\n\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\5\6E\n\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6W\n\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6"+
		"\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"v\n\6\3\6\3\6\5\6z\n\6\3\6\3\6\5\6~\n\6\3\7\3\7\7\7\u0082\n\7\f\7\16\7"+
		"\u0085\13\7\3\7\5\7\u0088\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0091\n"+
		"\b\f\b\16\b\u0094\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\5\t\u009d\n\t\3\t\3"+
		"\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ba\n\n\4\u0083\u0092"+
		"\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\b\5\2\13\f\17\17\""+
		"\"\3\2\62;\4\2--//\3\3\f\f\5\2C\\aac|\4\2C\\c|\2\u00dc\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\3\26\3\2\2\2\5\35\3\2\2\2\7-\3\2\2\2\t=\3\2"+
		"\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u008b\3\2\2\2\21\u009c\3\2\2\2\23\u00b9"+
		"\3\2\2\2\25\27\t\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31"+
		"\3\2\2\2\31\32\3\2\2\2\32\33\b\2\2\2\33\4\3\2\2\2\34\36\t\3\2\2\35\34"+
		"\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \6\3\2\2\2!#\5\5\3\2"+
		"\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\60\2\2%.\5\5\3\2&\'\5\5\3\2\')\7"+
		"\60\2\2(*\5\5\3\2)(\3\2\2\2)*\3\2\2\2*.\3\2\2\2+.\5\t\5\2,.\5\13\6\2-"+
		"\"\3\2\2\2-&\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\b\3\2\2\2/\60\5\5\3\2\60\61"+
		"\7g\2\2\61\62\5\5\3\2\62>\3\2\2\2\63\65\5\5\3\2\64\63\3\2\2\2\64\65\3"+
		"\2\2\2\65\66\3\2\2\2\66\67\7g\2\2\67>\5\5\3\289\5\5\3\29;\7g\2\2:<\5\5"+
		"\3\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=/\3\2\2\2=\64\3\2\2\2=8\3\2\2\2>\n"+
		"\3\2\2\2?@\5\5\3\2@A\7\60\2\2AB\5\5\3\2BD\7G\2\2CE\t\4\2\2DC\3\2\2\2D"+
		"E\3\2\2\2EF\3\2\2\2FG\5\5\3\2G~\3\2\2\2HJ\5\5\3\2IH\3\2\2\2IJ\3\2\2\2"+
		"JK\3\2\2\2KL\7\60\2\2LM\5\5\3\2MO\7G\2\2NP\t\4\2\2ON\3\2\2\2OP\3\2\2\2"+
		"PQ\3\2\2\2QR\5\5\3\2R~\3\2\2\2ST\5\5\3\2TV\7\60\2\2UW\5\5\3\2VU\3\2\2"+
		"\2VW\3\2\2\2WX\3\2\2\2XZ\7G\2\2Y[\t\4\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2"+
		"\2\\]\5\5\3\2]~\3\2\2\2^_\5\5\3\2_`\7\60\2\2`a\5\5\3\2ac\7G\2\2bd\t\4"+
		"\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\5\7\4\2f~\3\2\2\2gi\5\5\3\2hg\3\2"+
		"\2\2hi\3\2\2\2ij\3\2\2\2jk\7\60\2\2kl\5\5\3\2ln\7G\2\2mo\t\4\2\2nm\3\2"+
		"\2\2no\3\2\2\2op\3\2\2\2pq\5\7\4\2q~\3\2\2\2rs\5\5\3\2su\7\60\2\2tv\5"+
		"\5\3\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7G\2\2xz\t\4\2\2yx\3\2\2\2yz\3"+
		"\2\2\2z{\3\2\2\2{|\5\7\4\2|~\3\2\2\2}?\3\2\2\2}I\3\2\2\2}S\3\2\2\2}^\3"+
		"\2\2\2}h\3\2\2\2}r\3\2\2\2~\f\3\2\2\2\177\u0083\7%\2\2\u0080\u0082\13"+
		"\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\t\5"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\7\2\2\u008a"+
		"\16\3\2\2\2\u008b\u008c\7$\2\2\u008c\u008d\7$\2\2\u008d\u008e\7$\2\2\u008e"+
		"\u0092\3\2\2\2\u008f\u0091\13\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7$\2\2\u0096\u0097\7$\2\2\u0097\u0098\7$\2"+
		"\2\u0098\u0099\3\2\2\2\u0099\u009a\b\b\2\2\u009a\20\3\2\2\2\u009b\u009d"+
		"\t\6\2\2\u009c\u009b\3\2\2\2\u009d\u00a3\3\2\2\2\u009e\u00a2\t\7\2\2\u009f"+
		"\u00a2\5\5\3\2\u00a0\u00a2\7a\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\22\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7)\2\2"+
		"\u00a7\u00a8\13\2\2\2\u00a8\u00ba\7)\2\2\u00a9\u00aa\7)\2\2\u00aa\u00ab"+
		"\7^\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\5\5\3\2\u00ad\u00ae\7)\2\2\u00ae"+
		"\u00ba\3\2\2\2\u00af\u00b0\7)\2\2\u00b0\u00b1\7^\2\2\u00b1\u00b2\7p\2"+
		"\2\u00b2\u00b3\3\2\2\2\u00b3\u00ba\7)\2\2\u00b4\u00b5\7)\2\2\u00b5\u00b6"+
		"\7^\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\7)\2\2\u00b9"+
		"\u00a6\3\2\2\2\u00b9\u00a9\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b4\3\2"+
		"\2\2\u00ba\24\3\2\2\2\35\2\30\37\")-\64;=DIOVZchnuy}\u0083\u0087\u0092"+
		"\u009c\u00a1\u00a3\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}