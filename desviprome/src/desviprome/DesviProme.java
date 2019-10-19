/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desviprome;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author victhi
 */
class Calculos {
    
    float CalcularProm (int VNum[]) {
        int i, Suma = 0;
        float Prom;
        
        for (i=0;i<VNum.length;i++) {            
            Suma = Suma + VNum[i];
        }
        Prom = Suma/VNum.length;
        System.out.println("El Promedio es: " + Prom);
        return (Prom);
    }
    
    void CalcularDesv (int VNum[], float Prom) {
        int i;
        double Aux = 0, DesEst;
        for (i=0;i<VNum.length;i++) {//Calculo de Desviación         
            Aux = Aux + (Math.pow((VNum[i]-Prom),2)/VNum.length);
        }
        DesEst = Math.sqrt(Aux);
        System.out.println("La Desviación Estandar es: " + DesEst);
    }
}

public class DesviProme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i, N;
        float Prom;
        
        System.out.println("Ingrese Cantidad de elementos para la desviación estandar: ");
        N = input.nextInt();
        int VNum[] = new int[N];
        
        for (i=0;i<VNum.length;i++) {
            System.out.println("Ingrese Número " + i+1 + ": ");
            VNum[i] = input.nextInt();            
        }
        
        Calculos Promedio = new Calculos();
        Prom = Promedio.CalcularProm(VNum);
        
        Calculos Desviacion = new Calculos();
        Desviacion.CalcularDesv(VNum, Prom);
    }
}
