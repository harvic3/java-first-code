
package apparchivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppArchivos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner teclado = new Scanner(System.in);
        String nom = null;
        String rutaarchivo = null;
        
        System.out.println("Ingrese nombre del archivo");
        nom = teclado.nextLine();
        
        OperArchPlanos.CrearArchivo(nom);
        rutaarchivo = OperArchPlanos.BuscarArchivo();
        System.out.println(rutaarchivo);
        OperArchPlanos.EscribirArchivo(rutaarchivo);
        OperArchPlanos.LeerArchivo(rutaarchivo);
       
    }
}
