package controlador.inicio;

import modelo.inanimado.elementosvisuales.suelo.Suelo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TableroControlador controla los eventos que suceden el ma matriz de botones de la IU
 * @author abnerhl
 */
public class TableroControlador implements ActionListener {
    private Suelo[][] tablero;
    private JButton[][] botones;

    public TableroControlador(Suelo[][] tablero, JButton[][] botones) {
        this.tablero = tablero;
        this.botones = botones;
    }

    /**
     * iniciar() es el metodo con que se inicia la escucha del los eventos en la matriz de botones de la IU
     */
    public void iniciar() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones.length; j++) {
                botones[i][j].addActionListener(this);
            }
        }
    }

    /**
     * actionPerformed es el evento sobreescrito heredado de implementar ActionLisitener
     * @param e evento recibido debido al actionListener de cada boton de la matriz botones
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        int i = retornarI(e);
        int j = retornarJ(e);

        if ("Grama".equals(tablero[i][j].getTipoDeSuelo())) {
            System.out.println("Grama en " + botones[i][j].getName());
        } else if ("Agua".equals(tablero[i][j].getTipoDeSuelo())) {
            System.out.println("Agua en " + botones[i][j].getName());
        } else if ("Desierto".equals(tablero[i][j].getTipoDeSuelo())) {
            System.out.println("Desierto en " + botones[i][j].getName());
        }

    }

    /**
     *
     * @param e retornarI() retorna el valor J de la posicion de un boton y suelo en sus respectivas matrices
     * @return y es el valor i de la matriz de botones
     */
    private int retornarJ(ActionEvent e) {
        int y = 0;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones.length; j++) {
                if (e.getSource().equals(botones[i][j])) {
                    y = j;
                }
            }
        }
        return y;
    }

    /**
     * retornarI() retorna el valor J de la posicion de un boton y suelo en sus respectivas matrices
     * @param e evento e proveniente del actionPerfermed()
     * @return x es el valor i de la matriz de botones
     */
    private int retornarI(ActionEvent e) {
        int x = 0;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones.length; j++) {
                if (e.getSource().equals(botones[i][j])) {
                    x = i;
                }
            }
        }
        return x;
    }

}
