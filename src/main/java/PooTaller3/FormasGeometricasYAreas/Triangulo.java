package PooTaller3.FormasGeometricasYAreas;

/**
 *
 * @author Leidy Giraldo
 */
public class Triangulo extends FormaFigura {

    double base;
    double altura;

    public Triangulo(double base, double altura, String nombreFigura, String color) {
        super(nombreFigura, color);
        this.base = base;
        this.altura = altura;
    }

    //Area = b*h/2
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

}
