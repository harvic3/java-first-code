/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numposneg;

import java.util.Scanner;
/**
 *
 * @author victhi
 */
class Buscar {
    
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
    }    
}

public class NumPosNeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i, CNum;
        System.out.print("Ingrese la cantidad de Números: ");
        CNum = input.nextInt();
        int VNum[] = new int[CNum];
        
        for (i=0;i<VNum.length;i++) {
            System.out.println("Ingrese el número " + i+1 + ": ");
            VNum[i] = input.nextInt();
        }
        
        Buscar OrdenarVector = new Buscar();//Ordenar Vector
        OrdenarVector.OrdenarVector(VNum);
        
        Buscar BuscarNegCero = new Buscar();//Cambiar los Negativos por ceros
        BuscarNegCero.BuscarNeg(VNum);        
    }
}