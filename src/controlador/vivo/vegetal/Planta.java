package controlador.vivo.vegetal;

import controlador.vivo.SerVivo;

/*
 * Clse abstracta que se utiliza como plantilla para crear plantas que den granos o frutas.
 * @author abnerhl
 */
public abstract class Planta  implements SerVivo {
    protected int precioPorSemilla;
    protected int cantidadDeSemillasParaPlantar;
    protected int alimentosGenerados;
    protected int puntosDeVidaGenerados;

    /*
     *Constructor de Planta
     * @param precioPorSemilla es el precio necesario para la compra de una semilla en el mercado.
     * @param cantidadDeSemillasParaPlanta es la cantidad de semillas necesarias para una plantacion.
     * @param alimentosGenerados es la cantidad de alimento que proporcionara en cada cosecha.
     * @param puntosDeVidaGenerados es la cantidad de puntos de vida que agregara al jugador al consumir
     *        una unidad de estos alimentos.
     */
    public Planta(int precioPorSemilla, int cantidadDeSemillasParaPlantar, int alimentosGenerados, int puntosDeVidaGenerados) {
        this.precioPorSemilla = precioPorSemilla;
        this.cantidadDeSemillasParaPlantar = cantidadDeSemillasParaPlantar;
        this.alimentosGenerados = alimentosGenerados;
        this.puntosDeVidaGenerados = puntosDeVidaGenerados;
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

    /*
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    public abstract void morir();

    /*
     * Metodo cosechar() se utiliza para recoger alimentos de la planta
     */
    public abstract void cosechaar();
}
