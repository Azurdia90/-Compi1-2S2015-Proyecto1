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
    private int creditos;
    private int vida;
    private String tipo;
    private String descripcion;
    
    public Objeto(){
        this.nombre = "";
        this.imagen = "";
        this.destruir = 0;
        this.vida = 0;
        this.creditos = 0;
        this.tipo = "";
        this.descripcion = "";
    }
    
    //METODO CONSTRUCTOR DE LA CLASE
    public Objeto(String n, String i, int v, int ds, String t, String d){
        this.nombre = n;
        this.imagen = i;
        this.tipo = t;
        if(this.tipo.equals("heroe")){
            this.vida = v;
            this.destruir = 0;
            this.creditos = 0;
            this.descripcion = d;
        }else if(this.tipo.equals("enemigo")){
            this.vida = v;
            this.destruir = ds;
            this.creditos = 0;
            this.descripcion = d;
        }else if(this.tipo.equals("fondo")){
            this.vida = 0;
            this.destruir = 0;
            this.creditos = 0;
            this.descripcion = "";      
        }else if(this.tipo.equals("bomba")|| this.tipo.equals("arma")){
            this.vida = 0;
            this.destruir = ds;
            this.creditos = 0;
            this.descripcion = "";
        }else if(this.tipo.equals("bloque")||this.tipo.equals("meta")){
            this.vida = 0;
            this.destruir = 0;
            this.creditos = 0;
            this. descripcion = "";
        }else if(this.tipo.equals("bonus")){
            this.vida = 0;
            this.destruir = 0;
            this.creditos = v;
            this.descripcion ="";
        }
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
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
