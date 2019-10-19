/*
 * Una Clase abstracta:
    *No se puede instanciar
    *Los metodos dentro de la clase no están desarrollados
    *Debe contener por lo menos un metodo abstracto

    No se debe implementar constructor porque no se puede instanciar.
 */

package appastracta;

/**
 *
 * @author sala304
 */
public abstract class Figura {
    private int X;
    private int Y;
           
    public abstract void MostrarArea();
    
    public abstract void MostrarNombre();   
    
}
