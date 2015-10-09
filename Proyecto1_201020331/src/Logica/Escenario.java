package Logica;

import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class Escenario {

    private String nombre;
    private String fondo;
    private int largo;
    private int ancho;
    private ArrayList<Posicion> lista_posicion;
    
    public Escenario(){
        this.nombre = "";
        this.fondo = "";
        this.largo = 0;
        this.ancho = 0;
        this.lista_posicion = new ArrayList<Posicion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public ArrayList<Posicion> getLista_posicion() {
        return lista_posicion;
    }

    public void setLista_posicion(ArrayList<Posicion> lista_posicion) {
        this.lista_posicion = lista_posicion;
    }
    
}//FIN DE LA CLASE ESCENARIOS
