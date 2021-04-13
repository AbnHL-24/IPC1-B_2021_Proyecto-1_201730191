/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.inicio;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author abnerhl
 */
public class CrearAnimal extends javax.swing.JFrame {

    /**
     * Creates new form AñadirAnimal
     */
    public CrearAnimal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        lblDatosAnimalesTitulo = new javax.swing.JLabel();
        lblTiposDeAnimalesEnum = new javax.swing.JLabel();
        lblListaDeAnimales = new javax.swing.JLabel();
        txtfDatosAnimal = new javax.swing.JTextField();
        lblEjemploEntradaAnimal = new javax.swing.JLabel();
        lblDatosProductosProducir = new javax.swing.JLabel();
        lblListaProductosProducir = new javax.swing.JLabel();
        lblInstruccionesIngresoProductosProducir = new javax.swing.JLabel();
        txtfProductosProducir = new javax.swing.JTextField();
        lblDatosProductosDestaze = new javax.swing.JLabel();
        lblListaProductosDestaze = new javax.swing.JLabel();
        lblInstruccionesIngresoPorcentajeProducir = new javax.swing.JLabel();
        txtfPorcentajesProducir = new javax.swing.JTextField();
        txtfPorcentajesDestaze = new javax.swing.JTextField();
        lblInstruccionesIngresoPorcentajeDestaze = new javax.swing.JLabel();
        txtfProductosDestaze = new javax.swing.JTextField();
        lblInstruccionesIngresoProductosDestaze = new javax.swing.JLabel();
        btnAgregarAnimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar animal.");

        lblDatosAnimalesTitulo.setText("Datos del animal:");

        lblTiposDeAnimalesEnum.setText("Tipos de animales: HERBIVORO, OMNIVORO");

        lblListaDeAnimales.setText("Lista de animales:");

        lblEjemploEntradaAnimal.setText("Formato de entrada: tipo de animal, animal                Ejemplo de entrada: HERBIVORO,vaca");

        lblDatosProductosProducir.setText("Datos de los productos que el animal produce mientras esta vivo.");

        lblListaProductosProducir.setText("Lista de productos:");

        lblInstruccionesIngresoProductosProducir.setText("Formato de entrada: producto,producto                  Ejemplo: leche,huevos    Ingresar igual cantidad de productos y porcentajes.");

        lblDatosProductosDestaze.setText("Datos de los productos que el animal produce cuando de destaza.");

        lblListaProductosDestaze.setText("Lista de productos:");

        lblInstruccionesIngresoPorcentajeProducir.setText("Formato de entrada: porcentaje, porcentaje            Ejemplo: 25,75               los porcentajes no deben ser mayores a 100.");

        lblInstruccionesIngresoPorcentajeDestaze.setText("Formato de entrada: porcentaje, porcentaje            Ejemplo: 25,75               los porcentajes no deben ser mayores a 100.");

        lblInstruccionesIngresoProductosDestaze.setText("Formato de entrada: producto,producto                  Ejemplo: leche,huevos    Ingresar igual cantidad de productos y porcentajes.");

