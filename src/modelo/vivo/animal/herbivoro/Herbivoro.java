package modelo.vivo.animal.herbivoro;

import modelo.vivo.animal.Animal;
import modelo.vivo.animal.TipoAnimal;

/**
 * Clase Herbivoro utilizada para generar animales herbivoros.
 * @author abnerhl
 */
public class Herbivoro extends Animal {

    /**
     * Constructor de Herbivoro
     * @param tipoAnimal enum que especifica el tipo de animal.
     * @param nombreAnimal String con el nombre del animal.
     */
    public Herbivoro(TipoAnimal tipoAnimal, String nombreAnimal) {
        super(tipoAnimal,nombreAnimal);
    }

    /**
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    @Override
    public void morir() {
        //anyadir logica de morir
    }

    /**
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo
     */
    @Override
    public void destazar() {
        //implementar el metodo
    }

    /**
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo
     */
    @Override
    public void recoger() {

    }
}
