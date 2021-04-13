package controlador.barramenus;

import controlador.barramenus.bodega.bodegaControlador;
import controlador.barramenus.reportes.ReportePartidaControlador;
import modelo.inanimado.Granja;
import vista.pantallajuego.Base;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase MenuControlador crea actionListener para cada menu y llama a su respectivo controlador.
 * @author abnerhl
 */
public class MenusControlador implements ActionListener {
    Base base;
    Granja granja;

    /**
     * Constructor de MenusControlador.
     * @param base Objeto Base donde se encuentra la IU del juego.
     * @param granja Objeto Granja donde se encuantra los datos a manejar del juego.
     */
    public MenusControlador(Base base, Granja granja) {
        this.base = base;
        this.granja = granja;
    }

    /**
     * Coloca los actionListener en cada boton de la barra de menus del la IU base.
     */
    public  void iniciar() {
        base.getMniArchivo().addActionListener(this);
        base.getMniBodega().addActionListener(this);
        base.getMniMercado().addActionListener(this);
        base.getMniReporteAnimales().addActionListener(this);
        base.getMniReportePartidas().addActionListener(this);
        base.getMniReportePlantas().addActionListener(this);
    }

    /**
     *  Metodo sobreescrito requerido al implementar ActionListener.
     * @param e evento generado debido a los actionListener's de la barra de menus.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == base.getMniArchivo()) {
            System.out.println("Abrir Archivo");
        } else if (e.getSource() == base.getMniBodega()) {
            bodegaControlador bc = new bodegaControlador(granja);
            bc.iniciarVista();
        } else if (e.getSource() == base.getMniMercado()) {
            System.out.println("Abrir mercado");
        } else if (e.getSource() == base.getMniReporteAnimales()) {
            System.out.println("Abrir reportes animales");
        } else if (e.getSource() == base.getMniReportePartidas()) {
            ReportePartidaControlador rpc =new ReportePartidaControlador(granja);
            rpc.iniciarControlador();
        } else if (e.getSource() == base.getMniReportePlantas()) {
            System.out.println("Abrir reportes planta");
        }
    }
}
