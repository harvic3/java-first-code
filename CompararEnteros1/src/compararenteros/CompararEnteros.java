/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compararenteros;

/**
 *
 * @author sala207
 */
public class CompararEnteros {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        int NUM1 = 5;
        int NUM2 = 5;
        int i;
        
        if (NUM1 > NUM2){
            System.out.println("El numero Mayor es: " + NUM1);
        }
        else{
            if (NUM1 < NUM2){
                System.out.println("El numero Mayor es: " + NUM2);
            }
            else{
                System.out.println("Los numeros son iguales");
            }         
        }    
        System.out.println("Con ciclo para");
        for (i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("Con ciclo Mientras");
        i=0;
        while (i != 10){
            i++;
            System.out.println(i);
        }
        System.out.println("Con ciclo Do While");
        i=0;
        do{
            i++;
            System.out.println(i);
        }while(i != 10);
    }
}
