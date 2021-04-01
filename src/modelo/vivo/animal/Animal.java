package modelo.vivo.animal;

import modelo.vivo.SerVivo;

public abstract class Animal implements SerVivo {
    int edad;
    long comidaConsumida;
    int factorGenetico;
    int espacioRequerido;
    int puntosDeVida;

    /*
     * @param edad es la edad del animal, utilizada para el metodo morir.
     * @param comidaConsumida es la cantidad que el animal ha comida en lo que tiene de vida.
     * @param factorGenetico es un numero utilizado para calcular la cantidad de comida generada por el animal.
     * @param espacioRequerido es la cantidad de cuadros que ocupa el animal.
     * @param puntosDeVida es la cantidad de puntos que vida que tiene el animal.
     * @author abnerhl
     */
    public Animal (int edad, long comidaConsumida, int factorGenetico, int espacioRequerido, int puntosDeVida) {
        this.edad = edad;
        this.comidaConsumida = comidaConsumida;
        this.factorGenetico = factorGenetico;
        this.espacioRequerido = espacioRequerido;
        this.puntosDeVida = puntosDeVida;
    }

    /*
     * Metodo destazar() sirve para matar al animal y producir comida y/o alimentos.
     */
    public abstract void destazar();

    /*
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo
     */
    public abstract void recogerProductos();

    /*
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    public abstract void morir();
}
