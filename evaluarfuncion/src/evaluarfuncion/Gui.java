/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluarfuncion;

import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

/**
 *
 * @author victhi
 */
public class Gui extends Frame { // Se especializa la ventana
    Scanner Input = new Scanner(System.in);
    Button boton;  // Se crean variables de instancia
    Label etiq;    // para cada widget
    TextArea area;
    TextField LimInf;
    TextField LimSup;
    TextField Funcion;
    Canvas canvas;

    Panel panel;   // El contenedor adicional para textos y boton

    public Gui() {// El constructor para la ventana
        setLayout(new BorderLayout()); // asigna el layout

        // crea los widgets
        boton = new Button("Evaluar");
        etiq = new Label("¡Evaluar Funciones!", Label.CENTER);
        //area = new TextArea(5, 20);
        //etiq = new Label("Función: ");
        Funcion = new TextField(30);
        //etiq = new Label("Lim Inf: ");
        LimInf = new TextField(5);
        //etiq = new Label("Lim Sup: ");
        LimSup = new TextField(5);

        canvas = new MiCanvas();

        panel = new Panel(); // El contenedor adicional
        panel.setLayout(new FlowLayout());

        // armamos el panel
        panel.add(Funcion);
        
        panel.add(LimInf);
        panel.add(boton);
        panel.add(LimSup);

        // armamos la ventana
        add("North", etiq);
        add("Center", canvas);
        add("South", panel);        
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