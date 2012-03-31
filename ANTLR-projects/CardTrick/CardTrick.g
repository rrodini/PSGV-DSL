grammar CardTrick;

Trick	: Assignment | MethodCall;
Assignment :	Name '=' MethodCall;
MethodCall :	Name '.' MethodName Params;
Params     :	'(' ')' | ParamList;
ParamList  :   Param (',' Param)*;			
MethodName :	'shuffle' | 'print' | 'show' | 'println' 
	        | 'deal' | 'add' | 'addCards' | 'reverse'
	        | 'removeCard'
	   ;
Param	   :	Number | Name | Constant;
Name	   :	('a'..'z' | 'A'..'Z' | '0'..'9')+;
Number	   :	('0'..'9')+ Qualifier?;
Qualifier  :	'.' ('card' | 'cards');
Constant   :	'ADD_TO_TOP' | 'ADD_TO_BOTTOM' | 'TOP_CARD';	

