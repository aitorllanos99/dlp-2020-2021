grammar Xana;


@header {
package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;
}

program returns[Program ast]
       : definitions* mainFunction
       ;

definitions returns [List<Definition> ast]
           : varDefinition {\$ast.addAll($varDefinition.ast);}
           | funcDefinition {\$ast.addAll($funcDefinition.ast);}
           ;

funcDefinition: 'def ' ID '('(ID '::' type(',' ID '::' type)*)?')''::'functionTypes  'do' statements* 'end'
;
mainFunction: 'def ' 'main' '('')''do' statements* 'end'
;

varDefinition: ID  (',' ID)* '::' (primitiveType | complexType);

statements returns [Statement st]
        : ID '(' (expression (',' expression)*)? ')'
        | varDefinition
        | 'return' expression
        | 'if' expression* 'do' statements* ('else' statements*)? 'end'
        | 'while' expression* 'do' statements* 'end'
        | 'in' (expression  (',' expression)*)
        | 'puts' (expression (',' expression)*)
        | left = expression '=' rigth=expression { \$st = new Assignment(\$left.start.getLine(), \$left.start.getCharPositionInLine() +1 , \$left.ast ,  \$right.ast);}
        ;
expression returns [Expression ast]
        : ID '(' (expression (',' expression)*)? ')'
        | i = INT_CONSTANT {\$ast = new IntLiteral(\$i.getLine(), \$i.getCharPositionInLine() + 1, LexerHelper.lexemeToInt(\$i.text));}
        | c = CHAR_CONSTANT {\$ast = new CharLiteral(\$c.getLine(), \$c.getCharPositionInLine() + 1, LexerHelper.lexemeToChar(\$c.text));}
        | r = REAL_CONSTANT {\$ast = new DoubleLiteral(\$r.getLine(), \$r.getCharPositionInLine() + 1, LexerHelper.lexemeToReal(\$r.text));}
        | id = ID {\$ast = new Variable(\$id.getLine(), \$id.getCharPositionInLine() + 1, \$id.text);}
        | '(' expression ')' {\$ast = \$expression.ast;}
        | '[' expression ']' {\$ast = \$expression.ast;}
        | left = expression '[' right = expression ']'{\$ast = new Indexing(\$left.start.getLine(), \$left.start.getCharPositionInLine()+1, \$left.ast, \$rigth.ast);}
        | left = expression '.' right = expression {\$ast = new FieldAccess(\$left.start.getLine(), \$left.start.getCharPositionInLine() +1, \$left.ast, \$right.ast);}
        | exp = expression 'as' tc = type {\$ast = new Cast(\$exp.start.getLine(), \$exp.start.getCharPositionInLine()+1, \$tc.t. \$exp.ast);}
        | '-' exp = expression {\$ast = new UnaryMinus(\$exp.start.getLine(), \$exp.start.getCharPositionInLine() + 1, \$exp.ast);}
        | '!' exp = expression {\$ast = new UnaryNot(\$exp.start.getLine(), \$exp.start.getCharPositionInLine() + 1, \$exp.ast);}
        | left = expression op = ('*'| '/' | '%') right = expression {\$ast = new Arithmetic(\$left.start.getLine(), \$left.start.getCharPositionInLine() + 1, \$left.ast, \$right.ast, \$op.text);}
        | left = expression op = ('+'| '-') right = expression {\$ast = new Arithmetic(\$left.start.getLine(), \$left.start.getCharPositionInLine() + 1, \$left.ast, $right.ast, \$op.text);}
        | left = expression op = ('>'| '>=' | '<'| '<=' | '!='| '==') right = expression {\$ast = new Comparison(\$left.start.getLine(), \$left.start.getCharPositionInLine() + 1, \$left.ast, \$right.ast, \$op.text);}
        | left = expression op = ('&&'| '||') right = expression {\$ast = new Logical(\$left.start.getLine(), \$left.start.getCharPositionInLine() + 1, \$left.ast, \$right.ast, \$op.text);}
        ;



type returns [Type t]
    : p = primitiveType {\$t = p.t}
    | complexType {\$t = c.t}
    | v = voidType {\$t = v.t}
;

functionTypes returns [Type t]
        : p = primitiveType {\$t = p.t}
        | v = voidType {\$t = v.t}
        ;

voidType returns [Type t]
        : v='void' {\$t = new VoidType(\$v.getLine(), \$v.getCharPositionInLine() + 1);}
        ;

primitiveType returns [Type t]
             : i='int' {\$t = new IntType(\$i.getLine(), \$i.getCharPositionInLine() +1);}
             |c='char' {\$t = new CharType(\$c.getLine(), \$c.getCharPositionInLine() + 1);}
             |d='double' {\$t = new DoubleType(\$d.getLine(), \$d.getCharPositionInLine() +1) ;}
             ;
complexType: 'defstruct' 'do' varDefinition* 'end'
             |'['expression+ '::' type ']'
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