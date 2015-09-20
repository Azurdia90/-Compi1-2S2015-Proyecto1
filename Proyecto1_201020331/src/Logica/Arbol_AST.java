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
    
}//FIN DE LA CLASE ARBOL_AST
