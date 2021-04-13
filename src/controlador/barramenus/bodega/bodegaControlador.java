package controlador.barramenus.bodega;

import modelo.inanimado.Granja;
import modelo.inanimado.productos.Producto;
import modelo.vivo.animal.Animal;
import modelo.vivo.vegetal.Planta;
import vista.barramenus.bodega.BodegaVista;

/**
 * Clase que ejerce de controlador para la bodega.
 */
public class bodegaControlador {
    BodegaVista bodebaVista = new BodegaVista();
    Granja granja;

    /**
     * Constructor del controlador de la bodega.
     * @param granja objeto granja donde se guarda casi todo.
     */
    public bodegaControlador(Granja granja) {
        this.granja = granja;
    }

    /**
     * Inicia la vista de la ventana de la bodega.
     */
    public void iniciarVista() {
        bodebaVista.setResizable(true);
        bodebaVista.setLocationRelativeTo(null);
        bodebaVista.setVisible(true);
        imprimirAnimales();
        imprimirPlantas();
        imprimirProductos();
    }

    /**
     * Imprime en IU los animales y sus cantidades.
     */
    private void imprimirAnimales() {
        Animal[] animals = granja.getAnimales();
        for (int i = 0; i < animals.length; i++) {
            String tmp1 = "Tipo de animal: " + animals[i].getNombreAnimal() + ", hay: " + String.valueOf(animals[i].getCantidad() + ".");
            String tmp2 = bodebaVista.getLblImprimirAnimales().getText();
            bodebaVista.getLblImprimirAnimales().setText("<html><p style=\"width:180px\">"+tmp1 + tmp2+"</p></html>");
        }
    }

    /**
     * Imprime en IU las plantas y sus cantidades.
     */
    private void imprimirPlantas() {
        Planta[] plantas = granja.getPlantas();
        for (int i = 0; i < plantas.length; i++) {
            String tmp1 = "Tipo de planta: " + plantas[i].getNombre() + ", hay: " + String.valueOf(plantas[i].getCantidad() + ".");
            String tmp2 = bodebaVista.getLblImprimirPlantas().getText();
            bodebaVista.getLblImprimirPlantas().setText("<html><p style=\"width:180px\">"+tmp1 + tmp2+"</p></html>");
        }
    }

    /**
     * Imprime en IU los productos y sus cantidades.
     */
    private void imprimirProductos() {
        Producto[] productos = granja.getProductos();
        for (int i = 0; i < productos.length; i++) {
            String tmp1 = "Tipo de producto: " + productos[i].getNombreProducto() + ", hay: " + String.valueOf(productos[i].getCantidadProducto() + ".");
            String tmp2 = bodebaVista.getLblImprimirProductos().getText();
            bodebaVista.getLblImprimirProductos().setText("<html><p style=\"width:180px\">"+tmp1 + tmp2+"</p></html>");
        }
    }
}
