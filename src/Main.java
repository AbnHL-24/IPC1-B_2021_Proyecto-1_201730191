import controlador.inicio.InicioControlador;
import vista.inicio.BienvenidaVista;

/**
 * CLase Main, usada pere iniciar el programa. Contiene el psvm.
 * @author abnerhl
 */
public class Main {
    public static void main(String[] args) {
        BienvenidaVista bienvenida = new BienvenidaVista();
        InicioControlador inicio = new InicioControlador(bienvenida);
        inicio.iniciar();
    }    
}