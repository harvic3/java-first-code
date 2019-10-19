/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.salario;

/**
 *
 * @author sala304
 */
public class Empleados {
    int HorasTrabajadas = 0;
    int ValorHora = 0;
    int HoraExtD;
    int HoraExtT;
    String Nombre = "";
    
    public double CalcSalario(){
        double Salario = 0;
        
        if (HorasTrabajadas > 40){
            HoraExtD = HorasTrabajadas - 40;
            HorasTrabajadas = 40;
            if (HoraExtD > 8){
                HoraExtT = HoraExtD - 8;
                HoraExtD = 8;        
            }
        }
        Salario = HorasTrabajadas * ValorHora + HoraExtD * ValorHora * 2 + HoraExtD * ValorHora * 3;
        return(Salario);
    }
    
}
