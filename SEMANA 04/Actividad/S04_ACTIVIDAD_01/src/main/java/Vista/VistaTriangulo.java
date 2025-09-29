
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class VistaTriangulo extends javax.swing.JFrame {

    public VistaTriangulo() {
        initComponents();
        formulario();
    }
    
    private void formulario(){
        this.setTitle("Área y Perímetro - Triángulo");
        this.setLocationRelativeTo(null); //APARECE LA VENTANA CENTRADA
        this.setResizable(false); //EVITA QUE SE ESTIRE O CONTRAIGA LA VENANA
        this.getContentPane().setBackground(new Color(246, 240, 255)); //EL COLOR DE FONDO GENERAL
        this.setSize(new Dimension(370,215)); //AJUSTA EL TAMAÑO DE LA VENTANA(EJE X-HORIZONTAL; EJE Y-VERTICAL)
        this.panelIngreso.setBackground(new Color(246, 240, 255)); //EL COLOR DE FONDO DEL PANEL CALCULAR
        this.panelOperaciones.setBackground(new Color(246, 240, 255)); //EL COLOR DE FONDO DEL PANEL DATOS
        this.panelResultado.setBackground(new Color(246, 240, 255)); //EL COLOR DE FONDO DEL PANEL DATOS
        this.txtLado1.requestFocus();
    }
    
    public void valIniciales(){
        this.panelIngreso.setVisible(true);
        this.panelOperaciones.setVisible(true);
        this.panelResultado.setVisible(true);
        this.btnCalcular.setEnabled(false);
        this.btnNuevo.setEnabled(false);
        this.btnSalir.setEnabled(true);
    }
    
    public void valCalcular(){
        this.panelIngreso.setVisible(true);
        this.panelOperaciones.setVisible(true);
        this.panelResultado.setVisible(true);
        this.btnCalcular.setEnabled(false);
        this.btnNuevo.setEnabled(true);
        this.btnSalir.setEnabled(true);
        this.txtLado1.setEnabled(false);
        this.txtLado2.setEnabled(false);
        this.txtLado3.setEnabled(false);
    }
    
    public void valNuevo(){
        this.panelIngreso.setVisible(true);
        this.panelOperaciones.setVisible(true);
        this.panelResultado.setVisible(true);        
        this.btnCalcular.setEnabled(false);
        this.btnNuevo.setEnabled(false);
        this.btnSalir.setEnabled(true);
        this.txtLado1.setEnabled(true);
        this.txtLado2.setEnabled(true);
        this.txtLado3.setEnabled(true);
    }
    
    public double obtenerLado1(){
        try {
            String texto = this.txtLado1.getText().trim();
            if (texto.isEmpty()) {
                return Double.NaN; // Retorna NaN si está vacío
            }
            return Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            return Double.NaN; // Retorna NaN si no es un número válido
        }
    }

    public double obtenerLado2(){
        try {
            String texto = this.txtLado2.getText().trim();
            if (texto.isEmpty()) {
                return Double.NaN; // Retorna NaN si está vacío
            }
            return Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            return Double.NaN; // Retorna NaN si no es un número válido
        }
    }

    public double obtenerLado3(){
        try {
            String texto = this.txtLado3.getText().trim();
            if (texto.isEmpty()) {
                return Double.NaN; // Retorna NaN si está vacío
            }
            return Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            return Double.NaN; // Retorna NaN si no es un número válido
        }
    }
    
    public void mostrarResultados(double area, double perimetro){
        this.txtResultado.setText("\tResultados");
        this.txtResultado.append("\n\t-------------");
        this.txtResultado.append("\n\tÁrea: "+String.format("%.2f", area));
        this.txtResultado.append("\n\tPerímetro: "+String.format("%.2f", perimetro));               
    }
    
    public void limpiarCampos(){
        this.txtLado1.setText("");
        this.txtLado2.setText("");
        this.txtLado3.setText("");
        this.txtResultado.setText("");
        this.txtLado1.requestFocus();
    }    
    
    public void agregarCalcularListener (ActionListener listener){
        this.btnCalcular.addActionListener(listener);        
    }
    
    public void agregarNuevoListener (ActionListener listener){
        this.btnNuevo.addActionListener(listener);        
    }
    
    public void agregarSalirListener (ActionListener listener){
        this.btnSalir.addActionListener(listener);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIngreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLado2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLado3 = new javax.swing.JTextField();
        panelOperaciones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelResultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Ingrese Lado 1:");

        txtLado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLado1ActionPerformed(evt);
            }
        });
        txtLado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLado1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLado1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Ingrese Lado 2:");

        txtLado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLado2ActionPerformed(evt);
            }
        });
        txtLado2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLado2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLado2KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Ingrese Lado 3:");

        txtLado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLado3ActionPerformed(evt);
            }
        });
        txtLado3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLado3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLado3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoLayout = new javax.swing.GroupLayout(panelIngreso);
        panelIngreso.setLayout(panelIngresoLayout);
        panelIngresoLayout.setHorizontalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );
        panelIngresoLayout.setVerticalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnCalcular.setBackground(new java.awt.Color(51, 154, 204));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setMnemonic('C');
        btnCalcular.setText("Calcular");
        btnCalcular.setToolTipText("Clic para calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 215, 143));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setMnemonic('N');
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("Clic para nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 146, 153));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setMnemonic('S');
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Clic para salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Operaciones");

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelOperacionesLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperacionesLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnNuevo)
                    .addComponent(btnSalir))
                .addGap(37, 37, 37))
        );

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(51, 51, 255));
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLado1ActionPerformed
        // TODO add your handling code here:
        this.btnCalcular.doClick();
        this.txtLado1.setText("");
        this.txtLado1.requestFocus();
        this.btnCalcular.setEnabled(false);
        this.btnNuevo.setEnabled(true);
    }//GEN-LAST:event_txtLado1ActionPerformed

    private void txtLado1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLado1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcular.doClick();
        }
    }//GEN-LAST:event_txtLado1KeyPressed

    private void txtLado1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLado1KeyTyped
        // TODO add your handling code here:
        this.btnCalcular.setEnabled(true);
        char keyChar = evt.getKeyChar();

        if (!Character.isDigit(keyChar) && keyChar != '.') {
            evt.consume();
        }

        if (keyChar == '.' && txtLado1.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLado1KeyTyped

    private void txtLado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLado2ActionPerformed
        // TODO add your handling code here:
        this.btnCalcular.doClick();
        this.txtLado2.setText("");
        this.txtLado2.requestFocus();
        this.btnCalcular.setEnabled(false);
        this.btnNuevo.setEnabled(true);
    }//GEN-LAST:event_txtLado2ActionPerformed

    private void txtLado2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLado2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcular.doClick();
        }
    }//GEN-LAST:event_txtLado2KeyPressed

    private void txtLado2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLado2KeyTyped
        // TODO add your handling code here:
        this.btnCalcular.setEnabled(true);
        char keyChar = evt.getKeyChar();

        if (!Character.isDigit(keyChar) && keyChar != '.') {
            evt.consume();
        }

        if (keyChar == '.' && txtLado2.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLado2KeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        /*float lado;

        if (txtLado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un Valor");
        }else{
            lado = Float.parseFloat(txtLado.getText().trim());
            cua.setLado(lado);
            cua.hallarArea();
            this.txtResultado.setText(String.valueOf(cua.mostrarArea()));
            this.setSize(new Dimension(370,220));
            this.panelResultado.setVisible(true);
            this.btnNuevo.setEnabled(true);
            this.panelResultado.setBackground(new Color(246, 240, 255));
        }
        this.txtLado.requestFocus();
        this.btnCalcular.setEnabled(false);
        this.txtLado.setEnabled(false);*/
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        /*this.txtLado.setText("");
        this.txtResultado.setText("");
        this.setSize(new Dimension(370,170));
        this.panelResultado.setVisible(false);
        this.txtLado.requestFocus();
        this.btnNuevo.setEnabled(false);
        this.btnCalcular.setEnabled(false);
        this.txtLado.setEnabled(true);*/
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        /*int r = JOptionPane.showOptionDialog(this, "Estas seguro de salir..?", "Área - Cuadrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si Salgo", "No Salgo"}, "No salgo");
        if (r == 0) {
            System.exit(0);
        }
        this.txtLado.requestFocus();*/
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtLado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLado3ActionPerformed
        // TODO add your handling code here:
        this.btnCalcular.doClick();
        this.txtLado3.setText("");
        this.txtLado3.requestFocus();
        this.btnCalcular.setEnabled(false);
        this.btnNuevo.setEnabled(true);
    }//GEN-LAST:event_txtLado3ActionPerformed

    private void txtLado3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLado3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcular.doClick();
        }
    }//GEN-LAST:event_txtLado3KeyPressed

    private void txtLado3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLado3KeyTyped
        // TODO add your handling code here:
        this.btnCalcular.setEnabled(true);
        char keyChar = evt.getKeyChar();

        if (!Character.isDigit(keyChar) && keyChar != '.') {
            evt.consume();
        }

        if (keyChar == '.' && txtLado3.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLado3KeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        valIniciales();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelIngreso;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
