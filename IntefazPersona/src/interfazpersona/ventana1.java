package interfazpersona;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

//public class ventana extends JFrame {
public class ventana1 extends Frame {

    ResultSet rs;
    persona p = new persona();
    datos d = new datos();

    ventana1() {
        initComponentes();
        initEvents();

        this.add(pnlPanel);
        this.setSize(800, 600);
        this.setVisible(true);
    }

    ventana1(Frame v) {
        v.setVisible(false);
        initComponentes();
        initEvents();

        this.add(pnlPanel);
        this.setSize(800, 600);
        this.setVisible(true);
    }

    ventana1(java.awt.Frame v, String nombre, String apellido) {
        v.setVisible(false);
        initComponentes();
        initEvents();

        this.add(pnlPanel);
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);

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

    void initEvents() {
        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //d.cerrarConexion();
            }

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
//                    if(rs.first())
//                    while(rs.next()) {
//                        lblMostrar.setText(lblMostrar.getText() + "; " + rs.getObject(1) + "-" + rs.getObject(2) + "-" + rs.getObject(3));
//                    }

                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });

        btnConectar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
                    d.conexion();
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
//                    rs = d.select();
//                    while(rs.next()) {
//                        lblMostrar.setText(lblMostrar.getText() + "; " + rs.getObject(1) + "-" + rs.getObject(2) + "-" + rs.getObject(3));
//                    }
                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });

        btnGuardar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int numFilas = 0;

                try {
//                    p.nombre = txtNombre.getText();
//                    p.apellidos = txtApellido.getText();
//                    p.edad = Integer.parseInt(cmbEdad.getSelectedItem());

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
//                    p.nombre = txtNombre.getText();

//                    numFilas = d.delete(p.nombre);
                    JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Registros eliminados !!!");

                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });
    }
}
