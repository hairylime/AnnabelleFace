// Generated from C:/dev/repo/git/botparty/face/app/src/main\Bellechat.g4 by ANTLR 4.6
package com.lukeyes.annabelleface.parser.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BellechatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULLCMD=1, UNCMD=2, BINCMD=3, TERNCMD=4, QUOTED=5, CMDPFX=6, STRING=7, 
		ALPHANUM=8, WS=9, UNKNOWN=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NULLCMD", "UNCMD", "BINCMD", "TERNCMD", "QUOTED", "CMDPFX", "STRING", 
		"ALPHANUM", "WS", "UNKNOWN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NULLCMD", "UNCMD", "BINCMD", "TERNCMD", "QUOTED", "CMDPFX", "STRING", 
		"ALPHANUM", "WS", "UNKNOWN"
	};
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


	public BellechatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bellechat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6c\n\6\f\6\16\6f\13\6\3\6\3\6\3\7\3\7\3"+
		"\b\6\bm\n\b\r\b\16\bn\3\t\3\t\3\n\6\nt\n\n\r\n\16\nu\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\5\3"+
		"\2$$\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5$\3\2\2\2\7H\3\2\2\2\tV\3\2"+
		"\2\2\13`\3\2\2\2\ri\3\2\2\2\17l\3\2\2\2\21p\3\2\2\2\23s\3\2\2\2\25y\3"+
		"\2\2\2\27\"\5\r\7\2\30\31\7u\2\2\31\32\7e\2\2\32\33\7t\2\2\33\34\7g\2"+
		"\2\34\35\7c\2\2\35#\7o\2\2\36\37\7p\2\2\37 \7q\2\2 !\7q\2\2!#\7r\2\2\""+
		"\30\3\2\2\2\"\36\3\2\2\2#\4\3\2\2\2$F\5\r\7\2%&\7r\2\2&\'\7k\2\2\'(\7"+
		"v\2\2()\7e\2\2)G\7j\2\2*+\7p\2\2+,\7q\2\2,-\7q\2\2-.\7r\2\2./\7\63\2\2"+
		"/\60\7c\2\2\60\61\7t\2\2\61G\7{\2\2\62\63\7r\2\2\63\64\7c\2\2\64\65\7"+
		"w\2\2\65\66\7u\2\2\66G\7g\2\2\678\7h\2\289\7c\2\29:\7e\2\2:G\7g\2\2;<"+
		"\7u\2\2<=\7c\2\2=G\7{\2\2>?\7x\2\2?@\7k\2\2@A\7g\2\2AG\7y\2\2BC\7t\2\2"+
		"CD\7c\2\2DE\7v\2\2EG\7g\2\2F%\3\2\2\2F*\3\2\2\2F\62\3\2\2\2F\67\3\2\2"+
		"\2F;\3\2\2\2F>\3\2\2\2FB\3\2\2\2G\6\3\2\2\2HT\5\r\7\2IJ\7t\2\2JK\7w\2"+
		"\2KU\7p\2\2LM\7p\2\2MN\7q\2\2NO\7q\2\2OP\7r\2\2PQ\7\64\2\2QR\7c\2\2RS"+
		"\7t\2\2SU\7{\2\2TI\3\2\2\2TL\3\2\2\2U\b\3\2\2\2VW\5\r\7\2WX\7p\2\2XY\7"+
		"q\2\2YZ\7q\2\2Z[\7r\2\2[\\\7\65\2\2\\]\7c\2\2]^\7t\2\2^_\7{\2\2_\n\3\2"+
		"\2\2`d\7$\2\2ac\n\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2"+
		"\2\2fd\3\2\2\2gh\7$\2\2h\f\3\2\2\2ij\7^\2\2j\16\3\2\2\2km\5\21\t\2lk\3"+
		"\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\20\3\2\2\2pq\t\3\2\2q\22\3\2\2\2"+
		"rt\t\4\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\n\2\2"+
		"x\24\3\2\2\2yz\13\2\2\2z{\3\2\2\2{|\b\13\2\2|\26\3\2\2\2\t\2\"FTdnu\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}