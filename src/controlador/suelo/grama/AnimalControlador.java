package controlador.suelo.grama;

import controlador.suelo.LimpiarSueloControlador;
import modelo.inanimado.Granja;
import modelo.inanimado.elementosvisuales.suelo.grama.Grama;
import modelo.vivo.animal.Animal;
import vista.panelesdeinformacion.grama.GramaAnimal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class AnimalControlador implements Runnable{
    Animal animal;
    Granja granja;
    Grama grama;
    private AnimalControladorL animalControladorL;

    boolean disponibilidadParaProducir = true;
    boolean vivo = true;

    public AnimalControlador(Grama grama, Granja granja, AnimalControladorL animalControlador) {
        animalControladorL = animalControlador;
        this.granja = granja;
        this.grama = grama;
        this.animal = (Animal) grama.getSerVivo();
    }




    @Override
    public void run() {
        granja.getJugador().disminuirOro();
        do {
            asignarNombreBoton();
            aumentarCrias();
            animal.setEdad(animal.getEdad() + 1);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Producir();
            hambre();
            restarVida();
            morir();
            animalControladorL.actualizarDatos();
        } while (vivo);

    }

    private void asignarNombreBoton() {
        if (vivo) {
            granja.getBotones()[grama.getI()][grama.getJ()].setText(animal.getNombreAnimal());
        } else {
            granja.getBotones()[grama.getI()][grama.getJ()].setText("");
        }
    }

    private void aumentarCrias() {
        for (int i = 0; i < granja.getAnimales().length; i++) {
            if (animal.getNombreAnimal().equalsIgnoreCase(granja.getAnimales()[i].getNombreAnimal())) {
                granja.getAnimales()[i].aumentarCrias();
            }
        }
    }

    private void hambre() {
        animal.aumentarHambre();
    }

    private void morir() {
        if (animal.getPuntosDeVida() <= 0) {
            destazar();
            vivo = false;
            grama.setSerVivo(null);
            asignarNombreBoton();
            //granja.getTablero()[grama.getI()][grama.getJ()].isDisponibilidadDeSuelo(false);
            LimpiarSueloControlador lsc = new LimpiarSueloControlador(granja);
            lsc.iniciarControlador();

        }
    }

    private void destazar() {
        if (disponibilidadParaProducir) {
            for (int i = 0; i < granja.getProductos().length; i++) {
                for (int j = 0; j < animal.getProductosParaDestazar().length; j++) {
                    if (granja.getProductos()[i].getNombreProducto().equalsIgnoreCase(animal.getProductosParaDestazar()[j])) {
                        int nuevaCantidadComida = productosGeneradosAnimal(animal.getProductosParaDestazar()[j]) + granja.getProductos()[i].getCantidadProducto();
                        granja.getProductos()[i].setCantidadProducto(nuevaCantidadComida);
                    }
                }
            }
        }
    }

    private void restarVida() {
        int nuevaVida = animal.getPuntosDeVida() - 5;
        if (animal.getHambre() >10) {
            nuevaVida -= 5;
        }
        animal.setPuntosDeVida(nuevaVida);
    }

    private void Producir() {
        if (disponibilidadParaProducir) {
            for (int i = 0; i < granja.getProductos().length; i++) {
                for (int j = 0; j < animal.getProductosParaRecoger().length; j++) {
                    if (granja.getProductos()[i].getNombreProducto().equalsIgnoreCase(animal.getProductosParaRecoger()[j])) {
                        int nuevaCantidadComida = productosGeneradosAnimal(animal.getProductosParaRecoger()[j]) + granja.getProductos()[i].getCantidadProducto();
                        granja.getProductos()[i].setCantidadProducto(nuevaCantidadComida);
                    }
                }
            }
        }
    }

    private int productosGeneradosAnimal(String productoRecoger) {
        int cantidad = 0;
        for (int i = 0; i < animal.getProductosParaRecoger().length; i++) {
            if (productoRecoger.equals(animal.getProductosParaRecoger()[i])) {
                if (animal.getEdad() <20) { //Generar para joven
                    cantidad = 1 + 2 * ((animal.getComidaConsumida() + 5) / 10) * animal.getFactorGenetico() * (animal.getCantProductosParaRecoger()[i] / 100);
                } else if (animal.getEdad() >=20 && animal.getEdad() < 50) { //Generar para adulto
                    cantidad = 1 + 3 * ((animal.getComidaConsumida() + 5) / 10) * animal.getFactorGenetico() * (animal.getCantProductosParaRecoger()[i] / 100);
                } else if (animal.getEdad() >=50) { //Generar para anciano
                    cantidad = 1 + ((animal.getComidaConsumida() + 5) / 10) * animal.getFactorGenetico() * (animal.getCantProductosParaRecoger()[i] / 100);
                }
            } else {
                cantidad = 5;
            }
        }
        return cantidad;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
