public class Cuadrado extends Square {

    public Cuadrado(int x, int y, int size, String color) {
        super();  
        this.xPosition = x;
        this.yPosition = y;
        this.size = size;
        this.color = color;
    }

    public void dibujar() {
        makeVisible();  
    }

    public void cambiarTamaño(int nuevoTamaño) {
        changeSize(nuevoTamaño); 
    }

    public void cambiarColor(String nuevoColor) {
        changeColor(nuevoColor); 
    }

    public void mover(int x, int y) {
        moveHorizontal(x - this.xPosition); 
        moveVertical(y - this.yPosition);   
    }
}