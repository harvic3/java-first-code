
package nomina.Clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClsEmpleados {Connection conect;
    private String Cedula;
    private String PrimerApellido;
    private String SegundoApellido;
    private String PrimerNombre;
    private String SegundoNombre;
    private String Direccion;
    private String CorreoElectronico;
    private String Telefono;
    private String Celular;
    private double SalarioDia;
    private String FechaIngreso;
    private String FechaSalida;
    private String TipoSalario;
    private String FechaNac;
    private String EstCivil;
    private String Cargo;
    private String Estado;
    private int diasTrabajados;
    private String CuentaBanc;
    private double AuxTransporte;
    //private int DiasVacaciones; //Corresponde a los días que ha tomado de vacaciones el empleado

    

    
    public ClsEmpleados() {
        conect = ClsConexionDatos.conexion();
    }

    public ClsEmpleados(String Cedula, String PrimerApellido, String SegundoApellido, String PrimerNombre, String SegundoNombre, String Direccion, String CorreoElectronico, String Telefono, String Celular, double SalarioDia, String FechaIngreso, String FechaSalida, String TipoSalario, String FechaNac, String EstCivil, String Cargo, String Estado, int diasTrabajados, String CuentaBanc) {
        this.Cedula = Cedula;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.PrimerNombre = PrimerNombre;
        this.SegundoNombre = SegundoNombre;
        this.Direccion = Direccion;
        this.CorreoElectronico = CorreoElectronico;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.SalarioDia = SalarioDia;
        this.FechaIngreso = FechaIngreso;
        this.FechaSalida = FechaSalida;
        this.TipoSalario = TipoSalario;
        this.FechaNac = FechaNac;
        this.EstCivil = EstCivil;
        this.Cargo = Cargo;
        this.Estado = Estado;
        this.diasTrabajados = diasTrabajados;
        this.CuentaBanc = CuentaBanc;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public double getSalarioDia() {
        return SalarioDia;
    }

    public void setSalarioDia(double SalarioDia) {
        this.SalarioDia = SalarioDia;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getTipoSalario() {
        return TipoSalario;
    }

    public void setTipoSalario(String TipoSalario) {
        this.TipoSalario = TipoSalario;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getEstCivil() {
        return EstCivil;
    }

    public void setEstCivil(String EstCivil) {
        this.EstCivil = EstCivil;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String getCuentaBanc() {
        return CuentaBanc;
    }

    public void setCuentaBanc(String CuentaBanc) {
        this.CuentaBanc = CuentaBanc;
    }
    
    public double getAuxTransporte() {
        return AuxTransporte;
    }

    public void setAuxTransporte(double AuxTransporte) {
        this.AuxTransporte = AuxTransporte;
    }

    
   public String selectTodos() throws SQLException {

        

        String regs = "";
        ResultSet rs = null;
        rs = ClsConexionDatos.select(conect);
        
        while (rs.next()) {
            //regs = regs + rs.getObject(1) + "-" + rs.getObject(2) + "-" + rs.getObject(3);
            regs = regs + rs.getObject(1) +" "+ rs.getObject(2) +" "+ rs.getObject(3);
//            rs.getString("Cedula");
//            rs.getString("PrimerApellido");
            
        }
        

        return regs;
    }

    public void setAuxTransporte(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    

    
    
}
