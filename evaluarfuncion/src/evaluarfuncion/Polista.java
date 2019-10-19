package evaluarfuncion;

import java.util.Scanner;
/**
 *
 * @author victhi
 */
public class Polista {    
    Scanner input = new Scanner(System.in);    
    private Nodo Primer;
    //private Nodo Ultimo;
    //private int Tamaño;
    
    public Polista() {
        Primer = null;
        //this.Ultimo = null;
        //this.Tamaño = 0;
    }
    
    //Pedir Datos para la lista del Polinomio
    Polista LlenarListas(int j) {
        int Exp = 1, i = 1;
        float Coef;
        
        Polista ListaPol = new Polista();
        
        //Pedir Datos de los Polinomios
        System.out.println("Ingrese el coeficiente y el exponente según se le vaya solicitando y cuando " + "\n"
                + "termine presione el número 0. Ingrese el termino independiente de Ultimo si lo hay." );
        //Polinomio 1
        System.out.println("Inserte Datos del Polinomio " + j + ": ");
        while (Exp != 0) {
            System.out.println("Inserte Coeficiente " + i + ": ");
            Coef = input.nextFloat();
            if (Coef == 0) {
                break;
            }
            System.out.println("Inserte Exponente del Coef " + i + ": ");
            Exp = input.nextInt();
                        
            ListaPol.InsertarTerm(Coef, Exp);
            i++;
        }
        return (ListaPol);      
    }
    
    //Insertar un Término
    void InsertarTerm (float Co, int Ex) {
        Nodo Ant, Q;
        Q = Ant = Primer;        
        
        while ((Q != null)&&(Q.Exp > Ex)) {
            Ant = Q;
            Q = Q.Liga;
        }
        if ((Q != null)&&(Q.Exp == Ex)) {
            if (Q.Coef + Co != 0) {
                Q.Coef = Q.Coef + Co;
            }
            else {
                if (Primer == Q) {
                    Primer = Primer.Liga;
                }
                else {
                    Ant.Liga = Q.Liga;
                }
            }
        }
        else {
            Nodo Nuevo = new Nodo(Co, Ex);
            if (Q == Primer) {
                Nuevo.Liga = Primer;
                Primer = Nuevo;
            }
            else {
                Nuevo.Liga = Q;
                Ant.Liga = Nuevo;
            }
        }       
    }
    
    //Evaluar Polinomio
    double Evaluar (float X, Nodo A) {        
        double Res = 0;
        Nodo Q = Primer;
        
        if(Q == null) {
            System.out.println("La lista está Vacía.");
        }
        else {
            while (Q != null) {
                Res = Res + Q.Coef * Math.pow(X, Q.Exp);
                Q = Q.Liga;
            }
        }
        return (Res);
    }  
    
    //Buscar Cabeza desde el main
    Nodo GetCabeza () {
        return (Primer);
    }
    
    //Copias Listas
    Polista CopiarListas (Nodo Orig) {
        Polista ListaCopia = new Polista();
        Nodo A = Orig;
        
        if (A == null) {
            System.out.println("Lista Vacía, no se puede copiar!!");
        }
        else {            
            while (A != null) {
                ListaCopia.InsertarTerm(A.Coef, A.Exp);
                A = A.Liga;
            }
        }
        return (ListaCopia);
    }
}