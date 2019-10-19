/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesopersonas;
import java.util.Scanner;
/**
 *
 * @author victhi
 */
public class Calculos{
        
    //Objeto de tipo Scanner.
    Scanner in = new Scanner (System.in);
    
    //Variables
    int Peso;
    int Edad;
    int Estatura;
    String Sexo;
    String Nombre;
    String Estado;
    
    public void CrearSujeto (){
                
        System.out.println("Ingrese el Nombre de la Persona: ");    
        Nombre = in.next();
        System.out.println("Ingrese el Peso (Kg): ");
        Peso = in.nextInt();
         System.out.println("Ingrese la Edad: ");
        Edad = in.nextInt();
        System.out.println("Ingrese la Estatura (Cm): ");
        Estatura = in.nextInt();System.out.println("Ingrese el Sexo (Masculino = M, Femenino = F): ");   
        Sexo = in.next();
        
        if (Sexo == "M"){
            if ((Estatura/2.9) > Peso){
                Estado = "Falta de Peso";
            }
            else{
                if ((Estatura/2.3) < Peso){
                Estado = "Sobre Peso";
                }
                else{
                    Estado = "Normal";
                }            
            }            
        }
        else{
            if ((Estatura/3.1) > Peso){
                Estado = "Falta de Peso";
            }
            else{
                if ((Estatura/2.5) < Peso){
                Estado = "Sobre Peso";
                }
                else{
                    Estado = "Normal";
                }
            }            
        }
        //System.out.println("El estado de " + Nombre + " es: " + Estado);
        
        Sujeto Persona = new Sujeto(Peso, Edad, Estatura, Sexo, Nombre, Estado);
        
    }
                
    public void MostrarSujeto (String Nombre, String Estado) {
        System.out.println("El estado del paciente "+Nombre+" es: "+Estado);
    }    
 
}