// Generated from /home/andre/Área de Trabalho/Trabalho/InterpreTraduto/grammar/basicintast/parser/Basic.g4 by ANTLR 4.6

package basicintast.parser;
import basicintast.util.*;

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
		T__0=1, T__1=2, IF=3, BEGIN=4, END=5, ENDP=6, ELSE=7, THEN=8, WRITE=9, 
		WRITELN=10, READLN=11, INT=12, FLOAT=13, BOOLEAN=14, STRING=15, FOR=16, 
		WHILE=17, ARRAY=18, VAR=19, PROGRAM=20, GT=21, LT=22, EQ=23, GE=24, LE=25, 
		NE=26, PLUS=27, MINUS=28, MULT=29, DIV=30, OPEN=31, CLOSE=32, OPEN_BL=33, 
		CLOSE_BL=34, IS=35, EOL=36, NUM=37, VARNAME=38, STR=39, WS=40;
	public static final int
		RULE_program = 0, RULE_var = 1, RULE_var2 = 2, RULE_varn = 3, RULE_type = 4, 
		RULE_procedure = 5, RULE_start = 6, RULE_stmt = 7, RULE_cond = 8, RULE_condExpr = 9, 
		RULE_block = 10, RULE_write = 11, RULE_readln = 12, RULE_attr = 13, RULE_expr = 14, 
		RULE_expr1 = 15, RULE_expr2 = 16;
	public static final String[] ruleNames = {
		"program", "var", "var2", "varn", "type", "procedure", "start", "stmt", 
		"cond", "condExpr", "block", "write", "readln", "attr", "expr", "expr1", 
		"expr2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'>'", "'<'", "'=='", 
		"'>='", "'<='", "'!='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", 
		"'}'", "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "IF", "BEGIN", "END", "ENDP", "ELSE", "THEN", "WRITE", 
		"WRITELN", "READLN", "INT", "FLOAT", "BOOLEAN", "STRING", "FOR", "WHILE", 
		"ARRAY", "VAR", "PROGRAM", "GT", "LT", "EQ", "GE", "LE", "NE", "PLUS", 
		"MINUS", "MULT", "DIV", "OPEN", "CLOSE", "OPEN_BL", "CLOSE_BL", "IS", 
		"EOL", "NUM", "VARNAME", "STR", "WS"
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
		public TerminalNode PROGRAM() { return getToken(BasicParser.PROGRAM, 0); }
		public TerminalNode STR() { return getToken(BasicParser.STR, 0); }
		public TerminalNode EOL() { return getToken(BasicParser.EOL, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ProgramStmtContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitProgramStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgramStmtBeginContext extends ProgramContext {
		public TerminalNode PROGRAM() { return getToken(BasicParser.PROGRAM, 0); }
		public TerminalNode STR() { return getToken(BasicParser.STR, 0); }
		public TerminalNode EOL() { return getToken(BasicParser.EOL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public ProgramStmtBeginContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitProgramStmtBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ProgramStmtBeginContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(PROGRAM);
				setState(35);
				match(STR);
				setState(36);
				match(EOL);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(37);
					var();
					}
				}

				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(40);
					procedure();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ProgramStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(PROGRAM);
				setState(44);
				match(STR);
				setState(45);
				match(EOL);
				setState(46);
				start();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(BasicParser.VAR, 0); }
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(VAR);
			setState(50);
			var2();
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

	public static class Var2Context extends ParserRuleContext {
		public Var2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var2; }
	 
		public Var2Context() { }
		public void copyFrom(Var2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StartLContext extends Var2Context {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public StartLContext(Var2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStartL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarNameFirstContext extends Var2Context {
		public TerminalNode VARNAME() { return getToken(BasicParser.VARNAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOL() { return getToken(BasicParser.EOL, 0); }
		public Var2Context var2() {
			return getRuleContext(Var2Context.class,0);
		}
		public List<VarnContext> varn() {
			return getRuleContexts(VarnContext.class);
		}
		public VarnContext varn(int i) {
			return getRuleContext(VarnContext.class,i);
		}
		public VarNameFirstContext(Var2Context ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitVarNameFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var2Context var2() throws RecognitionException {
		Var2Context _localctx = new Var2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_var2);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				_localctx = new VarNameFirstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(VARNAME);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(53);
					varn();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(T__0);
				setState(60);
				type();
				setState(61);
				match(EOL);
				setState(62);
				var2();
				}
				break;
			case BEGIN:
				_localctx = new StartLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				start();
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

	public static class VarnContext extends ParserRuleContext {
		public VarnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varn; }
	 
		public VarnContext() { }
		public void copyFrom(VarnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarNameContext extends VarnContext {
		public TerminalNode VARNAME() { return getToken(BasicParser.VARNAME, 0); }
		public VarNameContext(VarnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnContext varn() throws RecognitionException {
		VarnContext _localctx = new VarnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varn);
		try {
			_localctx = new VarNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__1);
			setState(68);
			match(VARNAME);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(BasicParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(BasicParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(BasicParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(BasicParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class ProcedureContext extends ParserRuleContext {
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(BasicParser.BEGIN, 0); }
		public TerminalNode ENDP() { return getToken(BasicParser.ENDP, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(BEGIN);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				stmt();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WRITE) | (1L << READLN) | (1L << OPEN) | (1L << NUM) | (1L << VARNAME))) != 0) );
			setState(80);
			match(ENDP);
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
		public TerminalNode EOL() { return getToken(BasicParser.EOL, 0); }
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
		public TerminalNode EOL() { return getToken(BasicParser.EOL, 0); }
		public StmtAttrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStmtAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtCondContext extends StmtContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public StmtCondContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStmtCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPrintContext extends StmtContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public TerminalNode EOL() { return getToken(BasicParser.EOL, 0); }
		public StmtPrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStmtPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtReadContext extends StmtContext {
		public ReadlnContext readln() {
			return getRuleContext(ReadlnContext.class,0);
		}
		public TerminalNode EOL() { return getToken(BasicParser.EOL, 0); }
		public StmtReadContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitStmtRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StmtPrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				write();
				setState(83);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new StmtReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				readln();
				setState(86);
				match(EOL);
				}
				break;
			case 3:
				_localctx = new StmtAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				attr();
				setState(89);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new StmtExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				expr();
				setState(92);
				match(EOL);
				}
				break;
			case 5:
				_localctx = new StmtCondContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				cond();
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends CondContext {
		public BlockContext b1;
		public TerminalNode IF() { return getToken(BasicParser.IF, 0); }
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BasicParser.THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends CondContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(BasicParser.IF, 0); }
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BasicParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(BasicParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfElseStmtContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(IF);
				setState(98);
				match(OPEN);
				setState(99);
				condExpr();
				setState(100);
				match(CLOSE);
				setState(101);
				match(THEN);
				setState(102);
				((IfStmtContext)_localctx).b1 = block();
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(IF);
				setState(105);
				match(OPEN);
				setState(106);
				condExpr();
				setState(107);
				match(CLOSE);
				setState(108);
				match(THEN);
				setState(109);
				((IfElseStmtContext)_localctx).b1 = block();
				setState(110);
				match(ELSE);
				setState(111);
				((IfElseStmtContext)_localctx).b2 = block();
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

	public static class CondExprContext extends ParserRuleContext {
		public CondExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpr; }
	 
		public CondExprContext() { }
		public void copyFrom(CondExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondRelOpContext extends CondExprContext {
		public Token relop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondRelOpContext(CondExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitCondRelOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondExpresionContext extends CondExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExpresionContext(CondExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitCondExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condExpr);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new CondExpresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				expr();
				}
				break;
			case 2:
				_localctx = new CondRelOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				expr();
				setState(117);
				((CondRelOpContext)_localctx).relop = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << GE) | (1L << LE) | (1L << NE))) != 0)) ) {
					((CondRelOpContext)_localctx).relop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockStmtContext extends BlockContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public BlockStmtContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		try {
			_localctx = new BlockStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(OPEN_BL);
			setState(123);
			program();
			setState(124);
			match(CLOSE_BL);
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

	public static class WriteContext extends ParserRuleContext {
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	 
		public WriteContext() { }
		public void copyFrom(WriteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStrContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(BasicParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(BasicParser.STR, 0); }
		public PrintStrContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitPrintStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(BasicParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_write);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(WRITE);
				setState(127);
				match(STR);
				}
				break;
			case 2:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(WRITE);
				setState(129);
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

	public static class ReadlnContext extends ParserRuleContext {
		public ReadlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readln; }
	 
		public ReadlnContext() { }
		public void copyFrom(ReadlnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadVarContext extends ReadlnContext {
		public TerminalNode READLN() { return getToken(BasicParser.READLN, 0); }
		public TerminalNode VARNAME() { return getToken(BasicParser.VARNAME, 0); }
		public ReadVarContext(ReadlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BasicVisitor ) return ((BasicVisitor<? extends T>)visitor).visitReadVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadlnContext readln() throws RecognitionException {
		ReadlnContext _localctx = new ReadlnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_readln);
		try {
			_localctx = new ReadVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(READLN);
			setState(133);
			match(VARNAME);
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
		public TerminalNode VARNAME() { return getToken(BasicParser.VARNAME, 0); }
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
		enterRule(_localctx, 26, RULE_attr);
		try {
			_localctx = new AttrExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(VARNAME);
			setState(136);
			match(IS);
			setState(137);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
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
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				expr1();
				setState(140);
				match(PLUS);
				setState(141);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				expr1();
				setState(144);
				match(MINUS);
				setState(145);
				expr();
				}
				break;
			case 3:
				_localctx = new Expr1EmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
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
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
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
		enterRule(_localctx, 30, RULE_expr1);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Expr1MultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				expr2();
				setState(151);
				match(MULT);
				setState(152);
				expr();
				}
				break;
			case 2:
				_localctx = new Expr1DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				expr2();
				setState(155);
				match(DIV);
				setState(156);
				expr();
				}
				break;
			case 3:
				_localctx = new Expr2EmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
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
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr2VarContext extends Expr2Context {
		public TerminalNode VARNAME() { return getToken(BasicParser.VARNAME, 0); }
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
		enterRule(_localctx, 32, RULE_expr2);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				_localctx = new Expr2ParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(OPEN);
				setState(162);
				expr();
				setState(163);
				match(CLOSE);
				}
				break;
			case NUM:
				_localctx = new Expr2NumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(NUM);
				}
				break;
			case VARNAME:
				_localctx = new Expr2VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(VARNAME);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\5\2)\n\2\3\2\5\2,\n\2\3\2\3\2\3\2\3\2\5\2\62\n\2\3\3"+
		"\3\3\3\3\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D"+
		"\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\6\bO\n\b\r\b\16\bP\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nt\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0085"+
		"\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0097\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00a2\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00aa\n\22\3"+
		"\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\3\2\16\21\3\2"+
		"\27\34\u00ad\2\61\3\2\2\2\4\63\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2\nH\3\2\2"+
		"\2\fJ\3\2\2\2\16L\3\2\2\2\20a\3\2\2\2\22s\3\2\2\2\24z\3\2\2\2\26|\3\2"+
		"\2\2\30\u0084\3\2\2\2\32\u0086\3\2\2\2\34\u0089\3\2\2\2\36\u0096\3\2\2"+
		"\2 \u00a1\3\2\2\2\"\u00a9\3\2\2\2$%\7\26\2\2%&\7)\2\2&(\7&\2\2\')\5\4"+
		"\3\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5\f\7\2+*\3\2\2\2+,\3\2\2\2,\62"+
		"\3\2\2\2-.\7\26\2\2./\7)\2\2/\60\7&\2\2\60\62\5\16\b\2\61$\3\2\2\2\61"+
		"-\3\2\2\2\62\3\3\2\2\2\63\64\7\25\2\2\64\65\5\6\4\2\65\5\3\2\2\2\66:\7"+
		"(\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2"+
		"<:\3\2\2\2=>\7\3\2\2>?\5\n\6\2?@\7&\2\2@A\5\6\4\2AD\3\2\2\2BD\5\16\b\2"+
		"C\66\3\2\2\2CB\3\2\2\2D\7\3\2\2\2EF\7\4\2\2FG\7(\2\2G\t\3\2\2\2HI\t\2"+
		"\2\2I\13\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LN\7\6\2\2MO\5\20\t\2NM\3\2\2\2O"+
		"P\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\b\2\2S\17\3\2\2\2TU\5\30\r"+
		"\2UV\7&\2\2Vb\3\2\2\2WX\5\32\16\2XY\7&\2\2Yb\3\2\2\2Z[\5\34\17\2[\\\7"+
		"&\2\2\\b\3\2\2\2]^\5\36\20\2^_\7&\2\2_b\3\2\2\2`b\5\22\n\2aT\3\2\2\2a"+
		"W\3\2\2\2aZ\3\2\2\2a]\3\2\2\2a`\3\2\2\2b\21\3\2\2\2cd\7\5\2\2de\7!\2\2"+
		"ef\5\24\13\2fg\7\"\2\2gh\7\n\2\2hi\5\26\f\2it\3\2\2\2jk\7\5\2\2kl\7!\2"+
		"\2lm\5\24\13\2mn\7\"\2\2no\7\n\2\2op\5\26\f\2pq\7\t\2\2qr\5\26\f\2rt\3"+
		"\2\2\2sc\3\2\2\2sj\3\2\2\2t\23\3\2\2\2u{\5\36\20\2vw\5\36\20\2wx\t\3\2"+
		"\2xy\5\36\20\2y{\3\2\2\2zu\3\2\2\2zv\3\2\2\2{\25\3\2\2\2|}\7#\2\2}~\5"+
		"\2\2\2~\177\7$\2\2\177\27\3\2\2\2\u0080\u0081\7\13\2\2\u0081\u0085\7)"+
		"\2\2\u0082\u0083\7\13\2\2\u0083\u0085\5\36\20\2\u0084\u0080\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\31\3\2\2\2\u0086\u0087\7\r\2\2\u0087\u0088\7(\2\2"+
		"\u0088\33\3\2\2\2\u0089\u008a\7(\2\2\u008a\u008b\7%\2\2\u008b\u008c\5"+
		"\36\20\2\u008c\35\3\2\2\2\u008d\u008e\5 \21\2\u008e\u008f\7\35\2\2\u008f"+
		"\u0090\5\36\20\2\u0090\u0097\3\2\2\2\u0091\u0092\5 \21\2\u0092\u0093\7"+
		"\36\2\2\u0093\u0094\5\36\20\2\u0094\u0097\3\2\2\2\u0095\u0097\5 \21\2"+
		"\u0096\u008d\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097\37"+
		"\3\2\2\2\u0098\u0099\5\"\22\2\u0099\u009a\7\37\2\2\u009a\u009b\5\36\20"+
		"\2\u009b\u00a2\3\2\2\2\u009c\u009d\5\"\22\2\u009d\u009e\7 \2\2\u009e\u009f"+
		"\5\36\20\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\5\"\22\2\u00a1\u0098\3\2\2"+
		"\2\u00a1\u009c\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2!\3\2\2\2\u00a3\u00a4"+
		"\7!\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\7\"\2\2\u00a6\u00aa\3\2\2\2"+
		"\u00a7\u00aa\7\'\2\2\u00a8\u00aa\7(\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa#\3\2\2\2\17(+\61:CPasz\u0084\u0096"+
		"\u00a1\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}