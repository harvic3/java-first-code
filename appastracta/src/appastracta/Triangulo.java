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
public class Triangulo extends Figura{
    int B;
    int H;
    String Nombre;

    public Triangulo(int B, int H, String Nombre) {
        this.B = B;
        this.H = H;
        this.Nombre = Nombre;
    }
    
    @Override
    public void MostrarArea(){
        System.out.println("El area es: " + (B*H));
    }
    
    @Override    
    public void MostrarNombre(){
        System.out.println("El nombre es: " + Nombre);
    }
    
}
