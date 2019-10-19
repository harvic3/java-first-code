/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina.Clases;

/**
 *
 * @author Wilson
 */
public class ClsCargos {
    private String Cargo;
    private String NombreCargo;

    public ClsCargos(String Cargo, String NombreCargo) {
        this.Cargo = Cargo;
        this.NombreCargo = NombreCargo;
    }

    public ClsCargos() {
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getNombreCargo() {
        return NombreCargo;
    }

    public void setNombreCargo(String NombreCargo) {
        this.NombreCargo = NombreCargo;
    }
    

    
}
