/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estimulosuniversidad;
import java.util.Scanner;
/**
 *
 * @author sala304
 */
public class EstimulosUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int i = 1;
        
        short Tipo;
        String Nombre;
        float Prom;
        
        
        while (i != 0){
            System.out.println("Ingrese nombre del estudiante: ");
            Nombre = Input.nextLine();

            System.out.println("Presione 1 si es Pregrado, 2 si es Posgrado: ");
            Tipo = Input.nextShort();

            System.out.println("Ingrese el Promedio del Estudiante " + Nombre + ":");
            Prom = Input.nextFloat();
            
            Estudiante N = new Estudiante(Nombre, Tipo, Prom);

            N.CalcValMatYCred();
            
            System.out.println("Presione 1 si si desea ingresar más estudiantes o 0 para terminar: ");
            i = Input.nextInt();
        }    
        
        
    }
    
}
