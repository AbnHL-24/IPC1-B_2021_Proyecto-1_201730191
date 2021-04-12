package modelo.inanimado.productos;

/**
 * Clase Producto es el molde para todos los productos
 * @author abnerhl
 */
public class Producto {
    protected String nombreProducto;
    protected int cantidadProducto;

    /**
     * Contructor de la clase PRoducto
     * @param nombreProducto Es el nombre del producto.
     * @param cantidadProducto Es la cantidad del producto
     */
    public Producto(String nombreProducto, int cantidadProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
