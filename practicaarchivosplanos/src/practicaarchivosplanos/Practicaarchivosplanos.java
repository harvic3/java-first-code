/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarchivosplanos;

/**
 *
 * @author sala208
 */
public class Practicaarchivosplanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta="";
        archivosplanos.archivoplano();
        ruta=archivosplanos.buscararchivo();
        archivosplanos.leerarchivoplano(ruta);
    }
}
