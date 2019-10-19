/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funcionseno;
import java.util.Scanner;

/**
 *
 * @author sala304
 */
public class FuncionSeno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int X, N;
        
        System.out.println("Por favor ingrese X: ");
        X = Input.nextInt();
        
        System.out.println("Por favor ingrese la cantidad de iteraciones: ");
        N = Input.nextInt();        
        
        Funcion Seno = new Funcion(X, N);       
        Seno.CalSeno();
    }
    
}
