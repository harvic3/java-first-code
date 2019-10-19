/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polybios;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Polybios {
            
    //@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Scanner Input2 = new Scanner(System.in);
        char[][] MCif = new char[5][5];
        char[][] MDcif = new char[5][5];
        
        int N1, N2, i, j, k, F, C;
        String Temp = "", Num = "", TempN = "";
        char Letra;        
        
        MCif[0][0] = 'A';
        MCif[0][1] = 'b';
        MCif[0][2] = 'C';
        MCif[0][3] = 'd';
        MCif[0][4] = 'e';
        
        MCif[1][0] = 'F';
        MCif[1][1] = 'g';
        MCif[1][2] = 'H';
        MCif[1][3] = 'i';
        MCif[1][4] = 'M';
        
        MCif[2][0] = 'K';
        MCif[2][1] = 'O';
        MCif[2][2] = 'P';
        MCif[2][3] = 'Q';
        MCif[2][4] = 'S';
        
        MCif[3][0] = 'T';
        MCif[3][1] = 'L';
        MCif[3][2] = 'W';
        MCif[3][3] = 'V';
        MCif[3][4] = 'U';
        
        MCif[4][0] = 'Z';
        MCif[4][1] = 'Y';
        MCif[4][2] = 'N';
        MCif[4][3] = 'X';
        MCif[4][4] = 'R';
        
        MDcif[0][0] = 'A';
        MDcif[0][1] = 'B';
        MDcif[0][2] = 'C';
        MDcif[0][3] = 'D';
        MDcif[0][4] = 'E';
        
        MDcif[1][0] = 'F';
        MDcif[1][1] = 'G';
        MDcif[1][2] = 'H';
        MDcif[1][3] = 'J';
        MDcif[1][4] = 'M';
        
        MDcif[2][0] = 'K';
        MDcif[2][1] = 'O';
        MDcif[2][2] = 'P';
        MDcif[2][3] = 'Q';
        MDcif[2][4] = 'S';
        
        MDcif[3][0] = 'T';
        MDcif[3][1] = 'L';
        MDcif[3][2] = 'W';
        MDcif[3][3] = 'V';
        MDcif[3][4] = 'U';
        
        MDcif[4][0] = 'Z';
        MDcif[4][1] = 'Y';
        MDcif[4][2] = 'N';
        MDcif[4][3] = 'X';
        MDcif[4][4] = 'R';       
        
        //Ingresa el Numero de veces
        N1 = Input.nextInt();
        String[] Lineas = new String[N1];
        //Captura Lineas
        for (k=0;k<N1;k++){
            Lineas[k] = Input2.nextLine();
            //System.out.println(Lineas[k]);
        }
        //Ingresa el Numero de veces
        N2 = Input.nextInt();
        String[] Nums = new String[N2];
        //Captura Numeros
        for (k=0;k<N2;k++){
            Nums[k] = Input2.nextLine();
            //System.out.println(Nums[k]);
        }
        //Encriptamos Palabras
        for (k=0;k<N1;k++){
            Temp = Lineas[k];
            Temp = Temp.toUpperCase();
            int Tam = Temp.length();
            for (int l=0;l<Tam;l++){
                Letra = Temp.charAt(l);
                //System.out.println(Letra);
                Num = Cifrar(Letra, MDcif);
                System.out.print(Num);
            }
            System.out.println();
        }
        //Desencriptamos Palabras
        for (k=0;k<N2;k++){
            Temp = Nums[k];
            int Tam = Temp.length();
            for (int l=0;l<Tam;l++){
                if (Temp.charAt(l) != '*' & Temp.charAt(l) != ' '){
                    Letra = Temp.charAt(l);
                    F = ConvertirFC(Letra);
                    if (F == 1){
                        F = 0;
                    }else if(F == 3){
                        F = 1;
                    }else if(F == 5){
                        F = 2;
                    }else if(F == 7){
                        F = 3;
                    }else if(F == 9){
                        F = 4;
                    }
                    l++;
                    Letra = Temp.charAt(l);
                    C = ConvertirFC(Letra);
                    
                    System.out.print(MDcif[F][C-1]);
                }else{
                    System.out.print(Temp.charAt(l));
                }               
            }
            System.out.println();
        }
        System.out.println();
        
    }
    
    public static String Cifrar(char Let, char[][] Mat){
        String Num = "";
        int i, j;        
        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                if (Let == Mat[i][j]){
                    
                    if (i == 0){
                        Num = Num.concat(Integer.toString(1));
                    }else if(i == 1){
                        Num = Num.concat(Integer.toString(3));
                    }else if(i == 2){
                        Num = Num.concat(Integer.toString(5));
                    }else if(i == 3){
                        Num = Num.concat(Integer.toString(7));
                    }else if(i == 4){
                        Num = Num.concat(Integer.toString(9));
                    }
                    Num = Num.concat(Integer.toString(j+1));
                }
            }
        }        
        return Num;
    }
        
    public static int ConvertirFC(char Let){
        int Num = 0;
        
        //System.out.println(Let);
        switch(Let){
            case '1': Num = 1;
                break;
            case '2': Num = 2;
                break;
            case '3': Num = 3;
                break;
            case '4': Num = 4;
                break;
            case '5': Num = 5;
                break;
            case '6': Num = 6;
                break;
            case '7': Num = 7;
                break;
            case '8': Num = 8;
                break;
            case '9': Num = 9;
                break;
        }
        //System.out.println(Num);
        return Num;
    }
    
}
