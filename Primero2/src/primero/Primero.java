/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

import java.io.IOException;

/**
 *
 * @author sala207
 */
public class Primero {

    /**
     * @param args the command line arguments
     */        
    
    public static void main(String[] args) throws IOException {
        
        int NUM;
        
        System.out.print("Hola Mundo, ingresa un número: ");        
        NUM = System.in.read();
        System.out.print("El numero ingresado fue: " + Integer.valueOf(NUM) + "\n");      
    }
}
