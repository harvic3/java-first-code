/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*; 
import java.awt.event.*; 

class CerrarVentana extends WindowAdapter { 
	public void windowClosing(WindowEvent e) {
		System.exit(0); 
	} 
}

class Ventana extends Frame { 
	public Ventana() { 
		CerrarVentana cv = new CerrarVentana();
		addWindowListener(cv); 
		Button Boton = new Button();
		this.add(Boton);//se puede omitir this
		Boton.setLabel("Boton");
		setSize(400, 400);
		setTitle("Ventana");
		setVisible(true);
	} 
	
	public static void main(String args[]) { 
		Ventana mainFrame = new Ventana() ;
	} 
}