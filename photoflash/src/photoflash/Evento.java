/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package photoflash;
import java.util.Scanner;
/**
 *
 * @author sala207
 */
public class Evento {
    String MatStr[][];    
    int MatNum[][];
    double MatCal[][];
    
    public Evento () {
        MatStr = new String[31][3];
        MatNum = new int[31][4];
        MatCal = new double[31][2];
    }
    
    void InsertarInst (int POS, String Nom, String Tipo, String Dir, int NG, int Hora, int Min) {
        Scanner Input = new Scanner(System.in);
        if (MatNum[POS][0] == 1) {
            do {
                System.out.println("¡ATENCIÓN! No se puede programar el evento porque ese día no está disponible.");
                System.out.println("Ingrese un Numero de Día diferente: ");
                POS = Input.nextInt();
                POS--; //Bajamos un día por el cero de la matriz
            }while(MatNum[POS][0] == 1);            
        }

        MatNum[POS][0] = 1;//Día Ocupado
        //Datos String
        MatStr[POS][0] = Nom; //Guardamos Nombre
        MatStr[POS][1] = Tipo; //Guardamos Tipo
        MatStr[POS][2] = Dir; //Guardamos Dirección
        //Datos Enteros
        MatNum[POS][1] = NG; //Guardamos Numero de Graduados
        MatNum[POS][2] = Hora; //Guardamos la Hora del Evento
        MatNum[POS][3] = Min; //Guardamos los Minutos del Evento
        //Calculos
        if (Tipo.equals("Colegio")) {//Descuento del 10% para Colegio
            MatCal[POS][0] = 300000 * 0.1;
            MatCal[POS][1] = 300000 - MatCal[POS][0];
        }
        else {
            MatCal[POS][0] = 300000 * 0.2;//Descuento del 20% para Universidad
            MatCal[POS][1] = 300000 - MatCal[POS][0];
        }
        System.out.println("Evento ingresado correctamente...");            
    }//Fin Metodo Ingresar
    
}//Fin Clase Evento