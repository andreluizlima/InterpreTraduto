grammar Pascalzinho;

@header{
package basicintast.parser;
import basicintast.util.*;
}
program : p=PROGRAM STR EOL var? procedure*           #programStmtBegin
        | PROGRAM STR EOL start                       #programStmt
        ;
var     : VAR var2;
var2    : VARNAME varn* ':' type EOL  var2 #varNameFirst | start #startL ;

varn : ',' VARNAME #varName;

type    : INT
        | FLOAT
        | BOOLEAN 
        | STRING
        | arraytype
        ;

arraytype   :   ARRAY '['n1=NUM'..'n2=NUM']' OF t=INT
            |   ARRAY '['n1=NUM'..'n2=NUM']' OF t=FLOAT
            |   ARRAY '['n1=NUM'..'n2=NUM']' OF t=STRING
            |   ARRAY '['n1=NUM'..'n2=NUM']' OF t=BOOLEAN
            ;

procedure   : PROCEDURE VARNAME '('')' EOL start END
            ;

start   : BEGIN (stmt)+ ENDP
        | (stmt)+ 
        ;

stmt    : write EOL             #stmtPrint
        | readln  EOL           #stmtRead
        | attr  EOL             #stmtAttr
        | expr  EOL             #stmtExpr
        | cond                  #stmtCond
        ;

cond    : IF '('condExpr')' THEN  b1=block  END  EOL              #ifStmt
        | IF '('condExpr')' THEN  b1=block ELSE b2=block END EOL  #ifElseStmt
        | WHILE '('condExpr')' DO BEGIN b1=block END EOL   #whileStmt
        | FOR attr TO n=NUM DO BEGIN b1=block END EOL #forStmt
        | FOR n=NUM TO m=NUM DO BEGIN b1=block END EOL #forStmt2
        ;


condExpr: expr                                              #condExpresion
        | expr relop=('>'|'<'|'=='|'>='|'<='|'!=') expr     #condRelOp
        ;

block   : start     #blockStmt
        ;

write   : WRITE STR         #printStr
        | WRITE expr        #printExpr
        | WRITELN STR       #printStrLn
        | WRITELN expr      #printExprLn
        ;

readln    : READLN VARNAME          #readVar
        ;

attr    : VARNAME ':=' expr             #attrExpr
        | VARNAME ':=' STR              #attrString  
        | VARNAME ':=' truefalse        #attrBool
        | VARNAME '['v=(NUM|VARNAME)']'':='expr     #attrArrExpr
        | VARNAME '['v=(NUM|VARNAME)']'':='STR     #attrArrStr
        | VARNAME '['v=(NUM|VARNAME)']'':='truefalse     #attrArrTrueFalse
        ;

truefalse: TRUE | FALSE;

expr    : expr1 '+' expr    #exprPlus
        | expr1 '-' expr    #exprMinus
        | expr1             #expr1Empty
        ;

expr1   : expr2 '*' expr    #expr1Mult
        | expr2 '/' expr    #expr1Div
        | expr2             #expr2Empty
        ;

expr2   : '(' expr ')'      #expr2Par
        | NUM               #expr2Num
        | VARNAME               #expr2Var
        | VARNAME '['v=(NUM|VARNAME)']' #exprArr
        ;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');


//TOKENS
TO      : T O;
IF      : I F ;
BEGIN   : B E G I N ;
END     : E N D ;
ENDP    : E N D '.' ;
ELSE    : E L S E ;
THEN    : T H E N ;
WRITE   : W R I T E ;
WRITELN : W R I T E L N ;
READLN  : R E A D L N ;
INT     : I N T E G E R ;
FLOAT   : F L O A T ;
BOOLEAN : B O O L E A N ;
STRING  : S T R I N G ;
FOR     : F O R ;
WHILE   : W H I L E ;
ARRAY   : A R R A Y ;
VAR     : V A R ;
PROCEDURE: P R O C E D U R E;
PROGRAM : P R O G R A M ;
TRUE    : T R U E;
FALSE   : F A L S E;
OF      : O F;
DO      : D O;

GT      : '>' ;
LT      : '<' ;
EQ      : '==';
GE      : '>=';
LE      : '<=';
NE      : '!=';
PLUS    : '+' ;
MINUS   : '-' ;
MULT    : '*' ;
DIV     : '/' ;
OPEN    : '(' ;
CLOSE   : ')' ;
OPEN_BL : '{' ;
CLOSE_BL: '}' ;
IS      : '=' ;
EOL     : ';' ;
NUM     : [0-9]+('.'[0-9])* ;
VARNAME     : [a-zA-Z][a-zA-Z0-9_]*;
STR     : '"' ('\\' ["\\] | ~["\\\r\n])* '"';
WS      : [\n\r \t]+ -> skip;

//('['([0-9]+|([a-zA-Z][a-zA-Z0-9_]*))']')?