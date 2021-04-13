package modelo.inanimado;

import modelo.inanimado.elementosvisuales.suelo.Suelo;
import modelo.inanimado.productos.Producto;
import modelo.inanimado.productos.alimento.Alimento;
import modelo.inanimado.productos.alimento.TipoAlimento;
import modelo.inanimado.productos.materiales.MateriaPrima;
import modelo.vivo.animal.Animal;
import modelo.vivo.animal.TipoAnimal;
import modelo.vivo.jugador.Granjero;
import modelo.vivo.vegetal.Planta;
import modelo.vivo.vegetal.fruta.Fruta;
import modelo.vivo.vegetal.grano.Grano;
import vista.pantallajuego.Base;

import javax.swing.*;
import java.util.Random;

/**
 * Clase Granja, en su instanciase encuantra lo necesario para la granja.
 */
public class Granja {
    private Animal[] animales;
    private Planta[] plantas;
    private Producto[] productos;
    private Granjero jugador;
    private int oroGenerado = 0;
    private int alimentoGenerado = 0;
    private int cantidadCeldasCompradas = 0;

    private Suelo[][] tablero;
    private JButton[][] botones;

    private Base base;

    Random rd = new Random();

    /**
     * Constructor de la clase Granja.
     * @param jugador objeto jugador (el usuario).
     */
    public Granja(Granjero jugador) {
        this.jugador = jugador;
    }

    /**
     * Crea los animales, las plantas y los productos iniciales.
     */
    public void iniciarGranja() {
        productos = new Producto[4];
        productos[0] = new Alimento("Huevo", TipoAlimento.GRANO);
        productos[1] = new Alimento("Carne", TipoAlimento.CARNE);
        productos[2] = new Alimento("Leche", TipoAlimento.LACTEO);
        productos[3] = new MateriaPrima("Cuero");


        animales = new Animal[2];

        animales[0] = new Animal(TipoAnimal.HERBIVORO, "Vaca");
        String[] productosRecogerVaca = {"Leche"};
        animales[0].setProductosParaRecoger(productosRecogerVaca);
        int[] cantProductosParaRecogerVaca = {100};
        animales[0].setCantProductosParaRecoger(cantProductosParaRecogerVaca);
        String[] productosDestazarVaca = {"Cuero", "Carne"};
        animales[0].setProductosParaDestazar(productosDestazarVaca);
        int[] cantProductosParaDestazarVaca = {25, 75};
        animales[0].setCantProductosParaDestazar(cantProductosParaDestazarVaca);

        animales[1] = new Animal(TipoAnimal.OMNIVORO, "Gallina");
        String[] productosRecogerGallina = {"Huevos"};
        animales[1].setProductosParaRecoger(productosRecogerGallina);
        int[] cantProductosParaRecogerGallina = {100};
        animales[1].setCantProductosParaRecoger(cantProductosParaRecogerGallina);
        String[] productosDestazarGallina = {"Carne"};
        animales[1].setProductosParaDestazar(productosDestazarGallina);
        int[] cantProductosParaDestazarGallina = {100};
        animales[1].setCantProductosParaDestazar(cantProductosParaDestazarGallina);


        plantas = new Planta[2];
        plantas[0] = new Grano("Maiz", 20, 5, rd.nextInt(15) + 1, 3);
        plantas[1] = new Fruta("Manzano", 45, 8, rd.nextInt(18) + 1, 7);

    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public Planta[] getPlantas() {
        return plantas;
    }

    public void setPlantas(Planta[] plantas) {
        this.plantas = plantas;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public Granjero getJugador() {
        return jugador;
    }

    public void setJugador(Granjero jugador) {
        this.jugador = jugador;
    }

    public int getOroGenerado() {
        return oroGenerado;
    }

    public void setOroGenerado(int oroGenerado) {
        this.oroGenerado = oroGenerado;
    }

    public int getAlimentoGenerado() {
        return alimentoGenerado;
    }

    public void setAlimentoGenerado(int alimentoGenerado) {
        this.alimentoGenerado = alimentoGenerado;
    }

    public int getCantidadCeldasCompradas() {
        return cantidadCeldasCompradas;
    }

    public void setCantidadCeldasCompradas(int cantidadCeldasCompradas) {
        this.cantidadCeldasCompradas = cantidadCeldasCompradas;
    }

    public Suelo[][] getTablero() {
        return tablero;
    }

    public void setTablero(Suelo[][] tablero) {
        this.tablero = tablero;
    }

    public JButton[][] getBotones() {
        return botones;
    }

    public void setBotones(JButton[][] botones) {
        this.botones = botones;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}
