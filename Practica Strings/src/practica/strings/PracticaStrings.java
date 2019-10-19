/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.strings;
import java.util.Scanner;

/**
 *
 * @author sala304
 */
public class PracticaStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        String m = "Victor Alfonso Higuita Cañas";
        //String n = " ";
        int i, k = 0, kAux = 0, Tam = 0, Cont1 = 1, Cont2 = 1;
        char j = ' ';
        
        Tam = m.length();
        
        for (i=0;i<Tam;i++){
            
            kAux = k = m.indexOf(" ", kAux+1);
           
            if (m.charAt(i) == ' '){
                if (m.charAt(i-1) != m.charAt(i)){
                    Cont2++;
                }                                
            }
            
            if (k != 0){
               Cont1++;
            }            
            k = 0;
        }
        
        System.out.println("La cantidad de letras son: " + Cont1);
        System.out.println("La cantidad de palabras son: " + Cont2);
        
    }
    
}
