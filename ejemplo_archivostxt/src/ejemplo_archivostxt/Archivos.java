/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_archivostxt;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author victhi
 */
public class Archivos {
    private File Archivo;
    private FileReader Fr;
    private BufferedReader Br;
    private FileWriter Fichero;
    private PrintWriter Pw;
    
    
    public Archivos(){
        Archivo = null;
        Fr = null;
        Br = null;
        Fichero = null;
        Pw = null;
    }
       
    public void LeerArchivo(String Name){
        
        try{
            System.out.println();
            System.out.println("En el Archivo tenemos: ");
            Archivo = new File(Name);
            Fr = new FileReader (Archivo);
            Br = new BufferedReader(Fr);
            String Linea;
            while((Linea = Br.readLine())!= null){
               System.out.println(Linea);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{                   
                if( null != Fr ){   
                    Fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }      
    }
    
    public void EscribirArchivo(String Name, String Cadena){
                
        try
        {
            Fichero = new FileWriter(Name, true);
            Pw = new PrintWriter(Fichero);

            Pw.println(Cadena);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != Fichero)
              Fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
         
    }
    
}
