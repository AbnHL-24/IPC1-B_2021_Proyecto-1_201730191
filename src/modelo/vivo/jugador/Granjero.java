package modelo.vivo.jugador;

import modelo.vivo.SerVivo;

/**
 * Clase Grangero que sirve para crear al jugador.
 * @author abnerhl
 */
public class Granjero implements SerVivo {
    String nombre;
    String nickName;
    int puntosDeVida = 100;
    long oro = 50;
    long oroGenerado;
    long alimentooConsumido;

    /**
     *Constructor de la clase Grangero.
     *@param nombre se usa para recibir el nombre del granjero, se asigna a la variable nombre.
     *@param nickName se usa para recibir el nickName del granjero, se asigna a la variable nickName.
     */
    public Granjero(String nombre, String nickName) {
        this.nombre = nombre;
        this.nickName = nickName;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNickName() {
        return nickName;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public long getOro() {
        return oro;
    }

    public void setOro(long oro) {
        this.oro = oro;
    }

    public long getOroGenerado() {
        return oroGenerado;
    }

    public void setOroGenerado(long oroGenerado) {
        this.oroGenerado = oroGenerado;
    }

    public long getAlimentooConsumido() {
        return alimentooConsumido;
    }

    public void setAlimentooConsumido(long alimentooConsumido) {
        this.alimentooConsumido = alimentooConsumido;
    }

    /**
     * Metodo morir() que se utiliza para que los seres vivos partan a mejor vida.
     */
    @Override
    public void morir() {
        //implementar metodo perderVida
        //implementar metodo consumirAlimento
        //sacar los metodos anteriores y hacer que si vida == 0 entonces game over
    }
}