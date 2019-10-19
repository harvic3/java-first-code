/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizdispersa;

/**
 *
 * @author victhi
 */
public class MDTrip {
    int NF, NC, CD;
    float LT[][];
    
    public MDTrip (int NF, int NC, int CD) {
        int i, j;                
        LT = new float[CD+1][3];        
        LT[0][0] = this.NF = NF;
        LT[0][1] = this.NC = NC;
        LT[0][2] = this.CD = CD;
        for (i=1;i<CD+1;i++) {//Iniciamos en Cero los Digitos
            for (j=0;j<3;j++) {
                LT[i][j] = 0;
            }
        }
    }
    
    //Insertar Tripela
    MDTrip InsertarTrip (int F, int C, float D) {
        int Nf, i, j;
        short SW = 0;
        CD = (int) LT[0][2];
        MDTrip MatT = new MDTrip (NF, NC, CD);
        
        for (i=0;i<MatT.LT.length;i++) {
            for (j=0;j<MatT.LT[0].length;j++) {
                MatT.LT[i][j] = LT[i][j];
            }
        }
        
        for (Nf=1;Nf<CD+1;Nf++) {//Insertar la nueva tripleta
            if (MatT.LT[Nf][2] == 0.0) {
                MatT.LT[Nf][0] = F;
                MatT.LT[Nf][1] = C;
                MatT.LT[Nf][2] = D;
                SW = 1;
                break; //Rompemos porque ya insertamos la nueva tripleta
            }
            else {//Hay un digito con las mismas F y C?
                if ((MatT.LT[Nf][0] == F)&&(MatT.LT[Nf][1] == C)) {
                    MatT.LT[Nf][2] = MatT.LT[Nf][2] + D;
                    SW = 1;
                    break; //Rompemos porque ya insertamos la nueva tripleta
                }
            }                
        }
        //Si Entra aquí es porque hay que redimensionar
        if (SW == 0) {//No insertó el dato, Redimensionar
            MatT = MatT.Redimensionar(LT, NF, NC, CD);//Redimensionamos
            //CD = MatT.LT[0].length - 1;
            MatT.LT[0][2] = CD;
            MatT.LT[CD][0] = F;
            MatT.LT[CD][1] = C;
            MatT.LT[CD][2] = MatT.LT[CD][2] + D;
        }
        return (MatT);
    }
    
    //Redimensionar Matriz Tripleta
    public MDTrip Redimensionar (float[][] MT, int NF, int NC, int ND) {
        int i, j;        
        MDTrip MatX = new MDTrip(NF, NC, ND+1);
                
        for (i=0;i<MT.length;i++) {
            for (j=0;j<MT[0].length;j++) {
                MatX.LT[i][j] = MT[i][j];
            }
        }        
        return (MatX);
    }
    
    //Mostrar Matriz Dispersa
    public void MostrarMatDis (int NF, int NC, int CD) {
        int Nf, Nc, Cd;
        short SW = 0;
        
        System.out.println("La Matriz Dispersa es: ");
        for (Nf=1;Nf<=NF;Nf++) {            
            for (Nc=1;Nc<=NC;Nc++) {
                for (Cd=1;Cd<=LT[0][2];Cd++) {
                    SW = 0;
                    if ((Nf == LT[Cd][0])&&(Nc == LT[Cd][1])) {
                        System.out.print("|"+LT[Cd][2]);
                        SW = 1;
                        break;
                    }                    
                }
                if (SW == 0) {
                    System.out.print("| 0 ");
                }           
            }
            System.out.println("|");
        }
    }
    
    //Mostrar Matriz Tripleta
    public void MostrarMatTri () {
        int Nf, Nc;
        
        System.out.println("La Matriz Tripleta es: ");
        for (Nf=0;Nf<LT.length;Nf++) {
            for (Nc=0;Nc<3;Nc++) {
                System.out.print("|" + LT[Nf][Nc]);
            }
            System.out.println("|");
        }
    }
    
    //Sumar Filas
    public void SumarFilas () {
        int j, k;
        float Suma = 0;
        
        System.out.println("La Suma de las filas es: ");
        for (j=1;j<LT[0][0];j++) {
            for (k=1;k<=LT.length;k++) {
                if (LT[k][0] == j) {
                    Suma = Suma + LT[k][2];
                }       
            }
            System.out.println("Fila" + j + " es: " + Suma);
            Suma = 0;
        }
    }
    
    //Sumar Columnas
    public void SumarColumnas () {
        int j, k;
        float Suma = 0;
        
        System.out.println("La Suma de las columnas es: ");
        for (j=1;j<LT[0][1];j++) {
            for (k=1;k<=LT.length;k++) {
                if (LT[k][1] == j) {
                    Suma = Suma + LT[k][2];
                }       
            }
            System.out.println("Columna" + j + " es: " + Suma);
            Suma = 0;
        }
    }
    
}//Fin MDTrip