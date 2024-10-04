public class Circulo extends Circle {

    public Circulo(int x, int y, int diameter, String color) {
        super();  
        this.xPosition = x;
        this.yPosition = y;
        this.diameter = diameter;
        this.color = color;
    }

    public void dibujar() {
        makeVisible();  
    }

    public void cambiarTamaño(int nuevoDiametro) {
        changeSize(nuevoDiametro);  
    }

    public void cambiarColor(String nuevoColor) {
        changeColor(nuevoColor);  
    }

    public void mover(int x, int y) {
        moveHorizontal(x - this.xPosition); 
        moveVertical(y - this.yPosition);   
    }
}