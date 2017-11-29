// Generated from /home/andre/Área de Trabalho/Trabalho/InterpreTraduto/grammar/basicintast/parser/Basic.g4 by ANTLR 4.6

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
		T__0=1, T__1=2, T__2=3, IF=4, BEGIN=5, END=6, ENDP=7, ELSE=8, THEN=9, 
		WRITE=10, WRITELN=11, READLN=12, INT=13, FLOAT=14, BOOLEAN=15, STRING=16, 
		FOR=17, WHILE=18, ARRAY=19, VAR=20, PROGRAM=21, TRUE=22, FALSE=23, GT=24, 
		LT=25, EQ=26, GE=27, LE=28, NE=29, PLUS=30, MINUS=31, MULT=32, DIV=33, 
		OPEN=34, CLOSE=35, OPEN_BL=36, CLOSE_BL=37, IS=38, EOL=39, NUM=40, VARNAME=41, 
		STR=42, WS=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
		"Y", "Z", "IF", "BEGIN", "END", "ENDP", "ELSE", "THEN", "WRITE", "WRITELN", 
		"READLN", "INT", "FLOAT", "BOOLEAN", "STRING", "FOR", "WHILE", "ARRAY", 
		"VAR", "PROGRAM", "TRUE", "FALSE", "GT", "LT", "EQ", "GE", "LE", "NE", 
		"PLUS", "MINUS", "MULT", "DIV", "OPEN", "CLOSE", "OPEN_BL", "CLOSE_BL", 
		"IS", "EOL", "NUM", "VARNAME", "STR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "':='", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", "'+'", "'-'", "'*'", 
		"'/'", "'('", "')'", "'{'", "'}'", "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "IF", "BEGIN", "END", "ENDP", "ELSE", "THEN", 
		"WRITE", "WRITELN", "READLN", "INT", "FLOAT", "BOOLEAN", "STRING", "FOR", 
		"WHILE", "ARRAY", "VAR", "PROGRAM", "TRUE", "FALSE", "GT", "LT", "EQ", 
		"GE", "LE", "NE", "PLUS", "MINUS", "MULT", "DIV", "OPEN", "CLOSE", "OPEN_BL", 
		"CLOSE_BL", "IS", "EOL", "NUM", "VARNAME", "STR", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u017f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3="+
		"\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\6C\u0163\nC\rC\16C\u0164\3D\3D\7D\u0169"+
		"\nD\fD\16D\u016c\13D\3E\3E\3E\3E\7E\u0172\nE\fE\16E\u0175\13E\3E\3E\3"+
		"F\6F\u017a\nF\rF\16F\u017b\3F\3F\2\2G\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21"+
		"\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63"+
		"\2\65\2\67\29\2;\2=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24"+
		"[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081"+
		"(\u0083)\u0085*\u0087+\u0089,\u008b-\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\4\2C\\c|\6\2\62;C"+
		"\\aac|\4\2$$^^\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\"\u0169\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2"+
		"\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2"+
		"k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3"+
		"\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2"+
		"\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2\2\t\u0094\3\2\2"+
		"\2\13\u0096\3\2\2\2\r\u0098\3\2\2\2\17\u009a\3\2\2\2\21\u009c\3\2\2\2"+
		"\23\u009e\3\2\2\2\25\u00a0\3\2\2\2\27\u00a2\3\2\2\2\31\u00a4\3\2\2\2\33"+
		"\u00a6\3\2\2\2\35\u00a8\3\2\2\2\37\u00aa\3\2\2\2!\u00ac\3\2\2\2#\u00ae"+
		"\3\2\2\2%\u00b0\3\2\2\2\'\u00b2\3\2\2\2)\u00b4\3\2\2\2+\u00b6\3\2\2\2"+
		"-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63\u00be\3\2\2\2\65\u00c0"+
		"\3\2\2\2\67\u00c2\3\2\2\29\u00c4\3\2\2\2;\u00c6\3\2\2\2=\u00c8\3\2\2\2"+
		"?\u00cb\3\2\2\2A\u00d1\3\2\2\2C\u00d5\3\2\2\2E\u00da\3\2\2\2G\u00df\3"+
		"\2\2\2I\u00e4\3\2\2\2K\u00ea\3\2\2\2M\u00f2\3\2\2\2O\u00f9\3\2\2\2Q\u0101"+
		"\3\2\2\2S\u0107\3\2\2\2U\u010f\3\2\2\2W\u0116\3\2\2\2Y\u011a\3\2\2\2["+
		"\u0120\3\2\2\2]\u0126\3\2\2\2_\u012a\3\2\2\2a\u0132\3\2\2\2c\u0137\3\2"+
		"\2\2e\u013d\3\2\2\2g\u013f\3\2\2\2i\u0141\3\2\2\2k\u0144\3\2\2\2m\u0147"+
		"\3\2\2\2o\u014a\3\2\2\2q\u014d\3\2\2\2s\u014f\3\2\2\2u\u0151\3\2\2\2w"+
		"\u0153\3\2\2\2y\u0155\3\2\2\2{\u0157\3\2\2\2}\u0159\3\2\2\2\177\u015b"+
		"\3\2\2\2\u0081\u015d\3\2\2\2\u0083\u015f\3\2\2\2\u0085\u0162\3\2\2\2\u0087"+
		"\u0166\3\2\2\2\u0089\u016d\3\2\2\2\u008b\u0179\3\2\2\2\u008d\u008e\7<"+
		"\2\2\u008e\4\3\2\2\2\u008f\u0090\7.\2\2\u0090\6\3\2\2\2\u0091\u0092\7"+
		"<\2\2\u0092\u0093\7?\2\2\u0093\b\3\2\2\2\u0094\u0095\t\2\2\2\u0095\n\3"+
		"\2\2\2\u0096\u0097\t\3\2\2\u0097\f\3\2\2\2\u0098\u0099\t\4\2\2\u0099\16"+
		"\3\2\2\2\u009a\u009b\t\5\2\2\u009b\20\3\2\2\2\u009c\u009d\t\6\2\2\u009d"+
		"\22\3\2\2\2\u009e\u009f\t\7\2\2\u009f\24\3\2\2\2\u00a0\u00a1\t\b\2\2\u00a1"+
		"\26\3\2\2\2\u00a2\u00a3\t\t\2\2\u00a3\30\3\2\2\2\u00a4\u00a5\t\n\2\2\u00a5"+
		"\32\3\2\2\2\u00a6\u00a7\t\13\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\t\f\2\2"+
		"\u00a9\36\3\2\2\2\u00aa\u00ab\t\r\2\2\u00ab \3\2\2\2\u00ac\u00ad\t\16"+
		"\2\2\u00ad\"\3\2\2\2\u00ae\u00af\t\17\2\2\u00af$\3\2\2\2\u00b0\u00b1\t"+
		"\20\2\2\u00b1&\3\2\2\2\u00b2\u00b3\t\21\2\2\u00b3(\3\2\2\2\u00b4\u00b5"+
		"\t\22\2\2\u00b5*\3\2\2\2\u00b6\u00b7\t\23\2\2\u00b7,\3\2\2\2\u00b8\u00b9"+
		"\t\24\2\2\u00b9.\3\2\2\2\u00ba\u00bb\t\25\2\2\u00bb\60\3\2\2\2\u00bc\u00bd"+
		"\t\26\2\2\u00bd\62\3\2\2\2\u00be\u00bf\t\27\2\2\u00bf\64\3\2\2\2\u00c0"+
		"\u00c1\t\30\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\t\31\2\2\u00c38\3\2\2\2\u00c4"+
		"\u00c5\t\32\2\2\u00c5:\3\2\2\2\u00c6\u00c7\t\33\2\2\u00c7<\3\2\2\2\u00c8"+
		"\u00c9\5\31\r\2\u00c9\u00ca\5\23\n\2\u00ca>\3\2\2\2\u00cb\u00cc\5\13\6"+
		"\2\u00cc\u00cd\5\21\t\2\u00cd\u00ce\5\25\13\2\u00ce\u00cf\5\31\r\2\u00cf"+
		"\u00d0\5#\22\2\u00d0@\3\2\2\2\u00d1\u00d2\5\21\t\2\u00d2\u00d3\5#\22\2"+
		"\u00d3\u00d4\5\17\b\2\u00d4B\3\2\2\2\u00d5\u00d6\5\21\t\2\u00d6\u00d7"+
		"\5#\22\2\u00d7\u00d8\5\17\b\2\u00d8\u00d9\7\60\2\2\u00d9D\3\2\2\2\u00da"+
		"\u00db\5\21\t\2\u00db\u00dc\5\37\20\2\u00dc\u00dd\5-\27\2\u00dd\u00de"+
		"\5\21\t\2\u00deF\3\2\2\2\u00df\u00e0\5/\30\2\u00e0\u00e1\5\27\f\2\u00e1"+
		"\u00e2\5\21\t\2\u00e2\u00e3\5#\22\2\u00e3H\3\2\2\2\u00e4\u00e5\5\65\33"+
		"\2\u00e5\u00e6\5+\26\2\u00e6\u00e7\5\31\r\2\u00e7\u00e8\5/\30\2\u00e8"+
		"\u00e9\5\21\t\2\u00e9J\3\2\2\2\u00ea\u00eb\5\65\33\2\u00eb\u00ec\5+\26"+
		"\2\u00ec\u00ed\5\31\r\2\u00ed\u00ee\5/\30\2\u00ee\u00ef\5\21\t\2\u00ef"+
		"\u00f0\5\37\20\2\u00f0\u00f1\5#\22\2\u00f1L\3\2\2\2\u00f2\u00f3\5+\26"+
		"\2\u00f3\u00f4\5\21\t\2\u00f4\u00f5\5\t\5\2\u00f5\u00f6\5\17\b\2\u00f6"+
		"\u00f7\5\37\20\2\u00f7\u00f8\5#\22\2\u00f8N\3\2\2\2\u00f9\u00fa\5\31\r"+
		"\2\u00fa\u00fb\5#\22\2\u00fb\u00fc\5/\30\2\u00fc\u00fd\5\21\t\2\u00fd"+
		"\u00fe\5\25\13\2\u00fe\u00ff\5\21\t\2\u00ff\u0100\5+\26\2\u0100P\3\2\2"+
		"\2\u0101\u0102\5\23\n\2\u0102\u0103\5\37\20\2\u0103\u0104\5%\23\2\u0104"+
		"\u0105\5\t\5\2\u0105\u0106\5/\30\2\u0106R\3\2\2\2\u0107\u0108\5\13\6\2"+
		"\u0108\u0109\5%\23\2\u0109\u010a\5%\23\2\u010a\u010b\5\37\20\2\u010b\u010c"+
		"\5\21\t\2\u010c\u010d\5\t\5\2\u010d\u010e\5#\22\2\u010eT\3\2\2\2\u010f"+
		"\u0110\5-\27\2\u0110\u0111\5/\30\2\u0111\u0112\5+\26\2\u0112\u0113\5\31"+
		"\r\2\u0113\u0114\5#\22\2\u0114\u0115\5\25\13\2\u0115V\3\2\2\2\u0116\u0117"+
		"\5\23\n\2\u0117\u0118\5%\23\2\u0118\u0119\5+\26\2\u0119X\3\2\2\2\u011a"+
		"\u011b\5\65\33\2\u011b\u011c\5\27\f\2\u011c\u011d\5\31\r\2\u011d\u011e"+
		"\5\37\20\2\u011e\u011f\5\21\t\2\u011fZ\3\2\2\2\u0120\u0121\5\t\5\2\u0121"+
		"\u0122\5+\26\2\u0122\u0123\5+\26\2\u0123\u0124\5\t\5\2\u0124\u0125\59"+
		"\35\2\u0125\\\3\2\2\2\u0126\u0127\5\63\32\2\u0127\u0128\5\t\5\2\u0128"+
		"\u0129\5+\26\2\u0129^\3\2\2\2\u012a\u012b\5\'\24\2\u012b\u012c\5+\26\2"+
		"\u012c\u012d\5%\23\2\u012d\u012e\5\25\13\2\u012e\u012f\5+\26\2\u012f\u0130"+
		"\5\t\5\2\u0130\u0131\5!\21\2\u0131`\3\2\2\2\u0132\u0133\5/\30\2\u0133"+
		"\u0134\5+\26\2\u0134\u0135\5\61\31\2\u0135\u0136\5\21\t\2\u0136b\3\2\2"+
		"\2\u0137\u0138\5\23\n\2\u0138\u0139\5\t\5\2\u0139\u013a\5\37\20\2\u013a"+
		"\u013b\5-\27\2\u013b\u013c\5\21\t\2\u013cd\3\2\2\2\u013d\u013e\7@\2\2"+
		"\u013ef\3\2\2\2\u013f\u0140\7>\2\2\u0140h\3\2\2\2\u0141\u0142\7?\2\2\u0142"+
		"\u0143\7?\2\2\u0143j\3\2\2\2\u0144\u0145\7@\2\2\u0145\u0146\7?\2\2\u0146"+
		"l\3\2\2\2\u0147\u0148\7>\2\2\u0148\u0149\7?\2\2\u0149n\3\2\2\2\u014a\u014b"+
		"\7#\2\2\u014b\u014c\7?\2\2\u014cp\3\2\2\2\u014d\u014e\7-\2\2\u014er\3"+
		"\2\2\2\u014f\u0150\7/\2\2\u0150t\3\2\2\2\u0151\u0152\7,\2\2\u0152v\3\2"+
		"\2\2\u0153\u0154\7\61\2\2\u0154x\3\2\2\2\u0155\u0156\7*\2\2\u0156z\3\2"+
		"\2\2\u0157\u0158\7+\2\2\u0158|\3\2\2\2\u0159\u015a\7}\2\2\u015a~\3\2\2"+
		"\2\u015b\u015c\7\177\2\2\u015c\u0080\3\2\2\2\u015d\u015e\7?\2\2\u015e"+
		"\u0082\3\2\2\2\u015f\u0160\7=\2\2\u0160\u0084\3\2\2\2\u0161\u0163\t\34"+
		"\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0086\3\2\2\2\u0166\u016a\t\35\2\2\u0167\u0169\t"+
		"\36\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u0088\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0173\7$"+
		"\2\2\u016e\u016f\7^\2\2\u016f\u0172\t\37\2\2\u0170\u0172\n \2\2\u0171"+
		"\u016e\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0177\7$\2\2\u0177\u008a\3\2\2\2\u0178\u017a\t!\2\2\u0179\u0178\3\2\2"+
		"\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017e\bF\2\2\u017e\u008c\3\2\2\2\b\2\u0164\u016a\u0171"+
		"\u0173\u017b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}