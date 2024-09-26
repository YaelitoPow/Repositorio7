public class Main {
    public static void main(String[] args) {
        
        Carta carta = new Carta("K", Carta.Palo.DIAMANTES);
        Posicion posicion = new Posicion(-110, -110);

        Visualizador.carta(carta, posicion);
    }
}
