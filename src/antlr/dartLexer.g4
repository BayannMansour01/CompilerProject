lexer grammar dartLexer;
A: '&';
AA: '&&';
AE: '&=';
AT: '@';
C: ',';
CB: ']';
CBC: '}';
CIR: '^';
CIRE: '^=';
CO: ':';
CP: ')';
D: '.';
DD: '..';
DDD: '...';
EE: '==';
EG: '=>';
EQ: '=';
GT: '>';
LT: '<';
LTE: '<=';
LTLT: '<<';
LTLTE: '<<=';
ME: '-=';
MINUS: '-';
MM: '--';
////////
NE: '!=';
NOT: '!';
OB: '[';
OBC: '{';
OP: '(';
P: '|';
PC: '%';
PE: '%=';
PL: '+';
PLE: '+=';
PLPL: '++';
PO: '#';
POE: '|=';
PP: '||';
QU: '?';
QUD: '?.';
QUDD: '?..';
QUQU: '??';
QUQUEQ: '??=';
ROW: 'ROW' ;
SC: ';';
SE: '/=';
SL: '/';
SQS: '~/';
SQSE: '~/=';
SQUIG: '~';
ST: '*';
STE: '*=';
ABSTRACT_:'abstract';
AS_:'as';
ASSERT_:'assert';
ASYNC_:'async';
AWAIT_:'await';
ADD_:'add';
BOXDECORATION_:'BoxDecoration';
BOXSHAPE_:'BoxShape';
BREAK_:'break';
CASE_:'case';
CATCH_:'catch';
CLASS_:'class';
CONST_:'const';
CONTINUE_:'continue';
CONTROLLER_ : 'controller' ;
COVARIANT_:'covariant';
CONTAINER_:'Container';
CHILD_:'child';
COLOR_:'color';
COLORS_:'Colors';
DECORATION_:'decoration';
DEFAULT_:'default';
DEFERRED_:'deferred';
DO_:'do';
DYNAMIC_:'dynamic';
ELSE_:'else';
ENUM_:'enum';
EXPORT_:'export';
EXTENDS_:'extends';
EXTENSION_:'extension';
EXTERNAL_:'external';
FACTORY_:'factory';
FALSE_:'false';
FINAL_:'final';
FINALLY_:'finally';
FOR_:'for';
FUNCTION_:'Function';
GET_:'get';
GTILDE_:'gtilde';
HIDE_:'hide';
IF_:'if';
IMPLEMENTS_:'implements';
IMPORT_:'import';
IN_:'in';
INTERFACE_:'interface';
IS_:'is';
LATE_:'late';
LET_:'let';
LIBRARY_:'library';
LIST:'List';
MIXIN_:'mixin';
NATIVE_:'native';
NEW_:'new';
NULL_:'null';
OF_:'of';
ON_:'on';
OPERATOR_:'operator';
PART_:'part';
REQUIRED_:'required';
RETHROW_:'rethrow';
RETURN_:'return';
SET_:'set';
SHOW_:'show';
SHAPE_:'shape';
STATIC_:'static';
SUPER_:'super';
SWITCH_:'switch';
SYNC_:'sync';
STACK_:'Stack';
THIS_:'this';
THROW_:'throw';
TRUE_:'true';
TRY_:'try';
TYPEDEF_:'typedef';
INTTYPE: 'int';
DOUBLETYPE : 'double';
FLOATTYPE : 'float';
STRINGTYPE: 'String';
BoolTYPE: 'bool';
QUEUE :'Queue';
VARTYPE:'var';

VOID_:'void';
WHILE_:'while';
WITH_:'with';
WIDGET_:'Widget';
YIELD_:'yield';
Main : 'main';
INT : [0-9]+;
BOOL: TRUE_ | FALSE_ ;
PUBLIC_:'public';
PROTECT_:'protect';
PRIVATE_:'private';
Image_:'Image';
IMAGEIN_:'image';
NETWORKIMAGE_:'NetWorkImage';
//LABELTEXT_:'labelText';
TEXTFORMFIELD_:'TextFormField';
LABELTEXT_:'labelText';
HINTTEXT_:'hintText';
HOME : 'home';
MATERIALAPP :'MaterialApp' ;

