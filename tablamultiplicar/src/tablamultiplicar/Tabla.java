/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

/**
 *
 * @author sala302
 */
public class Tabla {
    private int Num;
    private int N;
    private int M;
        
    public void Multipli(int Num, int N, int M){
        int[][] MatTabla = new int[M-N][3];
        
        int i, NTemp = N;
        int Rango = M-N;
        System.out.println("Rango es: " + Rango);
        
        for (i=0;i<Rango;i++){
            MatTabla[i][0] = Num;
            MatTabla[i][1] = NTemp;
            MatTabla[i][2] = Num * NTemp;
            NTemp++;
        }
        
        System.out.println("La Tabla del Numero " + Num + " desde " + N + " hasta " + M + " es: ");
        for (i=0;i<Rango;i++){
            System.out.println(MatTabla[i][0] + " x " + MatTabla[i][1] + " = " + MatTabla[i][2]);        
        }    
    }
    
}
