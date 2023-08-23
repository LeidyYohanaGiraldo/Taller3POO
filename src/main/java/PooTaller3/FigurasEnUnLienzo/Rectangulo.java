package PooTaller3.FigurasEnUnLienzo;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class Rectangulo extends Figura {

    public Rectangulo(String nombreFigura, String color) {
        super(nombreFigura, color);
    }

    @Override
    public void dibujar() {
        JOptionPane.showMessageDialog(null,"Dibujando un Rectangulo de color: " + getColor());
    }

}
