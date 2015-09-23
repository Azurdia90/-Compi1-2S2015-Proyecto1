package Analizadores;

import Logica.Arbol_AST;
import Logica.Error_encontrado;
import	java_cup.runtime.Symbol;  
 
%%

%cupsym Tabla_simbolos_configuracion  
%class Lexico_configuracion           
%cup                    
%public                 
%unicode                
%line                   
%column                 
%char                   
%ignorecase     

numero = [0-9]+
letra = [a-zñA-ZÑ]
guion = [/\\]
atributo_nombre = {letra}({letra}|{numero}|"_")*
descripcion = "\""[^\"] ~"\""


%{
//codigo que se utilizara en el analizador lexico
private void listar_error(String t, int y, int x){
	Error_encontrado error_lexico = new Error_encontrado("Archivo Configuracion",t,"caracter no definido en el lenguaje", x, y, false);
	Arbol_AST.getLista_errores().add(error_lexico);
}

%}

%%


/* PALABRAS RESERVADAS */ 

"<"    				{return new Symbol(Tabla_simbolos_configuracion.abrir_tag, yycolumn,yyline,new String(yytext()));}
"configuracion"		{return new Symbol(Tabla_simbolos_configuracion.r_configuracion, yycolumn,yyline,new String(yytext()));}
"fondo"				{return new Symbol(Tabla_simbolos_configuracion.r_fondo, yycolumn,yyline,new String(yytext()));}
"nombre"      		{return new Symbol(Tabla_simbolos_configuracion.r_nombre, yycolumn,yyline,new String(yytext()));}
"imagen"      		{return new Symbol(Tabla_simbolos_configuracion.r_imagen, yycolumn,yyline,new String(yytext()));}
"figura"			{return new Symbol(Tabla_simbolos_configuracion.r_figura, yycolumn,yyline,new String(yytext()));}
"vida" 				{return new Symbol(Tabla_simbolos_configuracion.r_vida, yycolumn,yyline,new String(yytext()));}
"tipo"				{return new Symbol(Tabla_simbolos_configuracion.r_tipo, yycolumn,yyline,new String(yytext()));}
"enemigo"			{return new Symbol(Tabla_simbolos_configuracion.r_enemigo, yycolumn,yyline,new String(yytext()));}
"heroe"				{return new Symbol(Tabla_simbolos_configuracion.r_heroe, yycolumn,yyline,new String(yytext()));}
"destruir"			{return new Symbol(Tabla_simbolos_configuracion.r_destruir, yycolumn,yyline,new String(yytext()));}
"creditos"			{return new Symbol(Tabla_simbolos_configuracion.r_creditos, yycolumn,yyline,new String(yytext()));}
"descripcion"		{return new Symbol(Tabla_simbolos_configuracion.r_descripcion, yycolumn,yyline,new String(yytext()));}
"dise\u00f1o"		{return new Symbol(Tabla_simbolos_configuracion.r_disenio, yycolumn,yyline,new String(yytext()));}
"arma"				{return new Symbol(Tabla_simbolos_configuracion.r_arma, yycolumn,yyline,new String(yytext()));}
"bloque"			{return new Symbol(Tabla_simbolos_configuracion.r_bloque, yycolumn,yyline,new String(yytext()));}
"bomba"				{return new Symbol(Tabla_simbolos_configuracion.r_bomba, yycolumn,yyline,new String(yytext()));}
"bonus"				{return new Symbol(Tabla_simbolos_configuracion.r_bonus, yycolumn,yyline,new String(yytext()));}
"meta"				{return new Symbol(Tabla_simbolos_configuracion.r_meta, yycolumn,yyline,new String(yytext()));}
">"					{return new Symbol(Tabla_simbolos_configuracion.cerrar_tag, yycolumn,yyline,new String(yytext()));}
"{"       			{return new Symbol(Tabla_simbolos_configuracion.llave_abrir, yycolumn,yyline,new String(yytext()));}
"="    				{return new Symbol(Tabla_simbolos_configuracion.s_igual, yycolumn,yyline,new String(yytext()));}
{atributo_nombre}   {return new Symbol(Tabla_simbolos_configuracion.atributo_nombre, yycolumn,yyline,new String(yytext()));}
";"					{return new Symbol(Tabla_simbolos_configuracion.s_punto_coma, yycolumn,yyline,new String(yytext()));}
"imagen"			{return new Symbol(Tabla_simbolos_configuracion.r_imagen, yycolumn,yyline,new String(yytext()));}
{descripcion}		{return new Symbol(Tabla_simbolos_configuracion.descripcion, yycolumn,yyline,new String(yytext()));}
{numero}			{return new Symbol(Tabla_simbolos_configuracion.numero, yycolumn,yyline,new String(yytext()));}
","					{return new Symbol(Tabla_simbolos_configuracion.s_coma, yycolumn,yyline,new String(yytext()));}
"}"					{return new Symbol(Tabla_simbolos_configuracion.llave_cerrar, yycolumn,yyline,new String(yytext()));}
{guion}				{return new Symbol(Tabla_simbolos_configuracion.s_guion, yycolumn,yyline,new String(yytext()));}


[ \t\r\f\n]+ 	{ /* Se ignoran */}  

/* CUAQUIER OTRO */ 
.         		{listar_error(new String(yytext()),yyline,yycolumn);
				/*return new Symbol(Tabla_simbolos_configuracion.error, yycolumn,yyline,new String(yytext()));*/} 	