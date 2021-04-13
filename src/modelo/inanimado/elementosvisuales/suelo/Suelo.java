package modelo.inanimado.elementosvisuales.suelo;

import controlador.suelo.grama.AnimalControlador;

import javax.swing.*;
/*
 * Clase padre Suelo, sirve para crear las partes mas basicas de cada tipo de suelo.
 * @author abnerhl
 */
public class Suelo{
    protected boolean estadoCompraSuelo;        //Booleano que marca si el suelo esta comprado o no
    protected boolean disponibilidadDeSuelo;    //Boleando que especifica si el suelo esta disponible, solo en desierto debe ser falso
    protected int i;
    protected int j;

    public Suelo(boolean estadoCompraSuelo, boolean disponibilidadDeSuelo) {
        this.estadoCompraSuelo = estadoCompraSuelo;
        this.disponibilidadDeSuelo = disponibilidadDeSuelo;
    }

    public boolean isEstadoCompraSuelo() {
        return estadoCompraSuelo;
    }

    public void setEstadoCompraSuelo(boolean estadoCompraSuelo) {
        this.estadoCompraSuelo = estadoCompraSuelo;
    }

    public boolean isDisponibilidadDeSuelo() {
        return disponibilidadDeSuelo;
    }

    public void setDisponibilidadDeSuelo(boolean disponibilidadDeSuelo) {
        this.disponibilidadDeSuelo = disponibilidadDeSuelo;
    }

    public String getTipoDeSuelo() {
        return "Suelo";
    };

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
