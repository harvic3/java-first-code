/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqtDatos;
import java.io.*;

/**
 *
 * @author Víctor A Higuita C.
 */
public class CWriteTXT {
    
    /**
     * Función para Escribir en un archivo plano.
     * @param RutaArchivo Cadena que contiene la ruta del archivo.
     * @param Cadena Cadena para escribir en el archivo.
     * @throws IOException 
     */
    public void WriteFile(String RutaArchivo, String Cadena) throws IOException {
        File objFile;
        BufferedWriter ojbBufWriter;
//        FileWriter objFileWriter;
//        PrintWriter objPrintWrither;
//        FileWriter objFichero;

        objFile = new File(RutaArchivo);
        if (objFile.exists()){
            ojbBufWriter = new BufferedWriter(new FileWriter(objFile));
            ojbBufWriter.write(Cadena);
            ojbBufWriter.write("\n");
            ojbBufWriter.close();
//            objFileWriter = new FileWriter(objFile);
//            objPrintWrither = new PrintWriter(objFileWriter);
//            objFichero = new FileWriter(RutaArchivo, true);
//            objPrintWrither.println(Cadena);
//            objPrintWrither.flush();
        }       
        
    }//Write File
    
    /**
     * Función que crea un archivo plano.
     * @param RutaArchivo Ruta del Archivo plano para ser creado.
     * @throws java.io.IOException
     */
    public void CreateFile(String RutaArchivo) throws IOException{
        
        FileWriter objFileWriter = null;
        try {
            objFileWriter = new FileWriter(RutaArchivo);
            BufferedWriter objBufferedWriter = new BufferedWriter(objFileWriter);
            PrintWriter objArchivo = new PrintWriter(objBufferedWriter);
            objArchivo.println();
            objArchivo.close();
        } catch (IOException ex) {
            
        }//try
    }//CreateFile
    
}
