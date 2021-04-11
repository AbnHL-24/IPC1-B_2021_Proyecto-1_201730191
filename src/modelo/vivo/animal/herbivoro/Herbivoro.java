package modelo.vivo.animal.herbivoro;

import modelo.vivo.animal.Animal;
import modelo.vivo.animal.TipoAnimal;

/*
 * Clase Herbivoro utilizada para generar animales herbivoros;
 */
public class Herbivoro extends Animal {

    /*
     * @param edad es la edad del animal, utilizada para el metodo morir.
     * @param comidaConsumida es la cantidad que el animal ha comida en lo que tiene de vida.
     * @param factorGenetico es un numero utilizado para calcular la cantidad de comida generada por el animal.
     * @param espacioRequerido es la cantidad de cuadros que ocupa el animal.
     * @param puntosDeVida es la cantidad de puntos que vida que tiene el animal.
     * @author abnerhl
     */
    public Herbivoro(TipoAnimal tipoAnimal, int edad, long comidaConsumida, int factorGenetico, int espacioRequerido, int puntosDeVida) {
        super(tipoAnimal, edad, comidaConsumida, factorGenetico, espacioRequerido, puntosDeVida);
    }

    /*
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    @Override
    public void morir() {
        //anyadir logica de morir
    }

    /*
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo
     */
    @Override
    public void destazar() {
        //implementar el metodo
    }

    /*
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo
     */
    @Override
    public void recogerProductos() {

    }
}
