package PooTaller3.SistemaNotificaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class NotificacionMensajeTexto extends MensajeTexto {

    private String mensaje;
    

    @Override
    public void ingresarInfoMensajeTexto() {
        mensaje = JOptionPane.showInputDialog("Ingrese el mensaje que desea mostrar como notificacion");
        enviarMensaje();
    }

    @Override
    public void enviarMensaje() {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "Notificacion Mensaje de texto enviada con exito\n¿Desea Verla?",
                "Notificacion Mensaje de texto",
                JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "La notificacion que envio fue :" + mensaje);
        } else if (respuesta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Adiós");
        }
    }

}
