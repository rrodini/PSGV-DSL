// $ANTLR 3.4 /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g 2012-04-14 14:24:21

 import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class Eval extends DebugTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int ID=4;
    public static final int INT=5;
    public static final int NEWLINE=6;
    public static final int WS=7;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "stat", "prog", "expr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public Eval(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public Eval(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, input.getTreeAdaptor());

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public Eval(TreeNodeStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return Eval.tokenNames; }
    public String getGrammarFileName() { return "/Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g"; }


     /** Map variable name to Integer object holding value */
     HashMap memory = new HashMap();



    // $ANTLR start "prog"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:17:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:17:6: ( ( stat )+ )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:17:8: ( stat )+
            {
            dbg.location(17,8);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:17:8: ( stat )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= 10 && LA1_0 <= 13)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:17:8: stat
            	    {
            	    dbg.location(17,8);
            	    pushFollow(FOLLOW_stat_in_prog45);
            	    stat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "stat"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:19:1: stat : ( expr | ^( '=' ID expr ) );
    public final void stat() throws RecognitionException {
        CommonTree ID2=null;
        int expr1 =0;

        int expr3 =0;


        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:19:6: ( expr | ^( '=' ID expr ) )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= ID && LA2_0 <= INT)||(LA2_0 >= 10 && LA2_0 <= 12)) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:19:8: expr
                    {
                    dbg.location(19,8);
                    pushFollow(FOLLOW_expr_in_stat55);
                    expr1=expr();

                    state._fsp--;

                    dbg.location(19,13);
                    System.out.println(expr1); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:20:4: ^( '=' ID expr )
                    {
                    dbg.location(20,4);
                    dbg.location(20,6);
                    match(input,13,FOLLOW_13_in_stat63); 

                    match(input, Token.DOWN, null); 
                    dbg.location(20,10);
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_stat65); 
                    dbg.location(20,13);
                    pushFollow(FOLLOW_expr_in_stat67);
                    expr3=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    dbg.location(20,19);
                    memory.put((ID2!=null?ID2.getText():null), new Integer(expr3));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stat"



    // $ANTLR start "expr"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:23:1: expr returns [int value] : ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ID | INT );
    public final int expr() throws RecognitionException {
        int value = 0;


        CommonTree ID4=null;
        CommonTree INT5=null;
        int a =0;

        int b =0;


        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:24:2: ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ID | INT )
            int alt3=5;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 10:
                {
                alt3=3;
                }
                break;
            case ID:
                {
                alt3=4;
                }
                break;
            case INT:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:24:4: ^( '+' a= expr b= expr )
                    {
                    dbg.location(24,4);
                    dbg.location(24,6);
                    match(input,11,FOLLOW_11_in_expr86); 

                    match(input, Token.DOWN, null); 
                    dbg.location(24,12);
                    pushFollow(FOLLOW_expr_in_expr92);
                    a=expr();

                    state._fsp--;

                    dbg.location(24,20);
                    pushFollow(FOLLOW_expr_in_expr96);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    dbg.location(24,27);
                    value = a+b;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:25:4: ^( '-' a= expr b= expr )
                    {
                    dbg.location(25,4);
                    dbg.location(25,6);
                    match(input,12,FOLLOW_12_in_expr105); 

                    match(input, Token.DOWN, null); 
                    dbg.location(25,12);
                    pushFollow(FOLLOW_expr_in_expr111);
                    a=expr();

                    state._fsp--;

                    dbg.location(25,20);
                    pushFollow(FOLLOW_expr_in_expr115);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    dbg.location(25,27);
                    value = a-b;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:26:4: ^( '*' a= expr b= expr )
                    {
                    dbg.location(26,4);
                    dbg.location(26,6);
                    match(input,10,FOLLOW_10_in_expr124); 

                    match(input, Token.DOWN, null); 
                    dbg.location(26,12);
                    pushFollow(FOLLOW_expr_in_expr130);
                    a=expr();

                    state._fsp--;

                    dbg.location(26,20);
                    pushFollow(FOLLOW_expr_in_expr134);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    dbg.location(26,27);
                    value = a*b;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:27:4: ID
                    {
                    dbg.location(27,4);
                    ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_expr142); 
                    dbg.location(27,7);
                    Integer v = (Integer) memory.get((ID4!=null?ID4.getText():null));
                    	      if (v!=null) value = v.intValue();
                    	      else System.err.println("undefined variable "+(ID4!=null?ID4.getText():null));
                    	     

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Eval.g:31:4: INT
                    {
                    dbg.location(31,4);
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_expr149); 
                    dbg.location(31,8);
                    value = Integer.parseInt((INT5!=null?INT5.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(32, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog45 = new BitSet(new long[]{0x0000000000003C32L});
    public static final BitSet FOLLOW_expr_in_stat55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_stat63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_stat65 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_expr_in_stat67 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_11_in_expr86 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr92 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_expr_in_expr96 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_12_in_expr105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr111 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_expr_in_expr115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_10_in_expr124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr130 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_expr_in_expr134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expr142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr149 = new BitSet(new long[]{0x0000000000000002L});

}