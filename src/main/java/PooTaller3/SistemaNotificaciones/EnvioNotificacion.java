package PooTaller3.SistemaNotificaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class EnvioNotificacion {

    public void mostrarInformacion() {
        NotificacionCorreoElectronico correo = new NotificacionCorreoElectronico();
        NotificacionMensajeTexto mensaje = new NotificacionMensajeTexto();
        NotificacionPush push = new NotificacionPush();

        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido!!  ¿Que Notificacion desea enviar?\n\n"
                    + "1. Correo Electronico\n"
                    + "2. Mensaje Texto\n"
                    + "3. Push\n"
                    + "4. Salir"));

            switch (opcion) {
                case 1:
                    correo.ingresarInfoCorreoElectronico();
                    break;
                case 2:
                    mensaje.ingresarInfoMensajeTexto();
                    break;
                case 3:
                    push.ingresarInfoPush();
                    break;
                case 4:
                    bandera = false;
                    break;
                default:

            }
        }
    }

}
