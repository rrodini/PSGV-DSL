// $ANTLR 3.4 /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g 2012-04-14 14:12:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class Expr3Parser extends DebugParser {
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
    "invalidRule", "atom", "expr", "stat", "prog", "multExpr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public Expr3Parser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public Expr3Parser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public Expr3Parser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return Expr3Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:9:1: prog : ( stat )+ ;
    public final Expr3Parser.prog_return prog() throws RecognitionException {
        Expr3Parser.prog_return retval = new Expr3Parser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Expr3Parser.stat_return stat1 =null;



        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:9:6: ( ( stat )+ )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:9:8: ( stat )+
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(9,8);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:9:8: ( stat )+
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

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:9:10: stat
            	    {
            	    dbg.location(9,10);
            	    pushFollow(FOLLOW_stat_in_prog37);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());
            	    dbg.location(9,15);
            	    System.out.println(
            	    		  (stat1!=null?((CommonTree)stat1.tree):null)==null?"null":(stat1!=null?((CommonTree)stat1.tree):null).toStringTree());

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

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(11, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:13:1: stat : ( expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE ->);
    public final Expr3Parser.stat_return stat() throws RecognitionException {
        Expr3Parser.stat_return retval = new Expr3Parser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEWLINE3=null;
        Token ID4=null;
        Token char_literal5=null;
        Token NEWLINE7=null;
        Token NEWLINE8=null;
        Expr3Parser.expr_return expr2 =null;

        Expr3Parser.expr_return expr6 =null;


        CommonTree NEWLINE3_tree=null;
        CommonTree ID4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree NEWLINE7_tree=null;
        CommonTree NEWLINE8_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:13:6: ( expr NEWLINE -> expr | ID '=' expr NEWLINE -> ^( '=' ID expr ) | NEWLINE ->)
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

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:13:8: expr NEWLINE
                    {
                    dbg.location(13,8);
                    pushFollow(FOLLOW_expr_in_stat54);
                    expr2=expr();

                    state._fsp--;

                    stream_expr.add(expr2.getTree());
                    dbg.location(13,13);
                    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat56);  
                    stream_NEWLINE.add(NEWLINE3);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 13:21: -> expr
                    {
                        dbg.location(13,24);
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:14:4: ID '=' expr NEWLINE
                    {
                    dbg.location(14,4);
                    ID4=(Token)match(input,ID,FOLLOW_ID_in_stat65);  
                    stream_ID.add(ID4);

                    dbg.location(14,7);
                    char_literal5=(Token)match(input,13,FOLLOW_13_in_stat67);  
                    stream_13.add(char_literal5);

                    dbg.location(14,11);
                    pushFollow(FOLLOW_expr_in_stat69);
                    expr6=expr();

                    state._fsp--;

                    stream_expr.add(expr6.getTree());
                    dbg.location(14,16);
                    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat71);  
                    stream_NEWLINE.add(NEWLINE7);


                    // AST REWRITE
                    // elements: 13, ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 14:24: -> ^( '=' ID expr )
                    {
                        dbg.location(14,27);
                        // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:14:27: ^( '=' ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(14,29);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_13.nextNode()
                        , root_1);

                        dbg.location(14,33);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );
                        dbg.location(14,36);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:15:4: NEWLINE
                    {
                    dbg.location(15,4);
                    NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat86);  
                    stream_NEWLINE.add(NEWLINE8);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 15:12: ->
                    {
                        dbg.location(16,2);
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(16, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stat"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:18:1: expr : multExpr ( '+' ^ multExpr | '-' ^ multExpr )* ;
    public final Expr3Parser.expr_return expr() throws RecognitionException {
        Expr3Parser.expr_return retval = new Expr3Parser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        Expr3Parser.multExpr_return multExpr9 =null;

        Expr3Parser.multExpr_return multExpr11 =null;

        Expr3Parser.multExpr_return multExpr13 =null;


        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:18:6: ( multExpr ( '+' ^ multExpr | '-' ^ multExpr )* )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:18:8: multExpr ( '+' ^ multExpr | '-' ^ multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(18,8);
            pushFollow(FOLLOW_multExpr_in_expr100);
            multExpr9=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr9.getTree());
            dbg.location(18,17);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:18:17: ( '+' ^ multExpr | '-' ^ multExpr )*
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

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:18:18: '+' ^ multExpr
            	    {
            	    dbg.location(18,21);
            	    char_literal10=(Token)match(input,11,FOLLOW_11_in_expr103); 
            	    char_literal10_tree = 
            	    (CommonTree)adaptor.create(char_literal10)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal10_tree, root_0);

            	    dbg.location(18,23);
            	    pushFollow(FOLLOW_multExpr_in_expr106);
            	    multExpr11=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr11.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:18:34: '-' ^ multExpr
            	    {
            	    dbg.location(18,37);
            	    char_literal12=(Token)match(input,12,FOLLOW_12_in_expr110); 
            	    char_literal12_tree = 
            	    (CommonTree)adaptor.create(char_literal12)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal12_tree, root_0);

            	    dbg.location(18,39);
            	    pushFollow(FOLLOW_multExpr_in_expr113);
            	    multExpr13=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(19, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:21:1: multExpr : atom ( '*' ^ atom )* ;
    public final Expr3Parser.multExpr_return multExpr() throws RecognitionException {
        Expr3Parser.multExpr_return retval = new Expr3Parser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal15=null;
        Expr3Parser.atom_return atom14 =null;

        Expr3Parser.atom_return atom16 =null;


        CommonTree char_literal15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:21:9: ( atom ( '*' ^ atom )* )
            dbg.enterAlt(1);

            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:21:11: atom ( '*' ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(21,11);
            pushFollow(FOLLOW_atom_in_multExpr125);
            atom14=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom14.getTree());
            dbg.location(21,16);
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:21:16: ( '*' ^ atom )*
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

            	    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:21:17: '*' ^ atom
            	    {
            	    dbg.location(21,20);
            	    char_literal15=(Token)match(input,10,FOLLOW_10_in_multExpr128); 
            	    char_literal15_tree = 
            	    (CommonTree)adaptor.create(char_literal15)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal15_tree, root_0);

            	    dbg.location(21,22);
            	    pushFollow(FOLLOW_atom_in_multExpr131);
            	    atom16=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom16.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(22, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "multExpr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:24:1: atom : ( INT | ID | '(' ! expr ')' !);
    public final Expr3Parser.atom_return atom() throws RecognitionException {
        Expr3Parser.atom_return retval = new Expr3Parser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT17=null;
        Token ID18=null;
        Token char_literal19=null;
        Token char_literal21=null;
        Expr3Parser.expr_return expr20 =null;


        CommonTree INT17_tree=null;
        CommonTree ID18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal21_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:24:6: ( INT | ID | '(' ! expr ')' !)
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

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:24:8: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(24,8);
                    INT17=(Token)match(input,INT,FOLLOW_INT_in_atom144); 
                    INT17_tree = 
                    (CommonTree)adaptor.create(INT17)
                    ;
                    adaptor.addChild(root_0, INT17_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:25:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(25,4);
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_atom149); 
                    ID18_tree = 
                    (CommonTree)adaptor.create(ID18)
                    ;
                    adaptor.addChild(root_0, ID18_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/Robert/Documents/PSGV-DSL/ANTLR-projects/SimpleExpr/Expr3.g:26:4: '(' ! expr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(26,7);
                    char_literal19=(Token)match(input,8,FOLLOW_8_in_atom154); 
                    dbg.location(26,9);
                    pushFollow(FOLLOW_expr_in_atom157);
                    expr20=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr20.getTree());
                    dbg.location(26,17);
                    char_literal21=(Token)match(input,9,FOLLOW_9_in_atom159); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog37 = new BitSet(new long[]{0x0000000000000172L});
    public static final BitSet FOLLOW_expr_in_stat54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat65 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stat67 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_stat69 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr100 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_expr103 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr106 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_12_in_expr110 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_multExpr_in_expr113 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_atom_in_multExpr125 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_multExpr128 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_atom_in_multExpr131 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INT_in_atom144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_atom154 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_expr_in_atom157 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_atom159 = new BitSet(new long[]{0x0000000000000002L});

}