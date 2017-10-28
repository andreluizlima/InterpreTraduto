// Generated from C:\Users\junin\Documents\NetBeansProjects\InterTradutor\grammar\basicint\parser\Basic.g4 by ANTLR 4.6

package basicint.parser;
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramStmtContext extends ProgramContext {
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
		public ProgramStmtContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitProgramStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramStmtContext(_localctx);
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtExprContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtExprContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAttrContext extends StmtContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public StmtAttrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStmtAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPrintContext extends StmtContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StmtPrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStmtPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtReadContext extends StmtContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public StmtReadContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStmtRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StmtPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				print();
				}
				break;
			case 2:
				_localctx = new StmtReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				read();
				}
				break;
			case 3:
				_localctx = new StmtAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				attr();
				}
				break;
			case 4:
				_localctx = new StmtExprContext(_localctx);
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
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStrContext extends PrintContext {
		public TerminalNode PRINT() { return getToken(BasicParser.PRINT, 0); }
		public TerminalNode STR() { return getToken(BasicParser.STR, 0); }
		public PrintStrContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitPrintStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends PrintContext {
		public TerminalNode PRINT() { return getToken(BasicParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(PRINT);
				setState(30);
				match(STR);
				}
				break;
			case 2:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(PRINT);
				setState(32);
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

	public static class ReadContext extends ParserRuleContext {
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	 
		public ReadContext() { }
		public void copyFrom(ReadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadVarContext extends ReadContext {
		public TerminalNode READ() { return getToken(BasicParser.READ, 0); }
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public ReadVarContext(ReadContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitReadVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read);
		try {
			_localctx = new ReadVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(READ);
			setState(36);
			match(VAR);
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
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	 
		public AttrContext() { }
		public void copyFrom(AttrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttrExprContext extends AttrContext {
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrExprContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitAttrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr);
		try {
			_localctx = new AttrExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(VAR);
			setState(39);
			match(EQ);
			setState(40);
			expr();
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ExprPlusContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr1EmptyContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr1EmptyContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpr1Empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinusContext extends ExprContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExprMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				expr1();
				setState(43);
				match(PLUS);
				setState(44);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				expr1();
				setState(47);
				match(MINUS);
				setState(48);
				expr();
				}
				break;
			case 3:
				_localctx = new Expr1EmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				expr1();
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
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class Expr2EmptyContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr2EmptyContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpr2Empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr1MultContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpr1Mult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr1DivContext extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr1DivContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpr1Div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr1);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Expr1MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				expr2();
				setState(54);
				match(MULT);
				setState(55);
				expr();
				}
				break;
			case 2:
				_localctx = new Expr1DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				expr2();
				setState(58);
				match(DIV);
				setState(59);
				expr();
				}
				break;
			case 3:
				_localctx = new Expr2EmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				expr2();
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
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class Expr2VarContext extends Expr2Context {
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public Expr2VarContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpr2Var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr2NumContext extends Expr2Context {
		public TerminalNode NUM() { return getToken(BasicParser.NUM, 0); }
		public Expr2NumContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpr2Num(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr2ParContext extends Expr2Context {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr2ParContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitExpr2Par(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr2);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				_localctx = new Expr2ParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(OPEN);
				setState(65);
				expr();
				setState(66);
				match(CLOSE);
				}
				break;
			case NUM:
				_localctx = new Expr2NumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(NUM);
				}
				break;
			case VAR:
				_localctx = new Expr2VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(VAR);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\5\4$\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\66"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bA\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tI\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2M\2\25\3\2\2\2\4\35\3\2\2"+
		"\2\6#\3\2\2\2\b%\3\2\2\2\n(\3\2\2\2\f\65\3\2\2\2\16@\3\2\2\2\20H\3\2\2"+
		"\2\22\23\5\4\3\2\23\24\7\n\2\2\24\26\3\2\2\2\25\22\3\2\2\2\26\27\3\2\2"+
		"\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\36\5\6\4\2\32\36\5\b\5"+
		"\2\33\36\5\n\6\2\34\36\5\f\7\2\35\31\3\2\2\2\35\32\3\2\2\2\35\33\3\2\2"+
		"\2\35\34\3\2\2\2\36\5\3\2\2\2\37 \7\13\2\2 $\7\17\2\2!\"\7\13\2\2\"$\5"+
		"\f\7\2#\37\3\2\2\2#!\3\2\2\2$\7\3\2\2\2%&\7\f\2\2&\'\7\16\2\2\'\t\3\2"+
		"\2\2()\7\16\2\2)*\7\t\2\2*+\5\f\7\2+\13\3\2\2\2,-\5\16\b\2-.\7\3\2\2."+
		"/\5\f\7\2/\66\3\2\2\2\60\61\5\16\b\2\61\62\7\4\2\2\62\63\5\f\7\2\63\66"+
		"\3\2\2\2\64\66\5\16\b\2\65,\3\2\2\2\65\60\3\2\2\2\65\64\3\2\2\2\66\r\3"+
		"\2\2\2\678\5\20\t\289\7\5\2\29:\5\f\7\2:A\3\2\2\2;<\5\20\t\2<=\7\6\2\2"+
		"=>\5\f\7\2>A\3\2\2\2?A\5\20\t\2@\67\3\2\2\2@;\3\2\2\2@?\3\2\2\2A\17\3"+
		"\2\2\2BC\7\7\2\2CD\5\f\7\2DE\7\b\2\2EI\3\2\2\2FI\7\r\2\2GI\7\16\2\2HB"+
		"\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\21\3\2\2\2\b\27\35#\65@H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}