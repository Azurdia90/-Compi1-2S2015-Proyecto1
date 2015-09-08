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
letra = [A-Za-z]
guion = [/\\]
unidad_disco  = {letra}":"
atributo_nombre = {letra}({letra}|{numero}|"_")*
path = {unidad_disco}({guion}{atributo_nombre})+"."("conf"|"jpg"|"gif")
%{
//codigo que se utilizara en el analizador lexico

%}

%%


/* PALABRAS RESERVADAS */ 

"<"    				{return new Symbol(Tabla_simbolos.tag_abrir, yycolumn,yyline,new String(yytext()));}
"configuracion"		{return new Symbol(Tabla_simbolos.r_configurar, yycolumn,yyline,new String(yytext()));}
"figura"			{return new Symbol(Tabla_simbolos.r_figura, yycolumn,yyline,new String(yytext()));}
"nombre"      		{return new Symbol(Tabla_simbolos.r_nombre, yycolumn,yyline,new String(yytext()));}
"vida" 				{return new Symbol(Tabla_simbolos.r_vida, yycolumn,yyline,new String(yytext()));}
"tipo"				{return new Symbol(Tabla_simbolos.r_tipo, yycolumn,yyline,new String(yytext()));}
"arma"				{return new Symbol(Tabla_simbolos.r_arma, yycolumn,yyline,new String(yytext()));}
"bloque"			{return new Symbol(Tabla_simbolos.r_bloque, yycolumn,yyline,new String(yytext()));}
"bomba"				{return new Symbol(Tabla_simbolos.r_bomba, yycolumn,yyline,new String(yytext()));}
"bonus"				{return new Symbol(Tabla_simbolos.r_bonus, yycolumn,yyline,new String(yytext()));}
"enemigo"			{return new Symbol(Tabla_simbolos.r_enemigo, yycolumn,yyline,new String(yytext()));}
"heroe"				{return new Symbol(Tabla_simbolos.r_heroe, yycolumn,yyline,new String(yytext()));}
"meta"				{return new Symbol(Tabla_simbolos.r_meta, yycolumn,yyline,new String(yytext()));}
"destruir"			{return new Symbol(Tabla_simbolos.r_destruir, yycolumn,yyline,new String(yytext()));}
">"					{return new Symbol(Tabla_simbolos.tag_cerrar, yycolumn,yyline,new String(yytext()));}
"{"       			{return new Symbol(Tabla_simbolos.llave_abrir, yycolumn,yyline,new String(yytext()));}
"="    				{return new Symbol(Tabla_simbolos.s_igual, yycolumn,yyline,new String(yytext()));}
{atributo_nombre}   {return new Symbol(Tabla_simbolos.atributo_nombre, yycolumn,yyline,new String(yytext()));}
";"					{return new Symbol(Tabla_simbolos.s_punto_coma, yycolumn,yyline,new String(yytext()));}
"imagen"			{return new Symbol(Tabla_simbolos.r_imagen, yycolumn,yyline,new String(yytext()));}
"\""				{return new Symbol(Tabla_simbolos.s_comilla_doble, yycolumn,yyline,new String(yytext()));}
{path}				{return new Symbol(Tabla_simbolos.path, yycolumn,yyline,new String(yytext()));}
{numero}			{return new Symbol(Tabla_simbolos.entero, yycolumn,yyline,new String(yytext()));}
","					{return new Symbol(Tabla_simbolos.s_coma, yycolumn,yyline,new String(yytext()));}
"}"					{return new Symbol(Tabla_simbolos.llave_cerrar, yycolumn,yyline,new String(yytext()));}
{guion}				{return new Symbol(Tabla_simbolos.s_guion, yycolumn,yyline,new String(yytext()));}


[ \t\r\f\n]+ 	{ /* Se ignoran */}  

/* CUAQUIER OTRO */ 
.         		{//listar_error(new String(yytext()),yyline,yycolumn);
				return new Symbol(Tabla_simbolos.error, yycolumn,yyline,new String(yytext()));} 	