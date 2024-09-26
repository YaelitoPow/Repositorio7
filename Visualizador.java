public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        // Rectángulo para representar la carta
        Square square = new Square();
        square.changeColor("cian"); 
        square.moveHorizontal(p.getX());
        square.moveVertical(p.getY());
        square.changeSize(160);  
        square.makeVisible();

        int cantidadFiguras = obtenerCantidadFiguras(c.getValor());

        // Dibujar los símbolos dentro de la carta n cantidad de veces
        for (int i = 0; i < cantidadFiguras; i++) {
            if (c.getTipo() == Carta.Palo.TREBOLES) {
                Square symbol = new Square();
                symbol.changeColor("green");  
                symbol.changeSize(20);
                symbol.moveHorizontal(p.getX() + 110 + (i % 3) * 30);
                symbol.moveVertical(p.getY() -15 + (i / 3) * 30);
                symbol.makeVisible();
            }
            if (c.getTipo() == Carta.Palo.CORAZONES) {
                Triangle symbol = new Triangle();
                symbol.changeColor("red");  
                symbol.changeSize(20, 10);
                symbol.moveHorizontal(p.getX() + 110 + (i % 3) * 30);
                symbol.moveVertical(p.getY() -15 + (i / 3) * 30);
                symbol.makeVisible();
            }
            if (c.getTipo() == Carta.Palo.DIAMANTES) {
                Triangle symbol = new Triangle();
                symbol.changeColor("white");  
                symbol.changeSize(20, 10);
                symbol.moveHorizontal(p.getX() + 110 + (i % 3) * 30);
                symbol.moveVertical(p.getY() -15 + (i / 3) * 30);
                symbol.makeVisible();

            }
            if (c.getTipo() == Carta.Palo.PICAS) {
                Circle symbol = new Circle();
                symbol.changeColor("black");  
                symbol.changeSize(20);
                symbol.moveHorizontal(p.getX() + 110 + (i % 3) * 30);
                symbol.moveVertical(p.getY() -15 + (i / 3) * 30);
                symbol.makeVisible();
            }
        }
    }

    private static int obtenerCantidadFiguras(String valor) {
        if (esNumerico(valor)) {
            return Integer.parseInt(valor);
        }

        switch(valor.toUpperCase()){
            case "A":
                return 1;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            default:
                return 1;
        }
    }

    // Método para verificar si el valor de la carta es numérico
    private static boolean esNumerico(String valor) {
        return valor.matches("\\d+");  // Verifica si el valor contiene solo dígitos
    }
}

