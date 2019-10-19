package polinomioslistas;

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
        this.Primer = null;
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
    
    //Mostrar Lista
    void MostrarLista () {
        Nodo K = this.Primer;
        
        if (K == null) {
            System.out.println("Lista Vacía.");
        }
        else {
            while (K.Liga != null) {
                System.out.print(K.Coef + "X^" + K.Exp  + " + ");
                K = K.Liga;
            }            
            if (K.Exp == 0) { 
                System.out.print(K.Coef);
            }
            else {
                System.out.print(K.Coef + "X^" + K.Exp);
            }
        }
        System.out.println();
    }
    
    //Buscar Cabeza desde el main
    Nodo GetCabeza () {
        return (Primer);
    }
    
    //Sumar 2 Polinomios
    Polista SumarPolis (Nodo A, Nodo B) {        
        Nodo Q = A, P = B;        
        
        Polista SumaPolis = new Polista();
        
        while ((P != null) && (Q != null)) {
            if(P.Exp > Q.Exp) {
                SumaPolis.InsertarTerm(P.Coef, P.Exp);
                P = P.Liga;
            }
            else {
                if(Q.Exp > P.Exp) {
                    SumaPolis.InsertarTerm(Q.Coef, Q.Exp);
                    Q = Q.Liga;
                }
                else {
                    if((P.Coef + Q.Coef) != 0) { 
                     SumaPolis.InsertarTerm((P.Coef + Q.Coef),P.Exp);
                    }
                    P = P.Liga;
                    Q = Q.Liga;
                } 
            } 
        }
        while(P != null) {
            SumaPolis.InsertarTerm(P.Coef, P.Exp);
            P = P.Liga;
        }
        while(Q != null) {
            SumaPolis.InsertarTerm(Q.Coef, Q.Exp);
            Q = Q.Liga;
        }       
        return (SumaPolis);
    }
    
    //Multiplicar 2 Polinomios
    Polista MultiPolis (Nodo A, Nodo B) {
        Nodo Q = A, P = B;
        int Ex;
        float Coe;
        
        Polista Multiplicar = new Polista();
        
        while (P != null) {//Tomamos Primer termino de P, lista B          
            while (Q != null) {//Recorremos Q, lista A
                Ex = P.Exp + Q.Exp;//Sumamos Exponentes
                Coe = P.Coef * Q.Coef;//Multiplicamos Coeficientes
                Multiplicar.InsertarTerm(Coe, Ex);//Insertamos el término en el objeto multilicación
                Q = Q.Liga;//Avanzamos en Q, lista A
            }
            Q = A;//Actualizamos Cabeza de Q, Lista A
            P = P.Liga;//Avanzamos en P, lista B
        }
        return (Multiplicar);
    }
    
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

    //Dividir 2 Polinomios
    void DividirPolis (Nodo A, Nodo B) {
        Nodo Q = A, P = B;
        int Exp, Ex;
        float Coef, Coe;
        
        if (Q.Exp >= P.Exp) {
            Polista Dividendo1 = new Polista(); //Dividendo
            Polista Dividendo2 = new Polista(); //Dividendo
            Dividendo1 = Dividendo1.CopiarListas(Q); //Copiamos lista A, Dividendo
            Polista Cociente = new Polista(); //Creamos Cociente
            
            while (Dividendo1.Primer.Exp >= B.Exp) {
                Ex = Dividendo1.Primer.Exp - P.Exp;
                Coe = Dividendo1.Primer.Coef / P.Coef;
                Cociente.InsertarTerm(Coe, Ex);
                
                while (P != null) {            
                    Exp = P.Exp + Ex;//Sumamos Exponentes
                    Coef = P.Coef * Coe * (-1);//Multiplicamos Coeficientes y cambiamos signo
                    Dividendo2.InsertarTerm(Coef, Exp);//Insertamos el término en el objeto Residuo
                    P = P.Liga;//Avanzamos en P, lista Divisor
                }
                P = B; //Actualizamos Cabeza de P
                Dividendo1 = Dividendo1.SumarPolis(Dividendo1.GetCabeza(), Dividendo2.GetCabeza()); //Sumamos Dividendo1 y Dividendo2 y se devuelve al Dividendo1
                if (Dividendo1.GetCabeza() == null) {
                    Dividendo1.InsertarTerm(0, 0); //La lista está vacía, esto indica que la divisón da cero. Se envía 0^0 a este para que se salga
                }                
                Dividendo2.Primer = null; //Borramos el dividendo 2
            }
            System.out.println("La división de los Polinomios es: " );
            Cociente.MostrarLista();
            System.out.println("El Residuo de la divisón es: " );
            Dividendo1.MostrarLista();
        }
        else {
            System.out.println("El Polinomio no se puede Dividir.");
        }
    }
    
}//Fin Clase