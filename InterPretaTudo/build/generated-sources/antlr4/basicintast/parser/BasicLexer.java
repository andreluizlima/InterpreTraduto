// Generated from /home/a120077/Área de Trabalho/InterPretaTudo/grammar/basicintast/parser/Basic.g4 by ANTLR 4.6

package basicintast.parser;
import basicintast.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, BEGIN=2, END=3, ELSE=4, THEN=5, GT=6, LT=7, EQ=8, GE=9, LE=10, NE=11, 
		PLUS=12, MINUS=13, MULT=14, DIV=15, OPEN=16, CLOSE=17, OPEN_BL=18, CLOSE_BL=19, 
		IS=20, EOL=21, PRINT=22, READ=23, NUM=24, VAR=25, STR=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "IF", "BEGIN", 
		"END", "ELSE", "THEN", "GT", "LT", "EQ", "GE", "LE", "NE", "PLUS", "MINUS", 
		"MULT", "DIV", "OPEN", "CLOSE", "OPEN_BL", "CLOSE_BL", "IS", "EOL", "PRINT", 
		"READ", "NUM", "VAR", "STR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'>'", "'<'", "'=='", "'>='", "'<='", 
		"'!='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "'='", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "BEGIN", "END", "ELSE", "THEN", "GT", "LT", "EQ", "GE", "LE", 
		"NE", "PLUS", "MINUS", "MULT", "DIV", "OPEN", "CLOSE", "OPEN_BL", "CLOSE_BL", 
		"IS", "EOL", "PRINT", "READ", "NUM", "VAR", "STR", "WS"
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


	public BasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Basic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u0105\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u00e9"+
		"\n\63\r\63\16\63\u00ea\3\64\3\64\7\64\u00ef\n\64\f\64\16\64\u00f2\13\64"+
		"\3\65\3\65\3\65\3\65\7\65\u00f8\n\65\f\65\16\65\u00fb\13\65\3\65\3\65"+
		"\3\66\6\66\u0100\n\66\r\66\16\66\u0101\3\66\3\66\2\2\67\3\2\5\2\7\2\t"+
		"\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2"+
		")\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17"+
		"Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35\3\2\"\4\2CCc"+
		"c\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62"+
		";\4\2C\\c|\6\2\62;C\\aac|\4\2$$^^\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\""+
		"\u00ef\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2"+
		"\13u\3\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\177\3\2"+
		"\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2"+
		"\2\37\u0089\3\2\2\2!\u008b\3\2\2\2#\u008d\3\2\2\2%\u008f\3\2\2\2\'\u0091"+
		"\3\2\2\2)\u0093\3\2\2\2+\u0095\3\2\2\2-\u0097\3\2\2\2/\u0099\3\2\2\2\61"+
		"\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u009f\3\2\2\2\67\u00a1\3\2\2\29\u00a4"+
		"\3\2\2\2;\u00aa\3\2\2\2=\u00ae\3\2\2\2?\u00b3\3\2\2\2A\u00b8\3\2\2\2C"+
		"\u00ba\3\2\2\2E\u00bc\3\2\2\2G\u00bf\3\2\2\2I\u00c2\3\2\2\2K\u00c5\3\2"+
		"\2\2M\u00c8\3\2\2\2O\u00ca\3\2\2\2Q\u00cc\3\2\2\2S\u00ce\3\2\2\2U\u00d0"+
		"\3\2\2\2W\u00d2\3\2\2\2Y\u00d4\3\2\2\2[\u00d6\3\2\2\2]\u00d8\3\2\2\2_"+
		"\u00da\3\2\2\2a\u00dc\3\2\2\2c\u00e2\3\2\2\2e\u00e8\3\2\2\2g\u00ec\3\2"+
		"\2\2i\u00f3\3\2\2\2k\u00ff\3\2\2\2mn\t\2\2\2n\4\3\2\2\2op\t\3\2\2p\6\3"+
		"\2\2\2qr\t\4\2\2r\b\3\2\2\2st\t\5\2\2t\n\3\2\2\2uv\t\6\2\2v\f\3\2\2\2"+
		"wx\t\7\2\2x\16\3\2\2\2yz\t\b\2\2z\20\3\2\2\2{|\t\t\2\2|\22\3\2\2\2}~\t"+
		"\n\2\2~\24\3\2\2\2\177\u0080\t\13\2\2\u0080\26\3\2\2\2\u0081\u0082\t\f"+
		"\2\2\u0082\30\3\2\2\2\u0083\u0084\t\r\2\2\u0084\32\3\2\2\2\u0085\u0086"+
		"\t\16\2\2\u0086\34\3\2\2\2\u0087\u0088\t\17\2\2\u0088\36\3\2\2\2\u0089"+
		"\u008a\t\20\2\2\u008a \3\2\2\2\u008b\u008c\t\21\2\2\u008c\"\3\2\2\2\u008d"+
		"\u008e\t\22\2\2\u008e$\3\2\2\2\u008f\u0090\t\23\2\2\u0090&\3\2\2\2\u0091"+
		"\u0092\t\24\2\2\u0092(\3\2\2\2\u0093\u0094\t\25\2\2\u0094*\3\2\2\2\u0095"+
		"\u0096\t\26\2\2\u0096,\3\2\2\2\u0097\u0098\t\27\2\2\u0098.\3\2\2\2\u0099"+
		"\u009a\t\30\2\2\u009a\60\3\2\2\2\u009b\u009c\t\31\2\2\u009c\62\3\2\2\2"+
		"\u009d\u009e\t\32\2\2\u009e\64\3\2\2\2\u009f\u00a0\t\33\2\2\u00a0\66\3"+
		"\2\2\2\u00a1\u00a2\5\23\n\2\u00a2\u00a3\5\r\7\2\u00a38\3\2\2\2\u00a4\u00a5"+
		"\5\5\3\2\u00a5\u00a6\5\13\6\2\u00a6\u00a7\5\17\b\2\u00a7\u00a8\5\23\n"+
		"\2\u00a8\u00a9\5\35\17\2\u00a9:\3\2\2\2\u00aa\u00ab\5\13\6\2\u00ab\u00ac"+
		"\5\35\17\2\u00ac\u00ad\5\t\5\2\u00ad<\3\2\2\2\u00ae\u00af\5\13\6\2\u00af"+
		"\u00b0\5\31\r\2\u00b0\u00b1\5\'\24\2\u00b1\u00b2\5\13\6\2\u00b2>\3\2\2"+
		"\2\u00b3\u00b4\5)\25\2\u00b4\u00b5\5\21\t\2\u00b5\u00b6\5\13\6\2\u00b6"+
		"\u00b7\5\35\17\2\u00b7@\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9B\3\2\2\2\u00ba"+
		"\u00bb\7>\2\2\u00bbD\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd\u00be\7?\2\2\u00be"+
		"F\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0\u00c1\7?\2\2\u00c1H\3\2\2\2\u00c2\u00c3"+
		"\7>\2\2\u00c3\u00c4\7?\2\2\u00c4J\3\2\2\2\u00c5\u00c6\7#\2\2\u00c6\u00c7"+
		"\7?\2\2\u00c7L\3\2\2\2\u00c8\u00c9\7-\2\2\u00c9N\3\2\2\2\u00ca\u00cb\7"+
		"/\2\2\u00cbP\3\2\2\2\u00cc\u00cd\7,\2\2\u00cdR\3\2\2\2\u00ce\u00cf\7\61"+
		"\2\2\u00cfT\3\2\2\2\u00d0\u00d1\7*\2\2\u00d1V\3\2\2\2\u00d2\u00d3\7+\2"+
		"\2\u00d3X\3\2\2\2\u00d4\u00d5\7}\2\2\u00d5Z\3\2\2\2\u00d6\u00d7\7\177"+
		"\2\2\u00d7\\\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9^\3\2\2\2\u00da\u00db\7="+
		"\2\2\u00db`\3\2\2\2\u00dc\u00dd\5!\21\2\u00dd\u00de\5%\23\2\u00de\u00df"+
		"\5\23\n\2\u00df\u00e0\5\35\17\2\u00e0\u00e1\5)\25\2\u00e1b\3\2\2\2\u00e2"+
		"\u00e3\5%\23\2\u00e3\u00e4\5\13\6\2\u00e4\u00e5\5\3\2\2\u00e5\u00e6\5"+
		"\t\5\2\u00e6d\3\2\2\2\u00e7\u00e9\t\34\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ebf\3\2\2\2\u00ec"+
		"\u00f0\t\35\2\2\u00ed\u00ef\t\36\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1h\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f3\u00f9\7$\2\2\u00f4\u00f5\7^\2\2\u00f5\u00f8\t\37\2\2\u00f6"+
		"\u00f8\n \2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\7$\2\2\u00fdj\3\2\2\2\u00fe\u0100\t!\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b\66\2\2\u0104l\3\2\2\2\b\2\u00ea"+
		"\u00f0\u00f7\u00f9\u0101\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}