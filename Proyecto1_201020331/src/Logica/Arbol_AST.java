package Logica;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cristian
 */
public class Arbol_AST {
    
    private static Map <String,Objeto> Tabla_objetos = new HashMap<String, Objeto>();

    public static Map<String, Objeto> getTabla_objetos() {
        return Tabla_objetos;
    }

    public static void setTabla_objetos(Map<String, Objeto> Tabla_objetos) {
        Arbol_AST.Tabla_objetos = Tabla_objetos;
    }

}//FIN DE LA CLASE ARBOL_AST
