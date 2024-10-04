/**
 * Clase de un conjunto de cartas llamada Mazo, que realiza los métodos del juego de Cartas
 * 
 * @author Yael 
 * @version 21/09/2024
 */
import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas; 
    private ArrayList<Carta> cartasRepartidas; 

    public Mazo() {
        this.cartas = new ArrayList<>();
        this.cartasRepartidas = new ArrayList<>();
        inicializarMazo();
    }

    private void inicializarMazo() {
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (Carta.Palo tipo : Carta.Palo.values()) {
            for (String valor : valores) {
                cartas.add(new Carta(valor, tipo));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public ArrayList<Carta> repartir(int cantidad) {
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            if (!cartas.isEmpty()) {
                Carta carta = cartas.remove(0);
                mano.add(carta);
                cartasRepartidas.add(carta);
            }
        }
        return mano;
    }

    public void regresarCartas(ArrayList<Carta> cartasARegresar) {
        cartas.addAll(cartasARegresar);
        cartasRepartidas.removeAll(cartasARegresar);
    }

    public int contarCartasNoRepartidas() {
        return cartas.size(); 
    }

    public int contarCartasEnMazo() {
        return cartas.size();
    }

    public int contarCartasRepartidas() {
        return cartasRepartidas.size();
    }
}
