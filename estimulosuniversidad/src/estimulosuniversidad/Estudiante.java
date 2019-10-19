/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estimulosuniversidad;

/**
 *
 * @author sala304
 */
public class Estudiante {
    private String Nombre;    
    private short Tipo; //1 Pregrado, 2 Posgrado}
    private float Prom;
    private double ValMat; //Valor Matricula
    private int PorDes, Creditos;
    
    
    //Constructor: Lleva el mismo Nombre de la clase y no lleva tipo;
    public Estudiante(String Nom, short Tipo, float Prom){
        this.Prom = Prom;
        Nombre = Nom;
        this.Tipo = Tipo;
    }
    
    public void CalcValMatYCred(){
        
        if ((Prom >= 4.5)&&(Tipo == 1)){
            Creditos = 28;
            PorDes = 25;
        }else if ((Prom >= 4)&&(Prom < 4.5)&&(Tipo == 1)){
            Creditos = 25;
            PorDes = 10;
        }else if ((Prom >= 3.5)&&(Prom < 4)&&(Tipo == 1)){
            Creditos = 20;
            PorDes = 0;
        }else if ((Prom >= 2.5)&&(Prom < 3.5)&&(Tipo == 1)){
            Creditos = 15;
            PorDes = 0;
        }else if ((Prom < 2.5)&&(Tipo == 1)){
            Creditos = 0; //Credito Cero no se matricula
            PorDes = 0;
        }if ((Prom >= 4.5)&&(Tipo == 2)){ //Posgrado
            Creditos = 20;
            PorDes = 20;
        }else if ((Prom < 4.5)&&(Tipo == 2)){
            Creditos = 10;
            PorDes = 0;
        }
        
        if (Creditos == 0){
            System.out.println("El estudiante " + Nombre + " NO se puede matricular por regular.");
        }else if (Tipo == 1){
            ValMat = 50000 * Creditos;
            ValMat = ValMat - (ValMat * PorDes/100);
            System.out.println("El estudiante " + Nombre + " Tiene " + Creditos + 
                    " Creditos y el valor de su matricula es " + ValMat + " - Descuento: " + PorDes + "%");
        }else if (Tipo == 2){
            ValMat = 300000 * Creditos;
            ValMat = ValMat - (ValMat * PorDes/100);
            System.out.println("El estudiante " + Nombre + " Tiene " + Creditos + 
                    " Creditos y el valor de su matricula es " + ValMat + " - Descuento: " + PorDes + "%\n");
        }
    
    }
    
}
