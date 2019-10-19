package espejo;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Espejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Scanner Input2 = new Scanner(System.in);
        Scanner Input3 = new Scanner(System.in);
        
        int f, c, Num, Pos=0;
        int NMat1;
        int NMat2;
        int NRes;
        String TNum;
        char Let;
         
         f = Input.nextInt();
         c = Input2.nextInt();
         
         int[][] Mat = new int[f][c];
         
         TNum = Input3.nextLine();
         //System.out.println("Paó aquí");
         
         for (int i=0;i<f;i++){
             for (int j=0;j<c;j++){
                 Num = Convertir(TNum.charAt(Pos));                 
                 while (Num != 0 & Num != 1){
                     //System.out.println("Entró aquí");
                     Num = Convertir(TNum.charAt(Pos));                     
                 }
                 Mat[i][j] = Num;
                 Pos++;
             }
         }
         //System.out.println("Paso por aquí");
         if (f % 2 != 0){
             NMat1 = f*c;
             NMat2 = f*2*c;
             NRes = (NMat2 / NMat1) + 1;
         }else{
             NMat1 = f*c;
             NMat2 = f*2*c;
             NRes = NMat2 / NMat1;
         }
         
         System.out.println(NRes);
        
    }
    
    public static int Convertir(char Let){
        int Num = 0;
        
        //System.out.println(Let);
        switch(Let){
            case '1': Num = 1;
                break;
            case '2': Num = 2;
                break;
            case '3': Num = 3;
                break;
            case '4': Num = 4;
                break;
            case '5': Num = 5;
                break;
            case '6': Num = 6;
                break;
            case '7': Num = 7;
                break;
            case '8': Num = 8;
                break;
            case '9': Num = 9;
                break;
        }
        //System.out.println(Num);
        return Num;
    }
    
}
