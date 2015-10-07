package Analizadores_escenario;

import Logica.Arbol_AST;
import Logica.Error_encontrado;
import	java_cup.runtime.Symbol;  
 
%%

%cupsym Tabla_simbolos_escenario
%class Lexico_escenario           
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
	Error_encontrado error_lexico = new Error_encontrado(t,"caracter no definido en el lenguaje", x, y, false);
	Arbol_AST.getLista_errores().add(error_lexico);
}

%}

%%


/* PALABRAS RESERVADAS */ 

"<"    				{return new Symbol(Tabla_simbolos_escenario.abrir_tag, yycolumn,yyline,new String(yytext()));}
"escenario"			{return new Symbol(Tabla_simbolos_escenario.r_escenario, yycolumn,yyline,new String(yytext()));}
"nombre"			{return new Symbol(Tabla_simbolos_escenario.r_nombre, yycolumn,yyline,new String(yytext()));}
"fondo"      		{return new Symbol(Tabla_simbolos_escenario.r_fondo, yycolumn,yyline,new String(yytext()));}
"ancho"      		{return new Symbol(Tabla_simbolos_escenario.r_ancho, yycolumn,yyline,new String(yytext()));}
"alto"				{return new Symbol(Tabla_simbolos_escenario.r_alto, yycolumn,yyline,new String(yytext()));}
"personajes" 		{return new Symbol(Tabla_simbolos_escenario.r_personajes, yycolumn,yyline,new String(yytext()));}
"heroes"			{return new Symbol(Tabla_simbolos_escenario.r_heroes, yycolumn,yyline,new String(yytext()));}
"villanos"			{return new Symbol(Tabla_simbolos_escenario.r_villanos, yycolumn,yyline,new String(yytext()));}
"paredes"			{return new Symbol(Tabla_simbolos_escenario.r_paredes, yycolumn,yyline,new String(yytext()));}
"suelo"				{return new Symbol(Tabla_simbolos_escenario.r_suelo, yycolumn,yyline,new String(yytext()));}
"extras"			{return new Symbol(Tabla_simbolos_escenario.r_extras, yycolumn,yyline,new String(yytext()));}
"armas"				{return new Symbol(Tabla_simbolos_escenario.r_armas, yycolumn,yyline,new String(yytext()));}
"bonus"				{return new Symbol(Tabla_simbolos_escenario.r_bonus, yycolumn,yyline,new String(yytext()));}
"meta"				{return new Symbol(Tabla_simbolos_escenario.r_meta, yycolumn,yyline,new String(yytext()));}
"="    				{return new Symbol(Tabla_simbolos_escenario.s_igual, yycolumn,yyline,new String(yytext()));}
";"					{return new Symbol(Tabla_simbolos_escenario.s_punto_coma, yycolumn,yyline,new String(yytext()));}
"/"					{return new Symbol(Tabla_simbolos_escenario.s_guion, yycolumn,yyline,new String(yytext()));}
">"					{return new Symbol(Tabla_simbolos_escenario.cerrar_tag, yycolumn,yyline,new String(yytext()));}
"("       			{return new Symbol(Tabla_simbolos_escenario.abrir_p, yycolumn,yyline,new String(yytext()));}
{atributo_nombre}   {return new Symbol(Tabla_simbolos_escenario.atributo_nombre, yycolumn,yyline,new String(yytext()));}
{numero}			{return new Symbol(Tabla_simbolos_escenario.numero, yycolumn,yyline,new String(yytext()));}
".."				{return new Symbol(Tabla_simbolos_escenario.s_dospuntos, yycolumn,yyline,new String(yytext()));}
","					{return new Symbol(Tabla_simbolos_escenario.s_coma, yycolumn,yyline,new String(yytext()));}
")"					{return new Symbol(Tabla_simbolos_escenario.cerrar_p, yycolumn,yyline,new String(yytext()));}



[ \t\r\f\n]+ 	{ /* Se ignoran */}  

/* CUAQUIER OTRO */ 
.         		{listar_error(new String(yytext()),yyline,yycolumn);
				/*return new Symbol(Tabla_simbolos_configuracion.error, yycolumn,yyline,new String(yytext()));*/} 	