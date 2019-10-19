package interfazpersona;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

//public class ventana extends JFrame {
public final class ventana extends Frame {

    ResultSet rs;
    persona p;
    datos d = new datos();

    ventana() {
        initComponentes();
        initEvents(this);

        this.add(pnlPanel);
        this.setSize(800, 600);
        this.setVisible(true);
    }
    Panel pnlPanel = new Panel();
    Label lblNombre = new Label("Nombre");
    Label lblApellidos = new Label("Apellidos");
    Label lblEdad = new Label("Edad:");
    Label lblMostrar = new Label("...");
    TextField txtNombre = new TextField(30);
    TextField txtApellido = new TextField(30);
    //JComboBox cmbEdad = new JComboBox();
    Choice cmbEdad = new Choice();
    Button btnConectar = new Button("Conectar");
    Button btnGuardar = new Button("Guardar");
    Button btnMostrar = new Button("Mostrar");
    Button btnActualizar = new Button("Actualizar");
    Button btnBorrar = new Button("Borrar");
    Button btnIngresar = new Button("Ingresar");

    void initComponentes() {
        for (int i = 1; i <= 50; i++) {
            cmbEdad.addItem(Integer.toString(i));
        }

        pnlPanel.add(lblNombre);
        pnlPanel.add(lblApellidos);
        pnlPanel.add(lblEdad);
        pnlPanel.add(lblMostrar);
        pnlPanel.add(txtNombre);
        pnlPanel.add(txtApellido);
        pnlPanel.add(cmbEdad);
        pnlPanel.add(btnConectar);
        pnlPanel.add(btnGuardar);
        pnlPanel.add(btnMostrar);
        pnlPanel.add(btnActualizar);
        pnlPanel.add(btnBorrar);
        pnlPanel.add(btnIngresar);

    }

    void initEvents(final Frame vent) {
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //d.cerrarConexion();
            }

            @Override
            public void windowOpened(WindowEvent e) {
                lblNombre.setLocation(50, 50);
                txtNombre.setLocation(150, 50);
                lblApellidos.setLocation(50, 100);
                txtApellido.setLocation(150, 100);
                lblEdad.setLocation(50, 150);
                cmbEdad.setLocation(150, 150);
                btnConectar.setLocation(100, 300);
                btnGuardar.setLocation(200, 300);
                btnMostrar.setLocation(300, 300);
                btnActualizar.setLocation(400, 300);
                btnBorrar.setLocation(500, 300);
                btnIngresar.setLocation(400,50);
                lblMostrar.setForeground(Color.red);
                lblMostrar.setLocation(200, 250);
            }
        });

        btnIngresar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
                    
//                    rs = d.select(txtNombre.getText(), txtApellido.getText());
//                    
//                    if(rs.next()){
//                        lblMostrar.setText("");
//                        ventana1 v = new ventana1(vent, txtNombre.getText(), txtApellido.getText());
//                    }else{
//                        lblMostrar.setSize(250, 25);
//                        lblMostrar.setText("El usuario no existe");
//                    }

                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });

        btnConectar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
                    //d.conexion();
                    JOptionPane.showMessageDialog(null, "Conectado");

                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });

        btnMostrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {

                    lblMostrar.setSize(250, 25);
                    lblMostrar.setText(p.selectTodos());
                    
                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });

        btnGuardar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int numFilas = 0;

                try {
                    
//                    p = new persona(txtNombre.getText(), 
//                            txtApellido.getText(), 
//                            Integer.parseInt(cmbEdad.getSelectedItem()));
                      p = new persona();
                      
                      p.setNombre(txtNombre.getText());
                      p.setApellidos(txtApellido.getText());
                      p.setEdad(Integer.parseInt(cmbEdad.getSelectedItem()));
                      
                      numFilas = p.insertarPersona(p.getNombre(), 
                              p.getApellidos(), 
                              p.getEdad());
                    

//                    numFilas = d.insert(p.nombre, p.apellidos, p.edad);
                    JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Registros Guardados !!!");

                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });

        btnActualizar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int numFilas = 0;

                try {
//                    p.nombre = txtNombre.getText();
//                    p.apellidos = txtApellido.getText();
//                    p.edad = Integer.parseInt(cmbEdad.getSelectedItem());

//                    numFilas = d.update(p.nombre, p.apellidos, p.edad);
                    JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Registros actualizados !!!");

                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });

        btnBorrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int numFilas = 0;

                try {
                    //p.nombre = txtNombre.getText();

//                    numFilas = d.delete(p.nombre);
                    JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Registros eliminados !!!");

                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });
    }
}
