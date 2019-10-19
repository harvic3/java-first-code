/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqtVistas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class InitGUI extends javax.swing.JFrame {

    /**
     * Creates new form InitGUI
     */
    public InitGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumero2 = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        tbxNumero2 = new javax.swing.JTextField();
        tbxNumero1 = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        tbxResultado = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumero2.setText("Número 2");

        lblNumero1.setText("Número 1");

        btnSumar.setText("Sumar");
        btnSumar.setActionCommand("btnSumar");
        btnSumar.setName("btnSumar"); // NOI18N
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.setText("Restar");
        btnRestar.setToolTipText("");
        btnRestar.setName("btnRestar"); // NOI18N
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        lblResultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnSumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRestar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResultado)
                                .addGap(28, 28, 28)
                                .addComponent(tbxResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tbxNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNumero2)
                                    .addGap(28, 28, 28)
                                    .addComponent(tbxNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(lblNumero1)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(tbxNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero2)
                    .addComponent(tbxNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumar)
                    .addComponent(btnRestar))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(lblNumero1)
                    .addContainerGap(168, Short.MAX_VALUE)))
        );

        lblNumero2.getAccessibleContext().setAccessibleName("lblNumero2");
        lblNumero1.getAccessibleContext().setAccessibleName("lblNumero1");
        tbxNumero2.getAccessibleContext().setAccessibleName("tbxNumero2");
        tbxNumero1.getAccessibleContext().setAccessibleName("tbxNumero1");
        btnSumar.getAccessibleContext().setAccessibleName("btnSumar");
        btnRestar.getAccessibleContext().setAccessibleName("btnRestar");
        tbxResultado.getAccessibleContext().setAccessibleName("btnResultado");
        lblResultado.getAccessibleContext().setAccessibleName("lblResultado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        CFunctions Function = new CFunctions();
        pqtDatos.CReadTXT objReadFile = new pqtDatos.CReadTXT();
        pqtDatos.CWriteTXT objWriteFile = new pqtDatos.CWriteTXT();
        pqtCalculos.CSuma Suma = new pqtCalculos.CSuma();

        String strFilePatch = "1";
        boolean bolOperate = false;
        String strNumero1;
        String strNumero2;

        if ((tbxNumero1.getText().isEmpty()) || (tbxNumero2.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Ningún campo puede estar vacío.!");
        } else {
            //Verificar Carga del Archivo
            if (strFilePatch.equals("1")) {
                //Solicitamos Nombre para el Archivo.
                String strNombre = JOptionPane.showInputDialog("Por favor ingrese el Nombre del Archivo: ");
                try {
                    //Solicitamso Ruta para el Archivo.
                    strFilePatch = objReadFile.LoadFile();
                    strFilePatch = strFilePatch + strNombre + ".txt";
                    //Creamos el Archivo
                    objWriteFile.CreateFile(strFilePatch);

                } catch (IOException ex) {
                    Logger.getLogger(InitGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//If
            try {
                //Verificar si están los numeros para Restar.
                if (objReadFile.ReadFile(strFilePatch, (tbxNumero1.getText() + " y " + tbxNumero2.getText()))) {
                    int intResta = Suma.Sumar(Integer.parseInt(tbxNumero1.getText()), Integer.parseInt(tbxNumero2.getText()));
                    tbxResultado.setText(String.valueOf(intResta));
                    //Guardar Numeros nuevos
                    objWriteFile.WriteFile(strFilePatch, (tbxNumero1.getText() + " y " + tbxNumero2.getText()));
                } else {
                    System.out.println("Los números ya han sido operados. Ingrese otros o salga de la aplicación.");
                }//Else
            } catch (IOException ex) {
                Logger.getLogger(InitGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestarActionPerformed

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
            java.util.logging.Logger.getLogger(InitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InitGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField tbxNumero1;
    private javax.swing.JTextField tbxNumero2;
    private javax.swing.JTextField tbxResultado;
    // End of variables declaration//GEN-END:variables
}
