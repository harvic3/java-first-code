/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appastracta;

/**
 *
 * @author sala304
 */
public class AppAstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Nombre = "Fig1";
        int X, Y, L, B, H;
        
        Triangulo T1 = new Triangulo(10, 5, "Triangulo1");
        Cuadrado C1 = new Cuadrado(15, "Cuadrado1");
        
        T1.MostrarArea();
        T1.MostrarNombre();
        
        C1.MostrarArea();
        C1.MostrarNombre();
        
    }
    
}
