/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;
import java.util.Scanner;
/**
 *
 * @author sala302
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Num, N, M, Band = 1;
        Tabla TNum = new Tabla();
        
        while (Band != 0){
            System.out.println("Ingrese el Numero para la Tabla: ");
            Num = Input.nextInt();
            System.out.println("Ingrese el rango Menor: ");
            N = Input.nextInt();
            System.out.println("Ingrese el rango Mayor: ");
            M = Input.nextInt();
            TNum.Multipli(Num, N, M);            
            
            System.out.println("Si desea seguir presione 1, sino presione 0: ");
            Band = Input.nextInt();
        }
    }
}
