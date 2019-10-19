/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqtLogica;

/**
 *
 * @author ASUS
 */
public class clsOperCelular {
    clsCelular Cel [] = new clsCelular[5];
    int Cont = 0;
    
    public void Ingresar(int Codigo, String Marca, String Modelo, String Numero, int Saldo){
        clsCelular Cel = new clsCelular();
        Cel.setIntCodigo(Codigo);
        Cel.setStrMarca(Marca);
        Cel.setStrModelo(Modelo);
        Cel.setIntNumero(Numero);
        
    }
    
}
