// Generated from C:\Users\junin\Documents\NetBeansProjects\InterTradutor\grammar\basicint\parser\Basic.g4 by ANTLR 4.6

package basicint.parser;
import basicint.util.*;

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
		PLUS=1, MINUS=2, MULT=3, DIV=4, OPEN=5, CLOSE=6, EQ=7, EOL=8, PRINT=9, 
		READ=10, NUM=11, VAR=12, STR=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "MULT", "DIV", "OPEN", "CLOSE", "EQ", "EOL", "PRINT", 
		"READ", "NUM", "VAR", "STR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'='", "';'", "'print'", 
		"'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "MULT", "DIV", "OPEN", "CLOSE", "EQ", "EOL", "PRINT", 
		"READ", "NUM", "VAR", "STR", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\6\f<\n\f\r\f\16\f=\3\r\3\r\7\rB\n\r\f\r\16\rE\13\r\3"+
		"\16\3\16\7\16I\n\16\f\16\16\16L\13\16\3\16\3\16\3\17\6\17Q\n\17\r\17\16"+
		"\17R\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\3\2\7\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\7\2\13\13\""+
		"\"\62;C\\c|\5\2\13\f\17\17\"\"Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2"+
		"\17+\3\2\2\2\21-\3\2\2\2\23/\3\2\2\2\25\65\3\2\2\2\27;\3\2\2\2\31?\3\2"+
		"\2\2\33F\3\2\2\2\35P\3\2\2\2\37 \7-\2\2 \4\3\2\2\2!\"\7/\2\2\"\6\3\2\2"+
		"\2#$\7,\2\2$\b\3\2\2\2%&\7\61\2\2&\n\3\2\2\2\'(\7*\2\2(\f\3\2\2\2)*\7"+
		"+\2\2*\16\3\2\2\2+,\7?\2\2,\20\3\2\2\2-.\7=\2\2.\22\3\2\2\2/\60\7r\2\2"+
		"\60\61\7t\2\2\61\62\7k\2\2\62\63\7p\2\2\63\64\7v\2\2\64\24\3\2\2\2\65"+
		"\66\7t\2\2\66\67\7g\2\2\678\7c\2\289\7f\2\29\26\3\2\2\2:<\t\2\2\2;:\3"+
		"\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\30\3\2\2\2?C\t\3\2\2@B\t\4\2\2A"+
		"@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\32\3\2\2\2EC\3\2\2\2FJ\7$\2\2"+
		"GI\t\5\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2"+
		"MN\7$\2\2N\34\3\2\2\2OQ\t\6\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2ST\3\2\2\2TU\b\17\2\2U\36\3\2\2\2\7\2=CJR\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}