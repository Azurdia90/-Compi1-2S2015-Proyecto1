package Logica;

/**
 *
 * @author Cristian
 */
public class Fondo {
    
    private String nombre;
    private String path;
    
    public Fondo(){
        this.nombre = "";
        this.path = "";
    }
    
    //CONSTRUCTOR DE LA CLASE
    public Fondo(String n, String p){
        this.nombre = n;
        this.path = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}//FIN DE LA CLASE DE FONDO
