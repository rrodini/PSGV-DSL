grammar Expr2;

@header {
package test;
import java.util.HashMap;
}

@lexer::header {package test;}

@members {
/** Map variable name to its integer value */
HashMap memory = new HashMap();  
}


prog	:	stat+ ;

stat	:	expr NEWLINE {System.out.println($expr.value); }
	|	ID '=' expr NEWLINE {memory.put($ID.text, new Integer($expr.value));}
	|	NEWLINE
	;
	
expr returns [int value]
	:	e = multExpr { $value = $e.value; } 
		('+' e = multExpr { $value += $e.value; } 
		|'-' e = multExpr  { $value -= $e.value; }
		)*
	;
	
multExpr returns [int value]
	:	e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;})*
	;
	
atom returns [int value]
	:	INT {$value = Integer.parseInt($INT.text);}
	|	ID // variable reference
		{
		// look up value of variable
		Integer v = (Integer) memory.get($ID.text);
		// if found set the return value else error
		if (v != null) $value = v.intValue();
		else System.err.println("undefined variable " + $ID.text);
		}
		// value of parenthesized expression is its value'
	|	'(' e=expr ')' {$value = $e.value; }
	;
	
ID	:	('a'..'z'| 'A'..'Z')+ ;
INT	:	'0'..'9'+;
NEWLINE	:	'\r'? '\n' ;
WS	:	(' ' | '\t')+ {skip();} ;
	


