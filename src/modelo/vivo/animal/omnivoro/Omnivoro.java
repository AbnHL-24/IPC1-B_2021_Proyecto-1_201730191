package modelo.vivo.animal.omnivoro;

import modelo.vivo.animal.Animal;
import modelo.vivo.animal.TipoAnimal;

public class Omnivoro extends Animal {
    public Omnivoro(TipoAnimal tipoAnimal, int edad, long comidaConsumida, int factorGenetico, int espacioRequerido, int puntosDeVida) {
        super(tipoAnimal, edad, comidaConsumida, factorGenetico, espacioRequerido, puntosDeVida);
    }

    /*
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo
     */
    @Override
    public void destazar() {

    }

    /*
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo
     */
    @Override
    public void recogerProductos() {

    }

    /*
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    @Override
    public void morir() {

    }
}
