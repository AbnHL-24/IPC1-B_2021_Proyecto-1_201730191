package modelo.inanimado.elementosvisuales.suelo.grama;

import controlador.suelo.grama.AnimalControlador;
import modelo.inanimado.elementosvisuales.suelo.Suelo;
import modelo.vivo.SerVivo;
import modelo.vivo.jugador.Granjero;

import java.util.Random;
/**
 * Clase grama
 * @ author abnerhl
 */
public class Grama extends Suelo {
    private SerVivo serVivo;            //Animal o planta de la casilla
    private int fertibilidad;           //aleatorio de fertilidad
    private Random rd = new Random();   //random
    private AnimalControlador animalcontrol;

    public Grama(boolean estadoCompraSuelo) {
        super(estadoCompraSuelo, true);
        this.fertibilidad = rd.nextInt(3) + 1;
    }

    public void iniciarControladorAnimal() {
        ///animalcontrol = new AnimalControlador(g)
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

    public AnimalControlador getAnimalcontrol() {
        return animalcontrol;
    }

    public void setAnimalcontrol(AnimalControlador animalcontrol) {
        this.animalcontrol = animalcontrol;
    }
}
