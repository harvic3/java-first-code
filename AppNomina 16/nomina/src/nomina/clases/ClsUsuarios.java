/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina.Clases;

/**
 *
 * @author Wilson
 */
public class ClsUsuarios {
    
    String nombre ;
    String cedula;
    String Apellidos;
    String Contraseña;
    String TipoUsuario;

    public ClsUsuarios(String nombre, String cedula, String Apellidos, String Contraseña, String TipoUsuario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.Apellidos = Apellidos;
        this.Contraseña = Contraseña;
        this.TipoUsuario = TipoUsuario;
    }

    public ClsUsuarios() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    

       
    }

    

   
    

    
    

    
    
     
 
    
    

