grammar Expr3;
options {
 	output=AST;
 	// ANTLR can handle any tree node type, but let's use Java
 	ASTLabelType=CommonTree;  // type of $stat.tree ref
}

prog	:	( stat {System.out.println(
		  $stat.tree==null?"null":$stat.tree.toStringTree());} )+ ;

stat	:	expr NEWLINE -> expr
	|	ID '=' expr NEWLINE -> ^('=' ID expr)
	|	NEWLINE -> 
	;
	
expr	:	multExpr ('+'^ multExpr | '-'^ multExpr)*
	;
	
multExpr:	atom ('*'^ atom)*
	;
	
atom	:	INT
	|	ID
	|	'('! expr ')'!
	;
	
ID	:	('a'..'z'| 'A'..'Z')+ ;
INT	:	'0'..'9'+;
NEWLINE	:	'\r'? '\n' ;
WS	:	(' ' | '\t')+ {skip();} ;
	


