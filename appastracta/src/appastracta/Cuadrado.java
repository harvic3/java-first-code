/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appastracta;

/**
 *
 * @author sala304
 */
public class Cuadrado extends Figura{
    private int L;
    String Nombre;

    public Cuadrado(int L, String Nombre) {
        this.L = L;
        this.Nombre = Nombre;
    }
       
    @Override
    public void MostrarArea(){
        System.out.println("El área es: " + (L*L));
    }
    
    @Override    
    public void MostrarNombre(){
        System.out.println("El nombre es: " + Nombre);
    }
}
