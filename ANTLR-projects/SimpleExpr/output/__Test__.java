import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ExprLexer lex = new ExprLexer(new ANTLRFileStream("/Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        ExprParser parser = new ExprParser(tokens);
        ExprParser.prog_return r = parser.prog();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        Eval walker = new Eval(nodes);
        try {
            walker.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}