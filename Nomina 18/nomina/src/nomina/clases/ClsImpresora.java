/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nomina.Clases;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class ClsImpresora {
    Font fuente = new Font("Dialog", Font.PLAIN, 10);
    PrintJob pj;
    Graphics pagina;

    //Constructor de la Clase Impresora
    public ClsImpresora(String NombreArchivo) {
        pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), NombreArchivo, null);
    }
	
    public void Imprimir(ClsEmpleados Empleado, double Salud, double Pension, double Prestamos,
            double AuxTransporte, double SalarioNeto, double SalarioBasico, double SalarioBruto, 
            double Bonificaciones, double HorasExtD, double HorasExtN, String Periodo){
        
        NumberFormat Format = NumberFormat.getCurrencyInstance(Locale.getDefault());
        
        //En un try/catch porque pueden cancelar la impresion
        try {
            pagina = pj.getGraphics();
            pagina.setFont(fuente);
            pagina.setColor(Color.black);
            
            pagina.drawString("ID: " + Empleado.getCedula(), 60, 60);
            pagina.drawString("Nombres: " + Empleado.getPrimerNombre() + " " + Empleado.getSegundoNombre(), 60, 80);
            pagina.drawString("Apellidos: " + Empleado.getPrimerApellido() + " " + Empleado.getSegundoApellido(), 60, 100);
            pagina.drawString("Salario día: " + Format.format(Empleado.getSalarioDia()) + "         Periodo: " + Periodo, 60, 120);

            pagina.drawString("Conceptos de la nomina", 60, 140);            
            pagina.drawString("Extra Diurno ______________ " + Format.format(HorasExtD), 80, 155);
            pagina.drawString("Extra Nocturno ______________ " + Format.format(HorasExtN), 80, 170);
            pagina.drawString("Auxilio Transporte __________ " + Format.format(AuxTransporte), 80, 185);
            pagina.drawString("Salario Bruto ______________ " + Format.format(SalarioBruto), 80, 200);
            pagina.drawString("Aporte Salud ______________ " + Format.format(Salud), 80, 215);
            pagina.drawString("Aporte Pension ____________ " + Format.format(Pension), 80, 230);
            pagina.drawString("Deducción Prestamos _______ " + Format.format(Prestamos), 80, 245);
            pagina.drawString("Bonificaciones _____________ " + Format.format(Bonificaciones), 80, 260);
            pagina.drawString("Salario Neto _______________ " + Format.format(SalarioNeto), 80, 275);
            pagina.drawString("Fin", 80, 290);

            pagina.dispose();
            pj.end();
        } catch (Exception e) {
            System.out.println("Cancelada la Impresion...");
        }
    }//Fin de Imprimir String

					
}//Fin Clase imprimir
