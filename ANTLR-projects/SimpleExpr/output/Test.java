import org.antlr.runtime.*;

public class Test {

  public static void main(String [] args) {
    try {
      ANTLRInputStream input = new ANTLRInputStream(System.in);
      ExprLexer lexer = new ExprLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      ExprParser parser = new ExprParser(tokens);
      parser.prog();
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }

}