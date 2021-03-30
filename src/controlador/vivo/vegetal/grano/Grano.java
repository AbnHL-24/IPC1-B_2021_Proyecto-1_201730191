package controlador.vivo.vegetal.grano;

import controlador.vivo.vegetal.Planta;

/*
 * Clase Grano hecha para crear plantas que produzcan granos
 * @author abnerhl
 */
public class Grano extends Planta{
    /*
     *Constructor de Planta
     * @param precioPorSemilla es el precio necesario para la compra de una semilla en el mercado.
     * @param cantidadDeSemillasParaPlanta es la cantidad de semillas necesarias para una plantacion.
     * @param alimentosGenerados es la cantidad de alimento que proporcionara en cada cosecha.
     * @param puntosDeVidaGenerados es la cantidad de puntos de vida que agregara al jugador al consumir
     *        una unidad de estos alimentos.
     */
    public Grano(int precio, int cantidadDeSemillasParaPlantar, int alimentosGenerados, int puntosDeVidaGenerados) {
        super(precio, cantidadDeSemillasParaPlantar, alimentosGenerados, puntosDeVidaGenerados);
    }

    /*
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    @Override
    public void morir() {
        System.out.println("De momento es innmortal");
    }

    /*
     * Metodo cosechar() se utiliza para recoger alimentos de la planta
     */
    @Override
    public void cosechaar() {
        //hacer metodo cosechar
    }
}
