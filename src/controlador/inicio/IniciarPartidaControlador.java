package controlador.inicio;

import modelo.vivo.jugador.Granjero;
import vista.inicio.BienvenidaVista;

public class IniciarPartidaControlador {
    BienvenidaVista bienvenida;

    public IniciarPartidaControlador(BienvenidaVista bienvenida) {
        this.bienvenida = bienvenida;
    }

    public void generadDatos() {
        Granjero jugador = new Granjero(bienvenida.getTxtFNombre().getText(), bienvenida.getTxtFNickName().getText());
        //Generar granja
    }

}
