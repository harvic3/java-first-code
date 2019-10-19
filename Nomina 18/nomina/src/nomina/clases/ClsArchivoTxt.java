/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nomina.Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFileChooser;

/**
 *
 * @author ASUS
 */
public class ClsArchivoTxt {
    private File Archivo;
    private FileReader Fr;
    private BufferedReader Br;
    private FileWriter Fichero;
    private PrintWriter Pw;
    
    
    public ClsArchivoTxt(){
        Archivo = null;
        Fr = null;
        Br = null;
        Fichero = null;
        Pw = null;
    }
       
    public void ImprimirArchivo(ClsEmpleados Empleado, double Salud, double Pension, double Prestamos,
            double AuxTransporte, double SalarioNeto, double SalarioBasico, double SalarioBruto, double Bonificaciones, double HorasExtD, double HorasExtN, String Nombre, String Periodo){
        
        NumberFormat Format = NumberFormat.getCurrencyInstance(Locale.getDefault());
        
        try
        {
            Fichero = new FileWriter(Nombre, true);
            Pw = new PrintWriter(Fichero);
            
            Pw.println("ID: " + Empleado.getCedula());
            Pw.println("Nombres: " + Empleado.getPrimerNombre() + " " + Empleado.getSegundoNombre());
            Pw.println("Apellidos: " + Empleado.getPrimerApellido() + " " + Empleado.getSegundoApellido());
            Pw.println("Salario día: " + Format.format(Empleado.getSalarioDia()) + "        Periodo: " + Periodo);
            Pw.println();
            
            Pw.println("Conceptos de la nomina");
            Pw.println("Extra Diurno ______________ " + Format.format(HorasExtD));
            Pw.println("Extra Nocturno ______________ " + Format.format(HorasExtN));
            Pw.println("Auxilio Transporte _________ " + Format.format(AuxTransporte));
            Pw.println("Salario Bruto ______________ " + Format.format(SalarioBruto));            
            Pw.println("Aporte Salud ______________ " + Format.format(Salud));
            Pw.println("Aporte Pension ____________ " + Format.format(Pension));
            Pw.println("Deducción Prestamos _______ " + Format.format(Prestamos));
            Pw.println("Bonificaciones _____________ " + Format.format(Bonificaciones));
            Pw.println("Salario Neto _______________ " + Format.format(SalarioNeto));
            Pw.println("----------------------------------------------------------------");
            Pw.println();                       

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != Fichero)
              Fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
         
    }    
    
    
}
