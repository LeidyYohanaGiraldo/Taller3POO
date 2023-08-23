
package PooTaller3.FigurasEnUnLienzo;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class Cuadrado  extends Figura{

    public Cuadrado(String nombreFigura, String color) {
        super(nombreFigura, color);
    }

    @Override
    public void dibujar() {
         JOptionPane.showMessageDialog(null,"Dibujando un Cuadrado de color: " + getColor());
    }
    
}
