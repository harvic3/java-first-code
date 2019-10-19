package calculadorabasica;


public class CalculadoraBasica {

    
    public static void main(String[] args) {
        //Creamos un objeto de la clase frmCalculadora
        frmCalculadora micalculadora = new frmCalculadora();
        //indicamos que al abrirse, se ubicará en la mitad de la pantalla al pasarle
        //el parámetro null
        micalculadora.setLocationRelativeTo(null);
        //indicamos que se haga visible
        micalculadora.setVisible(true);
    }
}
