package UI;

import Logica.Arbol_AST;
import Logica.Escenario;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class JPTablero extends JPanel implements Runnable {
    
    private Escenario escenario;
    private final int  delay = 3;
    
    private Image background;
    private Image sprite_heroe;
    private Elemento heroe;
    
    private int width;
    private int height;
    
    public JPTablero(Escenario escenario){
        this.escenario = escenario;
        this.width = escenario.getAncho();
        this.height = escenario.getLargo();
        this.setSize(width, height);
        this.setear_fondo(escenario.getFondo());
        this.setear_heroe();
        this.setDoubleBuffered(true);
    }
    
    public void paintComponent(Graphics g) {
	/* Obtenemos el tamaño del panel para hacer que se ajuste a este
	cada vez que redimensionemos la ventana y se lo pasamos al drawImage */
	int width = this.getSize().width;
	int height = this.getSize().height;
	// Mandamos que pinte la imagen en el panel
	if (this.background != null) {
            g.drawImage(this.background, 0, 0, width, height, null);
	}
	super.paintComponent(g);
    }
    
    public void setear_fondo(String path_fondo){
        if(!path_fondo.equals("")){
            this.setOpaque(false);
            String f = Arbol_AST.getTabla_objetos().get(path_fondo).getImagen();
            String fondo = f.substring(1,f.length()-1);
            background = new ImageIcon(fondo).getImage();
            repaint();
        }else{
            this.setBackground(Color.GREEN); 
            repaint();
        }
    }
    
    public void setear_heroe(){
        int cont = 0;
        for(cont = 0; cont< escenario.getLista_posicion().size(); cont++){

        }
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
