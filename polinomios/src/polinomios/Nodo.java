
package polinomios;


public class Nodo {
    
    private float coe;
    private int exp;
    private Nodo liga;

    public Nodo(float coe, int exp) {
        this.coe = coe;
        this.exp = exp;
        this.liga=null;
    }

    public float getCoe() {
        return coe;
    }

    public void setCoe(float coe) {
        this.coe = coe;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    } 
}
