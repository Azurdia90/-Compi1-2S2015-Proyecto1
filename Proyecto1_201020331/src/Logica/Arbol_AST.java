package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cristian
 */
public class Arbol_AST {
    
    private static Map <String,Objeto> Tabla_objetos = new HashMap<String, Objeto>();
    private static ArrayList<Error_encontrado> Lista_errores = new ArrayList<Error_encontrado>();
    private static ArrayList<Escenario> Lista_escenarios = new ArrayList<Escenario>();
    private static ArrayList<String> Orden_escenarios = new ArrayList<String>();

    public static Map<String, Objeto> getTabla_objetos() {
        return Tabla_objetos;
    }

    public static void setTabla_objetos(Map<String, Objeto> Tabla_objetos) {
        Arbol_AST.Tabla_objetos = Tabla_objetos;
    }

    public static ArrayList<Error_encontrado> getLista_errores() {
        return Lista_errores;
    }

    public static void setLista_errores(ArrayList<Error_encontrado> Lista_errores) {
        Arbol_AST.Lista_errores = Lista_errores;
    }

    public static ArrayList<Escenario> getLista_escenarios() {
        return Lista_escenarios;
    }

    public static void setLista_escenarios(ArrayList<Escenario> Lista_escenarios) {
        Arbol_AST.Lista_escenarios = Lista_escenarios;
    }

    public static ArrayList<String> getOrden_escenarios() {
        return Orden_escenarios;
    }

    public static void setOrden_escenarios(ArrayList<String> Orden_escenarios) {
        Arbol_AST.Orden_escenarios = Orden_escenarios;
    }

}//FIN DE LA CLASE ARBOL_AST
