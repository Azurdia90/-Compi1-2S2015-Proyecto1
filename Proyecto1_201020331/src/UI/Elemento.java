package UI;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Cristian
 */
public class Elemento {
    
    private String nombre;
    private Image imagen;
    private int pos_x;
    private int pos_x2;
    private int pos_y;
    private int pos_y2;
    
    public Elemento(){
        this.nombre = "";
        this.imagen = null;
        this.pos_x = 0;
        this.pos_x2 = -1;
        this.pos_y = 0;
        this.pos_y2 = -1;
    }
    
    public Elemento(String n, String path, int pos_x, int pos_x2, int pos_y, int pos_y2){
        this.nombre = n;
        this.imagen = new ImageIcon(path).getImage();
        this.pos_x = pos_x;
        this.pos_x2 = pos_x2;
        this.pos_y = pos_y;
        this.pos_y2 = pos_y2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        String path = imagen.substring(1, imagen.length()-1);
        this.imagen = new ImageIcon(path).getImage();
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_x2() {
        return pos_x2;
    }

    public void setPos_x2(int pos_x2) {
        this.pos_x2 = pos_x2;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public int getPos_y2() {
        return pos_y2;
    }

    public void setPos_y2(int pos_y2) {
        this.pos_y2 = pos_y2;
    }
    
}//FIN DE LA CLASE ELEMENTO
