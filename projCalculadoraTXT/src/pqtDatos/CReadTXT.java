/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqtDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;


/**
 *
 * @author Víctor A Higuita C.
 */
public class CReadTXT {
    
    /**
     * Función para cargar la Ruta de un Archivo.
     * @return Campo que contiene la Ruta del Archivo.
     * @throws java.io.IOException
     */
    public String LoadFile() throws IOException{
        JFileChooser fc = new JFileChooser();
        String strPatchFile = null;
        File objFile;
        
        int intExist = fc.showOpenDialog(null);
        if (intExist == 0) {
            objFile = fc.getSelectedFile();
            System.out.println(objFile.getAbsolutePath());
            strPatchFile = objFile.getAbsolutePath();
        }
        return strPatchFile;        
    }//LoadFile
    
    /**
     * Función que lee un archivo de texto y evalúa si una cadena especifica está en él.
     * @param strPatchFile Ruta del archivo a procesar.
     * @param Cadena Indica la operación a Realizar Ejem:("Num1 Suma Num2", "Num1 Resta Num2").
     * @return Booleano que indica si se debe hacer o no la operación.
     * @throws java.io.IOException
     */
    public boolean ReadFile(String strPatchFile, String Cadena) throws IOException{
        boolean bolOperate = true;
        File objFile;
        FileReader objFileReader;
        BufferedReader objBufferReader;
        String strLine;
        
        if (strPatchFile != null){
            try {
            objFile = new File(strPatchFile);
            objFileReader = new FileReader(objFile);
            objBufferReader = new BufferedReader(objFileReader);
            while ((strLine = objBufferReader.readLine()) != null) {
                //System.out.println(strLine);
                if (strLine.equals(Cadena)){
                    bolOperate = false;
                }
            }
            } catch (IOException ioex) {
                System.out.println("Error al intentar leer el archivo.");
            }
        }
                
        return bolOperate;
    }//ReadFile
    
}
