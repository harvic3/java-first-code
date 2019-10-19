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
 * @author sala304
 */
public class ClsPrimaDeServicios {
    
    /**
     * 
     * @param SalarioDia
     * @param FechaIngreso
     * @return Prima
     */    
    public double CalcPrima(double SalarioDia, String FechaIngreso){
        GregorianCalendar Fecha = new GregorianCalendar();
        double Prima = 0;       
        int Dias = 0;
        int AnoI = 0, DiaI = 0, MesI = 0; 
        int AnoF = Fecha.get(Calendar.YEAR), MesF = Fecha.get(Calendar.MONTH);
        
        DiaI = Integer.parseInt(FechaIngreso.substring(8,10));
        MesI = Integer.parseInt(FechaIngreso.substring(5,7));
        AnoI = Integer.parseInt(FechaIngreso.substring(0,4));
        
        System.out.println(MesF + " " + MesI + " " + AnoF + " " + AnoI);
                
        if (AnoI == AnoF){
            Dias = ((MesF - MesI + 1) * 30) + (31 - DiaI);
            System.out.println("Entro a prima2");
        }else{
            System.out.println("Entro a prima1");
            Dias = 180;
        }
        System.out.println("Los días son: " + Dias);      
        Prima = (Dias * 15 / 180 * SalarioDia);     
        
        return Prima;
    }
    
    
}
