/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nomina.Clases;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author ASUS
 */
public class ClsCalculos {
     //private ClsEmpleados P;
    
    /**
     * Calcular Salario Bruto
     * @param DiasLaborados
     * @param SalarioDia
     * @return SalrioBruto
     */
    public static double CalcSalarioBruto(int DiasLaborados, double SalarioDia){
        double SalarioBruto = DiasLaborados*SalarioDia;        
        
        return(SalarioBruto);
    }
    public  double ValHorasExtras  (int horasExtras, double salarioDia){
        double salhora = salarioDia /8;
        double ValorHorasExtras = horasExtras*(salhora*1.35);
        return(ValorHorasExtras);
    }
    
    public  double ValHorasExtrasN  (int horasExtrasN, double salarioDia){
        double salhora = salarioDia /8;
        double ValorHorasExtras = horasExtrasN*(salhora*1.75);
        return(ValorHorasExtras);
    }
    
    public double SalarioBasico(int DiasLaborados, double SalarioDia){
        double SalarioBruto = DiasLaborados*SalarioDia;        
        
        return(SalarioBruto);
    }
    /**
     * Calcular Aporte a Salud
     * @param SalarioBruto
     * @return AporteSalud
     */
    public static double CalcAporteSalud(double SalarioBruto){
        double AporteSalud = SalarioBruto*0.04;
        
        return(AporteSalud);
    }
    /**
     * Calcular Aporte a Pensión
     * @param SalarioBruto
     * @return Aporte a Pension
     */
    public static double CalcAportePension(double SalarioBruto){
        double AportePension = SalarioBruto*0.04;
        
        return(AportePension);
    }
    /**
     * Calcular Salario Neto
     * @param SalarioBruto
     * @param AportePension
     * @param AporteSalud
     * @param Prestamos
     * @param AuxTransporte
     * @param Bonificaciones
     * @return SalarioNeto
     */
    public static double CalcSalarioNeto(double SalarioBruto, double AportePension, double AporteSalud, 
                                double Prestamos, double AuxTransporte, double Bonificaciones){
        double SalarioNeto = SalarioBruto + AuxTransporte + Bonificaciones - (AportePension + AporteSalud + Prestamos);
        
        return(SalarioNeto);
    }
    /**
     *Calcular Cesantias
     * @param SalarioDia
     * @param DiasTrabajados
     * @return
     */
//    public static double CalcCesantias(double SalarioDia, double DiasTrabajados) {
//        double Cesantias = 0;
//        Cesantias = (SalarioDia * DiasTrabajados) / 360;
//
//        return (Cesantias);
//    }
//    /**
//     * 
//     * @param SalarioDia
//     * @param FechaIngreso //Formato Año/Mes/Dia 0001/01/01
//     * @return 
//     */
//    public double CalcPrima(double SalarioDia, String FechaIngreso){
//        GregorianCalendar Fecha = new GregorianCalendar();
//        double Prima = 0;       
//        int Dias = 0;
//        int AnoI = 0, DiaI = 0, MesI = 0; 
//        int AnoF = Fecha.get(Calendar.YEAR), MesF = Fecha.get(Calendar.MONTH);
//        
//        DiaI = Integer.parseInt(FechaIngreso.substring(8,10));
//        MesI = Integer.parseInt(FechaIngreso.substring(5,7));
//        AnoI = Integer.parseInt(FechaIngreso.substring(0,4));
//        
//        System.out.println(MesF + " " + MesI + " " + AnoF + " " + AnoI);
//                
//        if (AnoI == AnoF){
//            Dias = ((MesF - MesI + 1) * 30) + (31 - DiaI);
//            System.out.println("Entro a prima2");
//        }else{
//            System.out.println("Entro a prima1");
//            Dias = 180;
//        }
//        System.out.println("Los días son: " + Dias);      
//        Prima = (Dias * 15 / 180 * SalarioDia);     
//        
//        return Prima;
//    }
    
    
}