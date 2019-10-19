/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nomina.Clases;

/**
 *
 * @author sala304
 */
public class ClsCesantias {    
    /**
     *Calcular Cesantias
     * @param SalarioDia
     * @param DiasTrabajados
     * @return Cesantias
     */
    public static double CalcCesantias(double SalarioDia, double DiasTrabajados) {
        double Cesantias = 0;
        Cesantias = (SalarioDia * 30 * DiasTrabajados) / 360;

        return (Cesantias);
    }
    
}
