package modelo.vivo.vegetal.fruta;

import modelo.vivo.vegetal.Planta;

/**
 * Clase Fruta
 *
 * Usada para generar frutas
 *
 * @author abnerhl
 */
public class Fruta extends Planta {

    /**
     *Constructor de Planta
     * @param nombre nombre de la planta
     * @param precio es el precio necesario para la compra de una semilla en el mercado.
     * @param cantidadDeSemillasParaPlantar es la cantidad de semillas necesarias para una plantacion.
     * @param alimentosGenerados es la cantidad de alimento que proporcionara en cada cosecha.
     * @param puntosDeVidaGenerados es la cantidad de puntos de vida que agregara al jugador al consumir
     *        una unidad de estos alimentos.
     */
    public Fruta(String nombre, int precio, int cantidadDeSemillasParaPlantar, int alimentosGenerados, int puntosDeVidaGenerados) {
        super(nombre, precio, cantidadDeSemillasParaPlantar, alimentosGenerados, puntosDeVidaGenerados);
    }

    /**
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    @Override
    public void morir() {
        System.out.println("De momento es inmortal");
    }

    /**
     * Metodo cosechar() se utiliza para recoger alimentos de la planta
     */
    @Override
    public void cosechar() {
        //implementar metodo Cossechar
    }
}
