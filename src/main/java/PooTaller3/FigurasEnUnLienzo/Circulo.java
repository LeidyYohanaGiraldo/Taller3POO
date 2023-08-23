
package PooTaller3.FigurasEnUnLienzo;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class Circulo extends Figura{

    public Circulo(String nombreFigura, String color) {
        super(nombreFigura, color);
    }
    
  
    
    @Override
    public void dibujar() {
      JOptionPane.showMessageDialog(null,"Dibujando un Circulo de color: " + getColor());
       
    }
    
}
