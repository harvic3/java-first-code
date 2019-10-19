
package proyectos_vectores;
import java.sql.*; 

public class conexion_oracle {
private Connection conexion;

    Statement getConexion;

public Connection getConexion() { 
    return conexion; 
} 

 public void setConexion(Connection conexion) { 
    this.conexion = conexion; 
}  
 
 public conexion_oracle conectar() { 
    try { 
        Class.forName("oracle.jdbc.OracleDriver"); 
        String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE"; 
          
        conexion = DriverManager.getConnection(BaseDeDatos, "hueco","hueco");
        getConexion = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        if (conexion != null) { 
            System.out.println("Conexion exitosa!"); 
        } else { 
            System.out.println("Conexion fallida!"); 
        } 
    } catch (Exception e) { 
        e.printStackTrace(); 
    }        return this; 
} 
 
/* private Connection getConexion()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/ejemplo",
                "root","2311046");
        return cn;
    }*/

public boolean escribir(String sql) { 
        try { 
            Statement sentencia; 
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY); 
            sentencia.executeUpdate(sql); 
            getConexion().commit(); 
            sentencia.close(); 
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            System.out.print("ERROR SQL"); 
            return false; 
        }         
        return true; 
    } 

public ResultSet consultar(String sql) { 
        ResultSet resultado = null; 
        try { 
            Statement sentencia; 
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY); 
            resultado = sentencia.executeQuery(sql); 
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            return null; 
        }        return resultado; 
    } 



}
