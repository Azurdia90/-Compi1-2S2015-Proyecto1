package Logica;

/**
 *
 * @author Cristian
 */
public class Figura {
    
    private String nombre;
    private String imagen;
    private int vida;
    private int destruir;
    private boolean tipo;
    private String descripcion;
    
    public Figura(){
        this.nombre = "";
        this.imagen = "";
        this.vida = 0;
        this.destruir = 0;
        this.tipo = false;
        descripcion = "";
    }
    //CONSTRUCTOR DE LA CLASE SI ES ENEMIGO ES 0 SI ES HEROE 1
    public Figura(String n, String i, int v, boolean b, String d){       
        this.nombre = n;
        this.imagen = i;
        if (b == false){
            this.destruir = v;
            this. vida = 0;
        }else{
            this.vida = v;
            this.destruir = 0;
        }
        this.tipo = true;
        this.descripcion = d;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDestruir() {
        return destruir;
    }

    public void setDestruir(int destruir) {
        this.destruir = destruir;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}//FIN DE LA CLASE FIGURA
