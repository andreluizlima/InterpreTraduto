/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicint;

import basicint.parser.BasicLexer;
import basicint.parser.BasicParser;
import basicint.parser.BasicVisitor;
import basicint.util.BasicVisitorImpl;
import basicint.util.SymbolsTable;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author wellington
 */
public class Run {

    /**
     * @param args the command line arguments
     */
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("input.basic");
        BasicLexer lexer = new BasicLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BasicParser parser = new BasicParser(tokens);

        ParseTree tree = parser.program();

        BasicVisitor eval = new BasicVisitorImpl();
        eval.visit(tree);
    
}
}