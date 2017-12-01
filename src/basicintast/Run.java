package basicintast;

import basicintast.parser.Escrever;
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
        String fn = "";
        if (args.length > 0) {
            fn = args[0];
            ANTLRInputStream input = new ANTLRFileStream(fn);
            PascalzinhoLexer lexer = new PascalzinhoLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PascalzinhoParser parser = new PascalzinhoParser(tokens);

            ParseTree tree = parser.program();

            if (args.length == 3 && (args[1].equals("-o") || args[1].equals("--out"))) {
                Escrever.set(args[2]);
                Escrever.gravar();
                System.exit(0);
            } else if (args.length == 5 && args[1].equals("-o") && args[3].equals("bin")) {
                Escrever.set(args[2]);
                Escrever.gravar();
                System.out.println("Compilando!");
                Process p = Runtime.getRuntime().exec("g++ " + args[2] + " -o " + args[4]);
                System.exit(0);
            } else {
                PascalzinhoVisitor eval = new PascalzinhoVisitorImpl();

                eval.visit(tree);
            }

        } else {
            System.out.println("Usage: java -jar Pascalzinho.jar file.pas\n       java -jar Pascalzinho.jar file.pas -o out.cpp\n       java -jar Pascalzinho.jar file.pas -o out.cpp bin out.exe");
            //System.exit(0);
        }

    }

}
