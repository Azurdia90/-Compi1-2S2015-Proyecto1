package Analizadores;

import	java_cup.runtime.Symbol;  



%%

%cupsym Tabla_simbolos  
%class Lexico           
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
descripcion = "\"" [^\"] ~"\""


%{
//codigo que se utilizara en el analizador lexico

%}

%%


/* PALABRAS RESERVADAS */ 

"<"    				{return new Symbol(Tabla_simbolos.abrir_tag, yycolumn,yyline,new String(yytext()));}
"configuracion"		{return new Symbol(Tabla_simbolos.r_configuracion, yycolumn,yyline,new String(yytext()));}
"fondo"				{return new Symbol(Tabla_simbolos.r_fondo, yycolumn,yyline,new String(yytext()));}
"nombre"      		{return new Symbol(Tabla_simbolos.r_nombre, yycolumn,yyline,new String(yytext()));}
"imagen"      		{return new Symbol(Tabla_simbolos.r_imagen, yycolumn,yyline,new String(yytext()));}
"figura"			{return new Symbol(Tabla_simbolos.r_figura, yycolumn,yyline,new String(yytext()));}
"vida" 				{return new Symbol(Tabla_simbolos.r_vida, yycolumn,yyline,new String(yytext()));}
"tipo"				{return new Symbol(Tabla_simbolos.r_tipo, yycolumn,yyline,new String(yytext()));}
"enemigo"			{return new Symbol(Tabla_simbolos.r_enemigo, yycolumn,yyline,new String(yytext()));}
"heroe"				{return new Symbol(Tabla_simbolos.r_heroe, yycolumn,yyline,new String(yytext()));}
"destruir"			{return new Symbol(Tabla_simbolos.r_destruir, yycolumn,yyline,new String(yytext()));}
"creditos"			{return new Symbol(Tabla_simbolos.r_creditos, yycolumn,yyline,new String(yytext()));}
"descripcion"		{return new Symbol(Tabla_simbolos.r_descripcion, yycolumn,yyline,new String(yytext()));}
"dise\u00f1o"		{return new Symbol(Tabla_simbolos.r_disenio, yycolumn,yyline,new String(yytext()));}
"arma"				{return new Symbol(Tabla_simbolos.r_arma, yycolumn,yyline,new String(yytext()));}
"bloque"			{return new Symbol(Tabla_simbolos.r_bloque, yycolumn,yyline,new String(yytext()));}
"bomba"				{return new Symbol(Tabla_simbolos.r_bomba, yycolumn,yyline,new String(yytext()));}
"bonus"				{return new Symbol(Tabla_simbolos.r_bonus, yycolumn,yyline,new String(yytext()));}
"meta"				{return new Symbol(Tabla_simbolos.r_meta, yycolumn,yyline,new String(yytext()));}
">"					{return new Symbol(Tabla_simbolos.cerrar_tag, yycolumn,yyline,new String(yytext()));}
"{"       			{return new Symbol(Tabla_simbolos.llave_abrir, yycolumn,yyline,new String(yytext()));}
"="    				{return new Symbol(Tabla_simbolos.s_igual, yycolumn,yyline,new String(yytext()));}
{atributo_nombre}   {return new Symbol(Tabla_simbolos.atributo_nombre, yycolumn,yyline,new String(yytext()));}
";"					{return new Symbol(Tabla_simbolos.s_punto_coma, yycolumn,yyline,new String(yytext()));}
"imagen"			{return new Symbol(Tabla_simbolos.r_imagen, yycolumn,yyline,new String(yytext()));}
"\""				{return new Symbol(Tabla_simbolos.s_comillas, yycolumn,yyline,new String(yytext()));}
{descripcion}		{return new Symbol(Tabla_simbolos.descripcion, yycolumn,yyline,new String(yytext()));}
{numero}			{return new Symbol(Tabla_simbolos.numero, yycolumn,yyline,new String(yytext()));}
","					{return new Symbol(Tabla_simbolos.s_coma, yycolumn,yyline,new String(yytext()));}
"}"					{return new Symbol(Tabla_simbolos.llave_cerrar, yycolumn,yyline,new String(yytext()));}
{guion}				{return new Symbol(Tabla_simbolos.s_guion, yycolumn,yyline,new String(yytext()));}


[ \t\r\f\n]+ 	{ /* Se ignoran */}  

/* CUAQUIER OTRO */ 
.         		{//listar_error(new String(yytext()),yyline,yycolumn);
				return new Symbol(Tabla_simbolos.error, yycolumn,yyline,new String(yytext()));} 	