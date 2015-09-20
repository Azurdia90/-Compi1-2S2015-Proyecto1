package UI;

import Logica.Arbol_AST;
import Logica.Objeto;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
/**
 *
 * @author Cristian
 */
public class jFTabla_simbolos extends javax.swing.JFrame {
    
    private int dimension_y = 0;
    
    public jFTabla_simbolos() {
        initComponents();
        dimension_y = Arbol_AST.getTabla_objetos().size();
        if(dimension_y > 0){
            setear_encabezados();
            crear_matriz_visual();
        }else{
            setear_encabezados();
            crear_matriz_visual_vacia();
        }
    }
    
    public void crear_matriz_visual(){
        int cont1 = 200;
        int cont2 = 200;
        for (Objeto value: Arbol_AST.getTabla_objetos().values()) {
            crear_columna_imagen(value,cont1);
            cont1 = cont1 + 200;
            crear_columna_descripcion(value,cont2);
            cont2 = cont2 + 200;
        }
    }
    
    public void crear_columna_imagen(Objeto valor, int pos){
        JLabel imagen = new JLabel();
        if(!valor.getImagen().equals("")){
            imagen.setBounds(100, pos, 200, 200);
            ImageIcon objeto = new ImageIcon(valor.getImagen());
            Icon icono = new ImageIcon(objeto.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
            imagen.setIcon(icono);
        }else{
            imagen.setBounds(100, pos, 200, 200);
            imagen.setBackground(Color.WHITE);
            imagen.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            imagen.setText("Imagen no disponible");
            imagen.setHorizontalAlignment(SwingConstants.CENTER);
            imagen.setVerticalAlignment(SwingConstants.CENTER);
            imagen.setOpaque(true);
            imagen.setVisible(true);
        }
        jPTabla.add(imagen);
    }
    
    public void crear_columna_descripcion(Objeto valor, int pos){
        JLabel caracteristica = new JLabel();
        caracteristica.setBounds(300,pos,300,200);
        caracteristica.setBackground(Color.WHITE);
        caracteristica.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        caracteristica.setText("<html>Nombe: "+valor.getNombre() +"<br>"+"Tipo: "+ 
                valor.getTipo() + "<br>"+"Vida: "+valor.getVida() +"<br>"+
                "Destruir: "+valor.getDestruir() +"<br>"+"Creditos: "+ 
                valor.getCreditos() +"<br>"+"Descripcion: "+ valor.getDescripcion()+
                "</html>");
        caracteristica.setOpaque(true);
        caracteristica.setVisible(true);
        jPTabla.add(caracteristica);
    }
    
    public void crear_matriz_visual_vacia(){
        JLabel espacio1 = new JLabel();
        JLabel espacio2 = new JLabel();
        espacio1.setBounds(100,200,200,100);
        espacio1.setBackground(Color.WHITE);
        espacio1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        espacio1.setVisible(true);
        espacio1.setOpaque(true);
        espacio1.setText("Información no disponible");
        espacio1.setHorizontalAlignment(SwingConstants.CENTER);
        espacio1.setVerticalAlignment(SwingConstants.CENTER);
        jPTabla.add(espacio1);
        espacio2.setBounds(300,200,300,100);
        espacio2.setBackground(Color.WHITE);
        espacio2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        espacio2.setVisible(true);
        espacio2.setOpaque(true);
        espacio2.setText("Información no disponible");
        espacio2.setHorizontalAlignment(SwingConstants.CENTER);
        espacio2.setVerticalAlignment(SwingConstants.CENTER);
        jPTabla.add(espacio2);
    }
    public void setear_encabezados(){
        JLabel encabezado1;
        JLabel encabezado2;
        encabezado1 = new JLabel();
        encabezado2 = new JLabel();
        encabezado1.setBounds(100,100,200,100);
        encabezado1.setBackground(Color.LIGHT_GRAY);
        encabezado1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        encabezado1.setVisible(true);
        encabezado1.setOpaque(true);
        encabezado1.setText("Imagen");
        encabezado1.setHorizontalAlignment(SwingConstants.CENTER);
        encabezado1.setVerticalAlignment(SwingConstants.CENTER);
        jPTabla.add(encabezado1);
        encabezado2.setBounds(300,100,300,100);
        encabezado2.setBackground(Color.LIGHT_GRAY);
        encabezado2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        encabezado2.setVisible(true);
        encabezado2.setOpaque(true);
        encabezado2.setText("Caracteristicas");
        encabezado2.setHorizontalAlignment(SwingConstants.CENTER);
        encabezado2.setVerticalAlignment(SwingConstants.CENTER);
        jPTabla.add(encabezado2);
    }//FIN DEL METODO QUE DA VALORES A LOS ENCABEZADOS

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTabla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPTabla.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("TABLA DE SIMBOLOS");

        javax.swing.GroupLayout jPTablaLayout = new javax.swing.GroupLayout(jPTabla);
        jPTabla.setLayout(jPTablaLayout);
        jPTablaLayout.setHorizontalGroup(
            jPTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTablaLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPTablaLayout.setVerticalGroup(
            jPTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(456, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPTabla;
    // End of variables declaration//GEN-END:variables
}
