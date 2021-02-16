// Generated from Xana.g4 by ANTLR 4.3

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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHAR_CONSTANT=1, INT_CONSTANT=2, REAL_CONSTANT=3, SINGLE_LINE_COMMENT=4, 
		MULTI_LINE_COMMENT=5, ID=6, SPACE=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'"
	};
	public static final String[] ruleNames = {
		"CHAR_CONSTANT", "CHAR_CONTENT", "INT_CONSTANT", "REAL_CONSTANT", "REAL_MANTISSA", 
		"REAL_EXPONENT", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "ID", "LETTER", 
		"SPACE", "DIGIT"
	};


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u008e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\'\n\3\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\5\4\61\n\4\3\5\3\5\5\5\65\n"+
		"\5\3\5\3\5\3\5\5\5:\n\5\3\6\5\6=\n\6\3\6\3\6\6\6A\n\6\r\6\16\6B\3\6\3"+
		"\6\3\6\7\6H\n\6\f\6\16\6K\13\6\5\6M\n\6\3\7\3\7\5\7Q\n\7\3\7\3\7\3\b\3"+
		"\b\7\bW\n\b\f\b\16\bZ\13\b\3\b\5\b]\n\b\3\b\3\b\5\ba\n\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\5\nw\n\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\f\3\f\6\f"+
		"\u0085\n\f\r\f\16\f\u0086\5\f\u0089\n\f\3\f\3\f\3\r\3\r\4Xk\2\16\3\3\5"+
		"\2\7\4\t\5\13\2\r\2\17\6\21\7\23\b\25\2\27\t\31\2\3\2\7\3\2\63;\4\2GG"+
		"gg\4\2C\\c|\4\2\13\f\17\17\3\2\62;\u009e\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\3\33\3\2\2"+
		"\2\5&\3\2\2\2\7\60\3\2\2\2\t9\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17T\3\2\2"+
		"\2\21d\3\2\2\2\23v\3\2\2\2\25\u0080\3\2\2\2\27\u0088\3\2\2\2\31\u008c"+
		"\3\2\2\2\33\34\7)\2\2\34\35\5\5\3\2\35\36\7)\2\2\36\4\3\2\2\2\37\'\13"+
		"\2\2\2 !\7^\2\2!\'\5\7\4\2\"#\7^\2\2#\'\7p\2\2$%\7^\2\2%\'\7v\2\2&\37"+
		"\3\2\2\2& \3\2\2\2&\"\3\2\2\2&$\3\2\2\2\'\6\3\2\2\2(\61\7\62\2\2)-\t\2"+
		"\2\2*,\5\31\r\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\61\3\2\2\2/-"+
		"\3\2\2\2\60(\3\2\2\2\60)\3\2\2\2\61\b\3\2\2\2\62\64\5\13\6\2\63\65\5\r"+
		"\7\2\64\63\3\2\2\2\64\65\3\2\2\2\65:\3\2\2\2\66\67\5\7\4\2\678\5\r\7\2"+
		"8:\3\2\2\29\62\3\2\2\29\66\3\2\2\2:\n\3\2\2\2;=\5\7\4\2<;\3\2\2\2<=\3"+
		"\2\2\2=>\3\2\2\2>@\7\60\2\2?A\5\31\r\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2B"+
		"C\3\2\2\2CM\3\2\2\2DE\5\7\4\2EI\7\60\2\2FH\5\31\r\2GF\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2L<\3\2\2\2LD\3\2\2\2M\f\3\2"+
		"\2\2NP\t\3\2\2OQ\7/\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\7\4\2S\16\3"+
		"\2\2\2TX\7%\2\2UW\13\2\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y`\3"+
		"\2\2\2ZX\3\2\2\2[]\7\17\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^a\7\f\2\2"+
		"_a\7\2\2\3`\\\3\2\2\2`_\3\2\2\2ab\3\2\2\2bc\b\b\2\2c\20\3\2\2\2de\7$\2"+
		"\2ef\7$\2\2fg\7$\2\2gk\3\2\2\2hj\13\2\2\2ih\3\2\2\2jm\3\2\2\2kl\3\2\2"+
		"\2ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7$\2\2op\7$\2\2pq\7$\2\2qr\3\2\2\2"+
		"rs\b\t\2\2s\22\3\2\2\2tw\7a\2\2uw\5\25\13\2vt\3\2\2\2vu\3\2\2\2w}\3\2"+
		"\2\2x|\7a\2\2y|\5\31\r\2z|\5\25\13\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\24\3\2\2\2\177}\3\2\2\2\u0080\u0081\t\4"+
		"\2\2\u0081\26\3\2\2\2\u0082\u0089\7\"\2\2\u0083\u0085\t\5\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\b\f\2\2\u008b\30\3\2\2\2\u008c\u008d\t\6\2\2\u008d\32"+
		"\3\2\2\2\26\2&-\60\649<BILPX\\`kv{}\u0086\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}