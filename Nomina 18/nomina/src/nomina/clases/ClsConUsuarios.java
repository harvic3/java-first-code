
package nomina.Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nomina.Formularios.FrmPrincipal;

public class ClsConUsuarios {

    private Connection conect = null;
    private String strSql;
    private int numFilas = 0;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Statement st;
    private ResultSet rs;
    
     public static Connection conexion() {

        String strSql = "";
        Connection conect = null;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            strSql = "jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=E:\\Poli\\Taller Programacion Java\\2014\\AppNomina\\Base de Datos\\BDNomina.mdb;";
//           String db = System.getProperty("user.dir")+"\\"+ "BDNomina.mdb"+";PWD="+"";  
//            strSql = "jdbc:odbc:;DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=" + db;    
            conect = DriverManager.getConnection(strSql, "", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conect;
    }
     
    public void Desconectar() {
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClsConUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodos Usuarios
    //
    
    
    
    
    public static int Insert(String Cedula,
            String PrimerApellido,
            String SegundoApellido,
            String PrimerNombre, 
            String SegundoNombre
             
            ) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";
        int numFilas = 0;
        Connection conect = conexion();

        try {
            strSql = "INSERT INTO TblUsuarios VALUES ('" + Cedula + "', '" + PrimerApellido + "', '" + SegundoApellido + "', '" + PrimerNombre + "', '" + SegundoNombre + "')";
            st = conect.createStatement();
            numFilas = st.executeUpdate(strSql);
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return numFilas;
    }

    void Update(String nombre, String apellidos, int edad) {
        try{
            st = conect.createStatement();
            strSql = "UPDATE Personas SET Apellidos = '" + apellidos + ", Edad = " + edad + " WHERE nombre = '" + nombre + "'";
            numFilas = st.executeUpdate(strSql);
            JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Registros Modificados !!!");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

   public void DeleteEmpleados(String Cedula) {
       Connection conect = conexion();
        try{
            st = conect.createStatement();
            strSql = "DELETE FROM TblUsuarios WHERE Cedula = '" + Cedula + "'";
            numFilas = st.executeUpdate(strSql);
            JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Usuario Eliminado !!!");        
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
                        
    public static ResultSet select(Connection conect) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";

        try {

            st = conect.createStatement();

            strSql = "select * from TblUsuarios";
            rs = st.executeQuery(strSql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return rs;
    }
    
    public int selectEmpleado(String cedula) {
        Connection conect = conexion();
        try {
            st = conect.createStatement();

            strSql = "select * from TblUsuarios Where Cedula = '" + cedula + "'" ;
            rs = st.executeQuery(strSql);
            while(rs.next())
            {
                if(cedula.equals( rs.getObject(1))){                                                        
                    return 1;    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error  "+e );  
        }   
        return 0;
    }
    
    public void buscarEmpleado(String cedula ){
        conexion();
        if(selectEmpleado(cedula)==1){
                       
        }        
    }
    
    
   public static ClsUsuarios[] SelectAll(int Fila) {
        java.util.List<ClsUsuarios> ListaUsuarios = new ArrayList <>();
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();        
        try {
            st = conect.createStatement();
            strSql = "select * from TblUsuarios";
            rs = st.executeQuery(strSql);           
            while (rs.next()) {               
               // System.out.println(Fila + " y " + rs.getRow());                
                if (Fila == rs.getRow()) {                                 
                    ClsUsuarios Tempusuarios = new ClsUsuarios();
                    Tempusuarios.setCedula(rs.getString("Cedula"));
                    Tempusuarios.setNombre(rs.getString("Usuario"));
                    Tempusuarios.setApellidos(rs.getString("Apellidos"));
                    Tempusuarios.setContraseña(rs.getString("Clave"));
                    Tempusuarios.setTipoUsuario(rs.getString("TipoUsuario"));
                    
                    ListaUsuarios.add(Tempusuarios);

                    break;
                }
            }            

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return ListaUsuarios.toArray(new ClsUsuarios[ListaUsuarios.size()]);
    } 
   
   public static int NumeroFilas() {
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();
        int Tamano = 0;
        try {
            st = conect.createStatement();
            strSql = "select * from TblEmpleados";
            rs = st.executeQuery(strSql);
            while(rs.next()){
                Tamano++;                
            }              
        } catch (SQLException e) {
            System.out.println("Error getting row count");
            return 0;
        }
        return Tamano;

    }
     
   
   public static ClsUsuarios[] buscar(String Cedula) {
        java.util.List<ClsUsuarios> ListaUsuarios = new ArrayList <>();
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();        
        try {
            st = conect.createStatement();
            strSql = "select * from TblUsuarios where Cedula = '"+Cedula+"'";
            rs = st.executeQuery(strSql);           
            while (rs.next()) {               
               
                    ClsUsuarios tempEmpleado = new ClsUsuarios();
                    tempEmpleado.setCedula(rs.getString("Cedula"));
                    tempEmpleado.setNombre(rs.getString("Usuario"));
                    tempEmpleado.setApellidos(rs.getString("Apellidos"));
                    tempEmpleado.setContraseña(rs.getString("Clave"));
                    tempEmpleado.setTipoUsuario(rs.getString("TipoUsuario"));
                    
                    ListaUsuarios.add(tempEmpleado);
                    break;                
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return ListaUsuarios.toArray(new ClsUsuarios[ListaUsuarios.size()]);
    }
    
}

