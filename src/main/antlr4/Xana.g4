grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: definitions* mainFunction
       ;

definitions: varDefinition | funcDefinition
    ;

funcDefinition: 'def ' ID '('(ID '::' type(',' ID '::' type)*)?')''::'type  'do' statements* 'end'
;
mainFunction: 'def ' 'main' '('')''do' statements* 'end'
;

varDefinition: ID  (',' ID)* '::' type;

statements: ID '(' (expression (',' expression)*)? ')'
        | varDefinition
        | 'return' expression
        | 'if' expression* 'do' statements* ('else' statements*)? 'end'
        | 'while' expression* 'do' statements* 'end'
        | 'in' (expression  (',' expression)*)
        | 'puts' (expression (',' expression)*)
        | expression '=' expression
        ;
expression: ID '(' (expression (',' expression)*)? ')'
        | INT_CONSTANT
        | CHAR_CONSTANT
        | REAL_CONSTANT
        | ID
        | '(' expression ')'
        | '[' expression ']'
        | expression '[' expression ']'
        | expression '.' expression
        | expression'as' type
        | '-' expression
        | '!' expression
        | expression ('*'| '/' | '%') expression
        | expression ('+'| '-') expression
        | expression ('>'| '>=' | '<'| '<=' | '!='| '==') expression
        | expression ('&&'| '||') expression
        ;



type: 'int'
    |'char'
    |'double'
    |'defstruct' 'do' varDefinition* 'end'
    |'['expression+ '::' type ']'
    | 'void'
;





//*******LEXER******
WHITESPACE: [ \n\t\r]+ -> skip
        ;
INT_CONSTANT: [0-9]+
            ;

REAL_CONSTANT: INT_CONSTANT?'.'INT_CONSTANT
            | INT_CONSTANT'.'INT_CONSTANT?
            | ELEVATION
            | EXPONENTIAL
            ;

ELEVATION: INT_CONSTANT'e'INT_CONSTANT
            | INT_CONSTANT?'e'INT_CONSTANT
            | INT_CONSTANT'e'INT_CONSTANT?
            ;
EXPONENTIAL: INT_CONSTANT'.'INT_CONSTANT'E'('+'|'-')?INT_CONSTANT
            | INT_CONSTANT?'.'INT_CONSTANT'E'('+'|'-')?INT_CONSTANT
            | INT_CONSTANT'.'INT_CONSTANT?'E'('+'|'-')?INT_CONSTANT
            | INT_CONSTANT'.'INT_CONSTANT'E'('+'|'-')?REAL_CONSTANT
            | INT_CONSTANT?'.'INT_CONSTANT'E'('+'|'-')?REAL_CONSTANT
            | INT_CONSTANT'.'INT_CONSTANT?'E'('+'|'-')?REAL_CONSTANT
            ;
COMMENTS: '#'.*?('\n'|EOF)-> skip
                    ;
COMMENTSBIGGER: '"""'.*?'"""' -> skip
                    ;
ID: ([a-zA-Z]|'_')([a-zA-Z]|INT_CONSTANT|'_')*
        ;
CHAR_CONSTANT: '\''.'\'' | '\'\\'INT_CONSTANT'\'' |  '\'\\n''\'' | '\'\\t''\''
            ;