/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package notasmatrices;
import java.util.Scanner;

/**
 *
 * @author victhi
 */
class Calculos {
    
    void EncontrarPromedio (float MatNot[][]){
       int i,j;
       float Suma = 0; 
       
       for (i=0;i<MatNot.length;i++){
            for (j=0;j<MatNot[i].length;j++){
                Suma = Suma + MatNot[i][j];                              
            }            
            System.out.println("La Nota promedio del Alumno " + i+1 + " es de: " + Suma/MatNot[i].length);
            Suma = 0;
        }
    }
    
    void EncontrarMayor (float MatNot[][]){
        int i,j;
        float May = 0;
        
        for (i=0;i<MatNot.length;i++){
            for (j=0;j<MatNot[i].length;j++){
                if (May < MatNot[i][j]){
                    May = MatNot[i][j];
                }
            }
            System.out.println("La Nota Mayor del Alumno " + i+1 + " es: " + May);
            May = 0;
        }
    }
    
}

public class NotasMatrices {

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
        float MatNot[][] = new float[NumEst][NumNotas];//Matriz Notas
                
        //Capturar Notas
        for (i=0;i<NumEst;i++){
            for (j=0;j<NumNotas;j++){
                System.out.println("Ingrese Nota " + j+1 + " Para el estudiante " + i+1 + ": ");
                MatNot[i][j] = input.nextFloat();
            }
        }
        
        Calculos NotaPromedio = new Calculos();
        NotaPromedio.EncontrarPromedio(MatNot);
        
        Calculos NotaMayor = new Calculos();
        NotaMayor.EncontrarMayor(MatNot);
        
    }    
}
