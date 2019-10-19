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
public class Calculos {
    
    public static double Potencia(int Base, int Exp){
        double Pot = 1, i;
        
        for(i=0;i<Exp;i++){
            Pot = Pot * Base;
        }        
        return(Pot);
    }
    
    public static int Factorial(int Base){
        int Fact = 1, i;
        
        for(i=1;i<=Base;i++){
            Fact = Fact*i;
        }        
        return(Fact);
    }
}
