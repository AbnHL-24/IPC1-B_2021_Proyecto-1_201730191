package controlador.suelo.grama;

import modelo.inanimado.Granja;
import modelo.inanimado.elementosvisuales.suelo.grama.Grama;
import modelo.vivo.animal.Animal;
import modelo.vivo.animal.TipoAnimal;
import vista.panelesdeinformacion.grama.AgregarAnimal;
import vista.pantallajuego.Base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarAnimalControlador implements ActionListener {
    AgregarAnimal agregarAnimal = new AgregarAnimal();
    Granja granja;
    Grama grama;
    Base base;

    public AgregarAnimalControlador(Granja granja, Grama grama, Base base) {
        this.granja = granja;
        this.grama = grama;
        this.base = base;
    }

    public void iniciarControlador() {
        agregarAnimal.setResizable(false);
        agregarAnimal.setLocationRelativeTo(null);
        agregarAnimal.setVisible(true);

        String listaAnimales = listaAnimales();
        agregarAnimal.getLblListaAnimales().setText("Lista de animales: " + listaAnimales);

        agregarAnimal.getBtnAgregar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombreAnimal = agregarAnimal.getTxtfNombreAnimal().getText();


        TipoAnimal tipoAnimal = retornarTipoAnimal(nombreAnimal);
        Animal animal = new Animal(tipoAnimal, nombreAnimal);

        String[] productosRecoger = retornarProductosRecoger(nombreAnimal);
        animal.setProductosParaRecoger(productosRecoger);

        int[] cantProductosParaRecoger = retornarCantProductosRecoger(nombreAnimal);
        animal.setCantProductosParaRecoger(cantProductosParaRecoger);

        String[] productosDestazar = retornarProductosDestazar(nombreAnimal);
        animal.setProductosParaDestazar(productosDestazar);

        int[] cantProductosParaDestazar = retornarCantProductosDestazar(nombreAnimal);
        animal.setCantProductosParaDestazar(cantProductosParaDestazar);

        grama.setSerVivo(animal);
        agregarAnimal.dispose();
        aumentarAnimal(nombreAnimal);

        GramaControlador gc = new GramaControlador(granja, grama, base);
        gc.iniciarControlador();

    }

    private void aumentarAnimal(String nombreAnimal) {
        for (int i = 0; i < granja.getAnimales().length; i++) {
            if (nombreAnimal.equalsIgnoreCase(granja.getAnimales()[i].getNombreAnimal())) {
                granja.getAnimales()[i].aumentarCantidad();
            }
        }
    }

    private int[] retornarCantProductosDestazar(String nombreAnimal) {
        int[] retornoA = {0};
        for (int i = 0; i < granja.getAnimales().length; i++) {
            if (nombreAnimal.equalsIgnoreCase(granja.getAnimales()[i].getNombreAnimal())) {
                retornoA = granja.getAnimales()[i].getCantProductosParaDestazar();
            }
        }
        return retornoA;
    }

    private String[] retornarProductosDestazar(String nombreAnimal) {
        String[] cadenaA = {""};
        for (int i = 0; i < granja.getAnimales().length; i++) {
            if (nombreAnimal.equalsIgnoreCase(granja.getAnimales()[i].getNombreAnimal())) {
                cadenaA = granja.getAnimales()[i].getProductosParaDestazar();
            }
        }
        return cadenaA;
    }

    private int[] retornarCantProductosRecoger(String nombreAnimal) {
        int[] retornoA = {0};
        for (int i = 0; i < granja.getAnimales().length; i++) {
            if (nombreAnimal.equalsIgnoreCase(granja.getAnimales()[i].getNombreAnimal())) {
                retornoA = granja.getAnimales()[i].getCantProductosParaRecoger();
            }
        }
        return retornoA;
    }

    private String[] retornarProductosRecoger(String nombreAnimal) {
        String[] cadenaA = {""};
        for (int i = 0; i < granja.getAnimales().length; i++) {
            if (nombreAnimal.equalsIgnoreCase(granja.getAnimales()[i].getNombreAnimal())) {
                cadenaA = granja.getAnimales()[i].getProductosParaRecoger();
            }
        }
        return cadenaA;
    }

    private TipoAnimal retornarTipoAnimal(String nombreAnimal) {
        TipoAnimal tipoAnimal = TipoAnimal.OMNIVORO;
        for (int i = 0; i < granja.getAnimales().length; i++) {
            if (nombreAnimal.equalsIgnoreCase(granja.getAnimales()[i].getNombreAnimal())) {
                tipoAnimal = granja.getAnimales()[i].getTipoAnimal();
            }

        }
        return tipoAnimal;
    }

    private String listaAnimales() {
        String animales = null;
        for (int i = 0; i < granja.getAnimales().length; i++) {
            if (animales == null) {
                String tmp = granja.getAnimales()[i].getNombreAnimal();
                animales = tmp;
            } else {
                String tmp1 = animales;
                String tmp2 = ", " + granja.getAnimales()[i].getNombreAnimal();
                animales = tmp1 + tmp2;
            }
        }
        return animales;
    }

}
