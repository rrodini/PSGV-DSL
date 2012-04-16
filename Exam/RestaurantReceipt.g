grammar RestaurantReceipt;

Receipt	: Restaurant FoodItems BeverageItems Taxes Tip Total Salutation;
Restaurant : RestaurantNumber USAddress;
RestaurantNumber : numbers;
USAddress	: Name Street City State Zip;
Name 	:	('a'..'z' | 'A'..'Z' | '0'..'9')+;
Street	:	('a'..'z' | 'A'..'Z' | '0'..'9')+;
City	:	('a'..'z' | 'A'..'Z' | '0'..'9')+;
State	:	('a'..'z' | 'A'..'Z' | '0'..'9')+;
Zip	:	numbers;
FoodItems	: Item+;
BeverageItems	: Item+;
Item 	:	ID productName quantity price calories;
ID	:	numbers;
productName	: ('a'..'z' | 'A'..'Z' | '0'..'9')+;
quantity	: '0'..'9')+;
price	: 	float;
calories	: numbers;
Taxes 	:	percent;
Tip	:	float;
Total	:	float;
Salutation	: ('a'..'z' | 'A'..'Z' | '0'..'9')+;	
percent	:	numbers;
float	:	numbers '.' numbers;
numbers	:	number+;
number 	:	'0'..'9';