/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionvectores;

import java.util.Scanner;
/**
 *
 * @author VHC
 */
public class AplicacionVectores {
        
    public static void main(String[] args) {
        
        //Vectores
        Scanner input = new Scanner(System.in);
        int VEC1[] = new int[10];
        int[] VEC2 = new int[10];
        int VEC3[] = {1,2,3,4};
        //Matriz
        float MAT[][] = new float[5][10];
        //varias Matrices
        float MAT2[][] = {{5,2,2,1,5,8,7,9,5,6,5,4},{1},{1,2,3,4}};
        
        int Tamaño = VEC3.length;
        int i;
               
        int Num;
        //System.out.println("Digite un Boolean: ");        
        //Num = input.nextInt();
        System.out.println("El tamaño es: " + Tamaño);
        
        for (i=0;i<VEC3.length;i++){
            System.out.println("El numero de la posicion " + i + "es: " + VEC3[i]);
        }
    }
}
