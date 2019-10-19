import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BullAndCows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Input = new Scanner(System.in);
         Random NumAle = new Random(10+1);
         int NumAux, j = 0;
         int[] VNum = new int[4];
         VNum[0] = 0;
         VNum[1] = 0;
         VNum[2] = 0;
         VNum[3] = 0;
         int Cows = 0, Bulls = 0;
         
         for (int i = 0;i<4;i++){
             
             NumAux = NumAle.nextInt(10+1);
                      
             while (j<4){
                 if (NumAux != VNum[j]){
                     j++;
                 }else{
                     NumAux = NumAle.nextInt(10+1);
                 }
             }
             VNum[i] = NumAle.nextInt(10+1);           
                
         }
         
         System.out.println("El numero generado es: " + VNum[0] + VNum[1] + VNum[2] + VNum[3]);
         
         for (int i=0;i<4;i++){
             System.out.println("Ingrese un numero entre 1 y 9 sin repetir: ");
             NumAux = Input.nextInt();
             
             if (NumAux == VNum[i]){
                 Bulls++;
             }else{
                 for (j=0;j<4;j++){
                     if (NumAux == VNum[j]){
                         Cows++;
                     }
                 }
             }
         }
         
         if (Cows == 4){
            System.out.println("You Won");
         }else{
             System.out.println(Cows + " Cows and " + Bulls + " Bulls.");
         }
        
         
    }
    
}
