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
        
        int i, j, Menu = 9;
        
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
                    
                    Menu = 9;
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
                    
                    Menu = 9;
                    break;
                case 3://Ejercicio Tres. Ventas Empresa                  
                    
                    Procedimientos CalcParametros = new Procedimientos();
                    CalcParametros.EjercicioTres();
                    
                    Menu = 9;
                    break;                
                case 4: //Ejercicio Vectores Venta Anual                    
                    int Mes;
                    float VVentas[] = new float[12];//Vector Ventas

                    Procedimientos BuscarMes = new Procedimientos();//Objeto Mes

                    for (i=0;i<12;i++){
                        Mes = i+1;
                        System.out.print("Inserte las ventas para el mes de ");
                        BuscarMes.MostrarMes(Mes);
                        System.out.println(": ");
                        VVentas[i] = input.nextFloat();
                    }

                    Procedimientos BuscarMayor = new Procedimientos();
                    Mes = BuscarMayor.MostrarMayor(VVentas);
                    System.out.print("El Mes de Mayor ventas es: ");
                    BuscarMes.MostrarMes(Mes);
                    System.out.println();
                    
                    Menu = 9;
                    break;
                case 5://Ejercicio Vectores Cambiar Negativos Por ceros
                    
                    Procedimientos LlenarV = new Procedimientos();
                    int VNum[] = LlenarV.LlenarVector();

                    Procedimientos OrdenarVector = new Procedimientos();//Ordenar Vector
                    OrdenarVector.OrdenarVector(VNum);

                    Procedimientos BuscarNegCero = new Procedimientos();//Cambiar los Negativos por ceros
                    BuscarNegCero.BuscarNeg(VNum);
                    
                    Menu = 9;
                    break;
                case 6://Ejercicio de Desviacion Estandar
                    int N;
                    float Prom;

                    System.out.println("Desviación estandar. ");
                    
                    Procedimientos LlenarV1 = new Procedimientos();
                    int VNum1[] = LlenarV1.LlenarVector();

                    Procedimientos Promedio = new Procedimientos();
                    Prom = Promedio.CalcularProm(VNum1);

                    Procedimientos Desviacion = new Procedimientos();
                    Desviacion.CalcularDesv(VNum1, Prom);
                    
                    Menu = 9;
                    break;
               case 9:
                    System.out.println("*****************Menu Principal*****************");
                    System.out.println("PRESIONE 1 para sumar dos matrices. ");
                    System.out.println("PRESIONE 2 para verificar si una matriz es simétrica. ");
                    System.out.println("PRESIONE 3 para el ejercicio de la empresa. ");
                    System.out.println("PRESIONE 4 para el ejercicio Vector Ventas Anuales. ");
                    System.out.println("PRESIONE 5 para el ejercicio Vector Ordenar y Cambiar Negativos por Ceros. ");
                    System.out.println("PRESIONE 6 para el ejercicio Vector Desviacion Estandar. ");
                    System.out.println("PRESIONE Cero para Salir. ");
                    System.out.print("Esperando Opción: ");
                    Menu = input.nextInt();
                    break;
            }            
        }    
        
    }    
}
