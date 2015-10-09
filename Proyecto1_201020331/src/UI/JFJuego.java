package UI;

import Logica.Escenario;
import javax.swing.JFrame;

/**
 *
 * @author Cristian
 */
public class JFJuego extends JFrame{
    
    public JFJuego(Escenario escenario){
        this.setTitle(escenario.getNombre());
        this.setSize(escenario.getAncho(), escenario.getLargo());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(new JPTablero(escenario));
        this.setVisible(true);
    }
    
}
