// $ANTLR 3.4 /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g 2012-04-07 17:44:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class Expr1Parser extends DebugParser {
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
    "invalidRule", "prog", "expr", "multExpr", "atom", "stat"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public Expr1Parser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public Expr1Parser(TokenStream input, int port, RecognizerSharedState state) {
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

public Expr1Parser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return Expr1Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g"; }



    // $ANTLR start "prog"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:3:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:3:6: ( ( stat )+ )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:3:8: ( stat )+
            {
            dbg.location(3,8);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:3:8: ( stat )+
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

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:3:8: stat
            	    {
            	    dbg.location(3,8);
            	    pushFollow(FOLLOW_stat_in_prog10);
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
        dbg.location(3, 13);

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
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:5:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(5, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:5:6: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
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

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:5:8: expr NEWLINE
                    {
                    dbg.location(5,8);
                    pushFollow(FOLLOW_expr_in_stat20);
                    expr();

                    state._fsp--;

                    dbg.location(5,13);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat22); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:6:4: ID '=' expr NEWLINE
                    {
                    dbg.location(6,4);
                    match(input,ID,FOLLOW_ID_in_stat27); 
                    dbg.location(6,7);
                    match(input,13,FOLLOW_13_in_stat29); 
                    dbg.location(6,11);
                    pushFollow(FOLLOW_expr_in_stat31);
                    expr();

                    state._fsp--;

                    dbg.location(6,16);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat33); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:7:4: NEWLINE
                    {
                    dbg.location(7,4);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat38); 

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
        dbg.location(8, 1);

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
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:10:1: expr : multExpr ( '+' multExpr | '-' multExpr )* ;
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:10:6: ( multExpr ( '+' multExpr | '-' multExpr )* )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:10:8: multExpr ( '+' multExpr | '-' multExpr )*
            {
            dbg.location(10,8);
            pushFollow(FOLLOW_multExpr_in_expr49);
            multExpr();

            state._fsp--;

            dbg.location(10,17);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:10:17: ( '+' multExpr | '-' multExpr )*
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

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:10:18: '+' multExpr
            	    {
            	    dbg.location(10,18);
            	    match(input,11,FOLLOW_11_in_expr52); 
            	    dbg.location(10,22);
            	    pushFollow(FOLLOW_multExpr_in_expr54);
            	    multExpr();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:10:33: '-' multExpr
            	    {
            	    dbg.location(10,33);
            	    match(input,12,FOLLOW_12_in_expr58); 
            	    dbg.location(10,37);
            	    pushFollow(FOLLOW_multExpr_in_expr60);
            	    multExpr();

            	    state._fsp--;


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
        dbg.location(11, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:13:1: multExpr : atom ( '*' atom )* ;
    public final void multExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:13:9: ( atom ( '*' atom )* )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:13:11: atom ( '*' atom )*
            {
            dbg.location(13,11);
            pushFollow(FOLLOW_atom_in_multExpr72);
            atom();

            state._fsp--;

            dbg.location(13,16);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:13:16: ( '*' atom )*
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

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:13:17: '*' atom
            	    {
            	    dbg.location(13,17);
            	    match(input,10,FOLLOW_10_in_multExpr75); 
            	    dbg.location(13,21);
            	    pushFollow(FOLLOW_atom_in_multExpr77);
            	    atom();

            	    state._fsp--;


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
        dbg.location(14, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "atom"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:16:1: atom : ( INT | ID | '(' expr ')' );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:16:6: ( INT | ID | '(' expr ')' )
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

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:16:8: INT
                    {
                    dbg.location(16,8);
                    match(input,INT,FOLLOW_INT_in_atom90); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:17:4: ID
                    {
                    dbg.location(17,4);
                    match(input,ID,FOLLOW_ID_in_atom95); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr1.g:18:4: '(' expr ')'
                    {
                    dbg.location(18,4);
                    match(input,8,FOLLOW_8_in_atom100); 
                    dbg.location(18,8);
                    pushFollow(FOLLOW_expr_in_atom102);
                    expr();

                    state._fsp--;

                    dbg.location(18,13);
                    match(input,9,FOLLOW_9_in_atom104); 

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
        dbg.location(19, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog10 = new BitSet(new long[]{0x0000000000000172L});
    public static final BitSet FOLLOW_expr_in_stat20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat22 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat27 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stat29 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_stat31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat33 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr49 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_expr52 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr54 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_12_in_expr58 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr60 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_atom_in_multExpr72 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_multExpr75 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_atom_in_multExpr77 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INT_in_atom90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom100 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_atom102 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom104 = new BitSet(new long[]{0x0000000000000002L});

}