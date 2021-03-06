package modelo.vivo.animal;

import modelo.vivo.SerVivo;

import java.util.Random;

/**
 *  Clase abstracta Animal que encapsula las caracteristicas mas basicas de los animales.
 * @author abnerhl
 */
public class Animal implements SerVivo {
    TipoAnimal tipoAnimal;
    String nombreAnimal;
    int cantidad;
    String[] productosParaRecoger;
    int[] cantProductosParaRecoger;
    String[] productosParaDestazar;
    int[] cantProductosParaDestazar;
    int cantidadDeCriasCompradas;
    int cantidadDeUnidadesDestazadas;
    int hambre;

    /**
     * edad es la edad del animal, utilizada para el metodo morir.
     */
    int edad;

    /**
     * comidaConsumida es la cantidad que el animal ha comida en lo que tiene de vida.
     */
    int comidaConsumida;

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

    /**
     * Recoge productos que crea un animal al estar vivo.
     */
    public void crearProductosARecoger() {

    }

    /**
     * Metodo destazar() sirve para matar al animal y producir comida y/o alimentos.
     */
    public void destazar(){

    }

    /**
     * Metodo que se utiliza para recoger los producros que el animal crea al estar vivo.
     */
    public void recoger(){

    }

    /**
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    public void morir(){

    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
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

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getComidaConsumida() {
        return comidaConsumida;
    }

    public void setComidaConsumida(int comidaConsumida) {
        this.comidaConsumida = comidaConsumida;
    }

    public int getFactorGenetico() {
        return factorGenetico;
    }

    public void setFactorGenetico(int factorGenetico) {
        this.factorGenetico = factorGenetico;
    }

    public int getEspacioRequerido() {
        return espacioRequerido;
    }

    public void setEspacioRequerido(int espacioRequerido) {
        this.espacioRequerido = espacioRequerido;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public Random getRd() {
        return rd;
    }

    public void setRd(Random rd) {
        this.rd = rd;
    }

    public int getCantidadDeCriasCompradas() {
        return cantidadDeCriasCompradas;
    }

    public void setCantidadDeCriasCompradas(int cantidadDeCriasCompradas) {
        this.cantidadDeCriasCompradas = cantidadDeCriasCompradas;
    }

    public int getCantidadDeUnidadesDestazadas() {
        return cantidadDeUnidadesDestazadas;
    }

    public void setCantidadDeUnidadesDestazadas(int cantidadDeUnidadesDestazadas) {
        this.cantidadDeUnidadesDestazadas = cantidadDeUnidadesDestazadas;
    }


    public void aumentarCantidad() {
        cantidad++;
        cantidadDeCriasCompradas++;
    }

    public void aumentarHambre() {
        hambre++;
    }

    public void aumentarCrias() {

    }
}
