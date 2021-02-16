grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: CHAR_CONSTANT
       ;
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