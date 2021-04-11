package controlador.inicio;

import modelo.inanimado.elementosvisuales.suelo.Suelo;
import modelo.inanimado.elementosvisuales.suelo.agua.Agua;
import modelo.inanimado.elementosvisuales.suelo.desierto.Desierto;
import modelo.inanimado.elementosvisuales.suelo.grama.Grama;
import modelo.vivo.jugador.Granjero;
import vista.inicio.BienvenidaVista;
import vista.pantallajuego.Base;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/*
 * Clase IniciarPartidaControlador sirve para empezar el juego.
 */
public class IniciarPartidaControlador {
    private BienvenidaVista bienvenida;
    private int tamanyoTablero = 6;
    private int tamanyoBoton = 150;
    private Suelo[][] tablero = new Suelo[tamanyoTablero][tamanyoTablero];
    private JButton[][] botones = new JButton[tamanyoTablero][tamanyoTablero];
    private Random rd = new Random();

    public IniciarPartidaControlador(BienvenidaVista bienvenida) {
        this.bienvenida = bienvenida;
    }

    /*
     * Metodo generarPartida encargado de iniciar lo necesario para empezar un juego.
     */
    public void generarPartida() {
        //Se crea al granjero
        Granjero jugador = new Granjero(bienvenida.getTxtFNombre().getText(), bienvenida.getTxtFNickName().getText());

        //Se crea la base sel juego y muestra en pantalla
        Base base = new Base();
        base.setResizable(true);
        base.setLocationRelativeTo(null);
        base.setVisible(true);
        bienvenida.setVisible(false);

        //Se establecen los datos inciales del jugador
        base.getLblNombre().setText("Nombre: " + jugador.getNombre());
        base.getLblNickName().setText("NickName: " + jugador.getNickName());
        base.getLblPuntosDeVida().setText("Puntos de vida: " + String.valueOf(jugador.getPuntosDeVida()));
        base.getLblOro().setText("Oro: " + String.valueOf(jugador.getOro()));

        base.getPnlTablero().setLayout(new GridLayout(tamanyoTablero, tamanyoTablero));
        inciarTablero();
        base.getPnlTablero().setPreferredSize(new Dimension(tamanyoTablero * tamanyoBoton, tamanyoTablero * tamanyoBoton));
        iniciarBotones(base);
        base.getScrlPaneTablero().setViewportView(base.getPnlTablero());

        TableroControlador tableroControlador = new TableroControlador(this.tablero, this.botones);
        tableroControlador.iniciar();
    }

    /*
     * Crea la matriz botones para mostrar en la IU.
     */
    private void iniciarBotones(Base base) {
        for (int i = 0; i < tamanyoTablero; i++) {
            for (int j = 0; j < tamanyoTablero; j++) {
                JButton btn = new JButton();

                this.botones[i][j] = btn;

                this.botones[i][j].setSize(tamanyoBoton, tamanyoBoton);
                if (this.tablero[i][j].isEstadoCompraSuelo()) {
                    this.botones[i][j].setToolTipText(this.tablero[i][j].getTipoDeSuelo());
                }
                this.botones[i][j].setName(i + "," +j);

                if (this.tablero[i][j].isEstadoCompraSuelo()) {
                    if ("Grama".equals(this.tablero[i][j].getTipoDeSuelo())) {
                        btn.setBackground(Color.GREEN);
                    } else if ("Agua".equals(this.tablero[i][j].getTipoDeSuelo())) {
                        btn.setBackground(Color.blue);
                    } else if ("Desierto".equals(this.tablero[i][j].getTipoDeSuelo())) {
                        btn.setBackground(Color.orange);
                    }
                } else {
                    btn.setBackground(Color.gray);
                }

                base.getPnlTablero().add(this.botones[i][j]);
                //base.getPnlTablero().validate();
                //base.getPnlTablero().repaint();
            }

        }
    }

    /*
     * Crea la matriz tablero de suelos.
     */
    private void inciarTablero() {
        for (int i = 0; i < tamanyoTablero; i++) {
            for (int j = 0; j < tamanyoTablero; j++) {
                //booleano para establecer el estado de compra del terreno inicial
                boolean estadoCompraSuelo = false;
                if (i < tamanyoTablero -1 && j < tamanyoTablero -1) {
                    estadoCompraSuelo = true;
                }
                //aleatorio para saber que tipo de suelo crear
                int num = rd.nextInt(20);
                //if para crear un tipo de suelos segun indique  rd.nextInt()
                if (num >= 0 && num <=7) {
                    this.tablero[i][j] = new Grama(estadoCompraSuelo);
                } else if (num >= 8 && num <= 14) {
                    this.tablero[i][j] = new Agua(estadoCompraSuelo);
                } else if (num >= 15 && num <= 19) {
                    this.tablero[i][j] = new Desierto(estadoCompraSuelo);
                }

            }
        }
    }
}
