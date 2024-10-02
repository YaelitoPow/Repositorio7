/**
 * Clase Main para ejecutar los métodos
 * 
 * @author Yael 
 * @version 21/09/2024
 */
import java.util.ArrayList;

public class Juego {

    public static void main(String[] args) {
        //Crear el mazo y barajarlo
        Mazo mazo = new Mazo();
        mazo.barajar();

        Jugador jugador1 = new Jugador("Yael");
        Jugador jugador2 = new Jugador("Sophia");

        //Repartir cartas a los jugadores
        jugador1.recibirCartas(mazo.repartir(5));
        jugador2.recibirCartas(mazo.repartir(5));

        System.out.println(jugador1.obtenerInformacionJugador());
        System.out.println(jugador2.obtenerInformacionJugador());

        System.out.println("Cartas en el mazo: " + mazo.contarCartasEnMazo());
        System.out.println("Cartas repartidas: " + mazo.contarCartasRepartidas());
        System.out.println("Cartas no repartidas: " + mazo.contarCartasNoRepartidas());

        //Los jugadores regresan sus cartas al mazo
        ArrayList<Carta> cartasARegresar = new ArrayList<>();
        cartasARegresar.addAll(jugador1.getMano());
        cartasARegresar.addAll(jugador2.getMano());

        mazo.regresarCartas(cartasARegresar);

        //Mostrar el estado del mazo después de regresar las cartas
        System.out.println("\n--- Mazo despúes de regresar las cartas --- ");
        System.out.println("Cartas en el mazo: " + mazo.contarCartasEnMazo());
        System.out.println("Cartas repartidas: " + mazo.contarCartasRepartidas());
        System.out.println("Cartas no repartidas: " + mazo.contarCartasNoRepartidas());
    }
}