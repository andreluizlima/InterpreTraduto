// Generated from C:\Users\junin\Documents\NetBeansProjects\InterTradutor\grammar\basicint\parser\Basic.g4 by ANTLR 4.6

package basicint.parser;
import java.util.*;
import basicint.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, OPEN=5, CLOSE=6, EQ=7, EOL=8, PRINT=9, 
		READ=10, NUM=11, VAR=12, STR=13, WS=14;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_print = 2, RULE_read = 3, RULE_attr = 4, 
		RULE_expr = 5, RULE_expr1 = 6, RULE_expr2 = 7;
	public static final String[] ruleNames = {
		"program", "stmt", "print", "read", "attr", "expr", "expr1", "expr2"
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

	@Override
	public String getGrammarFileName() { return "Basic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(BasicParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(BasicParser.EOL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				stmt();
				setState(17);
				match(EOL);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN) | (1L << PRINT) | (1L << READ) | (1L << NUM) | (1L << VAR))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				read();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				attr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				expr();
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

	public static class PrintContext extends ParserRuleContext {
		public Token STR;
		public ExprContext expr;
		public TerminalNode PRINT() { return getToken(BasicParser.PRINT, 0); }
		public TerminalNode STR() { return getToken(BasicParser.STR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(PRINT);
				setState(30);
				((PrintContext)_localctx).STR = match(STR);
				System.out.println((((PrintContext)_localctx).STR!=null?((PrintContext)_localctx).STR.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(PRINT);
				setState(33);
				((PrintContext)_localctx).expr = expr();
				System.out.println(((PrintContext)_localctx).expr.value); 
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

	public static class ReadContext extends ParserRuleContext {
		public Token VAR;
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(READ);
			setState(39);
			((ReadContext)_localctx).VAR = match(VAR);

			             Scanner s = new Scanner(System.in);
			             Double d = s.nextDouble();
			             SymbolsTable.getInstance().addSymbol((((ReadContext)_localctx).VAR!=null?((ReadContext)_localctx).VAR.getText():null),d);
			        
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

	public static class AttrContext extends ParserRuleContext {
		public Token a;
		public ExprContext b;
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((AttrContext)_localctx).a = match(VAR);
			setState(43);
			match(EQ);
			setState(44);
			((AttrContext)_localctx).b = expr();
			SymbolsTable.getInstance().addSymbol((((AttrContext)_localctx).a!=null?((AttrContext)_localctx).a.getText():null),((AttrContext)_localctx).b.value);
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

	public static class ExprContext extends ParserRuleContext {
		public Double value;
		public Expr1Context a;
		public ExprContext b;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((ExprContext)_localctx).a = expr1();
				setState(48);
				match(PLUS);
				setState(49);
				((ExprContext)_localctx).b = expr();
				 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value + ((ExprContext)_localctx).b.value; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				((ExprContext)_localctx).a = expr1();
				setState(53);
				match(MINUS);
				setState(54);
				((ExprContext)_localctx).b = expr();
				 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value - ((ExprContext)_localctx).b.value; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				((ExprContext)_localctx).a = expr1();
				 ((ExprContext)_localctx).value =  ((ExprContext)_localctx).a.value; 
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

	public static class Expr1Context extends ParserRuleContext {
		public Double value;
		public Expr2Context a;
		public ExprContext b;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr1);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((Expr1Context)_localctx).a = expr2();
				setState(63);
				match(MULT);
				setState(64);
				((Expr1Context)_localctx).b = expr();
				 ((Expr1Context)_localctx).value =  ((Expr1Context)_localctx).a.value * ((Expr1Context)_localctx).b.value; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((Expr1Context)_localctx).a = expr2();
				setState(68);
				match(DIV);
				setState(69);
				((Expr1Context)_localctx).b = expr();
				 ((Expr1Context)_localctx).value =  ((Expr1Context)_localctx).a.value / ((Expr1Context)_localctx).b.value; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				((Expr1Context)_localctx).a = expr2();
				 ((Expr1Context)_localctx).value =  ((Expr1Context)_localctx).a.value; 
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

	public static class Expr2Context extends ParserRuleContext {
		public Double value;
		public ExprContext a;
		public Token n;
		public Token v;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(BasicParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr2);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(OPEN);
				setState(78);
				((Expr2Context)_localctx).a = expr();
				setState(79);
				match(CLOSE);
				 ((Expr2Context)_localctx).value =  ((Expr2Context)_localctx).a.value; 
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				((Expr2Context)_localctx).n = match(NUM);
				 ((Expr2Context)_localctx).value =  Double.parseDouble((((Expr2Context)_localctx).n!=null?((Expr2Context)_localctx).n.getText():null)); 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				((Expr2Context)_localctx).v = match(VAR);
				 ((Expr2Context)_localctx).value =  SymbolsTable.getInstance().getSymbol((((Expr2Context)_localctx).v!=null?((Expr2Context)_localctx).v.getText():null));
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\'\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tY\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2]\2\25\3\2\2\2\4\35\3\2\2\2\6&"+
		"\3\2\2\2\b(\3\2\2\2\n,\3\2\2\2\f>\3\2\2\2\16M\3\2\2\2\20X\3\2\2\2\22\23"+
		"\5\4\3\2\23\24\7\n\2\2\24\26\3\2\2\2\25\22\3\2\2\2\26\27\3\2\2\2\27\25"+
		"\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\36\5\6\4\2\32\36\5\b\5\2\33\36"+
		"\5\n\6\2\34\36\5\f\7\2\35\31\3\2\2\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34"+
		"\3\2\2\2\36\5\3\2\2\2\37 \7\13\2\2 !\7\17\2\2!\'\b\4\1\2\"#\7\13\2\2#"+
		"$\5\f\7\2$%\b\4\1\2%\'\3\2\2\2&\37\3\2\2\2&\"\3\2\2\2\'\7\3\2\2\2()\7"+
		"\f\2\2)*\7\16\2\2*+\b\5\1\2+\t\3\2\2\2,-\7\16\2\2-.\7\t\2\2./\5\f\7\2"+
		"/\60\b\6\1\2\60\13\3\2\2\2\61\62\5\16\b\2\62\63\7\3\2\2\63\64\5\f\7\2"+
		"\64\65\b\7\1\2\65?\3\2\2\2\66\67\5\16\b\2\678\7\4\2\289\5\f\7\29:\b\7"+
		"\1\2:?\3\2\2\2;<\5\16\b\2<=\b\7\1\2=?\3\2\2\2>\61\3\2\2\2>\66\3\2\2\2"+
		">;\3\2\2\2?\r\3\2\2\2@A\5\20\t\2AB\7\5\2\2BC\5\f\7\2CD\b\b\1\2DN\3\2\2"+
		"\2EF\5\20\t\2FG\7\6\2\2GH\5\f\7\2HI\b\b\1\2IN\3\2\2\2JK\5\20\t\2KL\b\b"+
		"\1\2LN\3\2\2\2M@\3\2\2\2ME\3\2\2\2MJ\3\2\2\2N\17\3\2\2\2OP\7\7\2\2PQ\5"+
		"\f\7\2QR\7\b\2\2RS\b\t\1\2SY\3\2\2\2TU\7\r\2\2UY\b\t\1\2VW\7\16\2\2WY"+
		"\b\t\1\2XO\3\2\2\2XT\3\2\2\2XV\3\2\2\2Y\21\3\2\2\2\b\27\35&>MX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}