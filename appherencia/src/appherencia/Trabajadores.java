/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appherencia;

/**
 *
 * @author sala304
 */
public class Trabajadores extends Persona{ //Esta clase Hereda de Persona
    private int C_Horas;
    private float V_Hora;

    public Trabajadores(int C_Horas, float V_Hora, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.C_Horas = C_Horas;
        this.V_Hora = V_Hora;
    }   
    
    //Sobrecarga de Metodo
    @Override public void Mostrar(){ //Porque los nombres de los dos metodos Mostrar es igual en ambas clases
        super.Mostrar();
        System.out.println("La cantidad de Horas es: " + C_Horas);
        System.out.println("El valor de la hora es: " + V_Hora);
    }
    
    public void CalcSalario(int C_Horas, float V_Hora){
        double Sal;       
        
        Sal = V_Hora * C_Horas;
        System.out.println("El salario es: $" + Sal);        
    }
    
}
