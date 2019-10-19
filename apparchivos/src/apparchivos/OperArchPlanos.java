package apparchivos;

import java.io.*;
import javax.swing.JFileChooser;


public class OperArchPlanos {

    public static void CrearArchivo(String nom) {
        
        String nombreArchivo = "D://" + nom + ".txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(nombreArchivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salArch = new PrintWriter(bw);
            salArch.println();
            salArch.close();
        } catch (IOException ex) {
        }
    }

    public static String BuscarArchivo() {

        String ruta = null;
        JFileChooser fc = new JFileChooser();

        int respuesta = fc.showOpenDialog(null);
        if (respuesta == 0) {
            File archivoElegido = fc.getSelectedFile();
            System.out.println(archivoElegido.getAbsolutePath());
            ruta = archivoElegido.getAbsolutePath();
        }
        return ruta;
    }

    public static void LeerArchivo(String rutaarchivo) {
        File f;
        FileReader fr;
        BufferedReader br;
        String linea;
        try {
            f = new File(rutaarchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ioex) {
            System.out.println("Error en lectura de archivo");
        }
    }

    public static void EscribirArchivo(String rutaarchivo) throws IOException {
        File f;
        FileWriter fw;
        PrintWriter pw;
        FileWriter fichero;
        double a;
        f = new File(rutaarchivo);
        fw = new FileWriter(f);
        pw = new PrintWriter(fw);
        fichero = new FileWriter(rutaarchivo, true);
        pw.println("Alexandra");
        pw.println("Jose");
        pw.println("Pablo");
        pw.println("carlos");
        pw.flush();
    }
}
