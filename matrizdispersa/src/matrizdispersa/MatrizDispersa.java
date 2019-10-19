/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizdispersa;
import java.util.Scanner;
/**
 *
 * @author victhi
 */
public class MatrizDispersa {
    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int NF, NC, CD;
        short Menu = 10;

        System.out.println("Sistema para Manejar Matrices Dispersas.\n");

        System.out.print("Por Favor Ingrese Cantidad de Filas de la Matriz: ");
        NF = Input.nextInt();
        System.out.print("Por Favor Ingrese Cantidad de Columnas de la Matriz: ");
        NC = Input.nextInt();
        System.out.print("Por Favor Ingrese Cantidad de Elementos Diferentes de Cero de la Matriz: ");
        CD = Input.nextInt();
        
        MDTrip MatD = new MDTrip(NF, NC, CD);
        
        System.out.println("¿Qué desea Hacer?");
        
        while (Menu != 0) {
            switch (Menu) {
                case 1://Insertar Tripleta
                    int F, C;
                    float D;
                    while (Menu == 1) {
                        
                        do {
                            System.out.println("Inserte Fila del Digito: ");
                            F = Input.nextInt();
                        }while ((F > NF)||(F <= 0));
                        
                        do {
                            System.out.println("Inserte Columna del Digito: ");
                            C = Input.nextInt();
                        }while ((C > NC)||(C <= 0));
                        
                        System.out.println("Inserte el Digito: ");
                        D = Input.nextFloat();
                        MatD = MatD.InsertarTrip(F, C, D);                        
                        System.out.print("Si desea ingresar otra Tripleta presione 1, "
                                + "de lo contrario Presione culaquier numero: ");
                        Menu = Input.nextShort();
                    }
                    Menu = 10;                 
                    break;
                case 2://Sumar Filas
                    MatD.SumarFilas();
                    
                    Menu = 10;
                    break;
                case 3://Sumar Columnas
                    MatD.SumarColumnas();
                    
                    Menu = 10;
                    break;
                case 4:
                    
                    Menu = 10;
                    break;
                case 5:
                    MatD.MostrarMatDis(NF, NC, CD);
                    Menu = 10;
                    break;
                case 6:
                    MatD.MostrarMatTri();
                    Menu = 10;
                    break;
                case 10:
                    System.out.println("****_Menu Principal_****");
                    System.out.println("*Presione 1: Para Insertar Tripletas.\n"
                            + "*Presione 2: Para Sumar Filas.\n"
                            + "*Presione 3: Para Sumar Columnas.\n"
                            + "*Presione 4: Para Imprimir la Transpuesta.\n"
                            + "*Presione 5: Para Mostrar la Matriz Dispersa.\n"
                            + "*Presione 6: Para Mostrar la Matriz Tripleta.\n"
                            + "*Presione 0: Para Salir.\n"
                            + "Esperando Opción: ");
                    Menu = Input.nextShort();
                    break;
            }
        }
        
    
    }//Fin Main
    
}//Fin Programa
