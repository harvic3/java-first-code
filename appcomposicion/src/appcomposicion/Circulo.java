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
public class Circulo {
    private Punto P;
    private int Radio;
    
    /**
     * Contructor que recibe 3 parametros
     * @param X
     * @param Y
     * @param Radio 
     */
    public Circulo(int X, int Y, int Radio){
        P = new Punto(X, Y);
        this.Radio = Radio;
    }
    /**
     * Constructor que recibe Radio
     * @param Radio
     */
    public Circulo(int Radio){
        P = new Punto();
        this.Radio = Radio;
    }
    
    public void MostrarCiculo(){
        P.MostrarPunto();
        System.out.println("El radio es: " + Radio);
    }
    
    
}
