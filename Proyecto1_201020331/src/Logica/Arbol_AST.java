package Logica;

import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class Arbol_AST {
    
    private static ArrayList<Objeto> lista_objetos;

    public static ArrayList<Objeto> getLista_objetos() {
        return lista_objetos;
    }

    public static void setLista_objetos(ArrayList<Objeto> lista_objetos) {
        Arbol_AST.lista_objetos = lista_objetos;
    }
    
    
}
