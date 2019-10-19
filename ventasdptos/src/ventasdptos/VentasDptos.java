/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdptos;
import java.util.Scanner;

/**
 *
 * @author sala208
 */
public class VentasDptos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
       Salarios Dpto = new Salarios();
        
        System.out.println("Ingrese Ventas del Periodo para el Dpto 1:");
        Dpto.VentDpto1 = Input.nextDouble();
        System.out.println("Ingrese Ventas del Periodo para el Dpto 2:");
        Dpto.VentDpto2 = Input.nextDouble();
        System.out.println("Ingrese Ventas del Periodo para el Dpto 3:");
        Dpto.VentDpto3 = Input.nextDouble();
        
        System.out.println("Ingrese Salario de los Vendedores: ");
        Dpto.Salario = Input.nextDouble();
        
        Dpto.CalcSalario();
        System.out.println("Los Salario de los Vendedores son:");
        System.out.println("Salario Dpto 1 = " + Dpto.SalDpto[0]);
        System.out.println("Salario Dpto 2 = " + Dpto.SalDpto[1]);
        System.out.println("Salario Dpto 3 = " + Dpto.SalDpto[2]);
        
    }
}
