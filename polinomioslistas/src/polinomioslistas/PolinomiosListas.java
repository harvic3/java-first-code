package polinomioslistas;

import java.util.Scanner;

/**
 *
 * @authors: Paula Andréa Vargas - Victor Higuita
 */
public class PolinomiosListas {
        
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        int Menu = 4;
        float X;
        double Res;
        
        Polista ListaPol1 = new Polista();
        Polista ListaPol2 = new Polista();
        
        ListaPol1 = ListaPol1.LlenarListas(1);
        ListaPol2 = ListaPol2.LlenarListas(2);
        
        System.out.print("Ingrese el valor de la variable X: ");
        X = input.nextFloat();
               
        //Mostrar Listas
        System.out.println();
        System.out.println("Los Polinomios son: ");
        ListaPol1.MostrarLista();
        ListaPol2.MostrarLista();
        System.out.println("La variable X es = " + X);
        
        while (Menu != 0) {
            switch (Menu) {
            case 1://Sumar los Polinomios                
                Polista SumaPolis = new Polista();
                SumaPolis = SumaPolis.SumarPolis(ListaPol1.GetCabeza(), ListaPol2.GetCabeza());
                
                System.out.println("El Polinomio Suma es: ");
                SumaPolis.MostrarLista();        
        
                Res = SumaPolis.Evaluar(X, SumaPolis.GetCabeza());
                System.out.println("El Polinomio evaluado con X = " + X + " es: " + Res);
                
                Menu = 4;
                break;
            case 2://Multiplicar los Polinomios
                Polista MultPolis = new Polista();
		MultPolis = MultPolis.MultiPolis(ListaPol1.GetCabeza(), ListaPol2.GetCabeza());
                
                System.out.println("El Polinomio Multiplicación es: ");
                MultPolis.MostrarLista();        
        
                Res = MultPolis.Evaluar(X, MultPolis.GetCabeza());
                System.out.println("El Polinomio evaluado con X = " + X + " es: " + Res);
                
                Menu = 4;
                break;
            case 3://Dividir los Polinomios
                Polista DivPolis = new Polista();
                DivPolis.DividirPolis(ListaPol1.GetCabeza(), ListaPol2.GetCabeza());
                
                Menu = 4;
                break;            
            case 4://Mostrar Menu
                System.out.println("***************_Menu Principal_****************");
                System.out.println("*****PRESIONE 1: Para Sumar los Polinomios*****");
                System.out.println("**PRESIONE 2: Para Multiplicar los Polinomios**");
                System.out.println("****PRESIONE 3: Para Dividir los Polinomios****");
                System.out.println("************PRESIONE 0: Para Salir*************");
                System.out.println("***********************************************");
                System.out.print("Esperando Opción: ");
                Menu = input.nextInt();
                break;
            }
        }        
    }
}//Fin Clase Principal
