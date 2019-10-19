/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appfuncionseno;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author sala304
 */
public class Formulario extends Frame {
    
    Panel pnlPpal = new Panel();
    Label lblN = new Label("N");
    TextField txtN = new TextField();
    Label lblX = new Label("X");
    TextField txtX = new TextField();
    Button btnCalcular = new Button("Calcular");
    Label lblSeno = new Label("Seno = ");
    TextField txtSeno = new TextField();
    
    public Formulario(){
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
    
    void initComponents(){
        
        pnlPpal.add(lblN);
        pnlPpal.add(txtN);
        pnlPpal.add(lblX);
        pnlPpal.add(txtX);
        pnlPpal.add(btnCalcular);
        pnlPpal.add(lblSeno);
        pnlPpal.add(txtSeno);
        
    }
    
    //Listener Boton cerrar Ventana
    void initEvents(){
        
        this.addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
            
            public void windowOpened(WindowEvent e){
                lblN.setLocation(50, 50);
                txtN.setLocation(150, 50);
                lblX.setLocation(50, 100);
                txtX.setLocation(150, 100);
                btnCalcular.setLocation(50, 150);
                lblSeno.setLocation(200, 200);
                txtSeno.setLocation(300, 200);
                txtN.setSize(100, 25);
                txtX.setSize(100, 25);
                txtSeno.setSize(100, 25);
            }            
        });
        
        btnCalcular.addActionListener(new ActionListener() {

            //Defino el evento de dar clic sobre el boton
            public void actionPerformed(ActionEvent e) {
                
                
                try {                    
                    int X = Integer.parseInt(txtX.getText());
                    int N = Integer.parseInt(txtN.getText());
                    Seno Sen1 = new Seno(N, X);
                    txtSeno.setText(String.valueOf(Sen1.CalcularSeno()));
                    

                } catch (Exception ee) {
                    System.out.println(ee.getStackTrace());
                }
            }
        });
    }
    
}
