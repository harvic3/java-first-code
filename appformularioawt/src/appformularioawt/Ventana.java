/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appformularioawt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author sala208
 */
public class Ventana extends Frame{
    //1. Se define los componentes
    Panel pnlPpal = new Panel();
    Label lblNombre = new Label("Nombe");
    Label lblApellido = new Label("Apellido");
    Label lblEmail = new Label("ECorreo");
    Label lblArroba = new Label("@");
    TextField txtNombre = new TextField();
    TextField txtApellido = new TextField();
    TextField txtEmail = new TextField();
    Button btnGuardar = new Button("Guardar");
    Choice choTipoCorreo = new Choice();
    
    //3. Generar Constructor
    public Ventana(){
        //Invocar metodo de Inicialización
        initComponents();
        initEvents();
        //Adicionar el panel
        this.add(pnlPpal);
        //Asigana tamaño
        this.setSize(500, 600);
        //Visualizar la ventana
        this.setVisible(true);
    }
    
    //2. Adiciono los componentes al panel
    void initComponents(){
        
        choTipoCorreo.add("gmail.com");
        choTipoCorreo.add("outlook.com");
        choTipoCorreo.add("yahoo.com");
        lblNombre.setLocation(2, 2);
        pnlPpal.add(lblNombre);
        txtNombre.setLocation(20, 2);
        pnlPpal.add(txtNombre);
        lblApellido.setLocation(2, 4);
        pnlPpal.add(lblApellido);
        txtApellido.setLocation(20, 2);
        pnlPpal.add(txtApellido);
        pnlPpal.add(lblEmail);
        pnlPpal.add(txtEmail);
        pnlPpal.add(lblArroba);
        pnlPpal.add(choTipoCorreo);
        pnlPpal.add(btnGuardar);
        
    }
    
    //Listener Boton cerrar Ventana
    void initEvents(){
        
        this.addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    
    }
    
    
}
