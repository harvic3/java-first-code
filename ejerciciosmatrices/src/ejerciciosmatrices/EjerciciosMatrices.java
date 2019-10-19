/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmatrices;
import java.util.Scanner;

/**
 *
 * @author victhi
 */   


public class EjerciciosMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int Menu = 4;
        
        while (Menu != 0) {
            
            switch (Menu) {
                case 1://Ejercicio Uno. Sumar Matrices
                    int Val = 0;
        
                    Procedimientos CrearMatA = new Procedimientos();
                    int MatA[][] = CrearMatA.CrearMatriz('A');

                    Procedimientos CrearMatB = new Procedimientos();
                    int MatB[][] = CrearMatB.CrearMatriz('B');        

                    Procedimientos Validar = new Procedimientos();
                    Val = Validar.ValidarSuma(MatA, MatB);

                    if (Val == 1) {            
                        Procedimientos LlenarMatA = new Procedimientos();
                        LlenarMatA.LlenarMatriz(MatA, 'A');

                        Procedimientos LlenarMatB = new Procedimientos();
                        LlenarMatB.LlenarMatriz(MatB, 'B');

                        Procedimientos Sumar = new Procedimientos();
                        Sumar.SumarMatrices(MatA, MatB);
                    }
                    
                    Menu = 4;
                    break;
                case 2://Ejercicio Dos. Matriz Simétrica
                    Procedimientos CrearMat = new Procedimientos();
                    int Mat[][] = CrearMat.CrearMatriz('A');
                    
                    if (Mat.length == Mat[0].length) {
                        Procedimientos LlenarMatC = new Procedimientos();
                        LlenarMatC.LlenarMatriz(Mat, 'A');
                        
                        Procedimientos MostrarMat = new Procedimientos();
                        MostrarMat.MostrarMatriz(Mat);
                                
                        Procedimientos Evaluar = new Procedimientos();
                        Evaluar.EvaluarSimetricidad(Mat);
                    }
                    else {
                        System.out.println("La Matriz A NO es Simétrica.");
                    }
                    
                    Menu = 4;
                    break;
                case 3://Ejercicio Tres. Ventas Empresa                  
                    
                    Procedimientos CalcParametros = new Procedimientos();
                    CalcParametros.EjercicioTres();
                    
                    Menu = 4;
                    break;
                case 4:
                    System.out.println("Menu Principal: ");
                    System.out.println("PRESIONE 1 para sumar dos matrices. ");
                    System.out.println("PRESIONE 2 para verificar si una matriz es simétrica. ");
                    System.out.println("PRESIONE 3 para el ejercicio de la empresa. ");
                    System.out.println("PRESIONE Cero para Salir. ");
                    System.out.print("Esperando Opción: ");
                    Menu = input.nextInt();
                    break;
            }
            
        }    
        
    }    
}
