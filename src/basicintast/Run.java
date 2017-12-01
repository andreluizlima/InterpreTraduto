package basicintast;

import basicintast.parser.PascalzinhoLexer;
import basicintast.parser.PascalzinhoParser;
import basicintast.parser.PascalzinhoVisitor;
import basicintast.util.PascalzinhoVisitorImpl;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Run {

    public static void main(String[] args) throws IOException {
        System.out.println(args[0]);
        ANTLRInputStream input = new ANTLRFileStream("input.basic");
        PascalzinhoLexer lexer = new PascalzinhoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PascalzinhoParser parser = new PascalzinhoParser(tokens);

        ParseTree tree = parser.program();

        PascalzinhoVisitor eval = new PascalzinhoVisitorImpl();
        eval.visit(tree);             
    }

}