
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JOptionPane;

public class VistaDocente extends javax.swing.JFrame {
    private DefaultListCellRenderer listRenderer1;
    private DefaultListCellRenderer listRenderer2;

    public VistaDocente() {
        initComponents();
        formulario();
        inicializarElementos1();
        inicializarElementos2();
    }
    
    private void formulario(){
        this.setTitle("Docente - Conversión");
        this.setLocationRelativeTo(null); //APARECE LA VENTANA CENTRADA
        this.setResizable(false); //EVITA QUE SE ESTIRE O CONTRAIGA LA VENANA
        this.getContentPane().setBackground(new Color(50, 168, 157)); //EL COLOR DE FONDO GENERAL
        this.setSize(new Dimension(370,350)); //AJUSTA EL TAMAÑO DE LA VENTANA(EJE X-HORIZONTAL; EJE Y-VERTICAL)
        this.panelConversion.setBackground(new Color(50, 168, 157)); //EL COLOR DE FONDO DEL PANEL CALCULAR
        this.txtValor.requestFocus();
    }
    
    private void inicializarElementos1(){
        listRenderer1 = new DefaultListCellRenderer();        
        listRenderer1.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        cboOrigen.setRenderer(listRenderer1);
        this.cboOrigen.addItem("Milímetro - mm");
        this.cboOrigen.addItem("Centímetro - cm");
        this.cboOrigen.addItem("Metro - m");
        this.cboOrigen.addItem("Kilometro - km");
    }
    
    private void inicializarElementos2(){
        listRenderer2 = new DefaultListCellRenderer();        
        listRenderer2.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        cboDestino.setRenderer(listRenderer2);
        this.cboDestino.addItem("Milímetro - mm");
        this.cboDestino.addItem("Centímetro - cm");
        this.cboDestino.addItem("Metro - m");
        this.cboDestino.addItem("Kilometro - km");
    }
    
    public String obtenerValor() {
        // Usamos trim() para eliminar espacios en blanco al inicio y final
        return this.txtValor.getText().trim(); 
    }
    
    public String obtenerOrigen() {
        // Extrae solo la unidad (ej: "Milímetro - mm" -> "Milímetro")
        String selected = (String) this.cboOrigen.getSelectedItem();
        return selected.split(" - ")[0].trim();
    }
    
    public String obtenerDestino() {
        // Extrae solo la unidad (ej: "Centímetro - cm" -> "Centímetro")
        String selected = (String) this.cboDestino.getSelectedItem();
        return selected.split(" - ")[0].trim();
    }
    
    public void setNombreDocente(String nombre) {
        this.lblNombreDocente.setText(nombre.toUpperCase());
    }
    
    public void setResultado(String resultado) {
        this.txtResultado.setText(resultado);
    }
    
    public void limpiarCampos(){
        this.txtValor.setText("");
        this.txtResultado.setText("");
        this.cboOrigen.setSelectedIndex(0); // Vuelve a seleccionar Origen
        this.cboDestino.setSelectedIndex(0); // Vuelve a seleccionar Destino
        this.txtValor.requestFocus();
    }
    
    // MÉTODO NUEVO: Para mostrar mensajes (siguiendo el patrón de la VistaLogin)
    public void mostrarMensaje(String mensaje, String titulo, int tipoMensaje) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, tipoMensaje);
    }
    
    public void agregarRealizarConversionListener (ActionListener listener){
        this.btnRealizarConversion.addActionListener(listener);        
    }
    
    public void agregarCerrarSesionListener (ActionListener listener){
        this.btnCerrarSesion.addActionListener(listener);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConversion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnRealizarConversion = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboDestino = new javax.swing.JComboBox<>();
        lblNombreDocente = new javax.swing.JLabel();
        cboOrigen = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Valor a Convertir:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Unidad de Origen:");

        btnRealizarConversion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRealizarConversion.setForeground(new java.awt.Color(50, 168, 157));
        btnRealizarConversion.setText("Realizar Conversión");

        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(50, 168, 157));
        btnCerrarSesion.setText("Cerrar Sesión");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Unidad Destino:");

        lblNombreDocente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreDocente.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Resultado:");

        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConversionLayout = new javax.swing.GroupLayout(panelConversion);
        panelConversion.setLayout(panelConversionLayout);
        panelConversionLayout.setHorizontalGroup(
            panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversionLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelConversionLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblNombreDocente))
                        .addGroup(panelConversionLayout.createSequentialGroup()
                            .addGroup(panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtValor)
                                .addComponent(cboOrigen, 0, 177, Short.MAX_VALUE)
                                .addComponent(cboDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelConversionLayout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(btnRealizarConversion))
                        .addGroup(panelConversionLayout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(btnCerrarSesion)))
                    .addGroup(panelConversionLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 111, Short.MAX_VALUE))
        );
        panelConversionLayout.setVerticalGroup(
            panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConversionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNombreDocente))
                .addGap(18, 18, 18)
                .addGroup(panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(btnRealizarConversion)
                .addGap(18, 18, 18)
                .addGroup(panelConversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelConversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnRealizarConversion;
    private javax.swing.JComboBox<String> cboDestino;
    private javax.swing.JComboBox<String> cboOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblNombreDocente;
    private javax.swing.JPanel panelConversion;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
