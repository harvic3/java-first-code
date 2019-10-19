/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numero_pos_neg;

import java.util.Scanner;

/**
 *
 * @author victhi
 */
public class Numero_Pos_Neg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        int NUM = 0;
        String S = "";
        boolean B = true;
        double D = 0.0;
        
        
        while (NUM != -1){
            
            System.out.println("Inserte un numero entero diferente de cero:");
            NUM = input.nextInt();
            
            if (NUM == -1){
                System.out.println("Terminamos, Suerte!!");
                break;                
            }
            
            if (NUM == 0){
                System.out.println("El numero es Cero.");
            }
            else{
                if (NUM%2 == 0){
                    System.out.println("El numero " + NUM + " es Par.");
                }
                else{
                    System.out.println("El numero " + NUM + " no es par.");
                }
            }
        }
    }
    
}
