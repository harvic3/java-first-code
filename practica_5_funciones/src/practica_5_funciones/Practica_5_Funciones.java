/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_5_funciones;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author sala208
 */
public class Practica_5_Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random Rnd = new Random();
        int N = 0, NumB; 
        
        while (N == 0){
            N = Rnd.nextInt(10); //Tamaño Matriz
        }
        
        //N = 3; //OJO
        
        int Mat[][] = new int[N][N]; //Creamos Matriz
        System.out.println("N es: " + N);        
        
        Mat = GenMat(N); //Generamos matriz
        System.out.println("La Matriz generada es: ");
        MosMat(Mat, N); //Mostrar Matriz
        //Mat = OrdVect(Mat, N); //Ordenar
        Mat = OrdMat(Mat, N);
        System.out.println("La Matriz Ordenada es: ");
        MosMat(Mat, N); //Mostrar Matriz
        System.out.println("Ingrese un numero a Buscar: ");
        NumB = input.nextInt();
        BusElem(Mat, N, NumB); //Mostrar Matriz
        
    }
    
    //Función Generar
    public static int[][] GenMat(int N){
        int i, j = 0;
        Random Rnd = new Random();        
        int MatG[][] = new int[N][N];
        
        for (i=0;i<N;i++){
            for (j=0;j<N;j++){
                MatG[i][j] = Rnd.nextInt(10);
            }        
        }        
        return(MatG);
    }
    
    //Función Ordenar
    public static int[][] OrdVect(int Mat[][], int N){
        int i, j, k = N*N, AUX, PosV = 0;
        int Vec[] = new int[N*N];       
        
        for (i=0;i<N;i++){
            for (j=0;j<N;j++){
                Vec[PosV] = Mat[i][j];
                PosV++;
            }        
        }
        System.out.println("El Vector es: ");
        for (i=0;i<k;i++){            
                System.out.print(Vec[i] + " ");
        }
        System.out.println();
        
        for (i=0;i<k-1;i++){ //Ordenar Vector
            for (j=i+1;j<k;j++){
                if (Vec[j] < Vec[i]){
                    AUX = Vec[j];
                    Vec[j] = Vec[i];
                    Vec[i] = AUX;
                }
            }        
        }
        
        PosV = 0;
        for (i=0;i<N;i++){//Pasar Vector a matriz
            for (j=0;j<N;j++){
                Mat[i][j] = Vec[PosV];
                PosV++;
            }        
        }        
        return(Mat);
    }
    
    //Función Mostrar
    public static int[][] MosMat(int Mat[][], int N){
        int i, j;
        
        for (i=0;i<N;i++){            
            for (j=0;j<N;j++){
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }        
        return(null);
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
	int i, j, F = N, C = N;
	for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                if(Mat[i][j] == NumBus){
                    F = i+1;
                    C = j+1;
                    i = j = N;
                }	
            }
	}
        if ((F!=N+1)&&(C!=N+1)){
            System.out.println("El numero " + NumBus + " fue encontrado en la Fila " + F + " Columna " + C);
        }else{        
            System.out.println("El numero no fue encontrado");
        }
    }
    
}


