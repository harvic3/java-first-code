
package proyectos_vectores;

import java.sql.*;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Funciones {
    private conexion_oracle O = new conexion_oracle ();
   private Connection cn;
    private ResultSet rs;
    private Statement st=null;
    private PreparedStatement ps;
    private ResultSetMetaData rsm;
    DefaultTableModel dtm;
    DefaultTableModel temp;
  /*  private Connection getConexion()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/ejemplo",
                "root","2311046");
        return cn;
    }*/
 
    
    public void llenarTabla(JTable tabla,String Tex)throws Exception{
        O.conectar();
        st=O.getConexion;
        rs= st.executeQuery(Tex);
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);     
            }
            datos.add(filas);
        }
        dtm=(DefaultTableModel)tabla.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        } 
    }
    
    
    
    /*public void llenarTablaB(JTable tabla,String Tex)throws Exception{
    O.conectar();
        st=O.getConexion;
        rs= st.executeQuery(Tex);
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);
                
            }
            datos.add(filas);
        }
        dtm=(DefaultTableModel)tabla.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
       // ps.close();
    }*/
    
     public void limpiaTabla(JTable tabla)throws Exception{
        try{
            temp = (DefaultTableModel) tabla.getModel();
            int a =temp.getRowCount()-1;
            for(int i=0; i<a; i++)
                temp.removeRow(i);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
     
    public void LLenarBox(JComboBox CmbBD , String Tex)throws Exception{
        O.conectar();
        ps=O.getConexion().prepareStatement(Tex);
       // "select *from HUECO.FUNCION;"
        System.out.print(""+Tex);
        
       rs = ps.executeQuery();
        CmbBD.removeAllItems();
        while(rs.next()){
            CmbBD.addItem(rs.getString(2));
        }
        st.close();
    }
     
     
     public void InsertarTabla(String Tex) throws SQLException{
         O.conectar();
         st=O.getConexion().createStatement();
        st.execute(Tex);
        st.close();
    }
     
     public void BorrarTabla(String Tex) throws SQLException{
         //O.conectar();
         System.out.println(""+Tex);
         st=O.getConexion;;
         st.executeUpdate(""+Tex);
       
    }
    
}
