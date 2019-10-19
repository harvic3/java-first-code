/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_6_java;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author sala304
 */
public class Practica_6_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random Rnd = new Random();
        int N = 0, NumB; 
        
        System.out.println("Ingrese un entero para tamaño de matriz: ");
        N = input.nextInt();
        
        /*while (N == 0){
            N = Rnd.nextInt(10); //Tamaño Matriz
        }*/        
        //N = 3; //OJO
        
        int Mat[][] = new int[N][N]; //Creamos Matriz
        System.out.println("N es: " + N);
        Mat = GenMat(N); //Generamos matriz
        System.out.println("La Matriz generada es: ");
        MosMat(Mat, N); //Mostrar Matriz
        MosDiaPp(Mat, N);
        SumDiaPpSec(Mat, N);
        Mat = OrdMat(Mat, N);
        System.out.println("La Matriz Ordenada es: ");
        MosMat(Mat, N); //Mostrar Matriz
        System.out.println("Ingrese un numero a Buscar: ");
        NumB = input.nextInt();
        BusElem(Mat, N, NumB); //Mostrar Matriz
        
        
        
    }
    
    //Función Generar
    public static int[][] GenMat(int N){
        int i, j = 0, Num = 0;
        Random Rnd = new Random();        
        int MatG[][] = new int[N][N];
        
        for (i=0;i<N;i++){
            for (j=0;j<N;j++){
                //while (Num == 0){
                    Num = Rnd.nextInt(10);
                //}
                MatG[i][j] = Num;
            }        
        }        
        return(MatG);
    }
    
    //Función Mostrar
    public static void MosMat(int Mat[][], int N){
        int i, j;
        
        for (i=0;i<N;i++){            
            for (j=0;j<N;j++){
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }       
    }
    
    //Mostrar Diagonal Ppal y Sec y su respectiva Suma
    public static void MosDiaPp(int Mat[][], int N){
        int i, j, Suma = 0;
        
        System.out.println("La diagonal Ppal es: ");
        for (i=0;i<N;i++){  
            System.out.print(Mat[i][i] + " ");
            Suma = Suma + Mat[i][i];
        }
        System.out.println("La Suma de la diagonal Principal es: " + Suma);
        Suma = 0;
        System.out.println("La diagonal Secundaria es: ");
        for (i=N-1;i>=0;i--){
            System.out.print(Mat[N-i-1][i] + " ");
            Suma = Suma + Mat[N-i-1][i];
        }
        System.out.println("La Suma de la diagonal Secundaria es: " + Suma);        
    }
    
    //Mostrar Sobre y Debajo de las Diagonales
    public static void SumDiaPpSec(int Mat[][], int N){
        int i, j, k = 0, Suma = 0;
        
        System.out.println("Sobre la diagonal Principal tenemos: ");
        for (i=0;i<N-k;i++){
            for (j=k+1;j<N;j++){
                System.out.print(Mat[i][j] + " ");
                Suma = Suma + Mat[i][j];
            }
            k++;
        }
        if (N > 3){
            System.out.print(Mat[i][N-1] + " ");
            Suma = Suma + Mat[i][N-1];
        }
        
        System.out.println("La Suma Sobre la diagonal Principal es: " + Suma);
        Suma = 0;
        k = 0;
        
        System.out.println("Debajo la diagonal Principal tenemos: ");
        for (i=0;i<N-k;i++){
            for (j=k+1;j<N;j++){
                System.out.print(Mat[j][i] + " ");
                Suma = Suma + Mat[j][i];
            }
            k++;
        }
        if (N > 3){
            System.out.print(Mat[N-1][i] + " ");
            Suma = Suma + Mat[N-1][i];
        }
        
        System.out.println("La Suma Debajo la diagonal Principal es: " + Suma);
        Suma = 0;
        k = 0;
        
        System.out.println("Sobre la diagonal Secundaria tenemos: ");
        for (i=0;i<N-1;i++){            
            for (j=0;j<N-1-k;j++){
                System.out.print(Mat[i][j] + " ");
                Suma = Suma + Mat[i][j];
            }
            k++;            
        }        
        
        System.out.println("La Suma Sobre la diagonal Secundaria es: " + Suma);
        Suma = 0;
        k = 0;
        
        System.out.println("Debajo la diagonal Secundaria tenemos: ");
        for (i=N-1;i>=1;i--){            
            for (j=N-1;j>=1+k;j--){
                System.out.print(Mat[i][j] + " ");
                Suma = Suma + Mat[i][j];
            }
            k++;            
        }        
        
        System.out.println("La Suma Debajo la diagonal Secundaria es: " + Suma);
        Suma = 0;
        k = 0;
        
    }
    
    //Función Ordenar Matriz
    public static int[][] OrdMat(int Mat[][], int N){
        int i, j, x, y, AUX;
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                for(x=0;x<N;x++){
                    for(y=0;y<N;y++){
                        if(Mat[i][j] < Mat[x][y]){
                            AUX = Mat[i][j];
                            Mat[i][j] = Mat[x][y];
                            Mat[x][y] = AUX;
                        }
                    }
                }
            }
        }
        return(Mat);
    }
    
    //Busqueda en la Matriz
    public static void BusElem(int Mat[][], int N, int NumBus){
	int i, j, F = 20, C = 20;
	for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                if(Mat[i][j] == NumBus){
                    F = i+1;
                    C = j+1;
                    i = j = N;
                }	
            }
	}
        if ((F!=20)&&(C!=20)){
            System.out.println("El numero " + NumBus + " fue encontrado en la Fila " + F + " Columna " + C);
        }else{        
            System.out.println("El numero no fue encontrado");
        }
    }
    
}
