package Logica;

/**
 *
 * @author Cristian
 */
public class Error_encontrado {
    
    private String cadena;
    private String archivo;
    private String descripcion;
    private int posx;
    private int posy;
    private boolean tipo;
    
    public Error_encontrado(){
        this.archivo = "";
        this.cadena = "";
        this.descripcion = "";
        this.posx = 0;
        this.posy = 0;
        this.tipo = false;
    }
    
    public Error_encontrado(String a,String c,String d, int x, int y, boolean t){
        this.archivo = a;
        this.cadena = c;
        this.descripcion = d;
        this.posx = x;
        this.posy = y;
        this.tipo = t;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

}//FIN DE LA CLASE DE ERRORES
