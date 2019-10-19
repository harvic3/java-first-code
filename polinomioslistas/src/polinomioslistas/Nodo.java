/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomioslistas;

/**
 *
 * @author victhi
 */
public class Nodo {
    Nodo Liga;
    float Coef;
    int Exp;

    public Nodo (float Coef, int Exp) {
        this.Coef = Coef;
        this.Exp = Exp;
        this.Liga = null;
    }

}//Fin Clase Nodo