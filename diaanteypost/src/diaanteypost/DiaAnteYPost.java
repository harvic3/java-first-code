/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaanteypost;
import java.util.Scanner;

/**
 *
 * @author sala302
 */
public class DiaAnteYPost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Fecha MatFecha = new Fecha();
       
        int Dia, Mes, Año, i;
        
        for (i=0;i<5;i++){
            System.out.println("Por Favor ingrese la Fecha " + (i+1));
            System.out.print("Ingrese Día: ");
            Dia = Input.nextInt();
            System.out.print("Ingrese Mes: ");
            Mes = Input.nextInt();
            System.out.print("Ingrese Año: ");
            Año = Input.nextInt();
            
            if ((Dia>0)&(Dia<=31)&(Mes>0)&(Mes<=12)&(Año>0)){//Evaluo algun cero
                //Fecha MatFecha = new Fecha(Dia, Mes, Año, Pos);
                MatFecha.AntFecha(Dia, Mes, Año);
                MatFecha.SigFecha(Dia, Mes, Año);
            }else{
                System.out.println("Fecha No valida, ingrese de nuevo");
                i = i-1;
            }        
        }
        System.out.println("Terminó el Programa. Suerte!!");       
        
    }
}
