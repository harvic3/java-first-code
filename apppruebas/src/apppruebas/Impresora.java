/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppruebas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ASUS
 */
public class Impresora {
    
    Font fuente = new Font("Dialog", Font.PLAIN, 10);
    PrintJob pj;
    Graphics pagina;

    //Constructor de la Clase Impresora
    Impresora() {
        pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "SCAT", null);
    }
	
    public void Imprimir(String Cadena)
	{
		//En un try/catch porque pueden cancelar la impresion
		try
		{
			pagina = pj.getGraphics();
			pagina.setFont(fuente);
			pagina.setColor(Color.black);
			
			pagina.drawString("Esto es una Prueba", 60, 60);

			pagina.dispose();
			pj.end();
		}catch(Exception e)
		{
			System.out.println("Cancelada la Impresion...");
		}
	}//Fin de Imprimir String

					
}//Fin Clase imprimir
