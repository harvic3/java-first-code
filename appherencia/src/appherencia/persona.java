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
public class Persona {
    private String Nombre;
    private int Edad;

    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }
            
    public void Mostrar(){
        System.out.println("El Nombre es: " + Nombre);
        System.out.println("La edad es: " + Edad);
    }
    
}
