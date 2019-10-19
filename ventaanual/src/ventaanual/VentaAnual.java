/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaanual;

import java.util.Scanner;

class Funciones {
    
    void MostrarMes(int Mes) {
        switch(Mes){
            case 1:System.out.print("Enero");
                   break;
            case 2:System.out.print("Febrero");
                   break;
            case 3:System.out.print("Marzo");
                   break;
            case 4:System.out.print("Abríl");
                   break;
            case 5:System.out.print("Mayo");
                   break;
            case 6:System.out.print("Junio");
                   break;
            case 7:System.out.print("Julio");
                   break;
            case 8:System.out.print("Agosto");
                   break;
            case 9:System.out.print("Septiembre");
                   break;
            case 10:System.out.print("Octubre");
                   break;
            case 11:System.out.print("Noviembre");
                   break;
            case 12:System.out.print("Diciembre");
                   break;             
        }
    }
    
    int MostrarMayor(float VVentas[]) {
        int i, Mes = 0;
        float Suma = 0, Mayor = 0;
        
        for (i=0;i<12;i++) {
            if (VVentas[i] > Mayor) {
                Mayor = VVentas[i];
                Mes = i+1;                
            }
            Suma = Suma + VVentas[i];
        }
        
        System.out.println("El Promedio de las ventas es: " + Suma/12);
        return (Mes);        
    }
}

/**
 *
 * @author victhi
 */
public class VentaAnual {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
            
        int i, Mes;
        float VVentas[] = new float[12];//Vector Ventas
        
        Funciones BuscarMes = new Funciones();//Objeto Mes

        for (i=0;i<12;i++){
            Mes = i+1;
            System.out.print("Inserte las ventas para el mes de ");
            BuscarMes.MostrarMes(Mes);
            System.out.println(": ");
            VVentas[i] = input.nextFloat();
        }
        
        Funciones BuscarMayor = new Funciones();
        Mes = BuscarMayor.MostrarMayor(VVentas);
        System.out.print("El Mes de Mayor ventas es: ");
        BuscarMes.MostrarMes(Mes);
    }
}