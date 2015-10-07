package Analizadores_secuencia;

import Logica.Arbol_AST;
import Logica.Error_encontrado;
import	java_cup.runtime.Symbol;  
 
%%

%cupsym Tabla_simbolos_secuencia
%class Lexico_secuencia         
%cup                    
%public                 
%unicode                
%line                   
%column                 
%char                   
%ignorecase     

numero = [0-9]+
letra = [a-zñA-ZÑ]
atributo_nombre = {letra}({letra}|{numero}|"_")*

%{
//codigo que se utilizara en el analizador lexico
private void listar_error(String t, int y, int x){
	Error_encontrado error_lexico = new Error_encontrado("Archivo Secuencia",t,"caracter no definido en el lenguaje", x, y, false);
	Arbol_AST.getLista_errores().add(error_lexico);
}

%}

%%


/* PALABRAS RESERVADAS */ 

"<"    				{return new Symbol(Tabla_simbolos_secuencia.abrir_tag, yycolumn,yyline,new String(yytext()));}
"escenarios"		{return new Symbol(Tabla_simbolos_secuencia.r_escenarios, yycolumn,yyline,new String(yytext()));}
"escenario"			{return new Symbol(Tabla_simbolos_secuencia.r_escenario, yycolumn,yyline,new String(yytext()));}
"nombre"			{return new Symbol(Tabla_simbolos_secuencia.r_nombre, yycolumn,yyline,new String(yytext()));}
"orden"				{return new Symbol(Tabla_simbolos_secuencia.r_orden, yycolumn,yyline,new String(yytext()));}
"="    				{return new Symbol(Tabla_simbolos_secuencia.s_igual, yycolumn,yyline,new String(yytext()));}
";"					{return new Symbol(Tabla_simbolos_secuencia.s_punto_coma, yycolumn,yyline,new String(yytext()));}
"/"					{return new Symbol(Tabla_simbolos_secuencia.s_guion, yycolumn,yyline,new String(yytext()));}
">"					{return new Symbol(Tabla_simbolos_secuencia.cerrar_tag, yycolumn,yyline,new String(yytext()));}
{atributo_nombre}   {return new Symbol(Tabla_simbolos_secuencia.atributo_nombre, yycolumn,yyline,new String(yytext()));}
{numero}			{return new Symbol(Tabla_simbolos_secuencia.numero, yycolumn,yyline,new String(yytext()));}




[ \t\r\f\n]+ 	{ /* Se ignoran */}  

/* CUAQUIER OTRO */ 
.         		{listar_error(new String(yytext()),yyline,yycolumn);
				/*return new Symbol(Tabla_simbolos_configuracion.error, yycolumn,yyline,new String(yytext()));*/} 	