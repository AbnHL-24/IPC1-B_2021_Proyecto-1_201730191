package controlador.inicio;

import modelo.vivo.jugador.Granjero;
import vista.inicio.BienvenidaVista;
import vista.pantallajuego.Base;

/*
 * Clase IniciarPartidaControlador sirve para empezar el juego.
 */
public class IniciarPartidaControlador {
    BienvenidaVista bienvenida;

    public IniciarPartidaControlador(BienvenidaVista bienvenida) {
        this.bienvenida = bienvenida;
    }

    /*
     * Metodo generarPartida encargado de iniciar lo necesario para empezar un juego.
     */
    public void generarPartida() {
        Granjero jugador = new Granjero(bienvenida.getTxtFNombre().getText(), bienvenida.getTxtFNickName().getText());
        Base base = new Base();
        base.setResizable(false);
        base.setLocationRelativeTo(null);
        base.setVisible(true);
        bienvenida.setVisible(false);

        base.getLblNombre().setText("Nombre: " + jugador.getNombre());
        base.getLblNickName().setText("NickName: " + jugador.getNickName());
        base.getLblPuntosDeVida().setText("Puntos de vida: " + String.valueOf(jugador.getPuntosDeVida()));
        base.getLblOro().setText("Oro: " + String.valueOf(jugador.getOro()));

    }

}
