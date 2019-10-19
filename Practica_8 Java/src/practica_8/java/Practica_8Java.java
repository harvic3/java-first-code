/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_8.java;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sala304
 */
public class Practica_8Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, M;
        
        System.out.println("Ingrese Filas de la matriz: ");
        N = input.nextInt();
        System.out.println("Ingrese Columnas de la matriz: ");
        M = input.nextInt();
        
        int Mat[][] = new int[N][M];
        
        Mat = GenMat(N, M); //Llenamos Matriz
        
        System.out.println("\nLa Matriz es: ");
        MosMat(Mat, N, M);
        
        MosDiaPp(Mat, N, M);
        
        
        
        
    }
    
    //Función Generar
    public static int[][] GenMat(int N, int M){
        int i, j = 0, Num = 0;
        Random Rnd = new Random();
        
        int MatG[][] = new int[N][M];
        
        for (i=0;i<N;i++){
            for (j=0;j<M;j++){
                //while (Num == 0){
                    Num = Rnd.nextInt(N*M);
                //}
                MatG[i][j] = Num;
            }        
        }        
        return(MatG);
    }
    
    //Busqueda en la Matriz
    public static int[] BusElem(int Mat[][], int N, int M, int NumBus){
	int i, j, F = N, C = N;
        int Vec[] = new int[3];
        Vec[2] = 0;
        
	for(i=0;i<N;i++){
            for(j=0;j<M;j++){
                if(Mat[i][j] == NumBus){
                    F = i+1;
                    C = j+1;
                    i = j = N;
                }	
            }
	}
        if ((F!=N+1)&&(C!=N+1)){
            System.out.println("El numero " + NumBus + " fue encontrado en la Fila " + F + " Columna " + C);
            Vec[0] = F;
            Vec[1] = C;
            Vec[2] = 1;
        }else{        
            System.out.println("El numero no fue encontrado");
        }
        return(Vec);
    }
    
    //Función Generar con Ceros
    public static int[][] GenMatCero(int N, int M){
        int i, j = 0;        
        int MatG[][] = new int[N][M];
        
        for (i=0;i<N;i++){
            for (j=0;j<M;j++){                
                MatG[i][j] = 0;
            }        
        }        
        return(MatG);
    }
    
    //Función Mostrar Matriz
    public static void MosMat(int Mat[][], int N, int M){
        int i, j;
        
        for (i=0;i<N;i++){            
            for (j=0;j<M;j++){
                if (Mat[i][j]>9 ){
                    System.out.print(Mat[i][j] + " ");
                }else{
                    System.out.print(Mat[i][j] + "  ");
                }
            }
            System.out.println();
        }       
    }
    
    //Mostrar Diagonal Ppal y Sec
    public static void MosDiaPp(int Mat[][], int N, int M){
        int i, j, k = M-1;
        
        System.out.println("\nLa diagonal Ppal es: ");        
        for (i=0;i<N;i++){            
            for (j=0;j<M;j++){
                if (i == j){
                    System.out.print("\033[34m" + Mat[i][j] + " ");                    
                }else{
                    System.out.print("\033[30m" + Mat[i][j] + " "); 
                }
            }
            System.out.println();
        }
        
        System.out.println("\033[30m\nLa diagonal Sec es: ");        
        for (i=0;i<N;i++){            
            for (j=0;j<M;j++){
                if (j == k){
                    if (Mat[i][j]>9 ){
                        System.out.print("\033[32m" + Mat[i][j] + " ");
                    }else{
                        System.out.print("\033[32m" + Mat[i][j] + "  ");
                    }   
                }else{
                    System.out.print("\033[30m" + Mat[i][j] + " "); 
                }                
            }
            k--;
            System.out.println();
        }
    }
    
    
    
}
