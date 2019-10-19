/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evafunciones;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.Label;

public class CrearVentana extends Frame {
    Panel PanelCentral;
    TextField Funcion;
    Label Limite1;
    Label Limite2;
    TextField LimInf;
    TextField LimSup;
    TextArea Mensaje;
    Button Evaluar;
    Button Salir;
    Canvas canvas;
    
    public CrearVentana() {
        PanelCentral = new Panel();
        Funcion = new TextField(20);  
        Mensaje = new TextArea(5,35);
        Limite1 = new Label("Lim Inf: ");
        LimInf = new TextField(20);
        Limite2 = new Label("Lim Sup: ");
        LimSup = new TextField(20);
        canvas = new MiCanvas();
        Evaluar = new Button("Evaluar");
        Salir = new Button("Salir");
        PanelCentral.add(LimInf);
        PanelCentral.add(LimSup);        
        PanelCentral.add(Evaluar);
        PanelCentral.add(Salir);
        this.add(PanelCentral);
        this.setSize(500,600);
        this.setTitle("Evaluar Funciones");
        this.show();
    }   
}

class MiCanvas extends Canvas {
    public void paint(Graphics g, int X1, int Y1, int X2, int Y2) {
      int w = getSize().width;
      int h = getSize().height;
      g.drawLine(X1,Y1,X2,Y2);
    }

    public Dimension getMinimumSize() {
      return new Dimension(150,130);
    }

    public Dimension getPreferredSize() {
      return getMinimumSize();
    }
}