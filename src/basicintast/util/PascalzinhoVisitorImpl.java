/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast.util;

import basicintast.parser.PascalzinhoBaseVisitor;
import basicintast.parser.PascalzinhoLexer;
import basicintast.parser.PascalzinhoParser;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class PascalzinhoVisitorImpl extends PascalzinhoBaseVisitor<Object> {

    @Override
    public Object visitIfStmt(PascalzinhoParser.IfStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        if (visit) {
            return visit(ctx.b1);
        }
        return null;
    }

    @Override
    public Object visitIfElseStmt(PascalzinhoParser.IfElseStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        if (visit) {
            return visit(ctx.b1);
        } else {
            return visit(ctx.b2);
        }
    }

    @Override
    public Object visitBlockStmt(PascalzinhoParser.BlockStmtContext ctx) {
        return super.visitBlockStmt(ctx);
    }

    @Override
    public Object visitCondRelOp(PascalzinhoParser.CondRelOpContext ctx) {
        Double a = Double.parseDouble((String) visit(ctx.expr(0)));
        Double b = Double.parseDouble((String) visit(ctx.expr(1)));
        int op = ctx.relop.getType();

        switch (op) {
            case PascalzinhoLexer.EQ:
                return Objects.equals(a, b);
            case PascalzinhoLexer.NE:
                return a != b;
            case PascalzinhoLexer.LT:
                return a < b;
            case PascalzinhoLexer.GT:
                return a > b;
            case PascalzinhoLexer.LE:
                return a <= b;
            case PascalzinhoLexer.GE:
                return a >= b;
        }
        return null;
    }

    @Override
    public Object visitCondExpresion(PascalzinhoParser.CondExpresionContext ctx) {
        Double d = Double.parseDouble((String) visit(ctx.expr()));
        return d > 0;
    }

    @Override
    public Object visitPrintStr(PascalzinhoParser.PrintStrContext ctx) {
        String val = ctx.STR().getText();
        char c = '\0';
        val = val.replace('"', c);
        System.out.print(val);
        return 0d;
    }

    @Override
    public Object visitPrintExpr(PascalzinhoParser.PrintExprContext ctx) {
        Object o = visit(ctx.expr());
        System.out.print(o);
        return o;
    }

    @Override
    public Object visitPrintStrLn(PascalzinhoParser.PrintStrLnContext ctx) {
        String val = ctx.STR().getText();
        char c = '\0';
        val = val.replace('"', c);
        System.out.println(val);
        return 0d;
    }

    @Override
    public Object visitPrintExprLn(PascalzinhoParser.PrintExprLnContext ctx) {
        Object o = visit(ctx.expr());
        System.out.println(o);
        return o;
    }

    @Override
    public Object visitReadVar(PascalzinhoParser.ReadVarContext ctx) {

        if ((SymbolsTable.getInstance().getSymbol(ctx.VARNAME().getText())) != null) {
            Scanner s = new Scanner(System.in);
            Object value;
            String type = SymbolsTable.getInstance().getType(ctx.VARNAME().getText());
            switch (type) {
                case "integer":
                    value = s.next();
                    try {
                        Integer.parseInt((String) value);
                        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
                    } catch (Exception a) {
                        System.out.println("Tipo incompatível!");
                        break;
                    }
                    break;
                case "float":
                    value = s.next();
                    try {
                        Double.parseDouble((String) value);
                        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
                    } catch (Exception a) {
                        System.out.println("Tipo incompatível!");
                        break;
                    }
                    break;
                default:
                    value = s.next();
                    break;
            }

            /////////////////
            //System.out.println("valor: " + value + "tipo: " + type);
            /////////////////
            //SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
            return value;
        }
        System.out.println("Variável não declarada!");

        return null;
    }

    @Override
    public Object visitAttrExpr(PascalzinhoParser.AttrExprContext ctx) {
        if ((SymbolsTable.getInstance().getSymbol(ctx.VARNAME().getText())) != null) {
            Object value = (Object) visit(ctx.expr());
            String type = SymbolsTable.getInstance().getType(ctx.VARNAME().getText());
            switch (type) {
                case "integer":
                    try {
                        String v = value.toString();
                        Double d = Double.parseDouble(v);
                        Long i = d.longValue();
                        Integer out = Integer.parseInt(i.toString());
                        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
                    } catch (Exception a) {

                        System.out.println(a);
                        System.out.println("Tipo incompatível!");
                        break;
                    }
                    break;
                case "float":
                    try {
                        Double.parseDouble((String) value);
                        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
                    } catch (Exception a) {
                        System.out.println("Tipo incompatível!");
                        break;
                    }
                    break;
                default:
                    SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
                    break;
            }
            // SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
            return value;
        }System.out.println("Variável não declarada!");
        return null;
    }

    @Override
    public Object visitAttrBool(PascalzinhoParser.AttrBoolContext ctx) {
        String type = SymbolsTable.getInstance().getType(ctx.VARNAME().getText());
        Object value = ctx.getChild(2).getText();
        if (value.equals("true")) {
            SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, "1.0");
        } else {
            SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, "0.0");
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitAttrString(PascalzinhoParser.AttrStringContext ctx) {
        Object value = ctx.STR().getText();
        String type = SymbolsTable.getInstance().getType(ctx.VARNAME().getText());
        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
        return value;
    }

    @Override
    public Object visitExprPlus(PascalzinhoParser.ExprPlusContext ctx) {
        try {
            Double a = Double.parseDouble((String) visit(ctx.expr1()));
            Double b = Double.parseDouble((String) visit(ctx.expr()));
            Double result = a + b;
            return result.toString();
        } catch (Exception a) {
            System.out.println(a);
            System.out.println("Impossível calcular!");
        }
        return null;

    }

    @Override
    public Object visitExprMinus(PascalzinhoParser.ExprMinusContext ctx) {
        try {
            Double a = Double.parseDouble((String) visit(ctx.expr1()));
            Double b = Double.parseDouble((String) visit(ctx.expr()));
            Double result = a - b;
            return result.toString();

        } catch (Exception a) {
            System.out.println("Impossível calcular!");
        }
        return null;

    }

    @Override
    public Object visitExpr1Empty(PascalzinhoParser.Expr1EmptyContext ctx) {
        return visit(ctx.expr1());
    }

    @Override
    public Object visitExpr1Mult(PascalzinhoParser.Expr1MultContext ctx) {
        try {
            Object a = visit(ctx.expr2());
            Object b = visit(ctx.expr());
            Double aa = Double.parseDouble((String) a);
            Double bb = Double.parseDouble((String) b);
            Double result = aa * bb;
            return result.toString();
        } catch (Exception a) {
            System.out.println(a);
            System.out.println("Impossível calcular!");
        }
        return null;

    }

    @Override
    public Object visitExpr1Div(PascalzinhoParser.Expr1DivContext ctx) {
        try {
            Object a = visit(ctx.expr2());
            Object b = visit(ctx.expr());
            Double aa = Double.parseDouble((String) a);
            Double bb = Double.parseDouble((String) b);
            Double result = aa / bb;
            return result.toString();
        } catch (Exception a) {
            System.out.println("Impossível calcular!");
        }
        return null;

    }

    @Override
    public Object visitExpr2Empty(PascalzinhoParser.Expr2EmptyContext ctx) {
        return visit(ctx.expr2());
    }

    @Override
    public Object visitExpr2Par(PascalzinhoParser.Expr2ParContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitExpr2Num(PascalzinhoParser.Expr2NumContext ctx) {
        return ctx.NUM().getText();
    }

    @Override
    public Object visitExpr2Var(PascalzinhoParser.Expr2VarContext ctx) {
        return SymbolsTable.getInstance().getValue(ctx.VARNAME().getText());
    }

    @Override
    public Object visitVarNameFirst(PascalzinhoParser.VarNameFirstContext ctx) {
        String type = ctx.type().getText();
        //System.out.println("tipo: " + type);
        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, null);

        return visitChildren(ctx);
    }

    @Override
    public Object visitVarName(PascalzinhoParser.VarNameContext ctx) {
        String type = ctx.parent.getChild(3).getText();
        boolean teste = true;
        int i = 1;
        while (teste) {
            switch (type) {
                case "integer":
                    teste = false;
                    break;
                case "float":
                    teste = false;
                    break;
                case "boolean":
                    teste = false;
                    break;
                case "string":
                    teste = false;
                    break;
                default:
                    type = ctx.parent.getChild(3 + i).getText();
                    i++;
                    break;
            }
        }
        //System.out.println("tipo: " + type);
        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, null);

        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileStmt(PascalzinhoParser.WhileStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        while (visit) {
            visit(ctx.b1);
            visit = (Boolean) visit(ctx.condExpr());

        }
        return null;

    }

    @Override
    public Object visitForStmt(PascalzinhoParser.ForStmtContext ctx) {
        String varname = ctx.attr().getChild(0).getText();
        String type = SymbolsTable.getInstance().getType(varname);
        visit(ctx.attr());
        int n = Integer.parseInt((String) SymbolsTable.getInstance().getValue(varname));
        int max = Integer.parseInt((String) ctx.n.getText());
        //System.out.println("N: "+n+" Max:"+max);
        for (int i = n; n < max; n++) {
            visit(ctx.b1);
            SymbolsTable.getInstance().addSymbol(varname, type, n);
        }
        return null;
    }    
    @Override
    public Object visitForStmt2(PascalzinhoParser.ForStmt2Context ctx) {
        int n = Integer.parseInt((String) ctx.n.getText());
        int max = Integer.parseInt((String) ctx.m.getText());
        //System.out.println("N: "+n+" Max:"+max);
        for (int i = n; n < max; n++) {
            visit(ctx.b1);
        }
        return null;
    }

}
