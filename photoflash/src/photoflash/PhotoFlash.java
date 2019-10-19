/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package photoflash;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author sala207
 */
public class PhotoFlash {
    
    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        //Objeto Stream Reader
        InputStreamReader Isr;
        Isr = new InputStreamReader(System.in);
        BufferedReader Br;
        Br = new BufferedReader(Isr);
        
        short Menu = 5, FlagTipo, NumEvens = 0;
        String NomIns, Tipo, Dir;
        int NumGra, NumDia, Hora, Min;
        //float Desc, ValorN;
        
        Evento MatDat = new Evento();
        
        while (Menu != 0) {
            switch (Menu) {
                case 1: //Insertar Evento
                    while (Menu == 1) {
                        if (NumEvens == 31) {
                            System.out.println("Cantidad de Eventos Agotado, no se pueden insertar más.");
                            break;
                        }                        
                        System.out.println("REGISTRAR UN EVENTO.");
                        System.out.println("Ingrese Nombre de la Institución: ");
                        NomIns = Br.readLine();
                        System.out.println("Ingrese Tipo de la Institución (1 = Colegio, 2 = Universidad): ");
                        FlagTipo = Input.nextShort();
                        if (FlagTipo == 1) {
                            Tipo = "Colegio";
                        }
                        else {
                            Tipo = "Universidad";
                        }                        
                        System.out.println("Ingrese Dirección de la Institución: ");
                        Dir = Br.readLine();
                        System.out.println("Ingrese Cantidad de Graduados: ");
                        NumGra = Input.nextInt();
                        System.out.println("Ingrese Numero de día del Evento (1-31): ");
                        NumDia = Input.nextInt();
                        NumDia--; //Bajamos un día por el cero de la matriz
                        System.out.println("Ingrese Hora del Evento: ");
                        Hora = Input.nextInt();
                        System.out.println("Ingrese Minuto del Evento: ");
                        Min = Input.nextInt();
                        
                        MatDat.InsertarInst(NumDia, NomIns, Tipo, Dir, NumGra, Hora, Min);
                        
                        System.out.print("Presione 1 para Ingresar otro Evento o 0 para Cancelar: ");
                        Menu = Input.nextShort();
                        NumEvens++; //Aumentamos Evento
                    }
                    Menu = 5;
                    break;
                case 2: //Listar Eventos con precio
                    ListasEvento.IncluirPrecio(MatDat.MatStr, MatDat.MatNum, MatDat.MatCal);
                    Menu = 5;
                    break;
                case 3: //Listar Eventos por Tipo
                    ListasEvento.ListarPorTipo(MatDat.MatStr, MatDat.MatNum, MatDat.MatCal);
                    Menu = 5;
                    break;
                case 4: //Listar Evento por dia
                    ListasEvento.ListarPorDia(MatDat.MatStr, MatDat.MatNum, MatDat.MatCal);
                    Menu = 5;
                    break;
                case 5: //Mostrar Menu
                    System.out.println("***Menu de Opciones***");
                    System.out.println("*Presione 1: Para Registrar un Evento.");
                    System.out.println("*Presione 2: Para Listar Eventos con Precio");
                    System.out.println("*Presione 3: Para Listar Eventos por Tipo.");
                    System.out.println("*Presione 4: Para Listar Eventos por Día.");
                    System.out.println("*Presione 0: Para SALIR.");
                    System.out.print("Esperando Opción: ");
                    Menu = Input.nextShort();
                    break;
            }
        }
        
        
    }
}