        btnAgregarAnimal.setText("Agregar animal");

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarAnimal)
                    .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInstruccionesIngresoProductosDestaze, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                            .addComponent(txtfProductosDestaze)
                            .addComponent(lblInstruccionesIngresoPorcentajeDestaze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfPorcentajesDestaze, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblListaProductosDestaze)
                            .addComponent(lblDatosProductosDestaze)
                            .addComponent(lblInstruccionesIngresoProductosProducir, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                            .addComponent(lblListaProductosProducir)
                            .addComponent(lblDatosProductosProducir)
                            .addComponent(lblEjemploEntradaAnimal)
                            .addComponent(lblDatosAnimalesTitulo)
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(lblTiposDeAnimalesEnum)
                                .addGap(70, 70, 70)
                                .addComponent(lblListaDeAnimales))
                            .addComponent(txtfProductosProducir)
                            .addComponent(txtfDatosAnimal)
                            .addComponent(lblInstruccionesIngresoPorcentajeProducir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfPorcentajesProducir, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblDatosAnimalesTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiposDeAnimalesEnum)
                    .addComponent(lblListaDeAnimales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEjemploEntradaAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfDatosAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblDatosProductosProducir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblListaProductosProducir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstruccionesIngresoProductosProducir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfProductosProducir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstruccionesIngresoPorcentajeProducir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfPorcentajesProducir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblDatosProductosDestaze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblListaProductosDestaze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstruccionesIngresoProductosDestaze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfProductosDestaze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstruccionesIngresoPorcentajeDestaze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfPorcentajesDestaze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnAgregarAnimal))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAnimal;
    private javax.swing.JLabel lblDatosAnimalesTitulo;
    private javax.swing.JLabel lblDatosProductosDestaze;
    private javax.swing.JLabel lblDatosProductosProducir;
    private javax.swing.JLabel lblEjemploEntradaAnimal;
    private javax.swing.JLabel lblInstruccionesIngresoPorcentajeDestaze;
    private javax.swing.JLabel lblInstruccionesIngresoPorcentajeProducir;
    private javax.swing.JLabel lblInstruccionesIngresoProductosDestaze;
    private javax.swing.JLabel lblInstruccionesIngresoProductosProducir;
    private javax.swing.JLabel lblListaDeAnimales;
    private javax.swing.JLabel lblListaProductosDestaze;
    private javax.swing.JLabel lblListaProductosProducir;
    private javax.swing.JLabel lblTiposDeAnimalesEnum;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JTextField txtfDatosAnimal;
    private javax.swing.JTextField txtfPorcentajesDestaze;
    private javax.swing.JTextField txtfPorcentajesProducir;
    private javax.swing.JTextField txtfProductosDestaze;
    private javax.swing.JTextField txtfProductosProducir;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblDatosAnimalesTitulo() {
        return lblDatosAnimalesTitulo;
    }

    public JLabel getLblDatosProductosDestaze() {
        return lblDatosProductosDestaze;
    }

    public JLabel getLblDatosProductosProducir() {
        return lblDatosProductosProducir;
    }

    public JLabel getLblEjemploEntradaAnimal() {
        return lblEjemploEntradaAnimal;
    }

    public JLabel getLblInstruccionesIngresoPorcentajeDestaze() {
        return lblInstruccionesIngresoPorcentajeDestaze;
    }

    public JLabel getLblInstruccionesIngresoPorcentajeProducir() {
        return lblInstruccionesIngresoPorcentajeProducir;
    }

    public JLabel getLblInstruccionesIngresoProductosDestaze() {
        return lblInstruccionesIngresoProductosDestaze;
    }

    public JLabel getLblInstruccionesIngresoProductosProducir() {
        return lblInstruccionesIngresoProductosProducir;
    }

    public JLabel getLblListaDeAnimales() {
        return lblListaDeAnimales;
    }

    public JLabel getLblListaProductosDestaze() {
        return lblListaProductosDestaze;
    }

    public JLabel getLblListaProductosProducir() {
        return lblListaProductosProducir;
    }

    public JLabel getLblTiposDeAnimalesEnum() {
        return lblTiposDeAnimalesEnum;
    }

    public JPanel getPnlBase() {
        return pnlBase;
    }

    public JTextField getTxtfDatosAnimal() {
        return txtfDatosAnimal;
    }

    public JTextField getTxtfPorcentajesDestaze() {
        return txtfPorcentajesDestaze;
    }

    public JTextField getTxtfPorcentajesProducir() {
        return txtfPorcentajesProducir;
    }

    public JTextField getTxtfProductosDestaze() {
        return txtfProductosDestaze;
    }

    public JTextField getTxtfProductosProducir() {
        return txtfProductosProducir;
    }

    public JButton getBtnAgregarAnimal() {
        return btnAgregarAnimal;
    }

    

}
