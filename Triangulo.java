public class Triangulo extends Triangle {

    public Triangulo(int x, int y, int height, int width, String color) {
        super();  
        this.xPosition = x;
        this.yPosition = y;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public void dibujar() {
        makeVisible();  
    }

    public void cambiarTamaño(int nuevoAlto, int nuevoAncho) {
        changeSize(nuevoAlto, nuevoAncho);  
    }

    public void cambiarColor(String nuevoColor) {
        changeColor(nuevoColor);  
    }

    public void mover(int x, int y) {
        moveHorizontal(x - this.xPosition);  
        moveVertical(y - this.yPosition);    
    }
}
