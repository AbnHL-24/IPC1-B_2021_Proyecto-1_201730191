package modelo.inanimado.elementosvisuales.suelo.desierto;

import modelo.inanimado.elementosvisuales.suelo.Suelo;

public class Desierto extends Suelo {
    public Desierto(boolean estadoCompraSuelo) {
        super(estadoCompraSuelo, false);
    }

    @Override
    public String getTipoDeSuelo() {
        return "Desierto";
    }
}
