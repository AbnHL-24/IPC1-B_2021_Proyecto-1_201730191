package modelo.inanimado.productos.materiales;

/**
 * Clase MAteriaPrima qeus irve para crear productos de tipo materia prima.
 * @author abnerhl
 */
public class MateriaPrima extends modelo.inanimado.productos.Producto {

    /**
     * Constructor de MateriaPrima.
     * @param nombreProductos es el nombre del producto de clase materia prima.
     */
    public MateriaPrima(String nombreProductos) {
        super(nombreProductos, 0);
    }
}
