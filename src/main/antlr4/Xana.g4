grammar Xana;


@header {
package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.*;
}

program returns [Program ast]
       : d=definitions mf=mainFunction {$d.ast.add($mf.ast); $ast = new Program($d.start.getLine(), $d.start.getCharPositionInLine() +1, $d.ast);}
       ;

definitions returns [List<Definition> ast = new ArrayList<Definition>()]
           : (varDefinition {$ast.addAll($varDefinition.ast);}
           | funcDefinition {$ast.add($funcDefinition.ast);})*
           ;

funcDefinition returns [FuncDefinition ast]
        : 'def ' id = ID '('fp = funcParameters?')''::' ft = functionTypes  'do' fb = funcBody 'end' {$ast = new FuncDefinition($id.getLine(), $id.getCharPositionInLine()+1, $fb.stat, $fb.varDef, $ft.t,$id.text);}
        ;
funcParameters returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]
        : (id1 = ID '::' t1 = type {$ast.add(new VarDefinition($id1.getLine(), $id1.getCharPositionInLine() +1, $id1.text, $t1.t));}(',' id2 = ID '::' t2 = type{$ast.add(new VarDefinition($id2.getLine(), $id2.getCharPositionInLine() +1, $id2.text, $t2.t));})*)
        ;
funcBody returns[List<Statement> stat = new ArrayList<Statement>() ,List<VarDefinition> varDef = new ArrayList<VarDefinition>()]
        :(s = statements {$stat.addAll($s.st);} | v = varDefinition {$varDef.addAll($v.ast);})*
        ;
mainFunction returns [FuncDefinition ast]
        : 'def ' id = 'main' '('')''do' fb = funcBody 'end' {$ast = new FuncDefinition($id.getLine(), $id.getCharPositionInLine()+1, $fb.stat, $fb.varDef, new VoidType($id.getLine(), $id.getCharPositionInLine()+1),$id.text);}
        ;

varDefinition returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]
            : mid = moreIdentDefinitions '::' t = varTypes {for(String s: $mid.ast) $ast.add(new VarDefinition($mid.start.getLine(), $mid.start.getCharPositionInLine() +1 , s, $t.t));}
            ;
varTypes returns [Type t]
            : p = primitiveType {$t = $p.t;}
            | c = complexType {$t = $c.t;}
            ;
moreIdentDefinitions returns[List<String> ast = new ArrayList<String>()]:
            id1 = ID {$ast.add($id1.text);} (',' id2 = ID {$ast.add($id2.text);} )*
            ;
