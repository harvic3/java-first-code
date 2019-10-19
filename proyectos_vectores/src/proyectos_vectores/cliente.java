package proyectos_vectores;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cliente extends javax.swing.JFrame {

    private int CC;
    private String Nom;
    private String Apll1;
    private String Apll2;
    private String Dir;
    private String Tel;
    public conexion_oracle c = new conexion_oracle();
    private Funciones F = new Funciones();

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getApll1() {
        return Apll1;
    }

    public void setApll1(String Apll1) {
        this.Apll1 = Apll1;
    }

    public String getApll2() {
        return Apll2;
    }

    public void setApll2(String Apll2) {
        this.Apll2 = Apll2;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public cliente() {
        initComponents();
     LlenarJTable();
        desabilitar();
    }

    public void habilitar() {
        this.jTextField1.setEnabled(true);
        this.jTextField2.setEnabled(true);
        this.jTextField3.setEnabled(true);
        this.jTextField4.setEnabled(true);
        this.jTextField5.setEnabled(true);
        this.jTextField6.setEnabled(true);
        this.jTextField7.setEnabled(true);
        // this.jComboBox1.setEnabled(true);
        this.registrar.setEnabled(true);
        this.modificar.setEnabled(true);
        this.eliminar.setEnabled(true);
       
        this.buscar.setEnabled(true);
       

    }

    public void desabilitar() {
        this.jTextField1.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.jTextField3.setEnabled(false);
        this.jTextField4.setEnabled(false);
        this.jTextField5.setEnabled(false);
        this.jTextField6.setEnabled(false);
        this.jTextField7.setEnabled(false);
        this.registrar.setEnabled(false);
        this.modificar.setEnabled(false);
        this.eliminar.setEnabled(false);
      
        this.buscar.setEnabled(false);
    
//        this.jComboBox1.setEnabled(false);
    }
    
    
    public void LlenarJTable() {
    
    String Texto = "select *from Hueco.CLIENTE";
        try {
            F.llenarTabla(jTable1, Texto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    
    public void CapturaDato() {
        try {
            F.limpiaTabla(jTable1);
        } catch (Exception ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        String Texto;
        String Fila[] = new String[100];
        Fila[0] = "" + jTextField2.getText();
        Fila[1] = "" + jTextField1.getText();
        Fila[2] = "" + jTextField4.getText();
        Fila[3] = "" + jTextField6.getText();
        Fila[4] = "" + jTextField3.getText();
        Fila[5] = "" + jTextField5.getText();
        Fila[6] = "" + jTextField7.getText();
        Texto = "INSERT INTO HUECO.CLIENTE (CEDULA, NOMBRE, APELL1, APELL2, DIRECCION, TELEFONO, CORREO)VALUES (" + Fila[0] + ",'" + Fila[1] + "' , '" + Fila[2] + "', '" + Fila[3] + "','" + Fila[4] + "' ," + Fila[5] + " ,'" + Fila[6] + "' )";
        try {
            F.InsertarTabla(Texto);
        } catch (Exception ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        LlenarJTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Interfaz Persona (Cliente )"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, -1));

        jLabel3.setText("Dirección");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, -1));

        jLabel2.setText("Identificación");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, -1));
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 180, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, -1));
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 180, -1));

        jLabel4.setText("Apellido 1");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setText("Telefono");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 180, -1));

        jLabel6.setText("Apellido 2");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel6.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 180, -1));

        jLabel7.setText("Correo");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 180, -1));

        registrar.setText("Insertar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel6.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel6.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, -1));
        jPanel6.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 190, -1));

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel6.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 90, -1));

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel6.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 80, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 290, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros Persona"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificaciòn", "Nombre", "Apellido 1", "Apellido 2", "Direcciòn", "Telefono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 680, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        /* int salir=JOptionPane.showConfirmDialog(null,"decea en realidad salir","Confirmar",JOptionPane.YES_OPTION);
         if(salir==JOptionPane.YES_NO_OPTION)
         {
         System.exit(0);
         }*/

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        try {
            F.limpiaTabla(jTable1);
        } catch (Exception ex) {
            Logger.getLogger(TECNICO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        String Texto;
        String Fila[] = new String[100];
        Fila[0] = "" + jTextField2.getText();
        Fila[1] = "" + jTextField1.getText();
        Fila[2] = "" + jTextField4.getText();
        Fila[3] = "" + jTextField6.getText();
        Fila[4] = "" + jTextField3.getText();
        Fila[5] = "" + jTextField5.getText();
        Fila[6] = "" + jTextField7.getText();
        Texto = "INSERT INTO HUECO.CLIENTE (CEDULA, NOMBRE, APELL1, APELL2, DIRECCION, TELEFONO, CORREO)VALUES ("+Fila[0]+",'"+Fila[1]+"' , '"+Fila[2]+"', '"+Fila[3]+"','"+Fila[4]+"' ,"+Fila[5]+" ,'"+Fila[6]+"' )";
        try {
            F.InsertarTabla(Texto);
        } catch (Exception ex) {
            Logger.getLogger(TECNICO1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        int a;
        a = Integer.parseInt(jTextField8.getText());
        System.out.println(""+a);
        String Texto = "select *from Hueco.CLIENTE WHERE CEDULA = "+a+";";
        try {
            F.llenarTabla(jTable1, Texto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }        // TODO add your handling code here:
       
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String Texto;
        int ced =0;
        ced=Integer.parseInt(jTextField8.getText());
        //if(jTextField2==null){
            Texto ="DELETE FROM HUECO.CLIENTE WHERE CEDULA = "+ced+";";
            System.out.print(" "+Texto);
            try {
                F.BorrarTabla(Texto);
            } catch (SQLException ex) {
                Logger.getLogger(TECNICO1.class.getName()).log(Level.SEVERE, null, ex);
            }/*
        }else{
            String ax = JOptionPane.showInputDialog("Ingrese un numero de Cedula a Eliminar: ");
            if(ax != null){
                ced = Integer.parseInt(ax);
                Texto ="DELETE FROM HUECO.CLIENTE WHERE CEDULA = "+ced+";";
                try {
                    F.BorrarTabla(Texto);
                } catch (SQLException ex) {
                    Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {

            }*/
            // }

        // }      // }
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        habilitar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton modificar;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
