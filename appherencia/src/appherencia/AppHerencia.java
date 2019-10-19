/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appherencia;
import java.util.Scanner;

/**
 *
 * @author sala304
 */
public class AppHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        String Nombre = "Algo Luis Baldor";
        int Edad = 20, C_Horas = 48;        
        float V_Hora = 5000;
        
        Persona P = new Persona(Nombre, Edad);
        Trabajadores T = new Trabajadores(C_Horas, V_Hora, Nombre, Edad);
        
        //P.Mostrar();
        T.Mostrar();
        T.CalcSalario(C_Horas, V_Hora);
        
    }
    
}
