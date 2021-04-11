package modelo.inanimado.productos.alimento;

import modelo.inanimado.productos.Producto;

public class Alimento extends Producto {
    TipoAlimento tipoAlimentol;

    public Alimento(String[] nombreProductos, int[] porcentajeProductos, TipoAlimento tipoAlimentol) {
        super(nombreProductos, porcentajeProductos);
        this.tipoAlimentol = tipoAlimentol;
    }
}
