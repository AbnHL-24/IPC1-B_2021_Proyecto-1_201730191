package controlador.inicio;

import modelo.vivo.jugador.Granjero;
import vista.inicio.BienvenidaVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioControlador implements ActionListener {
    private BienvenidaVista bienvenida;

    public InicioControlador(BienvenidaVista bienvenida) {
        this.bienvenida = bienvenida;

        this.bienvenida.getBtnInicioPartida().addActionListener(this);
        this.bienvenida.getBtnCrearAnimales().addActionListener(this);
        this.bienvenida.getBtnCrearPlantas().addActionListener(this);
        this.bienvenida.getBtnCrearProductos().addActionListener(this);
    }

    public void iniciar() {
        this.bienvenida.setResizable(false);
        this.bienvenida.setLocationRelativeTo(null);
        this.bienvenida.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.bienvenida.getBtnInicioPartida()) {
            System.out.println("Iniciar partida");
        } else if (e.getSource() == this.bienvenida.getBtnCrearAnimales()) {
            System.out.println("Crear animales");
        } else if (e.getSource() == this.bienvenida.getBtnCrearPlantas()) {
            System.out.println("Crear plantas");
        } else if (e.getSource() == this.bienvenida.getBtnCrearProductos()) {
            System.out.println("Crear productos");
        }
    }
}
