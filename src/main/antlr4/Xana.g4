grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: expression* EOF
       ;


expression: INT_CONSTANT
       | CHAR_CONSTANT
       | REAL_CONSTANT
       | ID
       ;


CHAR_CONSTANT: '\''CHAR_CONTENT'\''
             ;

fragment
CHAR_CONTENT: .
            | '\\'INT_CONSTANT
            | '\\n'
            | '\\t'
            ;


INT_CONSTANT: '0'
            | [1-9]DIGIT*
            ;


REAL_CONSTANT: REAL_MANTISSA REAL_EXPONENT?
            | INT_CONSTANT REAL_EXPONENT
            ;

fragment
REAL_MANTISSA: (INT_CONSTANT)?'.'(DIGIT+)
            | (INT_CONSTANT)'.'DIGIT*
            ;
fragment
REAL_EXPONENT: ('e'|'E')'-'?INT_CONSTANT
            ;


SINGLE_LINE_COMMENT: '#'.*? (('\r'?'\n')|EOF) -> skip
            ;
MULTI_LINE_COMMENT: '"""'.*?'"""' -> skip
            ;


ID: ('_' | LETTER) ('_' | DIGIT | LETTER)*
            ;
fragment
LETTER: [a-zA-Z]
            ;

SPACE: (' ' | [\t\n\r]+) -> skip; //('\t' | ' ' | '\n' | '\r')+ -> skip


fragment
DIGIT: [0-9]
     ;
