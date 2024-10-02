/**
 * Clase del jugador del juego de cartas
 * 
 * @author Yael
 * @version 21/09/2024
 */
import java.util.ArrayList;

public class Jugador {
    public String nombre;
    private ArrayList<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void recibirCartas(ArrayList<Carta> cartas) {
        mano.addAll(cartas);
    }

    public void descartarMano() {
        mano.clear();
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public String obtenerInformacionJugador() {
        return "Jugador: " + nombre + ", Cartas: " + mano.toString();
    }
}
