package modelo.inanimado.productos;

public class Producto {
    protected String[] nombreProductos;
    protected int[] porcentajeProductos;

    public Producto(String[] nombreProductos, int[] porcentajeProductos) {
        this.nombreProductos = nombreProductos;
        this.porcentajeProductos = porcentajeProductos;
    }

    public String[] getNombreProductos() {
        return nombreProductos;
    }

    public void setNombreProductos(String[] nombreProductos) {
        this.nombreProductos = nombreProductos;
    }

    public int[] getPorcentajeProductos() {
        return porcentajeProductos;
    }

    public void setPorcentajeProductos(int[] porcentajeProductos) {
        this.porcentajeProductos = porcentajeProductos;
    }
}
