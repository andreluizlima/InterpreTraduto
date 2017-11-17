// Generated from C:\Users\a120106\Desktop\InterpreTraduto-master\InterPretaTudo\grammar\basicintast\parser\Basic.g4 by ANTLR 4.6

package basicintast.parser;
import basicintast.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programStmtBegin}
	 * labeled alternative in {@link BasicParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStmtBegin(BasicParser.ProgramStmtBeginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code programStmt}
	 * labeled alternative in {@link BasicParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStmt(BasicParser.ProgramStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(BasicParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(BasicParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#varnames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarnames(BasicParser.VarnamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(BasicParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(BasicParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPrint}
	 * labeled alternative in {@link BasicParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrint(BasicParser.StmtPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtRead}
	 * labeled alternative in {@link BasicParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtRead(BasicParser.StmtReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAttr}
	 * labeled alternative in {@link BasicParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAttr(BasicParser.StmtAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExpr}
	 * labeled alternative in {@link BasicParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpr(BasicParser.StmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtCond}
	 * labeled alternative in {@link BasicParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtCond(BasicParser.StmtCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link BasicParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(BasicParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link BasicParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(BasicParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExpresion}
	 * labeled alternative in {@link BasicParser#condExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpresion(BasicParser.CondExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condRelOp}
	 * labeled alternative in {@link BasicParser#condExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondRelOp(BasicParser.CondRelOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link BasicParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(BasicParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStr}
	 * labeled alternative in {@link BasicParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStr(BasicParser.PrintStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link BasicParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(BasicParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readVar}
	 * labeled alternative in {@link BasicParser#readln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadVar(BasicParser.ReadVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrExpr}
	 * labeled alternative in {@link BasicParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrExpr(BasicParser.AttrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link BasicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(BasicParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link BasicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(BasicParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr1Empty}
	 * labeled alternative in {@link BasicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1Empty(BasicParser.Expr1EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr1Mult}
	 * labeled alternative in {@link BasicParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1Mult(BasicParser.Expr1MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr1Div}
	 * labeled alternative in {@link BasicParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1Div(BasicParser.Expr1DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2Empty}
	 * labeled alternative in {@link BasicParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2Empty(BasicParser.Expr2EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2Par}
	 * labeled alternative in {@link BasicParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2Par(BasicParser.Expr2ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2Num}
	 * labeled alternative in {@link BasicParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2Num(BasicParser.Expr2NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2Var}
	 * labeled alternative in {@link BasicParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2Var(BasicParser.Expr2VarContext ctx);
}