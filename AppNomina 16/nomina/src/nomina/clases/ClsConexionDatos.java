
package nomina.Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nomina.Formularios.FrmPrincipal;

public class ClsConexionDatos {

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
            strSql = "jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=D:\\BDNomina.mdb;";
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
            Logger.getLogger(ClsConexionDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   //metodos para consulta de usuarios
    
    
    public int selectUsuario(String nombre,String pasword) {
        Connection conect = conexion();
        try {
            st = conect.createStatement();

            strSql = "select * from TblUsuarios Where Usuario = '" + nombre + "'" ;
            rs = st.executeQuery(strSql);
            while(rs.next())
            {
                if(nombre.equals( rs.getObject(2))&& pasword.equals( rs.getObject(4))){
                    if(rs.getObject(5).equals("Administrador")){
                        return 2;
                    
                    }
                    return 1;    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error  "+e );  
        }   
        return 0;
    }
    
    public void buscarUsua(String nomusua, String pasw ){
        conexion();
        if(selectUsuario(nomusua, pasw)==1){
            FrmPrincipal frm = new FrmPrincipal(1);           
        }
        else if(selectUsuario(nomusua, pasw)==2){
            FrmPrincipal frm = new FrmPrincipal(2);
        }
        //else JOptionPane.showMessageDialog(null, "Usted no se encuentra registrado  " ); 
              
        
    }
    
    //Metodos empleados
    //
    
    
    
    
    public static int Insert(String Cedula,
            String PrimerApellido,
            String SegundoApellido,
            String PrimerNombre, 
            String SegundoNombre,
            String Direccion,
            String CorreoElectronico,
            String Telefono,
            String Celular,
            double salario, 
            String FechaIngreso,
            String FechaSalida,
            String TipoSalario,
            String FechaNacimiento,
            String EstadoCivil, 
            String Cargo,
            String Estado,
            int diasTrabajados,
            String CuentaBancaria,
            double Auxtransporte 
            ) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";
        int numFilas = 0;
        Connection conect = conexion();

        try {
            strSql = "INSERT INTO TblEmpleados VALUES ('" + Cedula + "', '" + PrimerApellido + "', '" + SegundoApellido + "', '" + PrimerNombre + "', '" + SegundoNombre + "', '" + Direccion + "', '" + CorreoElectronico + "', '" + Telefono + "', '" + Celular + "', " + salario + ", '" + FechaIngreso + "', '" + FechaSalida + "', '" + TipoSalario + "', '" + FechaNacimiento + "', '" + EstadoCivil + "', '" + Cargo + "', '" + Estado + "', " + diasTrabajados + ", '" + CuentaBancaria + "', " + Auxtransporte + ")";
            st = conect.createStatement();
            numFilas = st.executeUpdate(strSql);
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return numFilas;
    }

    public static int Update(String Cedula,
            String PrimerApellido,
            String SegundoApellido,
            String PrimerNombre, 
            String SegundoNombre,
            String Direccion,
            String CorreoElectronico,
            String Telefono,
            String Celular,
            double Salario, 
            String FechaIngreso,
            String FechaSalida,
            String TipoSalario,
            String FechaNacimiento,
            String EstadoCivil, 
            String Cargo,
            String Estado,
            int DiasTrabajados,
            String CuentaBancaria,
            double AuxTransporte 
            ) {
        
            Statement st;
            ResultSet rs = null;
            String strSql = "";
            int numFilas = 0;
            Connection conect = conexion();

        try{
                        st = conect.createStatement();
            strSql = "UPDATE TblEmpleados SET Cedula= '" +Cedula+ "',PrimerApellido= '" +PrimerApellido+ "',SegundoApellido= '" +SegundoApellido+ "',PrimerNombre= '" +PrimerNombre+ "',SegundoNombre= '" +SegundoNombre+ "',Direccion= '" +Direccion+ "',CorreoElectronico= '" +CorreoElectronico+ "',Telefono= '" +Telefono+ "',Celular= '" +Celular+ "',Salario= " +Salario+ ",FechaIngreso= '" +FechaIngreso+ "',FechaSalida= '" +FechaSalida+ "',TipoSalario= '" +TipoSalario+ "',FechaNacimiento= '" +FechaNacimiento+ "',EstadoCivil= '" +EstadoCivil+ "',Cargo= '" +Cargo+ "',Estado= '" +Estado+ "',DiasTrabajados= " +DiasTrabajados+ ",CuentaBancaria= '" +CuentaBancaria+ "',AuxTransporte="+AuxTransporte+" WHERE Cedula = '" + Cedula + "'";        
            //strSql = "UPDATE Personas SET Apellidos = '" + Cedula + ", Edad = " + PrimerApellido +                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " WHERE nombre = '" + Cedula + "'";
//                    
            st = conect.createStatement();
            numFilas = st.executeUpdate(strSql);
            //JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Registros Modificados !!!");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return numFilas;
        //return 0;
    }
    
//     void Update(String nombre, String apellidos, int edad) {
//        try{
//            st = conect.createStatement();
//
    
//    strSql = "UPDATE Personas SET Apellidos = '" + apellidos + ", Edad = " + edad + " WHERE nombre = '" + nombre + "'";
//            numFilas = st.executeUpdate(strSql);
//            JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Registros Modificados !!!");
//            
//        }
//        catch (Exception e){
//            JOptionPane.showMessageDialog(null, "Error: " + e);
//        }
//    }

   public void DeleteEmpleados(String Cedula) {
       Connection conect = conexion();
        try{
            st = conect.createStatement();
            strSql = "DELETE FROM TblEmpleados WHERE Cedula = '" + Cedula + "'";
            numFilas = st.executeUpdate(strSql);
            JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Empleado Eliminado !!!");        
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

            strSql = "select * from TblEmpleados";
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

            strSql = "select * from TblEmpleados Where Cedula = '" + cedula + "'" ;
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
    
    
   public static ClsEmpleados[] SelectAll(int Fila) {
        java.util.List<ClsEmpleados> ListaEmpleados = new ArrayList <>();
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();        
        try {
            st = conect.createStatement();
            strSql = "select * from TblEmpleados";
            rs = st.executeQuery(strSql);           
            while (rs.next()) {               
               // System.out.println(Fila + " y " + rs.getRow());                
                if (Fila == rs.getRow()) {                                 
                    ClsEmpleados tempEmpleado = new ClsEmpleados();
                    tempEmpleado.setCedula(rs.getString("Cedula"));
                    tempEmpleado.setPrimerApellido(rs.getString("PrimerApellido"));
                    tempEmpleado.setSegundoApellido(rs.getString("SegundoApellido"));
                    tempEmpleado.setPrimerNombre(rs.getString("PrimerNombre"));
                    tempEmpleado.setSegundoNombre(rs.getString("SegundoNombre"));
                    tempEmpleado.setDireccion(rs.getString("Direccion")); 
                    tempEmpleado.setCorreoElectronico(rs.getString("CorreoElectronico")); 
                    tempEmpleado.setTelefono(rs.getString("Telefono")); 
                    tempEmpleado.setCelular(rs.getString("Celular")); 
                    tempEmpleado.setSalarioDia(rs.getDouble("Salario")); 
                    tempEmpleado.setFechaIngreso(rs.getString("FechaIngreso")); 
                    tempEmpleado.setFechaSalida(rs.getString("FechaSalida")); 
                    tempEmpleado.setTipoSalario(rs.getString("TipoSalario")); 
                    tempEmpleado.setFechaNac(rs.getString("FechaNacimiento")); 
                    tempEmpleado.setEstCivil(rs.getString("EstadoCivil")); 
                    tempEmpleado.setCargo(rs.getString("Cargo")); 
                    tempEmpleado.setEstado(rs.getString("Estado")); 
                    tempEmpleado.setDiasTrabajados(rs.getInt("DiasTrabajados")); 
                    tempEmpleado.setCuentaBanc(rs.getString("CuentaBancaria"));
                    tempEmpleado.setAuxTransporte(rs.getDouble("AuxTransporte")); 
                    ListaEmpleados.add(tempEmpleado);

                    break;
                }
            }            

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return ListaEmpleados.toArray(new ClsEmpleados[ListaEmpleados.size()]);
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
     
   
   public static ClsEmpleados[] buscar(String Cedula) {
        java.util.List<ClsEmpleados> ListaEmpleados = new ArrayList <>();
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();        
        try {
            st = conect.createStatement();
            strSql = "select * from TblEmpleados where Cedula = '"+Cedula+"'";
            rs = st.executeQuery(strSql);           
            while (rs.next()) {               
               
                    ClsEmpleados tempEmpleado = new ClsEmpleados();
                    tempEmpleado.setCedula(rs.getString("Cedula"));
                    tempEmpleado.setPrimerApellido(rs.getString("PrimerApellido"));
                    tempEmpleado.setSegundoApellido(rs.getString("SegundoApellido"));
                    tempEmpleado.setPrimerNombre(rs.getString("PrimerNombre"));
                    tempEmpleado.setSegundoNombre(rs.getString("SegundoNombre"));
                    tempEmpleado.setDireccion(rs.getString("Direccion")); 
                    tempEmpleado.setCorreoElectronico(rs.getString("CorreoElectronico")); 
                    tempEmpleado.setTelefono(rs.getString("Telefono")); 
                    tempEmpleado.setCelular(rs.getString("Celular")); 
                    tempEmpleado.setSalarioDia(rs.getDouble("Salario")); 
                    tempEmpleado.setFechaIngreso(rs.getString("FechaIngreso")); 
                    tempEmpleado.setFechaSalida(rs.getString("FechaSalida")); 
                    tempEmpleado.setTipoSalario(rs.getString("TipoSalario")); 
                    tempEmpleado.setFechaNac(rs.getString("FechaNacimiento")); 
                    tempEmpleado.setEstCivil(rs.getString("EstadoCivil")); 
                    tempEmpleado.setCargo(rs.getString("Cargo")); 
                    tempEmpleado.setEstado(rs.getString("Estado")); 
                    tempEmpleado.setDiasTrabajados(rs.getInt("DiasTrabajados")); 
                    tempEmpleado.setCuentaBanc(rs.getString("CuentaBancaria"));
                    tempEmpleado.setAuxTransporte(rs.getDouble("AuxTransporte")); 
                    ListaEmpleados.add(tempEmpleado);
                    break;                
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return ListaEmpleados.toArray(new ClsEmpleados[ListaEmpleados.size()]);
    }
   
   
   
   
    //Metodos CONCEPTOS
    
   
   
    public static int InsertConceptos(String Codigo,
            String DesCripcion,
            String TipoConcepto
             
            ) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";
        int numFilas = 0;
        Connection conect = conexion();

        try {
            strSql = "INSERT INTO TblConceptos VALUES ('" + Codigo + "', '" + DesCripcion + "', '" + TipoConcepto + "')";
            st = conect.createStatement();
            numFilas = st.executeUpdate(strSql);
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return numFilas;
    }

    void UpdateConceptos(String nombre, String apellidos, int edad) {
        try{
            st = conect.createStatement();
            strSql = "UPDATE TblConceptos SET Apellidos = '" + apellidos + ", Edad = " + edad + " WHERE nombre = '" + nombre + "'";
            numFilas = st.executeUpdate(strSql);
            JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Registros Modificados !!!");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

   public void DeleteConceptos(String conceptos) {
       Connection conect = conexion();
        try{
            st = conect.createStatement();
            strSql = "DELETE FROM Tblconceptos WHERE IdConcepto = '" + conceptos + "'";
            numFilas = st.executeUpdate(strSql);
            JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Concepto  Eliminado !!!");        
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
                        
    public static ResultSet selectConceptos(Connection conect) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";

        try {

            st = conect.createStatement();

            strSql = "select * from TblConceptos";
            rs = st.executeQuery(strSql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return rs;
    }
    
    public int selectConceptos(String codigo) {
        Connection conect = conexion();
        try {
            st = conect.createStatement();

            strSql = "select * from TblConceptos Where IdConcepto = '" + codigo + "'" ;
            rs = st.executeQuery(strSql);
            while(rs.next())
            {
                if(codigo.equals( rs.getObject(1))){                                                        
                    return 1;    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error  "+e );  
        }   
        return 0;
    }
    
    public void buscarConceptos(String codigo ){
        conexion();
        if(selectConceptos(codigo)==1){
                       
        }        
    }
    
    
   public static ClsConceptos[] SelectAllConceptos(int Fila) {
        java.util.List<ClsConceptos> ListaConceptos = new ArrayList <>();
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();        
        try {
            st = conect.createStatement();
            strSql = "select * from TblConceptos";
            rs = st.executeQuery(strSql);           
            while (rs.next()) {               
               // System.out.println(Fila + " y " + rs.getRow());                
                if (Fila == rs.getRow()) {                                 
                    ClsConceptos TempConceptos = new ClsConceptos();
                    TempConceptos.setConcepto(rs.getString("IdConcepto"));
                    TempConceptos.setDescripcionConcepto(rs.getString("NombreConcepto"));
                    TempConceptos.setTipoConcepto(rs.getString("TipoConcepto"));
                    
                    ListaConceptos.add(TempConceptos);

                    break;
                }
            }            

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return ListaConceptos.toArray(new ClsConceptos[ListaConceptos.size()]);
    } 
   
   public static int NumeroFilasConceptos() {
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();
        int Tamano = 0;
        try {
            st = conect.createStatement();
            strSql = "select * from TblConceptos";
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
     
   
   public static ClsConceptos[] buscaConceptos(String Codigo) {
        java.util.List<ClsEmpleados> ListaEmpleados = new ArrayList <>();
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();        
        try {
            st = conect.createStatement();
            strSql = "select * from TblConceptos where IdConcepto = '"+Codigo+"'";
            rs = st.executeQuery(strSql);           
            while (rs.next()) {               
               
                    ClsEmpleados tempEmpleado = new ClsEmpleados();
                    tempEmpleado.setCedula(rs.getString("IdConcepto"));
                    tempEmpleado.setPrimerApellido(rs.getString("NombreConcepto"));
                    tempEmpleado.setSegundoApellido(rs.getString("TipoConcepto"));
                    
                    ListaEmpleados.add(tempEmpleado);
                    break;                
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return ListaEmpleados.toArray(new ClsConceptos[ListaEmpleados.size()]);
    }
   
   
   
   //Metodos CARGOS************************************************************************
   
    
   
   
    public static int InsertCargos(String Codigo,
            String DesCripcion) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";
        int numFilas = 0;
        Connection conect = conexion();

        try {
            strSql = "INSERT INTO TblCargos VALUES ('" + Codigo + "', '" + DesCripcion + "')";
            st = conect.createStatement();
            numFilas = st.executeUpdate(strSql);
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return numFilas;
    }

    void UpdateCargos(String IdCargo, String NombreCargo) {
        try{
            st = conect.createStatement();
            strSql = "UPDATE TblCargos SET IdCargo = '" + IdCargo + ", NombreCargo = " + NombreCargo + " WHERE IdCargo = '" + IdCargo + "'";
            numFilas = st.executeUpdate(strSql);
            JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Cargos Modificados !!!");
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

   public void DeleteCargos(String IdCargo) {
       Connection conect = conexion();
        try{
            st = conect.createStatement();
            strSql = "DELETE FROM TblCargos WHERE IdCargo = '" + IdCargo + "'";
            numFilas = st.executeUpdate(strSql);
            JOptionPane.showMessageDialog(null, String.valueOf(numFilas) + " Cargo  Eliminado !!!");        
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
                        
    public static ResultSet selectCargos(Connection conect) {

        Statement st;
        ResultSet rs = null;
        String strSql = "";

        try {

            st = conect.createStatement();

            strSql = "select * from TblCargos";
            rs = st.executeQuery(strSql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return rs;
    }
    
    public int selectCargos(String codigo) {
        Connection conect = conexion();
        try {
            st = conect.createStatement();

            strSql = "select * from TblCargos Where IdCargo = '" + codigo + "'" ;
            rs = st.executeQuery(strSql);
            while(rs.next())
            {
                if(codigo.equals( rs.getObject(1))){                                                        
                    return 1;    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error  "+e );  
        }   
        return 0;
    }
    
    public void buscarCargos(String codigo ){
        conexion();
        if(selectCargos(codigo)==1){
                       
        }        
    }
    
    
   public static ClsCargos[] SelectAllCargos(int Fila) {
        java.util.List<ClsCargos> ListaCargos = new ArrayList <>();
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();        
        try {
            st = conect.createStatement();
            strSql = "select * from TblCargos";
            rs = st.executeQuery(strSql);           
            while (rs.next()) {               
               // System.out.println(Fila + " y " + rs.getRow());                
                if (Fila == rs.getRow()) {                                 
                    ClsCargos TempCargos = new ClsCargos();
                    TempCargos.setCargo(rs.getString("IdCargo"));
                    TempCargos.setNombreCargo(rs.getString("NombreCargo"));                                       
                    ListaCargos.add(TempCargos);
                    break;
                }
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return ListaCargos.toArray(new ClsCargos[ListaCargos.size()]);
    } 
   
   public static int NumeroFilasCargos() {
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();
        int Tamano = 0;
        try {
            st = conect.createStatement();
            strSql = "select * from TblCargos";
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
     
   
   public static ClsCargos[] buscaCargos(String Codigo) {
        java.util.List<ClsCargos> ListaCargos = new ArrayList <>();
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();        
        try {
            st = conect.createStatement();
            strSql = "select * from TblCargos where IdCargo = '"+Codigo+"'";
            rs = st.executeQuery(strSql);           
            while (rs.next()) {               
               
                    ClsCargos Tempcargos = new ClsCargos();
                    Tempcargos.setCargo(rs.getString("IdCargo"));
                    Tempcargos.setNombreCargo(rs.getString("NombreCargo"));                    
                    
                    ListaCargos.add(Tempcargos);
                    break;                
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return ListaCargos.toArray(new ClsCargos[ListaCargos.size()]);
    }
   
   public static ArrayList LlenarCBoxCargos() {
        
        ArrayList List = new ArrayList();
        /*JComboBox CBoxCargos = new JComboBox();
        CBoxCargos.setEnabled(true);
        CBoxCargos.removeAllItems();*/
        Statement st;
        ResultSet rs;
        String strSql, Temp = "";
        Connection conect = conexion();
        try {
            st = conect.createStatement();
            strSql = "select * from TblCargos where NombreCargo";
            rs = st.executeQuery(strSql);
            while (rs.next()) {
                
                Temp = rs.getString("NombreCargo");
                List.add(Temp);
                //CBoxCargos.addItem(Temp);                
                //System.out.println(Temp);
            }
            /*for (int i=0;i<6;i++){
                System.out.println(CBoxCargos.getItemAt(i));
            }*/
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }        
        //return CBoxCargos;
        return List;
    }
   
   
   public static ArrayList LlenarCBoxCedulas() {
        
        ArrayList List = new ArrayList();
        /*JComboBox CBoxCargos = new JComboBox();
        CBoxCargos.setEnabled(true);
        CBoxCargos.removeAllItems();*/
        Statement st;
        ResultSet rs;
        String strSql, Temp = "";
        Connection conect = conexion();
        try {
            st = conect.createStatement();
            strSql = "select * from TBlEmpleados ";
            rs = st.executeQuery(strSql);
            while (rs.next()) {
                
                Temp = rs.getString("Cedula");
                List.add(Temp);
                //CBoxCargos.addItem(Temp);                
                //System.out.println(Temp);
            }
            /*for (int i=0;i<6;i++){
                System.out.println(CBoxCargos.getItemAt(i));
            }*/
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }        
        //return CBoxCargos;
        return List;
    }
   
   
   
   
   
   /*
 
 metodos liquidacion 
 */

    public static int InsertLiq(String Cedula,
            int Periodo,
            double salhora,
            double AuxTransporte, 
            double SalarioBasico,
            double ValorExtrasDiurnas,
            double ValorExtrasNocturnas,
            double SalarioBruto,
            double AporteSalud,
            double AportePension, 
            double Bonificaciones,
            double Prestamos,
            double SalarioNeto            
            ) {
    
        Statement st;
        ResultSet rs = null;
        String strSql = "";
        int numFilas = 0;
        Connection conect = conexion();

        try {
            strSql = "INSERT INTO TblLiquidacion VALUES ('" + Cedula + "', " + Periodo + ", " 
                    + salhora + ", " + AuxTransporte + ", " + SalarioBasico + ", " + ValorExtrasDiurnas 
                    + ", " + ValorExtrasNocturnas + ", " + SalarioBruto + ", " + AporteSalud + ", " 
                    + AportePension + ", " + Bonificaciones + ", " + Prestamos + ", " + SalarioNeto + ")";
            st = conect.createStatement();
            numFilas = st.executeUpdate(strSql);
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return numFilas;
    }

    public static ClsLiquidacionNomina[] ImprimirNomina(int Fila, String Periodo){
        java.util.List<ClsLiquidacionNomina> ListaNomina = new ArrayList <>();
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();        
        try {
            st = conect.createStatement();
            strSql = "select * from TblLiquidacion";
            rs = st.executeQuery(strSql);           
            while (rs.next()) {               
               // System.out.println(Fila + " y " + rs.getRow());                
                if (Fila == rs.getRow() && rs.getString("Periodo").compareTo(Periodo) == 0) {                                 
                    ClsLiquidacionNomina Nomina = new ClsLiquidacionNomina();
                    Nomina.setCedula(rs.getString("Cedula"));
                    Nomina.setSalarioBasico(Double.valueOf(rs.getString("SalarioBasico")));
                    Nomina.setValorExtrasDiurnas(Double.valueOf(rs.getString("ValorExtrasDiurnas")));
                    Nomina.setValorExtrasNocturnas(Double.valueOf(rs.getString("ValorExtrasNocturnas")));
                    Nomina.setAuxTransporte(Double.valueOf(rs.getString("AuxTransporte")));
                    Nomina.setSalarioBruto(Double.valueOf(rs.getString("SalarioBruto")));
                    Nomina.setAporteSalud(Double.valueOf(rs.getString("Salud")));
                    Nomina.setAportePension(Double.valueOf(rs.getString("Pension")));
                    Nomina.setBonificaciones(Double.valueOf(rs.getString("Bonificaciones")));
                    Nomina.setPrestamos(Double.valueOf(rs.getString("Prestamos")));
                    Nomina.setSalarioNeto(Double.valueOf(rs.getString("NetoaPagar")));                    
                     
                    ListaNomina.add(Nomina);

                    break;
                }
            }            

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e);

        }
        return ListaNomina.toArray(new ClsLiquidacionNomina[ListaNomina.size()]);
    }
    
    public static int NominaFilas() {
        Statement st;
        ResultSet rs;
        String strSql;       
        Connection conect = conexion();
        int Tamano = 0;
        try {
            st = conect.createStatement();
            strSql = "select * from TblLiquidacion";
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

}

