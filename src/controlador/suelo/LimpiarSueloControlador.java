package controlador.suelo;

import modelo.inanimado.Granja;
import vista.panelesdeinformacion.grama.LimpiarTerreno;

public class LimpiarSueloControlador {
    LimpiarTerreno limpiarTerreno = new LimpiarTerreno();
    Granja granja;

    public LimpiarSueloControlador(Granja granja) {
        this.granja = granja;
    }

    public void iniciarControlador() {
        establecerPanelLimpio();
    }

    private void establecerPanelLimpio() {
        granja.getBase().getPnlDatosTablero().removeAll();
        granja.getBase().getPnlDatosTablero().repaint();
        limpiarTerreno.setSize(granja.getBase().getPnlDatosTablero().getSize());
        limpiarTerreno.setVisible(true);
        granja.getBase().getPnlDatosTablero().add(limpiarTerreno);
        granja.getBase().getPnlDatosTablero().validate();
    }
}
