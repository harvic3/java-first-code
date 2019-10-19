/*
 * Dudas: Como se calculan las Cesantías, por mes o anual?
 * 2. Cuál es el valor de los riesgos profesionales
 * 
 */

package nomina.Clases;

/**
 *
 * @author ASUS
 */
public class ClsSeguridadSocial {
    //Aportes del Empleado
    private double P_Pension;
    private double P_Salud;
    //Aportes de la Empresa   
    private double E_Pension;
    private double E_Salud;
    private double E_RiesgProf;
    private double E_Cesantias;
    //Aportes Totales
    private double Pension;
    private double Salud;
    
    //Parametros de Porcentajes
    private float PorcPension;
    private float PorcSalud;
    //Estos parametros se configuran en la pesataña de configuración de la aplicacción.
    
    /**Calculo Aporte Salud Empleado
     * 
     * @param SalarioBruto
     * @return P_Salud
     */
    public double CalcSaludP(double SalarioBruto){
        
        
        return(P_Salud);
    }
    
    /**Calculo Aporte Salud Empresa
     * 
     * @param SalarioBruto
     * @return E_Salud
     */
    public double CalcSaludE(double SalarioBruto){
        
        
        return(E_Salud);
    }
    
    /**Calculo Aporte Pensión Empleado
     * 
     * @param SalarioBruto
     * @return P_Pension
     */
    public double CalcPensionP(double SalarioBruto){
        
        
        return(P_Pension);
    }
    /**Calculo Aporte Pensión Empresa
     * 
     * @param SalarioBruto
     * @return P_Pension
     */
    public double CalcPensionE(double SalarioBruto){
        
        
        return(E_Pension);
    }
    
    
}
