
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

public class VistaFiguras extends javax.swing.JFrame {

    public VistaFiguras() {
        initComponents();
        formulario();
    }
    
    public void formulario(){
        this.setTitle("Área y Perímetro - Figuras");
        this.setLocationRelativeTo(null); //APARECE LA VENTANA CENTRADA
        this.setResizable(false); //EVITA QUE SE ESTIRE O CONTRAIGA LA VENANA
        this.getContentPane().setBackground(new Color(246, 240, 255)); //EL COLOR DE FONDO GENERAL
        this.setSize(new Dimension(470,170)); //AJUSTA EL TAMAÑO DE LA VENTANA(EJE X-HORIZONTAL; EJE Y-VERTICAL)
        this.panelSeleccion.setBackground(new Color(246, 240, 255)); //EL COLOR DE FONDO DEL PANEL CALCULAR        
    }
    
    public void agregarCuadradoListener (ActionListener listener){
        this.btnCuadrado.addActionListener(listener);        
    }
    
    public void agregarRectanguloListener (ActionListener listener){
        this.btnRectangulo.addActionListener(listener);        
    }
    
    public void agregarCirculoListener (ActionListener listener){
        this.btnCirculo.addActionListener(listener);        
    } 
    
    public void agregarTrianguloListener (ActionListener listener){
        this.btnTriangulo.addActionListener(listener);        
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSeleccion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCuadrado = new javax.swing.JButton();
        btnRectangulo = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione una Figura:");

        btnCuadrado.setText("Cuadrado");

        btnRectangulo.setText("Rectángulo");

        btnCirculo.setText("Círculo");

        btnTriangulo.setText("Triángulo");

        javax.swing.GroupLayout panelSeleccionLayout = new javax.swing.GroupLayout(panelSeleccion);
        panelSeleccion.setLayout(panelSeleccionLayout);
        panelSeleccionLayout.setHorizontalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSeleccionLayout.createSequentialGroup()
                        .addComponent(btnCuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRectangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCirculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTriangulo))
                    .addComponent(jLabel1))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelSeleccionLayout.setVerticalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuadrado)
                    .addComponent(btnRectangulo)
                    .addComponent(btnCirculo)
                    .addComponent(btnTriangulo))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(228, 228, 228))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelSeleccion;
    // End of variables declaration//GEN-END:variables
}
