/**
 * Define a grammar called Hello
 */
grammar Datalog;
r  : 'hello' ID ;         // match keyword hello followed by an identifier

ID : [a-zA-Z][a-zA-Z0-9]* ;             // match lower-case identifiers
//ID:('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'| INT )*;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

prog:	(expr NEWLINE)* ;

expr:	ESQUEMAS DOSPUNTOS esquema listaesquemas   HECHOS DOSPUNTOS listahechos   REGLAS DOSPUNTOS listareglas   CONSULTAS DOSPUNTOS consulta listaconsultas;

esquema: ID PARENTESISI ID listaid PARENTESISD;

listaesquemas:	esquema listaesquemas | NEWLINE;

listaid:	COMA ID listaid | NEWLINE;

hecho:	ID PARENTESISI TEXTO listastrings PARENTESISD PUNTO;

listahechos: hecho listahechos | NEWLINE;

regla: cabezapredicado DOSPUNTOSGUION predicado listapredicados PUNTO;

listareglas: regla listareglas | NEWLINE;

cabezapredicado: ID PARENTESISI ID listaid PARENTESISD;

predicado: ID PARENTESISI parametro listaparametros PARENTESISD;

listapredicados: COMA predicado listapredicados | NEWLINE;

parametro: TEXTO | ID | expresion;

listaparametros:	COMA parametro listaparametros | NEWLINE;

expresion: PARENTESISI parametro operador parametro PARENTESISD;

operador: SUMA | MULT;

consulta: predicado INTERROGA;

listaconsultas: consulta listaconsultas | NEWLINE;

listastrings: COMA TEXTO listastrings | NEWLINE;


IGUAL: '=' ;

DIFER: '!=' ;

GUION: '~' ;

PUNTO:'.';

COMA:',';

INTERROGA:'?';

PARENTESISI:'(';

PARENTESISD:')';

DOSPUNTOS:':';

DOSPUNTOSGUION:':-';

ESQUEMAS: 'Schemes';

HECHOS: 'Facts';

REGLAS: 'Rules';

CONSULTAS: 'Queries';

MULT:'*';

SUMA:'+';

NEWLINE : [\r\n]+ ;

INT: [0-9]+ ;

TEXTO :  '\'' ( ESC_TIPO_C | ~('\\'|'\'') )* '\'';

COMENTARIO: '#' ~('\n'|'\r')* '\r'? '\n';

ESC_TIPO_C :   '\\' ('b'|'t'|'n'|'f'|'r'|'\''|'\\') ;
