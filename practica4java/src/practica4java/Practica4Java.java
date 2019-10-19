/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica4java;

import java.util.Scanner;

/**
 *
 * @author victhi
 */
public class Practica4Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int Num = 0, i, j, Num1 = 0, Num2 = 1, Suma = 0, x = 2, k, Pri = 0, Cont = 0, Cvp = 0;       
        
        System.out.println("Ingrese la cantidad de numeros a generar:");
        Num = input.nextInt();
        
        int Mat[][] = new int [Num][Num];
        int Vec[] = new int [Num*Num];
                   
            
            Mat[0][0] = Num1;                    
            Mat[0][1] = Num2;
            
            for (i=0;i<Num;i++){//Generamos Matriz con los numeros            
                
                for (j=x;j<Num;j++){
                    Suma = Num1 + Num2;
                    Mat[i][j] = Suma;//System.out.print( Suma + ", ");
                    Num1 = Num2;
                    Num2 = Suma;
                    x = 0;
                }
            }
            
            System.out.println("\nLa Matriz es:");
            for (i=0;i<Num;i++){
                System.out.println();
                for (j=0;j<Num;j++){
                    
                    for (k=1;k<=Mat[i][j]/2;k++){ //For Primos
                        if (Mat[i][j]%k == 0){
                            Cont = Cont + 1;
                        }                        
                    }
                    
                    if (Cont == 1){ //Evalua Primo
                        Pri = Pri + 1;
                        Vec[Cvp] = Mat[i][j];
                        Cvp++;
                    }
                    System.out.print(Mat[i][j] + " ");                    
                    Cont = 0;
                }
            }        
            
            System.out.println("\n\nLos numeros primos son: ");
            for (i=0;i<Pri;i++){
                System.out.print(Vec[i] + " ");
            }
            
    }
}
    
