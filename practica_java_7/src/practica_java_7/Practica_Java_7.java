/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_java_7;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author sala208
 */
public class Practica_Java_7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random Rnd = new Random(); //Objeto ramdon
        
        int Ht, i, j, N = 3, Vht;
        int Mat[][] = new int[3][3];
        double Prom;
        
        
        for (i=0;i<N;i++){         
            System.out.println("Ingrese las Horas laboradas del Trabajador: ");
            Mat[i][0] = input.nextInt();
            System.out.println("Ingrese el valor de la hora del Trabajador: ");
            Mat[i][1] = input.nextInt();
        }
        
        for (i=0;i<N;i++){  
            Mat[i][2] = CalcSalario(Mat[i][0], Mat[i][1]);            
        }
        
        System.out.println("La Matriz Horas, Valor y Salario es: ");
        MosMat(Mat, N);
        
        Prom = CalcProm(Mat[0][0], Mat[1][0],Mat[2][0]);
        System.out.println("El promedio de las Horas es: " + Prom);
        
        Prom = CalcProm(Mat[0][1], Mat[1][1],Mat[2][1]);
        System.out.println("El promedio del Valor de las Horas es: " + Prom);
        
        Prom = CalcProm(Mat[0][2], Mat[1][2],Mat[2][2]);
        System.out.println("El promedio de los Salarios es: " + Prom);
        
        BusMMM(Mat[0][2], Mat[1][2],Mat[2][2]);
        
        
    }
    
    //Funcion Mostrar Matriz
    public static void MosMat(int Mat[][], int N){
        int i, j;
        
        for (i=0;i<N;i++){            
            for (j=0;j<N;j++){
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }       
    }
    
    //Funcion Calc Promedio
    public static double CalcProm(int N, int M, int K){
        double Prom;
        
        Prom = (N+M+K)/3;       
        return(Prom);
    }
    
    //Funcion Ordenar Vector
    public static void OrdVec(int Vec[], int N){
        int i, j, AUX;
        
        for (i=0;i<N-1;i++){ //Ordenar Vector
            for (j=i+1;j<N;j++){
                if (Vec[j] < Vec[i]){
                    AUX = Vec[j];
                    Vec[j] = Vec[i];
                    Vec[i] = AUX;
                }
            }        
        }
        System.out.println("El Vector es: ");
        for (i=0;i<N;i++){            
                System.out.print(Vec[i] + " ");
        }
    }
    
    //Funcion Mayor, Medio y Menor
    public static void BusMMM(int N, int M, int K){
        int May, Med, Men, i, j, AUX;
        int Vec[] = new int[3];
        Vec[0] = N;
        Vec[1] = M;
        Vec[2] = K;
        
        if ((N > M)&(N > K)){ //Mayor
            May = N;
        }else{
            if ((M > N)&(M > K)){
                May = M;
            }else{
                May = K;
            }
        }
        
        if ((N < M)&(N < K)){ //Menor
            Men = N;
        }else{
            if ((M < N)&(M < K)){
                Men = M;
            }else{
                Men = K;
            }
        }
        
        if ((N > M)&(N < K)){ //Medio
            Med = N;
        }else{
            if ((M > N)&(M < K)){
                Med = M;
            }else{
                Med = K;
            }
        }
        /*
        for (i=0;i<N-1;i++){ //Ordenar Vector
            for (j=i+1;j<N;j++){
                if (Vec[j] > Vec[i]){
                    AUX = Vec[j];
                    Vec[j] = Vec[i];
                    Vec[i] = AUX;
                }
            }        
        }*/
        System.out.println("El Mayor es: " + May + ", el Medio es: " + Med + ", el Menor es: " + Men);
        //System.out.println("El Mayor es: " + Vec[0] + ", el Medio es: " + Vec[1] + ", el Menor es: " + Vec[2]);
    }
    
    //Funcion Calcular Salario
    public static int CalcSalario(int Nht, int Vht){
        int Sal;
        int HextS = 0, HextT = 0;
        
        if (Nht > 40){            
            HextS = Nht - 40;
            Nht = 40;
            if (HextS > 8){
                HextT = HextS - 8;
                HextS = 8;
            }            
        }
        
        Sal = Nht*Vht + HextS*(Vht*2) + HextT*(Vht*3);
        return(Sal);        
    }
    
}
