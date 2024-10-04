/**
 * Clase que caracteriza a una carta de un mazo
 * 
 * @author Yael
 * @version 21/09/2024
 */
public class Carta {
    private String valor;
    private Palo tipo;

    public enum Palo {
        CORAZONES, DIAMANTES, TREBOLES, PICAS;
    }
    
    //Constructor
    public Carta(String valor, Palo tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    //Método para representar la carta en formato cadena
    @Override
    public String toString() {
        return this.valor + " de " + this.tipo;
    }
    
}