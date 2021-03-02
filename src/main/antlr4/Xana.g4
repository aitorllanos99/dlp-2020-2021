grammar Xana;


@header {
package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;
}

program returns [Program ast]
       : d=definitions* mf=mainFunction {$d.ast.add($mf.ast); $ast = new Program($d.start.getLine(), $d.start.getCharPositionInLine() +1, $d.ast);}
       ;

definitions returns [List<Definition> ast]
           : varDefinition {$ast.addAll($varDefinition.ast);}
           | funcDefinition {$ast.addAll($funcDefinition.ast);}
           ;

funcDefinition returns [FuncDefinition ast]
        : 'def ' id = ID '('fp = funcParameters?')''::' ft = functionTypes  'do' (statements | varDefinition)* 'end'
        ;
funcParameters returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]
        : (id1 = ID '::' t1 = type {$ast.add($id1.getLine(), $id1.getCharPositionInLine() +1, $id1.text, $t1.t);}(',' id2 = ID '::' t2 = type{$ast.add($id2.getLine(), $id2.getCharPositionInLine() +1, $id2.text, $t2.t);})*)
        ;
funcBody:; //COMO PONER EL STATEMENTS O VARDEFINITION EN COMUN AQUI?¿?¿?
mainFunction returns [FuncDefinition ast]
        : 'def ' 'main' '('')''do' (statements | varDefinition)* 'end'
        ;

varDefinition returns [VarDefinition ast]
            : mid = moreIdentDefinitions '::' t = varTypes {for(String s: $mid.ast) $ast.add(new VarDefinition($mid.start.getLine(), $mid.start.getCharPositionInLine() +1 , s, $t.t}
            ;
varTypes returns [Type t]
            : p = primitiveType {$t = p.t}
            | c = complexType {$t = c.t}
            ;
moreIdentDefinitions returns[List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
            id1 = ID {$ast.add($id1.text);} (',' id2 = ID {$ast.add($id2.text);} )*
            ;
statements returns [Statement st]
        : ID '(' mp = moreParameters ')'{$st = new Invocation($ID.getLine(), $ID.getCharPositionInLine(), $ID, $mp.ast);}
        | 'return' expression {$st = new Return ($expression.start.getLine(), $expression.start.getCharPositionInLine() +1 , $expression.ast);}
        | 'if' ex = expression+ 'do' ms = moreStatements ('else' ms2 = moreStatements)? 'end' {$st = new IfElse($ex.start.getLine(), $ex.start.getCharPositionInLine()+1, $ms.ast,$ms2.ast, $ex.ast);}
        | 'while' ex=expression+ 'do' ms = moreStatements 'end' {$st = new While($ex.start.getLine(), $ex.start.getCharPositionInLine()+1, $ms.ast, $ex.ast);}
        | 'in' me = moreExpressions {$st = new Print($me.start.getLine(), $me.start.getCharPositionInLine() +1, $me.ast)}
        | 'puts' me = moreExpressions {$st = new Print($me.start.getLine(), $me.start.getCharPositionInLine() +1, $me.ast)}
        | left = expression '=' right=expression {$st = new Assignment($left.start.getLine(), $left.start.getCharPositionInLine() +1 , $left.ast ,  $right.ast);}
        ;
moreExpressions returns[List<Expression> ast = new ArrayList<Expression>()]
        : e1 = expression {$ast.add($e1.ast);} (',' e2 = expression{$ast.add($e2.ast);})*
        ;
moreStatements returns [List<Statement> ast = new ArrayList<Statement>()]
        : stat=statements* {for(Statement s: $stat.st) $ast.add(s);}
        ;
moreParameters returns[List<Expression> ast = new ArrayList<Expression>()]
        :(e1 = expression {$ast.add($e1.ast);} (',' e2 = expression{$ast.add($e2.ast);})*)?
        ;
expression returns [Expression ast]
        : ID '(' mp = moreParameters ')' {$ast = new Invocation($ID.getLine(), $ID.getCharPositionInLine(), $ID, $mp.ast);}
        | i = INT_CONSTANT {$ast = new IntLiteral($i.getLine(), $i.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($i.text));}
        | c = CHAR_CONSTANT {$ast = new CharLiteral($c.getLine(), $c.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($c.text));}
        | r = REAL_CONSTANT {$ast = new DoubleLiteral($r.getLine(), $r.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($r.text));}
        | id = ID {$ast = new Variable($id.getLine(), $id.getCharPositionInLine() + 1, $id.text);}
        | '(' expression ')' {$ast = $expression.ast;}
        | '[' expression ']' {$ast = $expression.ast;}
        | left = expression '[' right = expression ']'{$ast = new Indexing($left.start.getLine(), $left.start.getCharPositionInLine()+1, $left.ast, $right.ast);}
        | left = expression '.' right = expression {$ast = new FieldAccess($left.start.getLine(), $left.start.getCharPositionInLine() +1, $left.ast, $right.ast);}
        | exp = expression 'as' tc = type {$ast = new Cast($exp.start.getLine(), $exp.start.getCharPositionInLine()+1, $tc.t. $exp.ast);}
        | '-' exp = expression {$ast = new UnaryMinus($exp.start.getLine(), $exp.start.getCharPositionInLine() + 1, $exp.ast);}
        | '!' exp = expression {$ast = new UnaryNot($exp.start.getLine(), $exp.start.getCharPositionInLine() + 1, $exp.ast);}
        | left = expression op = ('*'| '/' | '%') right = expression {$ast = new Arithmetic($left.start.getLine(), $left.start.getCharPositionInLine() + 1, $left.ast, $right.ast, $op.text);}
        | left = expression op = ('+'| '-') right = expression {$ast = new Arithmetic($left.start.getLine(), $left.start.getCharPositionInLine() + 1, $left.ast, $right.ast, $op.text);}
        | left = expression op = ('>'| '>=' | '<'| '<=' | '!='| '==') right = expression {$ast = new Comparison($left.start.getLine(), $left.start.getCharPositionInLine() + 1, $left.ast, $right.ast, $op.text);}
        | left = expression op = ('&&'| '||') right = expression {$ast = new Logical($left.start.getLine(), $left.start.getCharPositionInLine() + 1, $left.ast, $right.ast, $op.text);}
        ;



type returns [Type t]
    : p = primitiveType {$t = p.t}
    | c = complexType {$t = c.t}
    | v = voidType {$t = v.t}
;

functionTypes returns [Type t]
        : p = primitiveType {$t = p.t}
        | v = voidType {$t = v.t}
        ;

voidType returns [Type t]
        : v='void' {$t = new VoidType($v.getLine(), $v.getCharPositionInLine() + 1);}
        ;

primitiveType returns [Type t]
             : i='int' {$t = new IntType($i.getLine(), $i.getCharPositionInLine() +1);}
             |c='char' {$t = new CharType($c.getLine(), $c.getCharPositionInLine() + 1);}
             |d='double' {$t = new DoubleType($d.getLine(), $d.getCharPositionInLine() +1) ;}
             ;
complexType: 'defstruct' 'do' varDefinition* 'end'
             |'['(INT_CONSTANT | CHAR_CONSTANT | REAL_CONSTANT)+ '::' type ']'
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
