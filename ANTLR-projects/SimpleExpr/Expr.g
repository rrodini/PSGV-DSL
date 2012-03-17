grammar Expr;

prog	:	stat+ ;

stat	:	expr NEWLINE
	|	ID '=' expr NEWLINE
	|	NEWLINE
	;
	
expr	:	multExpr (('+' | '-') multExpr)*
	;
	
multExpr:	atom ('*' atom)*
	;
	
atom	:	INT
	|	ID
	|	'(' expr ')'
	;
	
ID	:	('a'..'z'| 'A'..'Z')+ ;
INT	:	'0'..'9'+;
NEWLINE	:	'\r'? '\n' ;
WS	:	(' ' | '\t')+ {skip();} ;
	


