/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package photoflash;

/**
 *
 * @author sala207
 */
public class ListasEvento {
    
    static void IncluirPrecio (String MatS[][], int MatN[][], double MatC[][]) {
        short k;
        
        System.out.println("Los Eventos por Valor son: ");
        for (k=0;k<31;k++) {
            if (MatN[k][0] == 1) {
                System.out.println("Evento: " + MatS[k][0] + ", el día " + k+1 + " a las " + MatN[k][2] 
                        + ":" + MatN[k][3] + ", Por un valor de " + MatC[k][1]);
            }
        }    
    }
    
    static void ListarPorTipo (String MatS[][], int MatN[][], double MatC[][]) {
        short k;
        
        System.out.println("Los Eventos por Colegio son: ");
        for (k=0;k<31;k++) {
            if ((MatN[k][0] == 1)&&(MatS[k][1].equals("Colegio"))) {
                System.out.println("Evento: " + MatS[k][0] + ", el día " + k+1 + " a las " + MatN[k][2] 
                        + ":" + MatN[k][3]);
            }
        }
        System.out.println("Los Eventos por Universidad son: ");
        for (k=0;k<31;k++) {
            if ((MatN[k][0] == 1)&&(MatS[k][1].equals("Universidad"))) {
                System.out.println("Evento: " + MatS[k][0] + ", el día " + k+1 + " a las " + MatN[k][2] 
                        + ":" + MatN[k][3]);
            }
        }        
    }
    
    static void ListarPorDia (String MatS[][], int MatN[][], double MatC[][]) {
        short k;
        
        for (k=0;k<31;k++) {
            System.out.println("El día " + k+1 + " el Evento: " + MatS[k][0] + " a las " + MatN[k][2] 
                    + ":" + MatN[k][3]);
        }        
    }
        
}//Fin Clase Listar.
