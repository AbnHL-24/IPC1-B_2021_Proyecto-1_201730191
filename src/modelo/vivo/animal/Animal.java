package modelo.vivo.animal;

import modelo.vivo.SerVivo;

import java.util.Random;

/**
 *  Clase abstracta Animal que encapsula las caracteristicas mas basicas de los animales.
 * @author abnerhl
 */
public abstract class Animal implements SerVivo {
    TipoAnimal tipoAnimal;
    String nombreAnimal;
    int cantidad;
    String[] productosParaRecoger;
    int[] cantProductosParaRecoger;
    String[] productosParaDestazar;
    int[] cantProductosParaDestazar;
    /**
     * edad es la edad del animal, utilizada para el metodo morir.
     */
    int edad;

    /**
     * comidaConsumida es la cantidad que el animal ha comida en lo que tiene de vida.
     */
    long comidaConsumida;

    /**
     * factorGenetico es un numero utilizado para calcular la cantidad de comida generada por el animal.
     */
    int factorGenetico;

    /**
     * espacioRequerido es la cantidad de cuadros que ocupa el animal.
     */
    int espacioRequerido;

    /***
     * puntosDeVida es la cantidad de puntos que vida que tiene el animal.
     */
    int puntosDeVida;

    Random rd = new Random();

    /**
     * @param tipoAnimal enum que especifica el tipo de animal.
     * @param nombreAnimal String con el nombre del animal.
     * @author abnerhl
     */
    public Animal (TipoAnimal tipoAnimal, String nombreAnimal) {
        this.tipoAnimal = tipoAnimal;
        this.nombreAnimal = nombreAnimal;
        this.cantidad = 0;
        this.edad = 0;
        this.comidaConsumida = 0;
        this.factorGenetico = rd.nextInt(3) + 1;
        this.espacioRequerido = 1;
        this.puntosDeVida = 100;
    }

    public String[] getProductosParaRecoger() {
        return productosParaRecoger;
    }

    public void setProductosParaRecoger(String[] productosParaRecoger) {
        this.productosParaRecoger = productosParaRecoger;
    }

    public String[] getProductosParaDestazar() {
        return productosParaDestazar;
    }

    public void setProductosParaDestazar(String[] productosParaDestazar) {
        this.productosParaDestazar = productosParaDestazar;
    }

    public int[] getCantProductosParaRecoger() {
        return cantProductosParaRecoger;
    }

    public void setCantProductosParaRecoger(int[] cantProductosParaRecoger) {
        this.cantProductosParaRecoger = cantProductosParaRecoger;
    }

    public int[] getCantProductosParaDestazar() {
        return cantProductosParaDestazar;
    }

    public void setCantProductosParaDestazar(int[] cantProductosParaDestazar) {
        this.cantProductosParaDestazar = cantProductosParaDestazar;
    }

    public void crearProductosARecoger() {

    }

    /**
     * Metodo destazar() sirve para matar al animal y producir comida y/o alimentos.
     */
    public abstract void destazar();

    /**
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo.
     */
    public abstract void recoger();

    /**
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    public abstract void morir();
}
