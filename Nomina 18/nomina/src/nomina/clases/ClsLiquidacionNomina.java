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
public class ClsLiquidacionNomina {
     //private ClsEmpleados P;
    
    /**
     * Calcular Salario Bruto
     * @param DiasLaborados
     * @param SalarioDia
     * @return SalrioBruto
     */
    String Cedula;
    int  Periodo;        
    double salhora;
    double AuxTransporte;
    double SalarioBasico;
    double ValorExtrasDiurnas;
    double ValorExtrasNocturnas;
    double SalarioBruto;
    double AporteSalud;
    double AportePension;
    double Bonificaciones;
    double Prestamos;
    double SalarioNeto;

    public ClsLiquidacionNomina(String Cedula, int Periodo, double salhora, double AuxTransporte, double SalarioBasico, double ValorExtrasDiurnas, double ValorExtrasNocturnas, double SalarioBruto, double AporteSalud, double AportePension, double Bonificaciones, double Prestamos, double SalarioNeto) {
        this.Cedula = Cedula;
        this.Periodo = Periodo;
        this.salhora = salhora;
        this.AuxTransporte = AuxTransporte;
        this.SalarioBasico = SalarioBasico;
        this.ValorExtrasDiurnas = ValorExtrasDiurnas;
        this.ValorExtrasNocturnas = ValorExtrasNocturnas;
        this.SalarioBruto = SalarioBruto;
        this.AporteSalud = AporteSalud;
        this.AportePension = AportePension;
        this.Bonificaciones = Bonificaciones;
        this.Prestamos = Prestamos;
        this.SalarioNeto = SalarioNeto;
    }

    public ClsLiquidacionNomina() {
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(int Periodo) {
        this.Periodo = Periodo;
    }

    public double getSalhora() {
        return salhora;
    }

    public void setSalhora(double salhora) {
        this.salhora = salhora;
    }

    public double getAuxTransporte() {
        return AuxTransporte;
    }

    public void setAuxTransporte(double AuxTransporte) {
        this.AuxTransporte = AuxTransporte;
    }

    public double getSalarioBasico() {
        return SalarioBasico;
    }

    public void setSalarioBasico(double SalarioBasico) {
        this.SalarioBasico = SalarioBasico;
    }

    public double getValorExtrasDiurnas() {
        return ValorExtrasDiurnas;
    }

    public void setValorExtrasDiurnas(double ValorExtrasDiurnas) {
        this.ValorExtrasDiurnas = ValorExtrasDiurnas;
    }

    public double getValorExtrasNocturnas() {
        return ValorExtrasNocturnas;
    }

    public void setValorExtrasNocturnas(double ValorExtrasNocturnas) {
        this.ValorExtrasNocturnas = ValorExtrasNocturnas;
    }

    public double getSalarioBruto() {
        return SalarioBruto;
    }

    public void setSalarioBruto(double SalarioBruto) {
        this.SalarioBruto = SalarioBruto;
    }

    public double getAporteSalud() {
        return AporteSalud;
    }

    public void setAporteSalud(double AporteSalud) {
        this.AporteSalud = AporteSalud;
    }

    public double getAportePension() {
        return AportePension;
    }

    public void setAportePension(double AportePension) {
        this.AportePension = AportePension;
    }

    public double getBonificaciones() {
        return Bonificaciones;
    }

    public void setBonificaciones(double Bonificaciones) {
        this.Bonificaciones = Bonificaciones;
    }

    public double getPrestamos() {
        return Prestamos;
    }

    public void setPrestamos(double Prestamos) {
        this.Prestamos = Prestamos;
    }

    public double getSalarioNeto() {
        return SalarioNeto;
    }

    public void setSalarioNeto(double SalarioNeto) {
        this.SalarioNeto = SalarioNeto;
    }

    
    
    
    
    
    
    
    
    
    public  double ValHorasExtras  (int horasExtras, double salarioDia){
            salhora = salarioDia / 8;
            ValorExtrasDiurnas = horasExtras * (salhora*1.35);
        return(ValorExtrasDiurnas);
    }
    
    public  double ValHorasExtrasN  (int horasExtrasN, double salarioDia){
            salhora = salarioDia / 8;
            ValorExtrasNocturnas = horasExtrasN * (salhora*1.75);
        return(ValorExtrasNocturnas);
    }
    
    public double SalarioBasico(int DiasLaborados, double SalarioDia){
         SalarioBasico = DiasLaborados * SalarioDia;        
        
        return(SalarioBasico);
    }
    
    public double SalarioBruto(double SalarioBasico, double ValExtrasDiurnas, double ValExtrasNocturnas){
        SalarioBruto = SalarioBasico + ValExtrasDiurnas + ValExtrasNocturnas;
        
        return(SalarioBruto);
    }
    /**
     * Calcular Aporte a Salud
     * @param SalarioBruto
     * @return AporteSalud
     */
    public double CalcAporteSalud(double SalarioBruto){
         AporteSalud = SalarioBruto*0.04;
        
        return(AporteSalud);
    }
    /**
     * Calcular Aporte a Pensión
     * @param SalarioBruto
     * @return Aporte a Pension
     */
    public  double CalcAportePension(double SalarioBruto){
         AportePension = SalarioBruto*0.04;
        
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
    public  double CalcSalarioNeto(double SalarioBruto, double AportePension, double AporteSalud, 
                                double Prestamos, double AuxTransporte, double Bonificaciones, 
                                double ExtraDiurno, double ExtraNocturno){
        
         SalarioNeto = SalarioBruto + AuxTransporte + Bonificaciones - (AportePension + AporteSalud + Prestamos);
        
        return(SalarioNeto);
    }
    /**
     *Calcular Cesantias
     * @param SalarioDia
     * @param DiasTrabajados
     * @return
     */
    
    
    
    
}