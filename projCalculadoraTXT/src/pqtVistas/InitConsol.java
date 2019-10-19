/*
 * Aplicación para Restar dos numeros desde Consola.
 */
package pqtVistas;

import java.io.IOException;
import java.util.Scanner;

public class InitConsol {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        CFunctions Function = new CFunctions();
        pqtDatos.CReadTXT objReadFile = new pqtDatos.CReadTXT();
        pqtDatos.CWriteTXT objWriteFile = new pqtDatos.CWriteTXT();
        pqtCalculos.CResta Resta = new pqtCalculos.CResta();

        String strFilePatch = "1";
        boolean bolOperate = false;
        String strNumero1;
        String strNumero2;

        System.out.println("Programa Restar Números.");
        System.out.println("Operación: Ingrese los números según se le solicite.");
        do {
            System.out.println();
            strNumero1 = Function.getNumber();
            strNumero2 = Function.getNumber();

            try {
                //Verificar Carga del Archivo
                if (strFilePatch.equals("1")) {
                    //Solicitamos Nombre para el Archivo.
                    //System.out.println("Por favor ingrese el Nombre del Archivo: ");
                    //String strNombre = input.nextLine();
                    //Solicitamso Ruta para el Archivo.
                    strFilePatch = objReadFile.LoadFile();
                    //strFilePatch = strFilePatch + strNombre + ".txt";
                    //Creamos el Archivo
                    objWriteFile.CreateFile(strFilePatch);
                }//If
                //Verificar si están los numeros para Restar.
                if (objReadFile.ReadFile(strFilePatch, (strNumero1 + " y " + strNumero2))) {
                    int intResta = Resta.Restar(Integer.parseInt(strNumero1), Integer.parseInt(strNumero2));
                    System.out.print("La resultado de " + strNumero1 + " - " + strNumero2 + " = " + intResta + "\n");
                    //Guardar Numeros nuevos
                    objWriteFile.WriteFile(strFilePatch, (strNumero1 + " y " + strNumero2));
                } else {
                    System.out.println("Los números ya han sido operados. Ingrese otros o salga de la aplicación.");
                }//Else
            } catch (IOException ex) {

            }
            //Preguntar si Salir.
            System.out.println("Si desea salir digite Exit, de lo contrario presione cualquier tecla: ");
            bolOperate = Function.Exit(input.nextLine());
        } while (bolOperate == false);//While

        System.out.println("Terminamos. Gracias!!");
    }//Main

}//Clase
