/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appcomposicion;

/**
 *
 * @author sala304
 */
public class Punto{
    private int X;
    private int Y;

    public Punto(){ //Origen del plano
        this.X = 0;
        this.Y = 0;
    }
    
    public Punto(int X, int Y){ //Con valores 
        this.X = X;
        this.Y = Y;
    }
    
    public void MostrarPunto(){
        System.out.println("X es: " + X);
        System.out.println("Y es: " + Y);
    }
    
}
