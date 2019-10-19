/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nomina.Clases;

/**
 *
 * @author ASUS
 */
public class ClsVacaciones {
    
    /**
     * Calcular Monto Vacaciones
     * @param DiasATomar
     * @param SalarioDia
     * @return 
     */
    public double CalcVacaciones(short DiasATomar, short SalarioDia) {
        
        double MontoVacaciones = 0;       
                
        MontoVacaciones = DiasATomar * SalarioDia;
        
        return (MontoVacaciones);
    }   
    /**
     * Calcular los Dias de Vacaciones
     * @param FechaIngreso
     * @param FechaSalida
     * @param DiasTomados
     * @return 
     */
    public int CalcDiasVacaciones(String FechaIngreso, String FechaSalida, short DiasTomados) {
        int DiaI, MesI, AnoI, DiaF, MesF, AnoF, Dias = 0;
        
        DiaI = Integer.parseInt(FechaIngreso.substring(8,10));
        MesI = Integer.parseInt(FechaIngreso.substring(5,7));
        AnoI = Integer.parseInt(FechaIngreso.substring(0,4));
        
        DiaF = Integer.parseInt(FechaSalida.substring(8,10));
        MesF = Integer.parseInt(FechaSalida.substring(5,7));
        AnoF = Integer.parseInt(FechaSalida.substring(0,4));
        
        Dias = ((AnoF - AnoI + 1)*360) - (MesI*30 - (30-DiaI-1)) - ((13 - MesF)*30 - DiaF);
        
        Dias = Dias - DiasTomados;
        
        return Dias;
    }
    
}
