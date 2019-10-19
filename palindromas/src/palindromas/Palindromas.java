/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromas;
import java.util.Scanner;

/**
 *
 * @author sala208
 */
public class Palindromas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String Pal;
        FunPal();
        
        
    }
    
    //Función String
    public static void FunPal(){
        Scanner Input = new Scanner(System.in);
        String P;
        boolean Band = false;
        int i, j, Tam;
        System.out.println("Inserte una frase o palabra: ");
        P = Input.nextLine();
        System.out.println("Original_" +P);
        P = P.toUpperCase();
        System.out.println("Mayuscula_"+P);
        
        P = P.trim();
        System.out.println("Sin espacios finales_"+P);
        Tam = P.length();
        
        P = P.replace(" ", "");        
        
        System.out.println("Sin Espacios_" + P);
        
        Tam = P.length();
        
        for (i=0;i<Tam-1;i++){
            if (P.charAt(i) == P.charAt(Tam - i -1)){
                if ((i == Tam-i-1) || (i > Tam-1)){
                    Band = true;
                    break;
                }                    
            }else{
                Band = false;
                System.out.println("La frase o palabra NO es Palindroma.");
                break;
            }        
        }
        
        if (Band == true){
            System.out.println("La frase o palabra es Palindroma.");
        }
    
    }
}
