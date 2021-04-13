package controlador.suelo.grama;

import modelo.inanimado.Granja;
import modelo.vivo.animal.Animal;

import java.util.concurrent.TimeUnit;

public class AnimalControlador implements Runnable {
    Animal animal;
    Granja granja;
    boolean disponibilidadParaProducir = true;
    boolean vivo = true;

    public AnimalControlador(Animal animal, Granja granja) {
        this.animal = animal;
        this.granja = granja;
    }

    @Override
    public void run() {
        do {
            animal.setEdad(animal.getEdad() + 1);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Producir();

            restarVida();
            morir();
        } while (vivo);
        //Anadir algo para chingarse al animal
    }

    private void morir() {
        if (animal.getPuntosDeVida() <= 0) {
            vivo = false;
        }
    }

    private void restarVida() {
        int nuevaVida = animal.getPuntosDeVida() - 5;
        animal.setPuntosDeVida(nuevaVida);
    }

    private void Producir() {
        if (disponibilidadParaProducir) {
            for (int i = 0; i < granja.getProductos().length; i++) {
                for (int j = 0; j < animal.getProductosParaRecoger().length; j++) {
                    if (granja.getProductos()[i].getNombreProducto().equals(animal.getProductosParaRecoger()[j])) {
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
                    cantidad = 2 * ((animal.getComidaConsumida() + 5) / 10) * animal.getFactorGenetico() * (animal.getCantProductosParaRecoger()[i] / 100);
                } else if (animal.getEdad() >=20 && animal.getEdad() < 50) { //Generar para adulto
                    cantidad = 3 * ((animal.getComidaConsumida() + 5) / 10) * animal.getFactorGenetico() * (animal.getCantProductosParaRecoger()[i] / 100);
                } else if (animal.getEdad() >=50) { //Generar para anciano
                    cantidad = ((animal.getComidaConsumida() + 5) / 10) * animal.getFactorGenetico() * (animal.getCantProductosParaRecoger()[i] / 100);
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
