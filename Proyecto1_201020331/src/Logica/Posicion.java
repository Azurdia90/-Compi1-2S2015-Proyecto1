package Logica;

/**
 *
 * @author Cristian
 */
public class Posicion {

    private String nombre;
    private int x_ini;
    private int x_fin;
    private int y_ini;
    private int y_fin;
    private String nivel;
    
    public Posicion(){
        this.nombre = "";
        this.x_ini = -1;
        this.x_fin = -1;
        this.y_ini = -1;
        this.y_fin = -1;
        //this.nivel = "";
    }
    //CONSTRUCTOR DE LA CLASE POSICION
    public Posicion(String n,int x1, int x2, int y1, int y2){
        this.nombre = n;
        this.x_ini = x1;
        this.x_fin = x2;
        this.y_ini = y1;
        this.y_fin = y2;
        //this.nivel = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX_ini() {
        return x_ini;
    }

    public void setX_ini(int x_ini) {
        this.x_ini = x_ini;
    }

    public int getX_fin() {
        return x_fin;
    }

    public void setX_fin(int x_fin) {
        this.x_fin = x_fin;
    }

    public int getY_ini() {
        return y_ini;
    }

    public void setY_ini(int y_ini) {
        this.y_ini = y_ini;
    }

    public int getY_fin() {
        return y_fin;
    }

    public void setY_fin(int y_fin) {
        this.y_fin = y_fin;
    }

    /*public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }*/
      
}//FIN DE LA CLASE QUE ALMACENARA LAS POSICIONES DE LOS OBJETOS;
