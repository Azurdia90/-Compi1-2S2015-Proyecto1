package UI;

import Logica.Arbol_AST;
import Logica.Escenario;
import Logica.Posicion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class JPTablero extends JPanel implements Runnable {
    //Variables constantes
    private Escenario escenario;
    private final int  delay = 3;
    //variables de los elementos que se dibujaran
    private Image background;
    private Elemento heroe;
    private Elemento meta;
    private ArrayList<Elemento> armas;
    private ArrayList<Elemento> bombas;
    private ArrayList<Elemento> bonus;
    private ArrayList<Elemento> bloques;
    private ArrayList<Elemento> enemigos;
    //variables del tamaño del tablero
    private int width;
    private int height;
    /**********************METODO CONSTRUCTOR DE L TABLERO DE JUEGO*******************************/
    public JPTablero(Escenario escenario){
        this.escenario = escenario;
        this.width = escenario.getAncho();
        this.height = escenario.getLargo();
        this.setSize(width, height);
        this.setear_fondo(escenario.getFondo());
        this.iniciar_listas();
        this.setear_elementos();
        this.setDoubleBuffered(true);
    }
    
    public void iniciar_listas(){
        armas = new ArrayList<Elemento>();
        bombas = new ArrayList<Elemento>();
        bonus = new ArrayList<Elemento>();
        bloques = new ArrayList<Elemento>();
        enemigos = new ArrayList<Elemento>();
    }
    /**********************METODO PARA PODER MOSTRAR EN PANTALLA JAVA 2D********************************/
    public void paintComponent(Graphics g) {
	/* Obtenemos el tamaño del panel para hacer que se ajuste a este
	cada vez que redimensionemos la ventana y se lo pasamos al drawImage */
	int width = this.getSize().width;
	int height = this.getSize().height;
        int cont = 0;
	// Mandamos que pinte la imagen en el panel
	if (this.background != null) {
            g.drawImage(this.background, 0, 0, width, height, null);
            g.drawImage(this.heroe.getImagen(),heroe.getPos_x(),heroe.getPos_y(), 20, 25,null);
            //g.drawImage(this.meta.getImagen(),meta.getPos_x(),meta.getPos_y(),20,25,null);
            for(cont = 0; cont < enemigos.size();cont++){
                g.drawImage(this.enemigos.get(cont).getImagen(),enemigos.get(cont).getPos_x(),enemigos.get(cont).getPos_y(),20,25, null);
            }
            for(cont = 0; cont< armas.size(); cont++){
                g.drawImage(this.armas.get(cont).getImagen(),armas.get(cont).getPos_x(),armas.get(cont).getPos_y(),20,25,null);
            }
            for(cont=0; cont < bombas.size(); cont++){
                g.drawImage(this.bombas.get(cont).getImagen(),bombas.get(cont).getPos_x(),bombas.get(cont).getPos_y(),20,25,null);
            }
            for(cont=0; cont < bonus.size(); cont++){
                g.drawImage(this.bonus.get(cont).getImagen(),bonus.get(cont).getPos_x(),bonus.get(cont).getPos_y(),20,25,null);
            }
	}
	super.paintComponent(g);
    }//FIN DEL METODO PARA GRAFICAR
    /**************************METODO PARA MANEJAR EL FONDO*************************************/
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
    }//FIN DEL METODO DE SETEO DEL FONDO DEL JUEGO
    
    /**************METODO QUE CARGARA TODOS LOS OBJETOS DEL TIPO ELEMENTO********************/
    public void setear_elementos(){
        int cont = 0;
        for(cont = 0; cont<escenario.getLista_posicion().size(); cont++){
            String tipo = buscar_tipo(escenario.getLista_posicion().get(cont).getNombre());
            if(tipo.equals("heroe")){
                setear_heroe(escenario.getLista_posicion().get(cont));
            }else if(tipo.equals("meta")){
                setear_meta(escenario.getLista_posicion().get(cont));
            }else if(tipo.equals("arma")){
                Elemento arma = setear_enemigos(escenario.getLista_posicion().get(cont));
                armas.add(arma);
            }else if(tipo.equals("bomba")){
                Elemento bomba = setear_bombas(escenario.getLista_posicion().get(cont));
                bombas.add(bomba);
            }else if(tipo.equals("bonus")){
                Elemento bono = setear_bombas(escenario.getLista_posicion().get(cont));
                bonus.add(bono);
            }else if(tipo.equals("bloque")){
                Elemento bloque = setear_bloques(escenario.getLista_posicion().get(cont));
                bloques.add(bloque);
            }else if(tipo.equals("enemigo")){
                Elemento enemigo = setear_enemigos(escenario.getLista_posicion().get(cont));
                enemigos.add(enemigo);
            }
        }//fin del recorrido de los elementos de la lista de posiciones
    }//fin del metodo de seteo de elementos
    
    public String buscar_tipo(String nombre){
        String tipo = "";
        tipo = Arbol_AST.getTabla_objetos().get(nombre).getTipo();
        return tipo;
    }
    /**********************METODOS PARA EL MANEJO DEL HEROE*****************************/

    public void setear_heroe(Posicion posicion){
           heroe  = new Elemento();
           heroe.setNombre(posicion.getNombre());
           heroe.setImagen(Arbol_AST.getTabla_objetos().get(heroe.getNombre()).getImagen());
           heroe.setPos_x(posicion.getX_ini());
           heroe.setPos_y(posicion.getY_ini());

    }//FIN DEL METODO DEL SETEO DEL OBJETO ELEMENTO 
    
    /********************METODOS PARA EL MANEJO DE META******************************/
    
    public void setear_meta(Posicion posicion){
        meta = new Elemento();
        meta.setNombre(posicion.getNombre());
        meta.setImagen(Arbol_AST.getTabla_objetos().get(meta.getNombre()).getImagen());
        meta.setPos_x(posicion.getX_ini());
        meta.setPos_y(posicion.getY_ini());
    }
    
    /********************METODOS PARA EL MANEJO DE ENEMIGOS**************************/
    
    public Elemento setear_enemigos(Posicion posicion){
        Elemento enemigo = new Elemento();
        enemigo.setNombre(posicion.getNombre());
        enemigo.setImagen(Arbol_AST.getTabla_objetos().get(enemigo.getNombre()).getImagen());
        enemigo.setPos_x(posicion.getX_ini());
        enemigo.setPos_y(posicion.getY_ini());
        return enemigo;
    }
    /***********************METODOS PARA EL MANEJO DE ARMAS************************/
    public Elemento setear_armas(Posicion posicion){
        Elemento arma = new Elemento();
        arma.setNombre(posicion.getNombre());
        arma.setImagen(Arbol_AST.getTabla_objetos().get(arma.getNombre()).getImagen());
        arma.setPos_x(posicion.getX_ini());
        arma.setPos_y(posicion.getY_ini());
        return arma;
    }
    /**********************METODOS PARA EL MANEJO DE BOMBAS***************************/
    public Elemento setear_bombas(Posicion posicion){
        Elemento bomba = new Elemento();
        bomba.setNombre(posicion.getNombre());
        bomba.setImagen(Arbol_AST.getTabla_objetos().get(bomba.getNombre()).getImagen());
        bomba.setPos_x(posicion.getX_ini());
        bomba.setPos_y(posicion.getY_ini());
        return bomba;
    }
    
    /********************METODOS PARA EL MANEJO DE BLOQUES***************************/
    public Elemento setear_bloques(Posicion posicion){
        Elemento bloque = new Elemento();
        bloque.setNombre(posicion.getNombre());
        bloque.setImagen(Arbol_AST.getTabla_objetos().get(bloque.getNombre()).getImagen());
        bloque.setPos_x(posicion.getX_ini());
        bloque.setPos_x2(posicion.getX_fin());
        bloque.setPos_y(posicion.getY_ini());
        bloque.setPos_y2(posicion.getY_fin());
        return bloque;
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
