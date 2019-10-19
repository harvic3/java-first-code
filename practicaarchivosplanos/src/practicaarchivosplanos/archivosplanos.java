/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarchivosplanos;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sala208
 */
public class archivosplanos {

    static String buscararchivo() {
        //Crear un objeto FileChooser
        String url = "";
        JFileChooser fc = new JFileChooser();
        //Mostrar la ventana para abrir archivo y recoger la respuesta
        //En el parámetro del showOpenDialog se indica la ventana
        //  al que estará asociado. Con el valor this se asocia a la
        //  ventana que la abre.
        int respuesta = fc.showOpenDialog(null);
        //Comprobar si se ha pulsado Aceptar
        if (respuesta == 0) {
            //Crear un objeto File con el archivo elegido
            File archivoElegido = fc.getSelectedFile();
            //Mostrar la ruta y el nombre del archvivo por consola
            System.out.println(archivoElegido.getAbsolutePath());
            url = archivoElegido.getAbsolutePath();
        }
        return (url);
    }

    static void archivoplano() {
        //Declaramos una variable String en la cual almacenaremos la ruta y el nombre de nuestro archivo plano
        String nombrearc = (JOptionPane.showInputDialog(null, "Introduzca el nombre del archivo","", JOptionPane.QUESTION_MESSAGE));

        String nombreArchivo = "D://" + nombrearc + ".txt"; // Aqui se le asigna el nombre y 
        FileWriter fw = null; // la extension al archivo 
        try {
            fw = new FileWriter(nombreArchivo);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salArch = new PrintWriter(bw);

            //Escribo algo en el archivo
            String info = (JOptionPane.showInputDialog(null, "Ingrese datos a el archivo","", JOptionPane.QUESTION_MESSAGE));
            salArch.print("---Inicio del archivo------");
            salArch.println();
             salArch.print(""+info);
            salArch.println();
            salArch.print("------Fin del archivo------");
            salArch.println();
            salArch.close();
        } catch (IOException ex) {
        }
    }

    static void leerarchivoplano(String ruta) {

        File f;
        FileReader fr;
        BufferedReader br;
        String linea;


        try {
            f = new File("" + ruta);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ioex) {
            System.out.println("Error en lectura de archivo");
        }
    }

    static void Creararchivoplano() {
        File f;
        FileWriter fw;
        PrintWriter pw;
        f = new File("D://nombreArchivo.txt");
        try {
            fw = new FileWriter(f);
            pw = new PrintWriter(fw);
            //fichero = new FileWriter("D:/prueba.txt", true);
            pw.println("-- \n\nPolitécnico Jaime Isaza Cadavid --");
            pw.println("-- Registro de libros --");
            pw.println("1. Matemáticas");
            pw.println("2. Ciencias");
            pw.println("3. Ingenierías");
            pw.flush();
        } catch (IOException ioex) {
            System.out.println("Error en lectura de archivo");
        }

    }
}
