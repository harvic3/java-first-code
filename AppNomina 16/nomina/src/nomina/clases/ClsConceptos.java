/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina.Clases;

/**
 *
 * @author Wilson
 */
public class ClsConceptos {
    private String Concepto ;
    private String DescripcionConcepto;
    private String tipoConcepto;

    public ClsConceptos(String Concepto, String DescripcionConcepto, String tipoConcepto) {
        this.Concepto = Concepto;
        this.DescripcionConcepto = DescripcionConcepto;
        this.tipoConcepto = tipoConcepto;
    }

    public ClsConceptos() {
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public String getDescripcionConcepto() {
        return DescripcionConcepto;
    }

    public void setDescripcionConcepto(String DescripcionConcepto) {
        this.DescripcionConcepto = DescripcionConcepto;
    }

    public String getTipoConcepto() {
        return tipoConcepto;
    }

    public void setTipoConcepto(String tipoConcepto) {
        this.tipoConcepto = tipoConcepto;
    }

    

    
    
}
