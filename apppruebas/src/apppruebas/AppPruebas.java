/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppruebas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class AppPruebas extends JFrame {

    String cadena;
    JTextField campo;
    JButton imprimir;
    JLabel info;
    Impresora imp;
    JPanel principal = new JPanel(new BorderLayout());
    JPanel etiq = new JPanel(new FlowLayout());
    JPanel dos = new JPanel(new FlowLayout());
    
    AppPruebas(){
        super("Muestra Simple de Impresión en JAVA...");
		
        info = new JLabel("ESCRIBA ALGO EN EL CAMPO Y HAGA CLIC EN IMPRIMIR...");
        cadena = new String();
        campo = new JTextField(30);
        imprimir = new JButton("IMPRIMIR");

        dos.add(campo);
        dos.add(imprimir);
        etiq.add(info);

        campo.setToolTipText("ESCRIBA ALGO AQUÍ...");
        imprimir.setToolTipText("CLIC AQUI PARA IMPRIMIR...");

        principal.add(etiq, BorderLayout.NORTH);
        principal.add(dos, BorderLayout.CENTER);

        getContentPane().add(principal);

        //AJUSTO EL TAMAÑO DE LA VENTANA AL MINIMO
        pack();
        //NO PERMITO QUE PUEDAN CAMBIAR EL TAMAÑO DE LA VENTANA
        this.setResizable(false);		

        //AHORA LA CENTRARÉ EN LA PANTALLA
        Dimension pantalla, cuadro;
        pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        cuadro = this.getSize();

        this.setLocation(((pantalla.width - cuadro.width)/2),(pantalla.height - cuadro.height)/2);
        
        imprimir.addActionListener ( new ActionListener(){
            
            public void actionPerformed(ActionEvent evt) {
                cadena = "";
                cadena = String.valueOf(campo.getText());
                if (!cadena.equals("")) {
                    imp = new Impresora();
                    imp.Imprimir(cadena);
                } else {
                    System.out.println("NO SE IMPRIME NADA EN BLANCO...");
                }

                campo.requestFocus();
                campo.select(0, cadena.length());
            }
        });
    
    }//FIN DEL CONSTRUCTOR
    
    public static void main(String[] args) {
        
        /*AppPruebas p = new AppPruebas();
        p.show();

        p.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });*/
        NumberFormat Format = NumberFormat.getCurrencyInstance(Locale.getDefault());
        
        double Dinero = 400520;
        System.out.println(Format.format(Dinero));

    }
    
}

/**
 * Convertir String a Entero
 */
//        String FechaIngreso = "2012/02/05";        
//        String FechaSalida = "2014/06/01";
//        
//        int DiaI, MesI, AnoI, DiaF, MesF, AnoF, Dias;
//        
//        DiaI = Integer.parseInt(FechaIngreso.substring(8,10));
//        MesI = Integer.parseInt(FechaIngreso.substring(5,7));
//        AnoI = Integer.parseInt(FechaIngreso.substring(0,4));
//        
//        DiaF = Integer.parseInt(FechaSalida.substring(8,10));
//        MesF = Integer.parseInt(FechaSalida.substring(5,7));
//        AnoF = Integer.parseInt(FechaSalida.substring(0,4));
//        Dias = ((AnoF - AnoI + 1)*360) - (MesI*30 - (30-DiaI-1)) - ((13 - MesF)*30 - DiaF);