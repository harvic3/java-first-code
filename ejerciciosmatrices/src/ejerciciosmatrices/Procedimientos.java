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
public class Procedimientos {
    
    Scanner input = new Scanner(System.in);
    
    int[][] CrearMatriz (char Nom){
               
        int FM, CM;        
        
        System.out.println("Ingrese # de Filas para la Matriz " + Nom + ": ");
        FM = input.nextInt();
        System.out.println("Ingrese # de Colunmas para la Matriz " + Nom + ": ");
        CM = input.nextInt();      
        
        int Mat[][] = new int[FM][CM];
        
        return (Mat);
    
    }
    
    int ValidarSuma (int MatA[][], int MatB[][]) {
               
        if ((MatA.length == MatB.length) && (MatA[0].length == MatB[0].length)) {
            return (1);
        }
        else {
            System.out.println("Las matrices no se pueden sumar.");
            return (0);
        }        
    }
    
    int[][] LlenarMatriz (int Mat[][], char Nom) {        
        int i, j;
                
        //Llenar Matrices
        for (i=0;i<Mat.length;i++) {
            for (j=0;j<Mat[i].length;j++) {
                System.out.println("Ingrese numero para la matriz " + Nom + " en la fila " + i+1 + " columna " + j+1 + ":");
                Mat[i][j] = input.nextInt();
            }
        }
        return (Mat);
    }
    
    void SumarMatrices (int MatA[][], int MatB[][]) {
        int i, j;
        int MatR[][] = new int[MatA.length][MatA[0].length];
        
        for (i=0;i<MatA.length;i++) {
            for (j=0;j<MatA[i].length;j++) {
                MatR[i][j] = MatA[i][j] + MatB[i][j];
            }
        }
        
        System.out.println("La matriz suma es: ");
        for (i=0;i<MatR.length;i++) {
            for (j=0;j<MatR[i].length;j++) {
                System.out.print(MatR[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    void EvaluarSimetricidad (int Mat[][]) {
        int i, j, Eva = 1;
        
        while (Eva == 1) {
            for (i=0;i<Mat.length;i++) {
                for (j=0;j<Mat[i].length;j++) {
                    if (Mat[i][j] != Mat [j][i]) {
                        System.out.println("La Matriz A NO es Simétrica.");
                        Eva = 0;
                        break;
                    }                
                }
                if (Eva == 0) {
                    break;
                }
            }
            if (Eva == 1) {
                System.out.println("La Matriz A es Simétrica.");
                Eva = 0;
            }
        }
        
    }
    
    void MostrarMatriz (int Mat[][]) {
        int i, j;
        
        System.out.println("La Matriz ingresada es: ");
        for (i=0;i<Mat.length;i++) {
            for (j=0;j<Mat[i].length;j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    void EjercicioTres () {
        int i, j, MaxVen = 0, NVenOcho = 0;
        float CDin = 0, MayDin = 0;
                
        int MVen[][] = new int[3][10];//Matriz Cantidades por producto
        float VPre[] = new float[10];//Vector Precios
        int VCanVen[] = new int[10];
        
        System.out.println("Ingrese la cantidad de articulos vendidos por cada vendedor: ");
        for (i=0;i<MVen.length;i++) {
            for (j=0;j<MVen[i].length;j++) {
                System.out.println("Ingrese articulos Cod " + j+1 + " para el vendedor " + i+1 + ": ");
                MVen[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Ingrese el Precio de los articulos según su consecutivo: ");
        for (i=0;i<VPre.length;i++) {
            System.out.println("Ingrese Precio del Articulo Cod " + i+1 + ": ");
            VPre[i] = input.nextFloat();
            VCanVen[i] = 0; //Inicializo Vector de Cantidad de Articulos vendidos
        }
        
        //Sumar Cantidad de Ventas por Vendedor
        for (i=0;i<MVen.length;i++) {
            for (j=0;j<MVen[i].length;j++) {
                CDin = CDin + MVen[i][j] * VPre[j];
                VCanVen[j] = VCanVen[j] + MVen[i][j]; //Acumulamos Cantidad de Articulos por categoria vendidos.
            }
            System.out.println("El Valor de Ventas del Vendedor " + i+1 + " es: " + CDin); //Se Imprime las ventas por cada vendedor.
            if (CDin > MayDin) {
                MayDin = CDin;
                MaxVen = i+1; //Se guarda el vendedor con mayores ventas
            }
            CDin = 0; //Se Inicializa el Acumulador
        }
        
        //Buscamos los no vendedores del Articulo ocho
        for (i=0;i<MVen.length;i++) {
            if (MVen[i][8] == 0) {
                NVenOcho++;
            }
        }
        
        //Imprimimos Datos
        System.out.println("El numero de vendedor con la mayor venta es: " + MaxVen);
        MaxVen = 0;
        int Pos = 0;
        for (i=0;i<VCanVen.length;i++) {
            if (VCanVen[i] > MaxVen) {
                MaxVen = VCanVen[i];
                Pos = i+1;
            }
        }
        System.out.println("El articulo más vendido fue: " + Pos);
        System.out.println("No vendieron el articulo numero ocho " + NVenOcho + " Vendedores");        
    }
    
}
