/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_archivostxt;
import java.util.Scanner;

/**
 *
 * @author victhi
 */
public class Ejemplo_ArchivosTXT {

    
    public static void main(String[] args) {
        
        Archivos Temp = new Archivos();
        
        Scanner Input = new Scanner(System.in);
        Scanner Input1 = new Scanner(System.in);
        String Name, Cadena;
        int X = 1;        
        
        System.out.println("Por favor Ingrese la dirección del Archivo: ");
        Name = Input.nextLine();
        
        while (X != 0){            
            System.out.println("Por favor Ingrese el nombre para guardar en el Archivo: ");
            Cadena = Input1.nextLine();          
            
            Temp.EscribirArchivo(Name, Cadena);
            Temp.LeerArchivo(Name);
            
            System.out.println("Si desea seguir Ingresando Nombres presione 1, sino 0: ");
            X = Input.nextInt();
        }

    }

}
