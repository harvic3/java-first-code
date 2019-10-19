/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesopersonas;
import java.util.Scanner;
/**
 *
 * @author VHC
 */

public class PesoPersonas {
              
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int W = 1;
        System.out.println("Ingrese información según se le solicite.");
        while (W != 0) {            
            Calculos X = new Calculos();
            X.CrearSujeto();
            X.MostrarSujeto(X.Nombre, X.Estado);
            System.out.println("Si desea Ingresar pacientes presione 1, de lo contrario 0.");
            W = in.nextInt();
        }        
   }
}
    
