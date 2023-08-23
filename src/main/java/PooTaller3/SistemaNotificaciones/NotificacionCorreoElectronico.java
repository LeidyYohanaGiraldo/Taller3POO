
package PooTaller3.SistemaNotificaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class NotificacionCorreoElectronico extends CorreoElectronico {
   private String mensaje;
   
   
    @Override
    public void ingresarInfoCorreoElectronico() {
        mensaje = JOptionPane.showInputDialog("Ingrese la notificacion que desea enviar");
        enviarMensaje();
    }

    @Override
    public void enviarMensaje() {
                int respuesta = JOptionPane.showConfirmDialog(
            null,
            "Notificacion Correo Electronico Enviada con exito\nDesea Verla?",
            "Notificacion Correo Electronico",
            JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"La notificacion que envio fue :" +  mensaje);
        } else if (respuesta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null,  "Adiós");
        }
    }
    
}
