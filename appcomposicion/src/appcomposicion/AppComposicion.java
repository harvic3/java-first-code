/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appcomposicion;
import java.util.Scanner;

/**
 *
 * @author sala304
 */
public class AppComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        Circulo C2 = new Circulo(4, 5, 10);
        Circulo C1 = new Circulo(3);
        
        C1.MostrarCiculo();
        C2.MostrarCiculo();
        
    }
    
}
