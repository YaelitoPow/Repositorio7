public class Carta {
    private String valor;
    private Palo tipo;

    public enum Palo {
        CORAZONES, DIAMANTES, TREBOLES, PICAS;
    }
   
    public Carta(String valor, Palo tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    // Getters
    public String getValor() {
        return this.valor;
    }

    public Palo getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return this.valor + " de " + this.tipo;
    }
}
