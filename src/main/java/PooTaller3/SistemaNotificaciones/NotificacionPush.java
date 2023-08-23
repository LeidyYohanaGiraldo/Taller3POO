package PooTaller3.SistemaNotificaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class NotificacionPush extends Push {

    private String mensaje;

    @Override
    public void ingresarInfoPush() {
        mensaje = JOptionPane.showInputDialog("Ingrese el mensaje que desea mostrar como notificacion");
        enviarMensaje();
    }

    @Override
    public void enviarMensaje() {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "Notificacion Push enviada con exito\n¿Deseas Verla?",
                "Notificacion Push",
                JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "La notificacion que envio fue :" + mensaje);
        } else if (respuesta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Adiós");
        }
    }
}
