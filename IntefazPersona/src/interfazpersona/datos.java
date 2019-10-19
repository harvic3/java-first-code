package interfazpersona;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class datos {

    //REALIZAR LA CONEXIÓN CON LA BASE DE DATOS
    public static Connection conexion() {

        String strSql = "";
        Connection conect = null;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            strSql = "jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=D:\\BDPersonas.mdb;";

            conect = DriverManager.getConnection(strSql, "", "");


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conect;
    }

    // REALIZAR UN SELECT A LA BASE DE DATOS Y MOSTRAR EL RESULTADO
    public static ResultSet select(Connection conect) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";

        try {

            st = conect.createStatement();

            strSql = "select * from personas";
            rs = st.executeQuery(strSql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return rs;
    }

    // REALIZAR UN SELECT A LA BASE DE DATOS Y MOSTRAR EL RESULTADO
    public static ResultSet select(Connection conect, String usuario, String clave) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";

        try {

            st = conect.createStatement();

            strSql = "select * from usuarios where usuario = '" + usuario + "' and clave = '" + clave + "'";
            rs = st.executeQuery(strSql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return rs;
    }

    // REALIZAR UN INSERT A LA BASE DE DATOS
    public static int insert(Connection conect, String nombre, String apellidos, int edad) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";
        int numFilas = 0;

        try {

            
            strSql = "INSERT INTO personas VALUES ('" + nombre + "', '" + apellidos + "', " + edad + ")";
            st = conect.createStatement();
            numFilas = st.executeUpdate(strSql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return numFilas;
    }

    // REALIZAR UN UPDATE A LA BASE DE DATOS
    public static int update(Connection conect, String nombre, String apellidos, int edad) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";
        int numFilas = 0;

        try {
            st = conect.createStatement();

            strSql = "UPDATE personas SET apellido = '" + apellidos + "', edad = " + edad + " WHERE nombre = '" + nombre + "'";
            numFilas = st.executeUpdate(strSql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return numFilas;
    }

    //REALIZAR UN DELETE EN LA BASE DE DATOS
    public static int delete(Connection conect, String nombre) {
        
        Statement st;
        ResultSet rs = null;
        String strSql = "";
        int numFilas = 0;

        try {

            st = conect.createStatement();
            strSql = "DELETE * FROM personas WHERE nombre = '" + nombre + "'";
            numFilas = st.executeUpdate(strSql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return numFilas;
    }

    //Cerrar la conexión con la base de Datos
    public static void cerrarConexion(Connection conect) {
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
