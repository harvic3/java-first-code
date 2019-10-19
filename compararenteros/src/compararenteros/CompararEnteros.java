/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compararenteros;
/**
 *
 * @author VHC
 */
class Funciones {
    
    int NUM1 = 4;
    int NUM2 = 7;
    int i;
    
    void Mostrar(){
        System.out.println("El numero Mayor es: ");
    }
    
    void Comparar(){
        
        if (NUM1 > NUM2){
            System.out.println("El numero Mayor es: " + NUM1);
        }
        else{
            if (NUM1 < NUM2){
                System.out.println("El numero Mayor es: " + NUM2);
            }
            else{
                System.out.println("Los numeros son iguales");
            }         
        }
    }
    
    void Para(){
        System.out.println("Con ciclo para");
        for (i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    
    void Mientras(){
        System.out.println("Con ciclo Mientras");
        i=0;
        while (i != 10){
            i++;
            System.out.println(i);
        }
    }
    
    void DoWhile(){
        System.out.println("Con ciclo Do While");
        i=0;
        do{
            i++;
            System.out.println(i);
        }while(i != 10);
    }
    
    void EnCasoDe(){
        System.out.println("Con Caso");
        switch (NUM1){
            case 1: System.out.println("El numero es Uno");
                 break;
            case 2: System.out.println("El numero es Dos");
                 break;
            case 3: System.out.println("El numero es Tres");
                 break;
            case 4: System.out.println("El numero es Cuatro");
                 break;
            case 5: System.out.println("El numero es Cinco");
                 break;
            case 6: System.out.println("El numero es Seis");
                 break;
            case 7: System.out.println("El numero es Siete");
                 break;
            case 8: System.out.println("El numero es Ocho");
                 break;
            case 9: System.out.println("El numero es Nueve");
                 break;            
        }
    }
}

public class CompararEnteros {
       
    public static void main(String[] args) {
        // TODO code application logic here
        Funciones A = new Funciones();
            A.Comparar();
            A.Para();
            A.Mientras();
            A.DoWhile();
            A.EnCasoDe();
    }
}
