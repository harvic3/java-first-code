/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplicationbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author cdposada
 */
public class conectar {
    Connection conect = null;

    public Connection conexion(){

        try {
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            String strConnect = "jdbc:odbc:bd_Estudiantes";

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String strConnect = "jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=D:\\Downloads\bdEstudiantes.mdb;";

            conect = DriverManager.getConnection(strConnect, "", "");
            JOptionPane.showMessageDialog(null, "Conectado");

            Statement st = conect.createStatement();

            ResultSet rs = st.executeQuery("select * from Estudiantes");
            while ( rs.next() )
            {
                System.out.println(rs.getObject(1) + "-" + rs.getObject(2) + "-" + rs.getObject(3) + "-" + rs.getObject(4));

            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conect;
    }

}
