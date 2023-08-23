package PooTaller3.FigurasEnUnLienzo;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class Triangulo extends Figura {

    public Triangulo(String nombreFigura, String color) {
        super(nombreFigura, color);
    }

    @Override
    public void dibujar() {
        JOptionPane.showMessageDialog(null,"Dibujando un Triangulo de color: " + getColor());
    }

}
