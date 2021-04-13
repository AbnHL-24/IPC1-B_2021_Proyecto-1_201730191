package controlador.inicio;

import modelo.inanimado.Granja;
import vista.inicio.CrearAnimal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearAnimalControlador implements ActionListener {
    Granja granja;
    CrearAnimal agregarAnimal = new CrearAnimal();

    public CrearAnimalControlador(Granja granja) {
        this.granja = granja;
    }

    public void iniciarControlador() {
    agregarAnimal.setResizable(false);
    agregarAnimal.setLocationRelativeTo(null);
    agregarAnimal.setVisible(true);

    String tituloAnimales = listaAnimales();
    agregarAnimal.getLblListaDeAnimales().setText("Lista de Animales: " + tituloAnimales);
    String listaProductos = listaProductos();
    agregarAnimal.getLblListaProductosProducir().setText("Lista de productos: " + listaProductos);
    agregarAnimal.getLblListaProductosDestaze().setText("Lista de productos: " + listaProductos);

    agregarAnimal.getBtnAgregarAnimal().addActionListener(this);

    }

    private String listaProductos() {
        String productos = null;
        for (int i = 0; i < granja.getProductos().length; i++) {
            if (productos == null) {
                String tmp = granja.getProductos()[i].getNombreProducto();
                productos = tmp;
            } else {
                String tmp1 = productos;
                String tmp2 = ", " + granja.getProductos()[i].getNombreProducto();
                productos = tmp1 + tmp2;
            }
        }
        return productos;
    }

    private String listaAnimales() {
        String animales = null;
        for (int i = 0; i < granja.getAnimales().length; i++) {
            if (animales == null) {
                String tmp = granja.getAnimales()[i].getNombreAnimal();
                animales = tmp;
            } else {
                String tmp1 = animales;
                String tmp2 = ", " + granja.getAnimales()[i].getNombreAnimal();
                animales = tmp1 + tmp2;
            }
        }
        return animales;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String datosAnimal = agregarAnimal.getTxtfDatosAnimal().getText();
        String nombreProductoProducir = agregarAnimal.getTxtfProductosProducir().getText();
        String porcentajeProductosProducir = agregarAnimal.getTxtfPorcentajesProducir().getText();
        String nombreProductosDestaze = agregarAnimal.getTxtfProductosDestaze().getText();
        String porcentajeProductosDestaze = agregarAnimal.getTxtfPorcentajesProducir().getText();

        String[] datosAnimalA = datosAnimal.split(",");
        String[] nombreProductoProducirA = nombreProductoProducir.split(",");
        String[] porcentajeProductosProducirAS = porcentajeProductosProducir.split(",");
        int[] porcentajeProductosProducirA = generarParseoPorcentajes(porcentajeProductosProducirAS);
        String[] nombreProductosDestazeA = nombreProductosDestaze.split(",");
        String[] porcentajeProductosDestazeAS = porcentajeProductosDestaze.split(",");
        int[] porcentajeProductosDestazeA = generarParseoPorcentajes(porcentajeProductosDestazeAS);
        System.out.println("Holamundo");

    }

    private int[] generarParseoPorcentajes(String[] cadena) {
        int[] retorno = null;
        for (int i = 0; i < cadena.length; i++) {
            retorno[i] = Integer.parseInt(cadena[i]);
        }
        return retorno;
    }

}
