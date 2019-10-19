/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina.Formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import nomina.Clases.ClsConexionDatos;

/**
 *
 * @author Wilson
 */
public class FrmIngreso extends javax.swing.JFrame {

    /**
     * Creates new form FrmIngreso
     */
    ClsConexionDatos d = new ClsConexionDatos();
    public FrmIngreso() {
        initComponents();
        this.setSize(420, 300);
        this.setVisible(true);
    }
    
    ResultSet rs;
    //String Nombre="";
    String Contraseña="";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        LblContraseña = new javax.swing.JLabel();
        BtnIngresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        TxtUsuario = new javax.swing.JTextField();
        TxtContraseña = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        LblUsuario.setText("Usuario");
        LblUsuario.setToolTipText("");
        getContentPane().add(LblUsuario);
        LblUsuario.setBounds(50, 60, 60, 20);

        LblContraseña.setText("Contraseña");
        LblContraseña.setToolTipText("");
        getContentPane().add(LblContraseña);
        LblContraseña.setBounds(50, 100, 90, 14);

        BtnIngresar.setText("Ingresar");
        BtnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });
        BtnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnIngresarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BtnIngresarKeyTyped(evt);
            }
        });
        getContentPane().add(BtnIngresar);
        BtnIngresar.setBounds(10, 150, 130, 30);

        jButton1.setText("Registrar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 150, 90, 30);

        BtnSalir.setText("Salir");
        BtnSalir.setToolTipText("");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir);
        BtnSalir.setBounds(250, 150, 90, 30);

        TxtUsuario.setToolTipText("");
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TxtUsuario);
        TxtUsuario.setBounds(140, 60, 130, 20);

        TxtContraseña.setToolTipText("");
        TxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraseñaActionPerformed(evt);
            }
        });
        TxtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtContraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(TxtContraseña);
        TxtContraseña.setBounds(140, 100, 130, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Frmusuarios frm = new Frmusuarios();           
        frm.show();
        setVisible(false); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        
        if(TxtUsuario.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane,"Debe digitar El usuario");
           TxtUsuario.requestFocus();
            return;
        }         
        if(TxtContraseña.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane,"Debe digitar la contraseña");
           TxtContraseña.requestFocus();
            return;
        } 
        
        try    
        {
         
        d.buscarUsua( TxtUsuario.getText(),TxtContraseña.getText());
        }
        catch (Exception e)
                {
                    
                }
        if(d.selectUsuario(TxtUsuario.getText(),TxtContraseña.getText())==0){
            JOptionPane.showMessageDialog(rootPane,"Usted no se encuentra registrado");
            TxtContraseña.requestFocus();
            return;
        }
        //TxtUsuario.requestFocus();
        setVisible(false); 
        
    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        
       setVisible(false); 
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BtnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnIngresarKeyPressed
       
    }//GEN-LAST:event_BtnIngresarKeyPressed

    private void BtnIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnIngresarKeyTyped
        
    }//GEN-LAST:event_BtnIngresarKeyTyped

    private void TxtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContraseñaActionPerformed
        
    }//GEN-LAST:event_TxtContraseñaActionPerformed

    private void TxtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtContraseñaKeyTyped
        char tecla;
        tecla= evt.getKeyChar();
        if(!Character.isDigit(tecla)&&tecla!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Debe Ingresar solo numeros");
            getToolkit().beep(); //sonido
            
            
        }
    }//GEN-LAST:event_TxtContraseñaKeyTyped

    
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
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIngreso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblContraseña;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
