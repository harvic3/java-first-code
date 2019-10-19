/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosvectores;

import java.util.Scanner;

/**
 *
 * @author victhi
 */
class Calculos {
    
    void EncontrarPromedio (float VecNot[]){
       int i;
       float Suma = 0; 
       
       for (i=0;i<VecNot.length;i++){            
                Suma = Suma + VecNot[i];                              
            }            
            System.out.println("La Nota promedio del Alumno " + i+1 + " es de: " + Suma/VecNot.length);
            Suma = 0;
        }
    
    void EncontrarMayor (float VecNot[]){
        int i;
        float May = 0;
        
        for (i=0;i<VecNot.length;i++){            
                if (May < VecNot[i]){
                    May = VecNot[i];
                }
            }
            System.out.println("La Nota Mayor del Alumno es: " + May);
            May = 0;
    }    
}

public class EjerciciosVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int NumEst; //Numero Estudiantes
        int NumNotas; //Numero de Notas
        int i=1,j;
        
        System.out.print("Ingrese Cantidad de Estudiantes: ");
        NumEst = input.nextInt();
        System.out.print("Ingrese Numero de Notas: ");
        NumNotas = input.nextInt();
        float VecNot[] = new float[NumNotas];//Vector Notas
                
        //Capturar Notas
        for (i=0;i<NumEst;i++){
            for (j=0;j<NumNotas;j++){
                System.out.println("Ingrese Nota " + j+1 + " Para el estudiante " + i+1 + ": ");
                VecNot[j] = input.nextFloat();
            }
            Calculos NotaPromedio = new Calculos();
            NotaPromedio.EncontrarPromedio(VecNot);

            Calculos NotaMayor = new Calculos();
            NotaMayor.EncontrarMayor(VecNot);
        }       
    }
}
