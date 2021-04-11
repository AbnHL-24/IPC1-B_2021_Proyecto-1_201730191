package controlador.inicio;

import modelo.vivo.jugador.Granjero;
import vista.inicio.BienvenidaVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controlador del inicio que se encarga de crear la partida o las opciones para expandir el juego
 * @author abnerhl
 */
public class InicioControlador implements ActionListener {
    private BienvenidaVista bienvenida;

    public InicioControlador(BienvenidaVista bienvenida) {
        this.bienvenida = bienvenida;

        this.bienvenida.getBtnInicioPartida().addActionListener(this);
        this.bienvenida.getBtnCrearAnimales().addActionListener(this);
        this.bienvenida.getBtnCrearPlantas().addActionListener(this);
        this.bienvenida.getBtnCrearProductos().addActionListener(this);
    }

    /**
     * Metodo iniciar() que se encarga de cargar la interfaz grafica del menu inicio.
     */
    public void iniciar() {
        this.bienvenida.setResizable(false);
        this.bienvenida.setLocationRelativeTo(null);
        this.bienvenida.setVisible(true);
    }

    /**
     * Metodo actionPerformed utilizado para escuchar los eventos en los botones de la interfaz grafica.
     * @param e es el escuchador del evento.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.bienvenida.getBtnInicioPartida()) {
            IniciarPartidaControlador iniciarPartida =  new IniciarPartidaControlador(this.bienvenida);
            iniciarPartida.generarPartida();
        } else if (e.getSource() == this.bienvenida.getBtnCrearAnimales()) {
            System.out.println("Crear animales");
        } else if (e.getSource() == this.bienvenida.getBtnCrearPlantas()) {
            System.out.println("Crear plantas");
        } else if (e.getSource() == this.bienvenida.getBtnCrearProductos()) {
            System.out.println("Crear productos");
        }
    }
}
