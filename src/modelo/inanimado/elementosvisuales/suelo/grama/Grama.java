package modelo.inanimado.elementosvisuales.suelo.grama;

import modelo.inanimado.elementosvisuales.suelo.Suelo;
import modelo.vivo.SerVivo;
import modelo.vivo.jugador.Granjero;

import java.util.Random;
/*
 * Clase grama
 * @ author abnerhl
 */
public class Grama extends Suelo {
    private SerVivo serVivo;            //Alverga al animal o planta de la casilla
    private int fertibilidad;           //aleatorio de fertilidad
    private Random rd = new Random();   //random


    public Grama(boolean estadoCompraSuelo) {
        super(estadoCompraSuelo, true);
        this.fertibilidad = rd.nextInt(3) + 1;
    }

    public SerVivo getSerVivo() {
        return serVivo;
    }

    public void setSerVivo(SerVivo serVivo) {
        if (serVivo instanceof Granjero) {
            //No hacer nada, ok no, arreglar esto.
        } else {
            this.serVivo = serVivo;
        }
    }

    public Random getRd() {
        return rd;
    }

    public void setRd(Random rd) {
        this.rd = rd;
    }

    public int getFertibilidad() {
        return fertibilidad;
    }

    public void setFertibilidad(int fertibilidad) {
        this.fertibilidad = fertibilidad;
    }

    @Override
    public String getTipoDeSuelo() {
        return "Grama";
    }
}
