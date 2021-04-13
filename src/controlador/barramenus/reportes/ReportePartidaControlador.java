package controlador.barramenus.reportes;

import modelo.inanimado.Granja;
import vista.barramenus.reportes.ReportePartidaVista;

/**
 * Clase que genera el controlador de los reportes de la partida.
 */
public class ReportePartidaControlador {
    ReportePartidaVista rPartida = new ReportePartidaVista();
    Granja granja;

    /**
     * Constructor de la clase ReportePartidaControlador.
     * @param granja objeto granja donde se guarda casi todo.
     */
    public ReportePartidaControlador(Granja granja) {
        this.granja = granja;
    }

    /**
     * Metodo que inicia el controlador, mostrando la IU y seteando los datos a mostrar.
     */
    public void iniciarControlador() {
        rPartida.setResizable(false);
        rPartida.setLocationRelativeTo(null);
        rPartida.setVisible(true);

        imprimirDatos();
    }

    /**
     * metodo que actualiza los datos en la IU del reporte.
     */
    private void imprimirDatos() {
        rPartida.getLblNombreGranjero().setText(granja.getJugador().getNombre());
        //Queda pendiente la duracion de la partida.
        rPartida.getLblOroGeneradoGranja().setText(String.valueOf(granja.getOroGenerado()));
        rPartida.getLblAlimentoConsumidoGranjero().setText(String.valueOf(granja.getJugador().getAlimentooConsumido()));
        rPartida.getLblAlimentoGeneradoGranja().setText(String.valueOf(granja.getAlimentoGenerado()));
        rPartida.getLblCantidadCeldasCompradas().setText(String.valueOf(granja.getCantidadCeldasCompradas()));

    }
}