/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appfuncionseno;

/**
 *
 * @author sala304
 */
public class Seno extends Calculos{
    private int  N;
    private int X;
    private double Seno = 0;

    public Seno(int N, int X) {
        this.N = N;
        this.X = X;
    }   
    
    public double CalcularSeno(){
        int i, Fact, Temp = 1;
        double Pot;
        short Signo = 1; //1 = + y 2 = -
        Seno = 0;
        for(i=0;i<N;i++){            
            Temp = i*2+1;
            System.out.println("I es: " + Temp);
            Pot = Potencia(X, i*2+1);
            Fact = Factorial(i*2+1);
            if (Signo == 1){
                Seno = Seno + (Pot/Fact);
                Signo = 2;
            }else{
                Seno = Seno - (Pot/Fact);
                Signo = 1;
            }
        }
        return(Seno);
    }
}
