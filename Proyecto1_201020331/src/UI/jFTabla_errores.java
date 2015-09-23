/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Logica.Arbol_AST;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian
 */
public class jFTabla_errores extends javax.swing.JFrame {
    
    private DefaultTableModel tabla_modelo;
    private String[] encabezado;
    private String[][] datos ;
    private DefaultTableModel dtm;
    private int filas = 0;
    private final Integer columnas = 6;
    /**
     * Creates new form jFTabla_errores
     */
    public jFTabla_errores() {
        initComponents();
        encabezado = new String[columnas];
        filas = Arbol_AST.getLista_errores().size();
        datos = new String[filas][columnas];
        setear_encabezados();
        mostrar_errores();
    }
    
    public void setear_encabezados(){
        encabezado[0] = "Archivo";
        encabezado[1] = "Tipo";
        encabezado[2] = "Lexema";
        encabezado[3] = "Descripción";
        encabezado[4] = "Posición en x";
        encabezado[5] = "Posición en y";
        setear_contenido();
    }
    
    public void setear_contenido(){
        int x =0;
        int y = 0;
        int pos = 0;
        for(y=0;y<filas;y++){
            for(x=0;x<columnas;x++){
                switch(x){
                    case 0:
                        datos[y][x] = Arbol_AST.getLista_errores().get(pos).getArchivo();
                        break;
                    case 1:
                        if(Arbol_AST.getLista_errores().get(pos).isTipo() == true){
                            datos[y][x] = "Error Sintactico";
                        }else{
                            datos[y][x] = "Error Lexico";
                        }
                        break;
                    case 2:
                        datos[y][x] = Arbol_AST.getLista_errores().get(pos).getCadena();
                        break;
                    case 3:
                        datos[y][x] = Arbol_AST.getLista_errores().get(pos).getDescripcion();
                        break;
                    case 4:
                        datos[y][x] = Integer.toString(Arbol_AST.getLista_errores().get(pos).getPosx());
                        break;
                    case 5:
                        datos[y][x] = Integer.toString(Arbol_AST.getLista_errores().get(pos).getPosy());
                        break;
                }//fin del case de las columnas
            }//fin del contador para las columnas
            pos = pos + pos;
        }//fin del contador para las filas
    }//fin del metodo para agregar contenido
    
    public void mostrar_errores(){
        if(!Arbol_AST.getLista_errores().isEmpty()){
           dtm = new DefaultTableModel(datos,encabezado);
           jTabla_error.setModel(dtm);
        }else{
           dtm = new DefaultTableModel(datos,encabezado);
           jTabla_error.setModel(dtm);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla_error = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("TABLA DE ERRORES");

        jTabla_error.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla_error);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla_error;
    // End of variables declaration//GEN-END:variables
}
