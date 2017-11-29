/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicintast.util;

import basicintast.parser.BasicBaseVisitor;
import basicintast.parser.BasicLexer;
import basicintast.parser.BasicParser;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class BasicVisitorImpl extends BasicBaseVisitor<Object> {

    @Override
    public Object visitIfStmt(BasicParser.IfStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        if (visit) {
            return visit(ctx.b1);
        }
        return null;
    }

    @Override
    public Object visitIfElseStmt(BasicParser.IfElseStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.condExpr());
        if (visit) {
            return visit(ctx.b1);
        } else {
            return visit(ctx.b2);
        }
    }

    @Override
    public Object visitBlockStmt(BasicParser.BlockStmtContext ctx) {
        return super.visitBlockStmt(ctx);
    }

    @Override
    public Object visitCondRelOp(BasicParser.CondRelOpContext ctx) {
        Double a = Double.parseDouble((String) visit(ctx.expr(0)));
        Double b = Double.parseDouble((String) visit(ctx.expr(1)));
        int op = ctx.relop.getType();

        switch (op) {
            case BasicLexer.EQ:
                return Objects.equals(a, b);
            case BasicLexer.NE:
                return a != b;
            case BasicLexer.LT:
                return a < b;
            case BasicLexer.GT:
                return a > b;
            case BasicLexer.LE:
                return a <= b;
            case BasicLexer.GE:
                return a >= b;
        }
        return null;
    }

    @Override
    public Object visitCondExpresion(BasicParser.CondExpresionContext ctx) {
        Double d = Double.parseDouble((String) visit(ctx.expr()));
        return d > 0;
    }

    @Override
    public Object visitPrintStr(BasicParser.PrintStrContext ctx) {
        String val = ctx.STR().getText();
        char c = '\0';
        val = val.replace('"', c);
        System.out.println(val);
        return 0d;
    }

    @Override
    public Object visitPrintExpr(BasicParser.PrintExprContext ctx) {
        Object o = visit(ctx.expr());
        System.out.println(o);
        return o;
    }

    @Override
    public Object visitReadVar(BasicParser.ReadVarContext ctx) {

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
            System.out.println("valor: " + value + "tipo: " + type);
            /////////////////
            //SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
            return value;
        }
        System.out.println("Variável não declarada!");

        return null;
    }

    @Override
    public Object visitAttrExpr(BasicParser.AttrExprContext ctx) {
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
    }

    @Override
    public Object visitAttrBool(BasicParser.AttrBoolContext ctx) {
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
    public Object visitAttrString(BasicParser.AttrStringContext ctx) {
        Object value = ctx.STR().getText();
        String type = SymbolsTable.getInstance().getType(ctx.VARNAME().getText());
        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, value);
        return value;
    }

    @Override
    public Object visitExprPlus(BasicParser.ExprPlusContext ctx) {
        try {
            Double a = Double.parseDouble((String) visit(ctx.expr1()));
            Double b = Double.parseDouble((String) visit(ctx.expr()));
            Double result = a + b;
            return result.toString();
        } catch (Exception a) {
            System.out.println(a + "PRIMEIRO");
            System.out.println("Impossível calcular!");
        }
        return null;

    }

    @Override
    public Object visitExprMinus(BasicParser.ExprMinusContext ctx) {
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
    public Object visitExpr1Empty(BasicParser.Expr1EmptyContext ctx) {
        return visit(ctx.expr1());
    }

    @Override
    public Object visitExpr1Mult(BasicParser.Expr1MultContext ctx) {
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
    public Object visitExpr1Div(BasicParser.Expr1DivContext ctx) {
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
    public Object visitExpr2Empty(BasicParser.Expr2EmptyContext ctx) {
        return visit(ctx.expr2());
    }

    @Override
    public Object visitExpr2Par(BasicParser.Expr2ParContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitExpr2Num(BasicParser.Expr2NumContext ctx) {
        return ctx.NUM().getText();
    }

    @Override
    public Object visitExpr2Var(BasicParser.Expr2VarContext ctx) {
        return SymbolsTable.getInstance().getValue(ctx.VARNAME().getText());
    }

    @Override
    public Object visitVarNameFirst(BasicParser.VarNameFirstContext ctx) {
        String type = ctx.type().getText();
        System.out.println("tipo: " + type);
        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, null);

        return visitChildren(ctx);
    }

    @Override
    public Object visitVarName(BasicParser.VarNameContext ctx) {
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
        System.out.println("tipo: " + type);
        SymbolsTable.getInstance().addSymbol(ctx.VARNAME().getText(), type, null);

        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileStmt(BasicParser.WhileStmtContext ctx) {
        Boolean visit = true;
        while (visit) {
            visit(ctx.b1);
            visit = (Boolean) visit(ctx.condExpr());

        }
        return null;

    }

}
