package modelo.vivo.vegetal;

import modelo.vivo.SerVivo;

/**
 * Clse abstracta que se utiliza como plantilla para crear plantas que den granos o frutas.
 * @author abnerhl
 */
public abstract class Planta  implements SerVivo {
    protected String nombre;
    protected int cantidad;
    protected int precioPorSemilla;
    protected int cantidadDeSemillasParaPlantar;
    protected int alimentosGenerados;
    protected int puntosDeVidaGenerados;

    /**
     * Constructor de Planta
     * @param nombre nombre de la planta
     * @param precioPorSemilla es el precio necesario para la compra de una semilla en el mercado.
     * @param cantidadDeSemillasParaPlantar es la cantidad de semillas necesarias para crear una planta.
     * @param alimentosGenerados es la cantidad de alimento que proporcionara en cada cosecha.
     * @param puntosDeVidaGenerados es la cantidad de puntos de vida que agregara al jugador al consumir
     *        una unidad de estos alimentos.
     */
    public Planta(String nombre, int precioPorSemilla, int cantidadDeSemillasParaPlantar, int alimentosGenerados, int puntosDeVidaGenerados) {
        this.nombre = nombre;
        this.precioPorSemilla = precioPorSemilla;
        this.cantidadDeSemillasParaPlantar = cantidadDeSemillasParaPlantar;
        this.alimentosGenerados = alimentosGenerados;
        this.puntosDeVidaGenerados = puntosDeVidaGenerados;
        this.cantidad = 0;
    }

    public int getPrecioPorSemilla() {
        return precioPorSemilla;
    }

    public void setPrecioPorSemilla(int precioPorSemilla) {
        this.precioPorSemilla = precioPorSemilla;
    }

    public int getCantidadDeSemillasParaPlantar() {
        return cantidadDeSemillasParaPlantar;
    }

    public void setCantidadDeSemillasParaPlantar(int cantidadDeSemillasParaPlantar) {
        this.cantidadDeSemillasParaPlantar = cantidadDeSemillasParaPlantar;
    }

    public int getAlimentosGenerados() {
        return alimentosGenerados;
    }

    public void setAlimentosGenerados(int alimentosGenerados) {
        this.alimentosGenerados = alimentosGenerados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPuntosDeVidaGenerados() {
        return puntosDeVidaGenerados;
    }

    public void setPuntosDeVidaGenerados(int puntosDeVidaGenerados) {
        this.puntosDeVidaGenerados = puntosDeVidaGenerados;
    }

    /**
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    public abstract void morir();

    /**
     * Metodo cosechar() se utiliza para recoger alimentos de la planta
     */
    public abstract void cosechar();
}
