package modelo.inanimado.elementosvisuales.suelo;

import javax.swing.*;
/*
 * Clase padre Suelo, sirve para crear las partes mas basicas de cada tipo de suelo.
 * @author abnerhl
 */
public class Suelo{
    protected boolean estadoCompraSuelo;        //Booleano que marca si el suelo esta comprado o no
    protected boolean disponibilidadDeSuelo;    //Boleando que especifica si el suelo esta disponible, solo en desierto debe ser falso

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

    public String tipoDeSuelo() {
        return "Suelo";
    };

}
