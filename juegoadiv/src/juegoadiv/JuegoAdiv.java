/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoadiv;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author victhi
 */
public class JuegoAdiv {   
    int[][] MatJ; 

    public JuegoAdiv () {
        MatJ = new int[10][4];
    }

    void InsertarVectorNumeros (int[] Vec, int Pos) {
        int k;
        for (k=0;k<4;k++) {
            MatJ[Pos][k] = Vec[k];
        }
    }

    void ImprimirMatriz () {
        int j;
        for (j=0;j<10;j++) {
            System.out.print("El numero Aleatorio era, " + MatJ[j][0] + ". Los Ingresados fueron: ");
            System.out.println(MatJ[j][1] + ", " + MatJ[j][2] + ", " + MatJ[j][3]);
        }
    }    
    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        JuegoAdiv MNum = new JuegoAdiv();
        Random NumAle = new Random(10+1);
        
        short SW = 1;
        int k, j, ContAcier = 0;
        int[] VecNum = new int[4];
        
        while (SW == 1) {
           for (k=0;k<10;k++) {
               VecNum[0] = NumAle.nextInt(10+1); 
               System.out.println("El Numero Aleatorio es: " + VecNum[0]);
               for (j=1;j<4;j++) {
                   do {
                       System.out.println("Intento " + j + " de 3. Adivina el numero de 1 a 10: ");
                       VecNum[j] = Input.nextInt();
                   }while ((VecNum[j] <= 0)||(VecNum[j] > 10));
                   if (VecNum[j] > VecNum[0]) {
                       System.out.println("El Numero que ingresó es Mayor que el Aleatorio.");
                   }
                   else if (VecNum[j] < VecNum[0]) {
                       System.out.println("El Numero que ingresó es Menor que el Aleatorio.");
                   }
                   else if (VecNum[j] == VecNum[0]) {
                       System.out.println("Felicitaciones, Adivinaste el Numero.");
                       ContAcier++;
                   }                   
               }
               if (ContAcier == 3) {
                   System.out.println("Felicitaciones, Adivinó en las 3 ocasiones");
               }
               else {
                   System.out.println("Oh que mal, No adivinaste en las 3 ocasiones, aún puedes logralo, "
                           + "te quedan " + (9 - k) + " Intentoss.");
               }
               ContAcier = 0;
               MNum.InsertarVectorNumeros(VecNum, k);
           }
           System.out.println("El Juego Se Desarrolló Así: ");
           MNum.ImprimirMatriz();
           System.out.println("Sí desea jugar de nuevo Presione 1, sino Presione 0.");
           SW = Input.nextShort();
        }       
    }
}
