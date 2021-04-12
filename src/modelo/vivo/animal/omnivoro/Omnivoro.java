package modelo.vivo.animal.omnivoro;

import modelo.vivo.animal.Animal;
import modelo.vivo.animal.TipoAnimal;

/**
 * Clase Omnivoro para animales que comen de todo.
 * @author abnerhl
 */
public class Omnivoro extends Animal {

    /**
     * Constructod de Homnivoro
     * @param tipoAnimal enum que especifica el tipo de animal.
     * @param nombreAnimal String con el nombre del animal.
     */
    public Omnivoro(TipoAnimal tipoAnimal, String nombreAnimal) {
        super(tipoAnimal, nombreAnimal);
    }

    /**
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo
     */
    @Override
    public void destazar() {

    }

    /**
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo
     */
    @Override
    public void recoger() {

    }

    /**
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    @Override
    public void morir() {

    }
}
