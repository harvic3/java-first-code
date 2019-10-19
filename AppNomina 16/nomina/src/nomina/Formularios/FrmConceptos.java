
package nomina.Formularios;

import com.sun.rowset.internal.Row;
import java.awt.Button;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nomina.Clases.ClsConceptos;
import nomina.Clases.ClsConexionDatos;
import nomina.Clases.ClsEmpleados;

/**
 *
 * @author  Wilson  Otalvaro Bedoya
 *          Victor Higuita 
 *          Juliana Toro
 */
public class FrmConceptos extends javax.swing.JInternalFrame {

    
    ClsConexionDatos datos = new ClsConexionDatos();
    ClsConceptos conceptos = new ClsConceptos();
    ResultSet rs;
    ClsEmpleados p;
    int fila=0;
    int Fila = 1;
    int Max = 1;
    
    public FrmConceptos() {
        initComponents();
        this.setSize(1345, 650);
        this.setVisible(true);
       
       
        
        BtnGrabar.setEnabled(false);
        BtnDeshacer.setEnabled(false);
        inhabilitar();
        BtnModificar.setVisible(false);
        
        Fila = 1;
        ExtraerDatos(Fila);
                 
        
    }
                   
    public void inhabilitar(){
    TxtCodigo.setEnabled(false);
    TxtNombreConcepto.setEnabled(false);
    TxtTipoConcepto.setEnabled(false);
       
    }
    

    public void habilitar(){
    TxtCodigo.setEnabled(true);
    TxtNombreConcepto.setEnabled(true);
    TxtTipoConcepto.setEnabled(true);
    
    }
    private void limpiar(){
        TxtCodigo.setText("");
        TxtNombreConcepto.setText("");
        TxtTipoConcepto.setText("");
        
    
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
        TxtCodigo = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtNombreConcepto = new javax.swing.JTextField();
        TxtTipoConcepto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BtnPrimero = new javax.swing.JButton();
        BtnAnterior = new javax.swing.JButton();
        BtnSiguiiente = new javax.swing.JButton();
        BtnUltimo = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnGrabar = new javax.swing.JButton();
        BtnDeshacer = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Conceptos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 30, 50, 20);

        TxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoActionPerformed(evt);
            }
        });
        TxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(TxtCodigo);
        TxtCodigo.setBounds(120, 30, 120, 20);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("NombreConcepto");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 110, 20);

        TxtNombreConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreConceptoActionPerformed(evt);
            }
        });
        TxtNombreConcepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreConceptoKeyTyped(evt);
            }
        });
        jPanel1.add(TxtNombreConcepto);
        TxtNombreConcepto.setBounds(120, 30, 250, 20);

        TxtTipoConcepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTipoConceptoKeyTyped(evt);
            }
        });
        jPanel1.add(TxtTipoConcepto);
        TxtTipoConcepto.setBounds(120, 60, 120, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("TipoConcepto");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 60, 77, 20);

        jTabbedPane1.addTab("Datos Personales", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(40, 70, 660, 370);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Datos Personales");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        BtnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Primero.jpg"))); // NOI18N
        BtnPrimero.setText("Primero");
        BtnPrimero.setToolTipText("Primer Registro");
        BtnPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnPrimero.setName(""); // NOI18N
        BtnPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrimeroActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPrimero);
        BtnPrimero.setBounds(70, 460, 90, 60);

        BtnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Anterior.jpg"))); // NOI18N
        BtnAnterior.setText("Anterior");
        BtnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAnterior);
        BtnAnterior.setBounds(190, 460, 90, 60);

        BtnSiguiiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Siguiente.jpg"))); // NOI18N
        BtnSiguiiente.setText("Siguiente");
        BtnSiguiiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSiguiiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSiguiiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguiienteActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSiguiiente);
        BtnSiguiiente.setBounds(320, 460, 90, 60);

        BtnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Ultimo.jpg"))); // NOI18N
        BtnUltimo.setText("Ultimo");
        BtnUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUltimo);
        BtnUltimo.setBounds(440, 460, 90, 60);

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Editar.jpg"))); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEditar);
        BtnEditar.setBounds(760, 170, 90, 60);

        BtnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Grabar.jpg"))); // NOI18N
        BtnGrabar.setText("Grabar");
        BtnGrabar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGrabar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnGrabar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGrabar);
        BtnGrabar.setBounds(760, 240, 90, 60);

        BtnDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Deshacer1.jpg"))); // NOI18N
        BtnDeshacer.setText("Deshacer");
        BtnDeshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDeshacer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnDeshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeshacerActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDeshacer);
        BtnDeshacer.setBounds(760, 310, 90, 60);

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Salir.jpg"))); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir);
        BtnSalir.setBounds(760, 460, 90, 60);

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/05.jpg"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnNuevo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNuevo);
        BtnNuevo.setBounds(760, 100, 90, 60);

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Deshacer.jpg"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminar);
        BtnEliminar.setBounds(760, 380, 90, 60);

        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/Modificar.jpg"))); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModificar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModificar);
        BtnModificar.setBounds(760, 240, 90, 60);

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nomina/Iconos/buscarlupa.jpg"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar);
        BtnBuscar.setBounds(610, 460, 90, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrimeroActionPerformed
         Fila = 1;
        ExtraerDatos(Fila);
    }//GEN-LAST:event_BtnPrimeroActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
        BtnGrabar.setEnabled(true);
        BtnDeshacer.setEnabled(true);
        BtnEditar.setEnabled(false);
        BtnNuevo.setEnabled(false);
        BtnPrimero.setEnabled(false);
        BtnAnterior.setEnabled(false);
        BtnSiguiiente.setEnabled(false);
        BtnUltimo.setEnabled(false);
        BtnEliminar.setEnabled(false);
        TxtCodigo.setEnabled(true);
        TxtCodigo.requestFocus();
        TxtCodigo.setText("");
        BtnBuscar.setEnabled(false);
        
        habilitar();
        limpiar();
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formInternalFrameClosed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        // TODO add your handling code here:
        BtnPrimero.setEnabled(false);
        BtnAnterior.setEnabled(false);
        BtnSiguiiente.setEnabled(false);
        BtnUltimo.setEnabled(false);
        BtnNuevo.setEnabled(false);
        BtnDeshacer.setEnabled(true);
        BtnGrabar.setVisible(false);
        BtnEliminar.setEnabled(false);
        BtnModificar.setVisible(true);
        BtnEditar.setEnabled(false);
        habilitar();
        
        
        
        
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeshacerActionPerformed
        // TODO add your handling code here:
        BtnNuevo.setEnabled(true);
        BtnGrabar.setVisible(true);
        BtnGrabar.setEnabled(false);
        BtnDeshacer.setEnabled(false);
        BtnEditar.setEnabled(true);
        BtnPrimero.setEnabled(true);
        BtnAnterior.setEnabled(true);
        BtnSiguiiente.setEnabled(true);
        BtnUltimo.setEnabled(true);
        limpiar();
        Fila = 1;
        ExtraerDatos(Fila);
        inhabilitar();
        BtnEliminar.setEnabled(true);
        BtnModificar.setVisible(false);
        BtnBuscar.setEnabled(true);
        
    }//GEN-LAST:event_BtnDeshacerActionPerformed

    private void BtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGrabarActionPerformed
        
        char tecla=0;
        String cedula="";
        if(TxtCodigo.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane,"Debe digitar El codigo"); 
            TxtCodigo.requestFocus();
            return;          
        }  
        
        if (TxtCodigo.getText().length() != 0) {
            try {

                if (datos.selectConceptos(TxtCodigo.getText()) == 1) {
                    JOptionPane.showMessageDialog(null, "Concepto ya existe: " + TxtCodigo.getText());
                    TxtCodigo.requestFocus();
                    return;
                }
            } catch (Exception e) {
            }
            //setVisible(false);
        }
        
        if(TxtNombreConcepto.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane,"Debe digitar El Nombre del Concepto");
           TxtNombreConcepto.requestFocus();
            return;
        }         
         if(TxtTipoConcepto.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane,"Debe digitar El Tipo de Conceptos");
           TxtTipoConcepto.requestFocus();
            return;
        }         
         
             
        {
        int numFilas = 0;

                try {
                    conceptos = new ClsConceptos();
                    conceptos.setConcepto(TxtCodigo.getText());
                    conceptos.setDescripcionConcepto(TxtNombreConcepto.getText());
                    conceptos.setTipoConcepto(TxtTipoConcepto.getText());
                    
                    
                    
                    numFilas = datos.InsertConceptos(
                            conceptos.getConcepto(),
                            conceptos.getDescripcionConcepto(),
                            conceptos.getTipoConcepto()
                            
                            );
                    JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Registros Guardados !!!");

                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                    JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " error !!!");
                }
        }
        BtnPrimero.setEnabled(true);
        BtnAnterior.setEnabled(true);
        BtnSiguiiente.setEnabled(true);
        BtnUltimo.setEnabled(true);
        BtnGrabar.setEnabled(false);
        BtnNuevo.setEnabled(true);
        BtnEditar.setEnabled(true);
        BtnBuscar.setEnabled(true);        
        inhabilitar();
    }//GEN-LAST:event_BtnGrabarActionPerformed

    private void TxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoActionPerformed
        
        
    }//GEN-LAST:event_TxtCodigoActionPerformed

    private void TxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodigoKeyTyped
        char tecla;
        tecla= evt.getKeyChar();
        if(!Character.isDigit(tecla)&&tecla!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Debe Ingresar solo numeros");
            getToolkit().beep(); //sonido
            
            
        }
        if(tecla==KeyEvent.VK_ENTER){
            try    
        {
                        
        datos.buscarConceptos(TxtCodigo.getText());
        TxtCodigo.requestFocus();
        }
        catch (Exception e)
                {
                    
                }
        //setVisible(false);
        }
    }//GEN-LAST:event_TxtCodigoKeyTyped

    private void BtnSiguiienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguiienteActionPerformed
        Max = ClsConexionDatos.NumeroFilasConceptos();
        if (Fila < Max){
            Fila++;
        }        
        ExtraerDatos(Fila);        
    }//GEN-LAST:event_BtnSiguiienteActionPerformed

    private void BtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnteriorActionPerformed
         if (Fila > 1){
            Fila--;
        }        
        ExtraerDatos(Fila);
    }//GEN-LAST:event_BtnAnteriorActionPerformed

    private void BtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUltimoActionPerformed
       Max = ClsConexionDatos.NumeroFilasConceptos();
        Fila = Max;
        ExtraerDatos(Fila);
    }//GEN-LAST:event_BtnUltimoActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        datos.DeleteConceptos(TxtCodigo.getText());
        limpiar();
        inhabilitar();
        Fila = 1;
        ExtraerDatos(Fila);
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        BtnNuevo.setEnabled(true);
        BtnEditar.setEnabled(true);
        BtnModificar.setVisible(false);
        BtnGrabar.setVisible(true);
        BtnGrabar.setEnabled(false);
        inhabilitar();
        BtnPrimero.setEnabled(true);
        BtnAnterior.setEnabled(true);
        BtnSiguiiente.setEnabled(true);
        BtnUltimo.setEnabled(true);
        BtnEliminar.setEnabled(true);
        BtnBuscar.setEnabled(false);        
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        int x=0;
        if(TxtNombreConcepto.getText().length()!=0){
            x=1;
        }
        else
        {
            x=2;
        }
       
        if (x==1){
        
        limpiar();
        TxtCodigo.setEnabled(true);
        TxtCodigo.requestFocus();
        BtnPrimero.setEnabled(false);
        BtnAnterior.setEnabled(false);
        BtnSiguiiente.setEnabled(false);
        BtnUltimo.setEnabled(false);
        BtnNuevo.setEnabled(false);
        BtnEditar.setEnabled(false);
        BtnGrabar.setEnabled(false);
        BtnDeshacer.setEnabled(true);
        BtnEliminar.setEnabled(false);
       
       if (TxtCodigo.getText().length() == 0){
            //JOptionPane.showMessageDialog(rootPane,"Debe digitar cedula"); 
            TxtCodigo.requestFocus();
            
        }  
        }
         if(x==2){

             Fila = 1;
        cargarDatos(TxtCodigo.getText());
        BtnNuevo.setEnabled(true);
        BtnModificar.setEnabled(true);
        BtnEliminar.setEnabled(true);
        BtnPrimero.setEnabled(true);
        BtnAnterior.setEnabled(true);
        BtnSiguiiente.setEnabled(true);
        BtnUltimo.setEnabled(true);
        
                
       }
        
       
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void TxtTipoConceptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTipoConceptoKeyTyped
        char tecla;
        tecla= evt.getKeyChar();
        if(!Character.isLetter(tecla)&&tecla!=KeyEvent.VK_ESCAPE&&tecla!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Debe Ingresar solo letras");
            getToolkit().beep(); //sonido

        }
    }//GEN-LAST:event_TxtTipoConceptoKeyTyped

    private void TxtNombreConceptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreConceptoKeyTyped
        char tecla;
        tecla= evt.getKeyChar();
        if(!Character.isLetter(tecla)&&tecla!=KeyEvent.VK_ESCAPE&&tecla!=KeyEvent.VK_BACK_SPACE){
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Debe Ingresar solo letras");
            getToolkit().beep(); //sonido

        }
    }//GEN-LAST:event_TxtNombreConceptoKeyTyped

    private void TxtNombreConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreConceptoActionPerformed

    private void cargarDatos(String Cedula){      
        ClsConceptos[] Conceptos = new ClsConceptos[1];
        try {            
           Conceptos = ClsConexionDatos.buscaConceptos(Cedula);
            TxtCodigo.setText(Conceptos[0].getConcepto());
            TxtNombreConcepto.setText(Conceptos[0].getDescripcionConcepto());
            TxtTipoConcepto.setText(Conceptos[0].getTipoConcepto());
            
        } catch (Exception ee) {
            System.out.println(ee.getStackTrace());
        }

    }

   
private void ExtraerDatos(int Fila){      
        ClsConceptos[] Conceptos = new ClsConceptos[1];
        try {            
           Conceptos = ClsConexionDatos.SelectAllConceptos(Fila);
            TxtCodigo.setText(Conceptos[0].getConcepto());
            TxtNombreConcepto.setText(Conceptos[0].getDescripcionConcepto());
            TxtTipoConcepto.setText(Conceptos[0].getTipoConcepto());
            
        } catch (Exception ee) {
            System.out.println(ee.getStackTrace());
        }

    }
    




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnterior;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnDeshacer;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGrabar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnPrimero;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSiguiiente;
    private javax.swing.JButton BtnUltimo;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtNombreConcepto;
    private javax.swing.JTextField TxtTipoConcepto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
