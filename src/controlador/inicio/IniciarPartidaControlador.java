package controlador.inicio;

import controlador.barramenus.MenusControlador;
import modelo.inanimado.Granja;
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

/**
 * Clase IniciarPartidaControlador sirve para empezar el juego.
 * @author abnerhl
 */
public class IniciarPartidaControlador {
    private BienvenidaVista bienvenida;
    Granjero jugador;
    Granja granja;
    private int tamanyoTablero = 6;
    private int tamanyoBoton = 150;
    private Suelo[][] tablero = new Suelo[tamanyoTablero][tamanyoTablero];
    private JButton[][] botones = new JButton[tamanyoTablero][tamanyoTablero];
    private Random rd = new Random();

    public IniciarPartidaControlador(BienvenidaVista bienvenida) {
        this.bienvenida = bienvenida;
    }

    /**
     * Metodo generarPartida encargado de iniciar lo necesario para empezar un juego.
     */
    public void generarPartida() {
        //Se crea al granjero
        jugador = new Granjero(bienvenida.getTxtFNombre().getText(), bienvenida.getTxtFNickName().getText());
        granja = new Granja(jugador);
        //Crea las cosas que tiene la granja, animales, plantas, etc.
        granja.iniciarGranja();

        //Se crea la base del juego y muestra en pantalla
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

        //Establesco un gridlayout a pnlTablero.
        base.getPnlTablero().setLayout(new GridLayout(tamanyoTablero, tamanyoTablero));
        //Llamo al metodo inciarTablero que esta abajo.
        inciarTablero();
        //establesco el tamaño del pnlTablero que sera el tamaño del boton por la cantidad de botones.
        base.getPnlTablero().setPreferredSize(new Dimension(tamanyoTablero * tamanyoBoton, tamanyoTablero * tamanyoBoton));
        //Llamo al metodo iniciarBotones que esta abajo
        iniciarBotones(base);
        // Le establesco el pnlTablero al scrlPaneTablero.
        base.getScrlPaneTablero().setViewportView(base.getPnlTablero());

        //Llamo al cotrolador que escucha los clicks en los botones.
        TableroControlador tableroControlador = new TableroControlador(this.tablero, this.botones, granja, base);
        tableroControlador.iniciar();
        MenusControlador menusControlador = new MenusControlador(base, granja);
        menusControlador.iniciar();

        System.out.println("prueba");
    }

    /**
     * Crea la matriz botones para mostrar en la IU.
     * @param base es una implementacion de la vista Base donde se genera la interfaz principal del juego.
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

    /**
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
