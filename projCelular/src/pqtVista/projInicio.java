/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqtVista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import pqtLogica.clsOperCelular;

/**
 *
 * @author ASUS
 */
public class projInicio {

    public projInicio() throws IOException{
    
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(flujo);
            
        String Opcion = "";
        String strTemp = "";
        int Opc;
        clsOperCelular Operacion  = new clsOperCelular();
        
        do{
            System.out.println("Menu Proyecto Celulares.");
            System.out.println("1. Ingresar Nuevo Registro. ");
            System.out.println("2. Ingresar . ");
            System.out.println("3. Ingresar . ");
            System.out.print("Seleccione una opcion: ");            
            Opcion = buffer.readLine();
            System.out.println();
            Opc = Integer.parseInt(Opcion);
                        
            switch (Opc){
                case 1:
                    System.out.println("Ingrese el Codigo: ");
                    String strCodigo = buffer.readLine();
                    int intCodigo = Integer.parseInt(strCodigo);
                    System.out.println("Ingrese el Marca: ");
                    String strMarca = buffer.readLine();
                    System.out.println("Ingrese el Modelo: ");
                    String strModelo = buffer.readLine();
                    System.out.println("Ingrese el Numero: ");
                    String strNumero = buffer.readLine();
                    System.out.println("Ingrese el Saldo: ");
                    strTemp = buffer.readLine();
                    int intSaldo = Integer.parseInt(strTemp); 
                    
                    //Envío de Variables
                    Operacion.Ingresar(intCodigo, strMarca, strModelo, strNumero, intSaldo);
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
            }
            
        }while(Opc != 0);
        
    }
        
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        projInicio pI = new projInicio();
        
        
        
    }
    
}