statements returns [List<Statement> st = new ArrayList<Statement>()]
        : ID '(' mp = moreParameters ')'{$st.add(new Invocation($ID.getLine(), $ID.getCharPositionInLine(), new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text), $mp.ast));}
        | 'return' expression {$st.add(new Return ($expression.start.getLine(), $expression.start.getCharPositionInLine() +1 , $expression.ast));}
        | 'if' ex = expression+ 'do' ms += statements* ('else' ms2 += statements*)? 'end' {List<Statement> ifs = new ArrayList<Statement>();
                                                                                               for(var s: $ms) ifs.addAll(s.st);
                                                                                               List<Statement> elses = new ArrayList<Statement>();
                                                                                               for(var s: $ms2) elses.addAll(s.st);
                                                                                               $st.add(new IfElse($ex.start.getLine(), $ex.start.getCharPositionInLine()+1, $ex.ast, ifs,elses));}
        | 'while' ex=expression+ 'do' ms += statements* 'end' {List<Statement> sts = new ArrayList<Statement>();
                                                                   for(var s: $ms) sts.addAll(s.st);$st.add(new While($ex.start.getLine(), $ex.start.getCharPositionInLine()+1, sts, $ex.ast));}
        | 'in' me = moreExpressions {$me.ast.stream().map(e-> $st.add(new Read($me.start.getLine(), $me.start.getCharPositionInLine() +1, e)));}
        | 'puts' me = moreExpressions {$me.ast.stream().map(e-> $st.add(new Write($me.start.getLine(), $me.start.getCharPositionInLine() +1, e)));}
        | left = expression '=' right=expression {$st.add(new Assignment($left.start.getLine(), $left.start.getCharPositionInLine() +1 , $left.ast ,  $right.ast));}
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
        : ID '(' mp = moreParameters ')' {$ast = new Invocation($ID.getLine(), $ID.getCharPositionInLine(), new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text), $mp.ast);}
        | i = INT_CONSTANT {$ast = new IntLiteral($i.getLine(), $i.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($i.text));}
        | c = CHAR_CONSTANT {$ast = new CharLiteral($c.getLine(), $c.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($c.text));}
        | r = REAL_CONSTANT {$ast = new DoubleLiteral($r.getLine(), $r.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($r.text));}
        | id = ID {$ast = new Variable($id.getLine(), $id.getCharPositionInLine() + 1, $id.text);}
        | '(' expression ')' {$ast = $expression.ast;}
        | '[' expression ']' {$ast = $expression.ast;}
        | left = expression '[' right = expression ']'{$ast = new Indexing($left.start.getLine(), $left.start.getCharPositionInLine()+1, $left.ast, $right.ast);}
        | left = expression '.' right = expression {$ast = new FieldAccess($left.start.getLine(), $left.start.getCharPositionInLine() +1, $left.ast, $right.ast);}
        | exp = expression 'as' tc = type {$ast = new Cast($exp.start.getLine(), $exp.start.getCharPositionInLine()+1, $tc.t, $exp.ast);}
        | '-' exp = expression {$ast = new UnaryMinus($exp.start.getLine(), $exp.start.getCharPositionInLine() + 1, $exp.ast);}
        | '!' exp = expression {$ast = new UnaryNot($exp.start.getLine(), $exp.start.getCharPositionInLine() + 1, $exp.ast);}
        | left = expression op = ('*'| '/' | '%') right = expression {$ast = new Arithmetic($left.start.getLine(), $left.start.getCharPositionInLine() + 1, $left.ast, $right.ast, $op.text);}
        | left = expression op = ('+'| '-') right = expression {$ast = new Arithmetic($left.start.getLine(), $left.start.getCharPositionInLine() + 1, $left.ast, $right.ast, $op.text);}
        | left = expression op = ('>'| '>=' | '<'| '<=' | '!='| '==') right = expression {$ast = new Comparison($left.start.getLine(), $left.start.getCharPositionInLine() + 1, $left.ast, $right.ast, $op.text);}
        | left = expression op = ('&&'| '||') right = expression {$ast = new Logical($left.start.getLine(), $left.start.getCharPositionInLine() + 1, $left.ast, $right.ast, $op.text);}
        ;



type returns [Type t]
    : p = primitiveType {$t = $p.t;}
    | c = complexType {$t = $c.t;}
    | v = voidType {$t = $v.t;}
;

functionTypes returns [Type t]
        : p = primitiveType {$t = $p.t;}
        | v = voidType {$t = $v.t;}
        ;

voidType returns [Type t]
        : v='void' {$t = new VoidType($v.getLine(), $v.getCharPositionInLine() + 1);}
        ;

primitiveType returns [Type t]
             : i='int' {$t = new IntType($i.getLine(), $i.getCharPositionInLine() +1);}
             |c='char' {$t = new CharType($c.getLine(), $c.getCharPositionInLine() + 1);}
             |d='double' {$t = new DoubleType($d.getLine(), $d.getCharPositionInLine() +1) ;}
             ;
complexType returns [Type t]: id = 'defstruct' 'do' vd += varDefinition* 'end' {List<RecordField> rec = new ArrayList<RecordField>();
                                                                                List<VarDefinition> vds = new ArrayList<VarDefinition>();
                                                                                for(var v: $vd) vds.addAll(v.ast);
                                                                                for(var v: vds) rec.add(new RecordField(v.getLine(),v.getColumn(),v.getName(),v.getType()));
                                                                                $t = new RecordType($id.getLine(), $id.getCharPositionInLine()+1, rec);}
             |'['i = INT_CONSTANT '::' tp = type ']' {$t = new ArrayType($i.getLine(), $i.getCharPositionInLine()+1,$tp.t,LexerHelper.lexemeToInt($i.text));}
             ;

/*structFieldsDefinition returns[List <VarDefinition> ast  = new ArrayList<VarDefinition>();]:
             (id1=ID '::' t1=type)* {$ast.add(new VarDefinition($id1.getLine(), $id1.getCharPositionInLine() +1, $id1.text, $t1.t));}
            ;*/

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
