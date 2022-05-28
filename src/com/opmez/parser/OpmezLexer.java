// Generated from .\Opmez.g4 by ANTLR 4.9.2
package com.opmez.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpmezLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFINEFUNC=1, INITIAL=2, KO=3, KC=4, PO=5, PC=6, IF=7, ELSE=8, ELIF=9, 
		SCOL=10, ASSIGN=11, PRINT=12, DECLARE=13, EQT=14, NEQT=15, GT=16, LT=17, 
		GEQT=18, LEQT=19, AND=20, OR=21, TRUE=22, FALSE=23, NOT=24, MULT=25, DIV=26, 
		SUM=27, SUB=28, INT=29, DOUBLE=30, ID=31, STRING=32, LINECOM=33, MULTILINECOM=34, 
		WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", "ELSE", "ELIF", 
			"SCOL", "ASSIGN", "PRINT", "DECLARE", "EQT", "NEQT", "GT", "LT", "GEQT", 
			"LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "MULT", "DIV", "SUM", "SUB", 
			"INT", "DOUBLE", "ID", "STRING", "LINECOM", "MULTILINECOM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'initial'", "'->'", "'<-'", "'('", "')'", "'if'", "'else'", 
			"'elif'", "';'", "'='", "'systalk'", "'use'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", "'!'", "'*'", 
			"'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", "ELSE", 
			"ELIF", "SCOL", "ASSIGN", "PRINT", "DECLARE", "EQT", "NEQT", "GT", "LT", 
			"GEQT", "LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "MULT", "DIV", "SUM", 
			"SUB", "INT", "DOUBLE", "ID", "STRING", "LINECOM", "MULTILINECOM", "WS"
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


	public OpmezLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Opmez.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\6\36\u00a7\n\36\r\36\16\36\u00a8\3\37\6\37\u00ac"+
		"\n\37\r\37\16\37\u00ad\3\37\3\37\6\37\u00b2\n\37\r\37\16\37\u00b3\3 \6"+
		" \u00b7\n \r \16 \u00b8\3 \7 \u00bc\n \f \16 \u00bf\13 \3!\3!\7!\u00c3"+
		"\n!\f!\16!\u00c6\13!\3!\3!\3\"\3\"\7\"\u00cc\n\"\f\"\16\"\u00cf\13\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u00d9\n#\f#\16#\u00dc\13#\3#\3#\3#\3#\3"+
		"#\3$\6$\u00e4\n$\r$\16$\u00e5\3$\3$\6\u00b3\u00c4\u00cd\u00da\2%\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00f1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\3I\3\2\2\2\5K\3\2\2\2\7S\3\2\2\2\tV\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2"+
		"\17]\3\2\2\2\21`\3\2\2\2\23e\3\2\2\2\25j\3\2\2\2\27l\3\2\2\2\31n\3\2\2"+
		"\2\33v\3\2\2\2\35z\3\2\2\2\37}\3\2\2\2!\u0080\3\2\2\2#\u0082\3\2\2\2%"+
		"\u0084\3\2\2\2\'\u0087\3\2\2\2)\u008a\3\2\2\2+\u008d\3\2\2\2-\u0090\3"+
		"\2\2\2/\u0095\3\2\2\2\61\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u009f\3\2\2"+
		"\2\67\u00a1\3\2\2\29\u00a3\3\2\2\2;\u00a6\3\2\2\2=\u00ab\3\2\2\2?\u00b6"+
		"\3\2\2\2A\u00c0\3\2\2\2C\u00c9\3\2\2\2E\u00d4\3\2\2\2G\u00e3\3\2\2\2I"+
		"J\7%\2\2J\4\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7k\2\2NO\7v\2\2OP\7k\2\2PQ\7c"+
		"\2\2QR\7n\2\2R\6\3\2\2\2ST\7/\2\2TU\7@\2\2U\b\3\2\2\2VW\7>\2\2WX\7/\2"+
		"\2X\n\3\2\2\2YZ\7*\2\2Z\f\3\2\2\2[\\\7+\2\2\\\16\3\2\2\2]^\7k\2\2^_\7"+
		"h\2\2_\20\3\2\2\2`a\7g\2\2ab\7n\2\2bc\7u\2\2cd\7g\2\2d\22\3\2\2\2ef\7"+
		"g\2\2fg\7n\2\2gh\7k\2\2hi\7h\2\2i\24\3\2\2\2jk\7=\2\2k\26\3\2\2\2lm\7"+
		"?\2\2m\30\3\2\2\2no\7u\2\2op\7{\2\2pq\7u\2\2qr\7v\2\2rs\7c\2\2st\7n\2"+
		"\2tu\7m\2\2u\32\3\2\2\2vw\7w\2\2wx\7u\2\2xy\7g\2\2y\34\3\2\2\2z{\7?\2"+
		"\2{|\7?\2\2|\36\3\2\2\2}~\7#\2\2~\177\7?\2\2\177 \3\2\2\2\u0080\u0081"+
		"\7@\2\2\u0081\"\3\2\2\2\u0082\u0083\7>\2\2\u0083$\3\2\2\2\u0084\u0085"+
		"\7@\2\2\u0085\u0086\7?\2\2\u0086&\3\2\2\2\u0087\u0088\7>\2\2\u0088\u0089"+
		"\7?\2\2\u0089(\3\2\2\2\u008a\u008b\7(\2\2\u008b\u008c\7(\2\2\u008c*\3"+
		"\2\2\2\u008d\u008e\7~\2\2\u008e\u008f\7~\2\2\u008f,\3\2\2\2\u0090\u0091"+
		"\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093\7w\2\2\u0093\u0094\7g\2\2\u0094"+
		".\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\60\3\2\2\2\u009b\u009c\7#\2\2\u009c"+
		"\62\3\2\2\2\u009d\u009e\7,\2\2\u009e\64\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"\66\3\2\2\2\u00a1\u00a2\7-\2\2\u00a28\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4"+
		":\3\2\2\2\u00a5\u00a7\t\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9<\3\2\2\2\u00aa\u00ac\t"+
		"\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\7\60\2\2\u00b0\u00b2\t"+
		"\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4>\3\2\2\2\u00b5\u00b7\t\3\2\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bd"+
		"\3\2\2\2\u00ba\u00bc\t\4\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be@\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00c0\u00c4\7$\2\2\u00c1\u00c3\13\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\7$\2\2\u00c8B\3\2\2\2\u00c9\u00cd\7B\2\2\u00ca"+
		"\u00cc\13\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d1\7\f\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\"\2\2\u00d3D\3\2\2\2"+
		"\u00d4\u00d5\7B\2\2\u00d5\u00d6\7}\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9"+
		"\13\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de"+
		"\7\177\2\2\u00de\u00df\7B\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b#\2\2\u00e1"+
		"F\3\2\2\2\u00e2\u00e4\t\5\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8"+
		"\b$\2\2\u00e8H\3\2\2\2\f\2\u00a8\u00ad\u00b3\u00b8\u00bd\u00c4\u00cd\u00da"+
		"\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}