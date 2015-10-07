package Logica;

import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class Escenario {

    private String nombre;
    private ArrayList<Posicion> lista_posicion;
    
    public Escenario(){
        this.nombre = "";
        this.lista_posicion = new ArrayList<Posicion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Posicion> getLista_posicion() {
        return lista_posicion;
    }

    public void setLista_posicion(ArrayList<Posicion> lista_posicion) {
        this.lista_posicion = lista_posicion;
    }
    
    
}//FIN DE LA CLASE ESCENARIOS
