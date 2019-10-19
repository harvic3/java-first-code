/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.salario;
import java.util.Scanner;

/**
 *
 * @author sala304
 */
public class POOSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int i = 1, j;
        
        Empleados Empleado = new Empleados();
        
        while(i!=0){
            System.out.println("Ingrese Nombre del empleado:");
            Empleado.Nombre = Input.nextLine();
            System.out.println("Ingrese Horas Laboradas del empleado " + Empleado.Nombre);
            Empleado.HorasTrabajadas = Input.nextInt();
            System.out.println("Ingrese Valor Hora del empleado " + Empleado.Nombre);
            Empleado.ValorHora = Input.nextInt();
            
            System.out.println("El Salario del empleado "+ Empleado.Nombre + " es: " + Empleado.CalcSalario());
            
            System.out.println("Para Seguir presione 1 en caso contrario 0");
            i = Input.nextInt();
        }
        
    }    
}
