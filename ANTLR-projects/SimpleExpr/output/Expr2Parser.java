// $ANTLR 3.4 /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g 2012-04-14 14:00:21

package test;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class Expr2Parser extends DebugParser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "expr", "multExpr", "prog", "atom", "stat"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public Expr2Parser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public Expr2Parser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public Expr2Parser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return Expr2Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g"; }


    /** Map variable name to its integer value */
    HashMap memory = new HashMap();  



    // $ANTLR start "prog"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:16:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:16:6: ( ( stat )+ )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:16:8: ( stat )+
            {
            dbg.location(16,8);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:16:8: ( stat )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==8) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:16:8: stat
            	    {
            	    dbg.location(16,8);
            	    pushFollow(FOLLOW_stat_in_prog32);
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
        dbg.location(16, 13);

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
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:18:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        Token ID2=null;
        int expr1 =0;

        int expr3 =0;


        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:18:6: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
            int alt2=3;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            switch ( input.LA(1) ) {
            case INT:
            case 8:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==13) ) {
                    alt2=2;
                }
                else if ( (LA2_2==NEWLINE||(LA2_2 >= 10 && LA2_2 <= 12)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case NEWLINE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:18:8: expr NEWLINE
                    {
                    dbg.location(18,8);
                    pushFollow(FOLLOW_expr_in_stat42);
                    expr1=expr();

                    state._fsp--;

                    dbg.location(18,13);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat44); 
                    dbg.location(18,21);
                    System.out.println(expr1); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:19:4: ID '=' expr NEWLINE
                    {
                    dbg.location(19,4);
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stat51); 
                    dbg.location(19,7);
                    match(input,13,FOLLOW_13_in_stat53); 
                    dbg.location(19,11);
                    pushFollow(FOLLOW_expr_in_stat55);
                    expr3=expr();

                    state._fsp--;

                    dbg.location(19,16);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat57); 
                    dbg.location(19,24);
                    memory.put((ID2!=null?ID2.getText():null), new Integer(expr3));

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:20:4: NEWLINE
                    {
                    dbg.location(20,4);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat64); 

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
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:23:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
    public final int expr() throws RecognitionException {
        int value = 0;


        int e =0;


        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:24:2: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:24:4: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
            {
            dbg.location(24,6);
            pushFollow(FOLLOW_multExpr_in_expr84);
            e=multExpr();

            state._fsp--;

            dbg.location(24,17);
             value = e; 
            dbg.location(25,3);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:25:3: ( '+' e= multExpr | '-' e= multExpr )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=3;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }
                else if ( (LA3_0==12) ) {
                    alt3=2;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:25:4: '+' e= multExpr
            	    {
            	    dbg.location(25,4);
            	    match(input,11,FOLLOW_11_in_expr92); 
            	    dbg.location(25,10);
            	    pushFollow(FOLLOW_multExpr_in_expr98);
            	    e=multExpr();

            	    state._fsp--;

            	    dbg.location(25,21);
            	     value += e; 

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:26:4: '-' e= multExpr
            	    {
            	    dbg.location(26,4);
            	    match(input,12,FOLLOW_12_in_expr106); 
            	    dbg.location(26,10);
            	    pushFollow(FOLLOW_multExpr_in_expr112);
            	    e=multExpr();

            	    state._fsp--;

            	    dbg.location(26,22);
            	     value -= e; 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(28, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:30:1: multExpr returns [int value] : e= atom ( '*' e= atom )* ;
    public final int multExpr() throws RecognitionException {
        int value = 0;


        int e =0;


        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:31:2: (e= atom ( '*' e= atom )* )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:31:4: e= atom ( '*' e= atom )*
            {
            dbg.location(31,5);
            pushFollow(FOLLOW_atom_in_multExpr138);
            e=atom();

            state._fsp--;

            dbg.location(31,11);
            value = e;
            dbg.location(31,32);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:31:32: ( '*' e= atom )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==10) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:31:33: '*' e= atom
            	    {
            	    dbg.location(31,33);
            	    match(input,10,FOLLOW_10_in_multExpr143); 
            	    dbg.location(31,38);
            	    pushFollow(FOLLOW_atom_in_multExpr147);
            	    e=atom();

            	    state._fsp--;

            	    dbg.location(31,44);
            	    value *= e;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


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
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "atom"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:34:1: atom returns [int value] : ( INT | ID | '(' e= expr ')' );
    public final int atom() throws RecognitionException {
        int value = 0;


        Token INT4=null;
        Token ID5=null;
        int e =0;


        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:35:2: ( INT | ID | '(' e= expr ')' )
            int alt5=3;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            switch ( input.LA(1) ) {
            case INT:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case 8:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:35:4: INT
                    {
                    dbg.location(35,4);
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_atom167); 
                    dbg.location(35,8);
                    value = Integer.parseInt((INT4!=null?INT4.getText():null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:36:4: ID
                    {
                    dbg.location(36,4);
                    ID5=(Token)match(input,ID,FOLLOW_ID_in_atom174); 
                    dbg.location(37,3);

                    		// look up value of variable
                    		Integer v = (Integer) memory.get((ID5!=null?ID5.getText():null));
                    		// if found set the return value else error
                    		if (v != null) value = v.intValue();
                    		else System.err.println("undefined variable " + (ID5!=null?ID5.getText():null));
                    		

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr2.g:45:4: '(' e= expr ')'
                    {
                    dbg.location(45,4);
                    match(input,8,FOLLOW_8_in_atom187); 
                    dbg.location(45,9);
                    pushFollow(FOLLOW_expr_in_atom191);
                    e=expr();

                    state._fsp--;

                    dbg.location(45,15);
                    match(input,9,FOLLOW_9_in_atom193); 
                    dbg.location(45,19);
                    value = e; 

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
        dbg.location(46, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog32 = new BitSet(new long[]{0x0000000000000172L});
    public static final BitSet FOLLOW_expr_in_stat42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat51 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stat53 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_stat55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr84 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_expr92 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr98 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_12_in_expr106 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr112 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_atom_in_multExpr138 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_multExpr143 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_atom_in_multExpr147 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INT_in_atom167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom187 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_atom191 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom193 = new BitSet(new long[]{0x0000000000000002L});

}