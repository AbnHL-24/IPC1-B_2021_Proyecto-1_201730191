package controlador.suelo.grama;

import modelo.inanimado.Granja;
import modelo.inanimado.elementosvisuales.suelo.Suelo;
import modelo.inanimado.elementosvisuales.suelo.grama.Grama;
import vista.panelesdeinformacion.grama.GramaAnimal;
import vista.panelesdeinformacion.grama.GramaLimpia;
import vista.pantallajuego.Base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GramaControlador implements ActionListener {
    private Granja granja;
    private Grama grama;
    private Base base;
    private GramaLimpia gramaLimpia;
    private GramaAnimal gramaAnimal;


    public GramaControlador(Granja granja, Grama grama, Base base) {
        this.granja = granja;
        this.grama = grama;
        this.base = base;
    }

    public void iniciarControlador() {
        if (grama.isEstadoCompraSuelo()) {
            if (grama.getSerVivo() == null) {
                gramaLimpia = new GramaLimpia();
                establecerPanelLimpio();
                gramaLimpia.getBtnCrearAnimal().addActionListener(this);
                gramaLimpia.getBtnCrearPlanta().addActionListener(this);

            } else {
                gramaAnimal = new GramaAnimal();
                establecerPanelAnimal();
            }
        } else {
            System.out.println("Hay que comprar el suelo");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gramaLimpia.getBtnCrearAnimal()) {
            System.out.println("Crear animal");
        } else if (e.getSource() == gramaLimpia.getBtnCrearPlanta()) {
            System.out.println("Crear planta");
        }
    }

    private void establecerPanelAnimal() {
        base.getPnlDatosTablero().removeAll();
        base.getPnlDatosTablero().repaint();
        gramaAnimal.setSize(base.getPnlDatosTablero().getSize());
        gramaAnimal.setVisible(true);
        base.getPnlDatosTablero().add(gramaLimpia);
        base.getPnlDatosTablero().validate();
    }

    private void establecerPanelLimpio() {
        base.getPnlDatosTablero().removeAll();
        base.getPnlDatosTablero().repaint();
        gramaLimpia.setSize(base.getPnlDatosTablero().getSize());
        gramaLimpia.setVisible(true);
        base.getPnlDatosTablero().add(gramaLimpia);
        base.getPnlDatosTablero().validate();
    }

}
