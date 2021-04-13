package controlador.suelo.grama;

import controlador.inicio.CrearAnimalControlador;
import modelo.inanimado.Granja;
import modelo.inanimado.elementosvisuales.suelo.grama.Grama;
import modelo.vivo.animal.Animal;
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
                gramaLimpia.getBtnAñadirAnimal().addActionListener(this);
                gramaLimpia.getBtnAñadirPlanta().addActionListener(this);

            } else {
                gramaAnimal = new GramaAnimal();
                establecerPanelAnimal();
                AnimalControladorL ac = new AnimalControladorL(granja, gramaAnimal, grama);
                ac.iniciarControlador();
            }
        } else {
            System.out.println("Hay que comprar el suelo");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gramaLimpia.getBtnAñadirAnimal()) {
            AgregarAnimalControlador aac = new AgregarAnimalControlador(granja, grama, base);
            aac.iniciarControlador();
        } else if (e.getSource() == gramaLimpia.getBtnAñadirPlanta()) {
            System.out.println("Crear planta");
        }
    }

    private void establecerPanelAnimal() {
        base.getPnlDatosTablero().removeAll();
        base.getPnlDatosTablero().repaint();
        gramaAnimal.setSize(base.getPnlDatosTablero().getSize());
        gramaAnimal.setVisible(true);
        base.getPnlDatosTablero().add(gramaAnimal);
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
