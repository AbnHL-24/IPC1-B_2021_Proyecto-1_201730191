package modelo.inanimado.productos.alimento;

import modelo.inanimado.productos.Producto;

/**
 * Clase Alimento sirve para crear alimentos.
 * @author abnerhl
 */
public class Alimento extends Producto {
    TipoAlimento tipoAlimentol;

    /**
     * Constructor Alimento crea los alimentos.
     * @param nombreProductos es el nombre con del producto a crear.
     * @param tipoAlimentol enum que especifica el tipo de alimento.
     */
    public Alimento(String nombreProductos, TipoAlimento tipoAlimentol) {
        super(nombreProductos, 0);
        this.tipoAlimentol = tipoAlimentol;
    }

    public TipoAlimento getTipoAlimentol() {
        return tipoAlimentol;
    }

    public void setTipoAlimentol(TipoAlimento tipoAlimentol) {
        this.tipoAlimentol = tipoAlimentol;
    }
}
