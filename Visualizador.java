public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        //Contorno negro alrededor de la carta
        Square contorno = new Square();
        contorno.changeColor("black");
        contorno.moveHorizontal(p.getX() - 5);  
        contorno.moveVertical(p.getY() - 5);
        contorno.changeSize(170);  
        contorno.makeVisible();
        
        //Carta
        Square square = new Square();
        square.changeColor("white"); 
        square.moveHorizontal(p.getX());
        square.moveVertical(p.getY());
        square.changeSize(160);  
        square.makeVisible();

        //Dibujar el símbolo del palo en la carta
        switch (c.getTipo()) {
            case TREBOLES:
                dibujarTrebol(p);
                break;
            case CORAZONES:
                dibujarCorazon(p);
                break;
            case DIAMANTES:
                dibujarDiamante(p);
                break;
            case PICAS:
                dibujarPicas(p);
                break;
        }

        dibujarValor(c.getValor(), c.getTipo(), p);
    }

    private static void dibujarTrebol(Posicion p) {
        Square t1 = new Square();
        t1.changeColor("black");
        t1.changeSize(20);
        t1.moveHorizontal(p.getX() + 70);
        t1.moveVertical(p.getY() + 50);
        t1.makeVisible();

        Square t2 = new Square();
        t2.changeColor("black");
        t2.changeSize(20);
        t2.moveHorizontal(p.getX() + 60);
        t2.moveVertical(p.getY() + 70);
        t2.makeVisible();

        Square t3 = new Square();
        t3.changeColor("black");
        t3.changeSize(20);
        t3.moveHorizontal(p.getX() + 80);
        t3.moveVertical(p.getY() + 70);
        t3.makeVisible();
    }

    private static void dibujarCorazon(Posicion p) {
        Square c1 = new Square();
        c1.changeColor("red");
        c1.changeSize(20);
        c1.moveHorizontal(p.getX() + 70);
        c1.moveVertical(p.getY() + 50);
        c1.makeVisible();

        Square c2 = new Square();
        c2.changeColor("red");
        c2.changeSize(20);
        c2.moveHorizontal(p.getX() + 60);
        c2.moveVertical(p.getY() + 70);
        c2.makeVisible();

        Square c3 = new Square();
        c3.changeColor("red");
        c3.changeSize(20);
        c3.moveHorizontal(p.getX() + 80);
        c3.moveVertical(p.getY() + 70);
        c3.makeVisible();
    }

    private static void dibujarDiamante(Posicion p) {
        Triangle d1 = new Triangle();
        d1.changeColor("red");
        d1.changeSize(20, 20);
        d1.moveHorizontal(p.getX() + 180);
        d1.moveVertical(p.getY() + 52);
        d1.makeVisible();

        Triangle d2 = new Triangle();
        d2.changeColor("red");
        d2.changeSize(20, 20);
        d2.moveHorizontal(p.getX() + 170);
        d2.moveVertical(p.getY() + 72);
        d2.makeVisible();

        Triangle d3 = new Triangle();
        d3.changeColor("red");
        d3.changeSize(20, 20);
        d3.moveHorizontal(p.getX() + 190);
        d3.moveVertical(p.getY() + 72);
        d3.makeVisible();
    }

    private static void dibujarPicas(Posicion p) {
        Triangle t1 = new Triangle();
        t1.changeColor("black");
        t1.changeSize(20, 20); 
        t1.moveHorizontal(p.getX() + 180); 
        t1.moveVertical(p.getY() + 52); 
        t1.makeVisible();
    
        Triangle t2 = new Triangle();
        t2.changeColor("black");
        t2.changeSize(20, 20);
        t2.moveHorizontal(p.getX() + 170);
        t2.moveVertical(p.getY() + 72);
        t2.makeVisible();
    
        Triangle t3 = new Triangle();
        t3.changeColor("black");
        t3.changeSize(20, 20);
        t3.moveHorizontal(p.getX() + 190);
        t3.moveVertical(p.getY() + 72);
        t3.makeVisible();
    }

    private static void dibujarValor(String valor, Carta.Palo palo, Posicion p) {
        int cantidadFiguras = obtenerCantidadFiguras(valor);
    
        // Definir el color según el palo
        String colorCirculo;
        if (palo == Carta.Palo.CORAZONES || palo == Carta.Palo.DIAMANTES) {
            colorCirculo = "red";  // Rojo para corazones y diamantes
        } else {
            colorCirculo = "black"; // Negro para tréboles y picas
        }
    
        for (int i = 0; i < cantidadFiguras; i++) {
            Circle valorCirculo = new Circle();
            valorCirculo.changeColor(colorCirculo);  // Cambia el color según el palo
            valorCirculo.changeSize(10);     
            valorCirculo.moveHorizontal(p.getX() + 85 + (i % 5) * 15); 
            valorCirculo.moveVertical(p.getY() + 35 + (i / 5) * 15);  
            valorCirculo.makeVisible();
        }
    }
    

    private static int obtenerCantidadFiguras(String valor) {
        if (esNumerico(valor)) {
            return Integer.parseInt(valor);
        }

        switch (valor.toUpperCase()) {
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

    //Método para verificar si el valor de la carta es numérico
    private static boolean esNumerico(String valor) {
        return valor.matches("\\d+");  //Verifica si el valor contiene solo dígitos
    }
}
