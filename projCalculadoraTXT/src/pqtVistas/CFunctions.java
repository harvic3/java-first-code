/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqtVistas;
import java.util.Scanner;

/**
 *
 * @author Víctor A Higuita C.
 */
public class CFunctions {
    Scanner input = new Scanner(System.in);
    
    /**
     * Método Leer Número que solicita el ingreso de un número por consola.
     * @return Número ingresado por el usuario.
     */
    public String getNumber(){        
        boolean bolFlag = false;
        String strNumero = null;
        while (bolFlag == false){
            System.out.print("Por favor ingrese un numero: ");
            strNumero = input.nextLine();
            if (isNumeric(strNumero)){
                bolFlag = true;
            }
        }//While
        return strNumero;
    }//getNumber
    
    /**
     * Función para evaluar si una cadena se puede convertir a número.
     * @param Numero Cadena a ser evaluada
     * @return Booleano como resultado de la transacción.
     */
    public boolean isNumeric(String Numero){
	try {
		Integer.parseInt(Numero);
		return true;
	} catch (NumberFormatException ex){
                System.out.println("Lo que ingresó no es un numero. Error: " + ex);
		return false;
	}
    }//Metodo Numeric
    
    /**
     * 
     * @param Cadena Cadena para Evaluar 
     * @return 
     */
    public boolean Exit(String Cadena){
        boolean bolSalir = false;
        if (Cadena.toUpperCase().equals("EXIT")){
            bolSalir = true;
        }
        
        return bolSalir;
    }
    
}
