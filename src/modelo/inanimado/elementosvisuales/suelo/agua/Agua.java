package modelo.inanimado.elementosvisuales.suelo.agua;

import modelo.inanimado.elementosvisuales.suelo.Suelo;

public class Agua extends Suelo {
    public Agua(boolean estadoCompraSuelo) {
        super(estadoCompraSuelo, true);
    }

    @Override
    public String getTipoDeSuelo() {
        return "Agua";
    }
}
