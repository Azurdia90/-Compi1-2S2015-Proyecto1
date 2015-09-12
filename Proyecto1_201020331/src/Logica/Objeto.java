package Logica;

/**
 *
 * @author Cristian
 */
public class Objeto {
    
    //ATRIBUTOS DE LA CLASE OBJETO
    private String nombre;
    private String imagen;
    private int destruir;
    private int vida;
    private String tipo;
    private String descripcion;
    
    public Objeto(){
        this.nombre = "";
        this.imagen = "";
        this.destruir = 0;
        this.vida = 0;
        this.tipo = "";
        this.descripcion = "";
    }
    
    //METODO CONSTRUCTOR DE LA CLASE
    public Objeto(String n, String i, int v, String t, String d){
        this.nombre = n;
        this.imagen = i;
        this.tipo = t;
        if(this.tipo.equals("bonus") || this.tipo.equals("heroe")|| this.tipo.equals("enemigo")){
            this.vida = v;
        }else if(this.tipo.equals("arma")|| this.tipo.equals("bomba")){
            this.destruir = v;
        }else{
            this.destruir = 0;
        }
        this.descripcion = d;
    }//fin del metodo constructor
    
    //METODOS GETTER Y SETTER DE LA CLASE
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

    public int getDestruir() {
        return destruir;
    }

    public void setDestruir(int destruir) {
        this.destruir = destruir;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}//FIN DE LA CLASE OBJETO