RUNAPP : 'runApp';
HEIGHT_:'height';
WIDTH_:'width';
//row&cloumn
ROW_: 'Row' ;
COLUMN_: 'Column';
CHILDREN : 'children';
MAINAXISALIGNMENT: 'MainAxisAlignment';
MAINAXISALIGNMENTIN: 'mainAxisAlignment';
CROSSAXISALIGNMENT : 'CrossAxisAlignment';
CROSSAXISALIGNMENTIN : 'crossAxisAlignment';
CENTER : 'center';
END :'end' ;
START: 'start';
//
LISTVIEW_:'ListView';
SCROLLDIRECTION:'scrollDirection';
AXIS:'Axis';
HORIZONTAL:'horizontal';
VERTICAL:'vertical';
BUILDER:'builder';
ITEMBUILDER:'itemBuilder';
ITEMCOUNT:'itemCount';
CONTEXT:'context';
SCAFFOLD :'Scaffold';
BODY : 'body';
TYPEWIDGET: 'StatelessWidget' | 'StatefullWidget';
Navigator : 'Navigator';
PUSH:'push';
Pop:'pop';
MaterialPageRoute :'MaterialPageRoute';
Text:'Text';
OnPressed : 'onPressed';
TextButton : 'TextButton';


ACCESSMODIFIER : PRIVATE_|PROTECT_|PUBLIC_;
NUMBER : DIGIT+ ( '.' DIGIT+ )? EXPONENT? | '.' DIGIT+ EXPONENT? ;
HEX_NUMBER : '0x' HEX_DIGIT+ | '0X' HEX_DIGIT+ ;
SingleLineString : StringDQ | StringSQ | 'r\'' (~('\'' | '\n' | '\r'))* '\'' | 'r"' (~('"' | '\n' | '\r'))* '"' ;
MultiLineString : '"""' StringContentTDQ*? '"""' | '\'\'\'' StringContentTSQ*? '\'\'\'' | 'r"""' (~'"' | '"' ~'"' | '""' ~'"')* '"""' | 'r\'\'\'' (~'\'' | '\'' ~'\'' | '\'\'' ~'\'')* '\'\'\'' ;
IDENTIFIER : IDENTIFIER_START IDENTIFIER_PART* ;
WHITESPACE : ( '\t' | ' ' | NEWLINE )+  -> skip;
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT : '/*' ( MULTI_LINE_COMMENT | . )*? '*/'  -> skip ;
fragment EXPONENT : ( 'e' | 'E' ) ( '+' | '-' )? DIGIT+ ;
fragment HEX_DIGIT : 'a' .. 'f' | 'A' .. 'F' | DIGIT ;
fragment StringDQ : '"' StringContentDQ*? '"' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}' | '$' /**{ CheckNotOpenBrace() }?*/ ;
fragment StringSQ : '\'' StringContentSQ*? '\'' ;
fragment StringContentSQ : ~('\\' | '\'' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}' | '$'/** { CheckNotOpenBrace() }?*/ ;
fragment StringContentTDQ : ~('\\' | '"') | '"' ~'"' | '""' ~'"' ;
fragment StringContentTSQ : '\'' ~'\'' | '\'\'' ~'\'' | . ;
fragment ESCAPE_SEQUENCE : '\n' | '\r' | '\\f' | '\\b' | '\t' | '\\v' | '\\x' HEX_DIGIT HEX_DIGIT | '\\u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT | '\\u{' HEX_DIGIT_SEQUENCE '}' ;
fragment HEX_DIGIT_SEQUENCE : HEX_DIGIT HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? ;
fragment NEWLINE : '\n' | '\r' | '\r\n' ;
fragment BUILT_IN_IDENTIFIER : 'abstract' | 'as' | 'covariant' | 'deferred' | 'dynamic' | 'export' | 'external' | 'extension' | 'factory' | 'Function' | 'get' | 'implements' | 'import' | 'interface' | 'late' | 'library' | 'mixin' | 'operator' | 'part' | 'required' | 'set' | 'static' | 'typedef' ;
fragment OTHER_IDENTIFIER : 'async' | 'hide' | 'of' | 'on' | 'show' | 'sync' | 'await' | 'yield' ;
fragment IDENTIFIER_NO_DOLLAR : IDENTIFIER_START_NO_DOLLAR IDENTIFIER_PART_NO_DOLLAR* ;
fragment IDENTIFIER_START_NO_DOLLAR : LETTER | '_' ;
fragment IDENTIFIER_PART_NO_DOLLAR : IDENTIFIER_START_NO_DOLLAR | DIGIT ;
fragment IDENTIFIER_START : IDENTIFIER_START_NO_DOLLAR | '$' ;
fragment IDENTIFIER_PART : IDENTIFIER_START | DIGIT ;
fragment LETTER : 'a' .. 'z' | 'A' .. 'Z' ;
fragment DIGIT : '0' .. '9' ;
