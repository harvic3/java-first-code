/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdptos;

/**
 *
 * @author sala208
 */
public class Salarios {
    double VentDpto1, VentDpto2, VentDpto3, Salario;
    double[] SalDpto = new double[3];
    double VenTotal;    
    
    public void CalcSalario(){
        SalDpto[0] = Salario;
        SalDpto[1] = Salario;
        SalDpto[2] = Salario;
        
        VenTotal = VentDpto1 + VentDpto2 + VentDpto3;
        if (VentDpto1 > VenTotal*.33){
            SalDpto[0] = Salario*1.2;
        }
        if (VentDpto2 > VenTotal*.33){
            SalDpto[1] = Salario*1.2;
        }
        if (VentDpto3 > VenTotal*.33){
            SalDpto[2] = Salario*1.2;
        }
    }
    
}
