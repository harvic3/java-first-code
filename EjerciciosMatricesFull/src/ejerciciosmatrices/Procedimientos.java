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
    
    int[] LlenarVector () {
        int i, N;
        System.out.print("Ingrese la cantidad de Números: ");
        N = input.nextInt();
        int VNum[] = new int[N];
        
        for (i=0;i<VNum.length;i++) {
            System.out.println("Ingrese el número " + i+1 + ": ");
            VNum[i] = input.nextInt();
        }
        
        return (VNum);
    }
    
    //Ejercicio Venta Anual
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
    //------------------------------------------------------------------
    //Ejercicio Vectores Buscar Negativos y cambiar a Cero y Ordenar Acendentemente
    void OrdenarVector (int VNum[]) {
        int i, j, Num;
        
        for (i=0;i<VNum.length;i++) {
            for (j=i+1;j<VNum.length;j++) {
                if (VNum[i]>VNum[j]) {
                    Num = VNum[j];
                    VNum[j] = VNum[i];
                    VNum[i] = Num;
                }
            }
        }
        System.out.println("El Vector ordenado ascendentemente es: ");
        for (i=0;i<VNum.length;i++) {
            System.out.print(VNum[i] + " ");
        }
        System.out.println();
    }
    
    void BuscarNeg (int VNum[]) {
        int i;
        
        System.out.println("Los Numeros son: ");
        
        for (i=0;i<VNum.length;i++) {
            if (VNum[i] < 0) {
                VNum[i] = 0;
            }
            System.out.print(VNum[i] + " ");
        }
        System.out.println();
        
    }    
    //------------------------------------------------------------------
    //Ejercicio Vectores Desviacion Estandar
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
    //------------------------------------------------------------------
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
