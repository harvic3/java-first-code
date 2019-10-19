

package polinomios;

import java.io.BufferedReader;
import java.io.*;


public class Menu {
    
    public static PolLsl B;
    public static PolLsl A;
    public static PolLsl C;
    
    public static void main(String[] args) throws IOException {
       String n="s";
       
       B=new PolLsl();
       A=new PolLsl();
       C=new PolLsl();
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       while(n.equals("s")){
             n=menUsuario();
             switch(n){
               
             case "1":System.out.println("COEFICIENTE (POLINOMIO B)");
                   int co=Integer.parseInt(br.readLine());
                   System.out.println("EXPONENTE (POLINOMIO B)");
                   int ex=Integer.parseInt(br.readLine());
                   B.insertarTer(co, ex);
                   break;
             case "2":System.out.println("EXPONENTE (POLINOMIO B)");
                   int exp=Integer.parseInt(br.readLine());
                   B.eliminarTerm(exp);
                    break;
             case "3":System.out.print("X= ");
                   int x=Integer.parseInt(br.readLine());
                   B.evaluarPol(x);
                   System.out.println("EL POLINOMIO B EN X="+x+ " es igual a "+ B.evaluarPol(x));
                   break;
             case "4":System.out.println("EL POLINOMIO B ES "+B.toString());
                   break;
              
            }
         System.out.println("DIGITE s PARA CONTINUAR EN EL POLINOMIO B O c PARA CREAR EL POLINOMIO A");
         n=br.readLine();
       }
       
       while(n.equals("c")){
                 n=menUsuario();
                 switch(n){
                   case "1":System.out.println("COEFICIENTE (POLINOMIO A)");
                            int co=Integer.parseInt(br.readLine());
                            System.out.println("EXPONENTE (POLINOMIO A)");
                            int ex=Integer.parseInt(br.readLine());
                            A.insertarTer(co, ex);
                            break;
                   case "2":System.out.println("EXPONENTE (POLINOMIO A)");
                            int exp=Integer.parseInt(br.readLine());
                            A.eliminarTerm(exp);
                            break;
                   case "3":System.out.print("X= ");
                            int x=Integer.parseInt(br.readLine());
                            A.evaluarPol(x);
                            System.out.println("EL POLINOMIO A EVALUADO EN X="+x+ " es igual a "+ A.evaluarPol(x));
                            break;
                   case "4":System.out.println("EL POLINOMIO A ES "+A.toString());
                            break;
                 }
                 
                 System.out.println("DIGITE c PARA CONTINUAR EN EL POLINOMIO A O OTRA TECLA PARA HACER ALGUNA OPERACION");
                 n=br.readLine();   
             }
       n=menOperaciones(); 
       switch(n){
           case "1":C=A.sumar(B);
                    System.out.println("La suma es "+C.toString());
                    break;
           case "2":C=A.multiplicar(B);
                    System.out.println("La multiplicacion es"+C.toString());
                    break;
           case "3":C=A.dividir(A,B);
                    System.out.println("La division es "+C.toString());
                    break;
       } 
    }
    public static String menUsuario() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DIGITE LA OPCION DESEADA");
        System.out.println("1.INSERTAR TERMINO");
        System.out.println("2.ELIMINAR TERMINO");
        System.out.println("3.EVALUAR POLINOMIO");
        System.out.println("4 MOSTRAR EL POLINOMIO");
           
        String opc=br.readLine();
        
        return opc;
        
    }
    public static String menOperaciones() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("DIGITE LA OPCION DESEADA");
        System.out.println("1.SUMAR POLINOMIO A+B");
        System.out.println("2.MULTIPLICAR POLINOMIO A*B");
        System.out.println("3.DIVIDIR POLINOMIO A/B");
 
        String opc=br.readLine();
        
        return opc;
        
    }
}
