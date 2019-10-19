/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaanteypost;

/**
 *
 * @author sala302
 */
public class Fecha {
    private int Dia;
    private int Mes;
    private int Año;
    //private int[][] MatFec = new int[5][5];
    
    /*public Fecha(int D, int M, int A, int Pos){
        MatFec[Pos][0] = D;
        MatFec[Pos][1] = M;
        MatFec[Pos][2] = A;    
    }*/
    
   /* public void ValidarFec(int Dia, int Mes, int Año){
        
        if ((Dia>0)||(Dia<=31)&(Mes>0)||(Mes<=12)&(Año>0)){//Evaluo algun cero
            
        }else{
            System.out.println("Fecha No valida, ingrese de nuevo");
        }    
    }*/
    
    public void SigFecha(int D, int M, int A){
                
        if ((M == 1)&(D == 1)){//Es Enero 1
            Año = A - 1;
            Dia = 31;
            Mes = 12;               
        }else if((D == 1)&(M > 1)){
            Dia = 31;
            Mes = M - 1;
            Año = A;
        }else{
            Dia = D - 1;
            Mes = M;
            Año = A;
        }      
        System.out.println("La fecha Siguiente es: " + Dia + "/" + Mes + "/" + Año);
    }
    
    public void AntFecha(int D, int M, int A){
         
        if ((M == 12)&(D == 31)){//Es Dic 31
            Año = A + 1;
            Dia = 1;
            Mes = 1;                   
        }else if((D == 31)&(M < 12)){
            Dia = 1;
            Mes = M + 1;
            Año = A;
        }else{
            Dia = D + 1;
            Mes = M;
            Año = A;
        }
        
        System.out.println("La fecha Anterior es: " + Dia + "/" + Mes + "/" + Año);
    }
    
}
