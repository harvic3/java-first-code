/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funcionseno;

/**
 *
 * @author sala304
 */
public class Funcion {
    private int X;
    private int N;
    
    public Funcion(int X, int N){
        this.X = X;
        this.N = N;
    }
    
    public void CalSeno(){
        int i, j, Fact = 1;
        double ValTem = 0;
        int CFact = 3;
        double Calc;
        
        System.out.println("El Calculo de la función es: ");
        System.out.print("Sen(" + X + ") = " + X);
        
        for (i=1;i<N;i++){//Los ciclos de N menos el de X que cuenat como el primero
            for (j=1;j<=CFact;j++){//Aqui se calcula el Factorial
                Fact = Fact * j;
            }
            Calc = (Math.pow(X, CFact)/Fact); //Hacemos el calculo de XExp*/Fact*
            ValTem = ValTem + Calc;//Acumulamos Valores para la formula (Todos los calculos se acumulan y luego se restan con X)
            //System.out.print(" - (" + Math.pow(X, CFact) + "/" + Fact + ")"); //Con este se imprimen los valores de XExp*/Fact*
            System.out.print(" - " + Calc); //Mostramos el Valor calculado           
            CFact = CFact + 2;//Aumentamos el Factorial en dos (Inicia en 3, luego 5, 7, 9, y así sucesivamente) Esto solo por el ciclo N
            Fact = 1; //Reiniciamos el Factorial
        }
        System.out.print(" = " + (X-ValTem)); //Mostramos el resultado final
    }
}
