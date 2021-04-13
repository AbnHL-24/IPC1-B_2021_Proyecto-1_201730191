package controlador.suelo.grama;

import modelo.inanimado.Granja;
import modelo.inanimado.elementosvisuales.suelo.grama.Grama;
import modelo.vivo.animal.Animal;
import vista.panelesdeinformacion.grama.GramaAnimal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalControladorL implements ActionListener {
    GramaAnimal gramaAnimal;
    Granja granja;
    Grama grama;
    Animal animal;

    public AnimalControladorL(Granja granja, GramaAnimal gramaAnimal, Grama grama) {
        this.gramaAnimal = gramaAnimal;
        this.granja = granja;
        this.grama = grama;
        this.animal = (Animal) grama.getSerVivo();

        actualizarDatos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gramaAnimal.getBtnAlimentar()) {

        }

    }

    public void iniciarControlador() {
        gramaAnimal.getBtnAlimentar().addActionListener(this);
        gramaAnimal.getBtnDestazar().addActionListener(this);
        gramaAnimal.getBtnObtenerProduccion().addActionListener(this);

        Thread ac = new Thread(new AnimalControlador(grama, granja, this));
        ac.start();
    }

    public void actualizarDatos() {
        gramaAnimal.getLblTipoAnimal().setText("Tipo de animal: " + String.valueOf(animal.getNombreAnimal()));
        gramaAnimal.getLblPuntosVida().setText("Puntos de vida: " + String.valueOf(animal.getPuntosDeVida()));
        gramaAnimal.getLblHambre().setText("Nivel de hambre: " + String.valueOf(animal.getHambre()));

    }
}
