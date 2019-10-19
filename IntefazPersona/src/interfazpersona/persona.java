package interfazpersona;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class persona {

    Connection conect;
    private String nombre;
    private String apellidos;
    private int edad;

    public persona() {
    }

    public persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String selectTodos() throws SQLException {
        
        conect = datos.conexion();
        
        String regs = "";
        ResultSet rs = null;
        rs = datos.select(conect);

        while (rs.next()) {
            regs = regs + rs.getObject(1) + "-" + rs.getObject(2) + "-" + rs.getObject(3);
        }

        return regs;
    }

    public int insertarPersona(String nombre, String apellidos, int edad) {
        int filas = 0;
        filas = datos.insert(conect,nombre, apellidos, edad);
        return filas;
    }
}
