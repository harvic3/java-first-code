/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.*; 
import java.awt.event.*; 

class AWTExample extends WindowAdapter { 
	public void windowClosing(WindowEvent e) {
		System.exit(0); 
	} 
}

class Ventana extends Frame { 
	public Ventana() { 
		AWTExample cv = new AWTExample();
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
