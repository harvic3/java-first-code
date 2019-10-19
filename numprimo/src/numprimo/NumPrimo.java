/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numprimo;

import java.util.Scanner;
/**
 *
 * @author sala208
 */
public class NumPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         int i, j, Num = 1, Cont = 0, Acum = 0;
         String Coc = "1";
         
         System.out.println("Ingrese un numero entero:");
         Num = input.nextInt();
         
         while (Num >= 0){           
             
            for (i=1;i<=Num/2;i++){ //Primo
                if (Num%i == 0){
                    Cont = Cont + 1;
                }
            }
            for (i=Num-1;i>=2;i--){ //Perfecto
                if(Num%i == 0){
                    Acum = Acum + Num/i;
                    Coc = Coc + "+" + Num/i;
                }
            }
            
            Acum = Acum + 1; //Ajuste
            //System.out.println(Acum);
            
            if (Cont > 1){ //Evalua Primo
                System.out.println("El numero no es primo");                
            }
            else{
                System.out.println("El numero es primo");
            }
            
            if (Num%2 == 0){ //Evalua par
                System.out.println("El numero es Par");
            }
            else{
                System.out.println("El numero es Impar");
            }
            
            if(Acum == Num){ //Evalua Perfecto, Abundante y Defectivo
                System.out.println("El numero " + Num + " es Perfecto");
            }            
            else{
                if (Acum > Num){
                    System.out.println("El " + Num + " = " + Coc + ": Defectivo");
                }
                else{
                    if (Acum < Num){
                        System.out.println("El " + Num + " = " + Coc + ": Abundante");
                    }               
                }
            }
            
            Acum = 0;
            Cont = 0;            
            Coc = "1";
            
            System.out.println("\nIngrese un numero entero: ");
            Num = input.nextInt();
            
         }        
    }
}
