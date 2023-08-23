package PooTaller3.MenuTaller3;

import PooTaller3.AnimalesYSonidos.ObtenerAnimal;
import PooTaller3.BancoYCuentas.Banco;
import PooTaller3.EmpleadosYSalarios.SalarioEmpleados;
import PooTaller3.FigurasEnUnLienzo.Lienzo;
import PooTaller3.FigurasGeometricas.CalcularFigura;
import PooTaller3.FormasGeometricasYAreas.CalcularAreaFigura;
import PooTaller3.InstrumentosMusicales.TocarInstrumentos;
import PooTaller3.JuegoDeCartas.Juego;
import PooTaller3.SistemaNotificaciones.EnvioNotificacion;
import PooTaller3.TiendaEnLínea.SistemaTienda;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class SeleccionEjerciciosTaller {

    CalcularFigura calcularFigura = new CalcularFigura();
    EnvioNotificacion envioNotificacion = new EnvioNotificacion();
    Banco banco = new Banco();
    Juego juego = new Juego();
    SistemaTienda sistemaTienda = new SistemaTienda();
    ObtenerAnimal obtenerAnimal = new ObtenerAnimal();
    CalcularAreaFigura calcularAreaFigura = new CalcularAreaFigura();
    SalarioEmpleados salarioEmpleados = new SalarioEmpleados();
    TocarInstrumentos tocarInstrumentos = new TocarInstrumentos();
    Lienzo lienzo = new Lienzo();

    
    
    public void mostrarOpcionEjercicios() {
    boolean bandera = true;
    
    while (bandera) {
        String[] opciones = {
            "1. Figuras geométricas ",
            "2. Sistema de notificaciones",
            "3. Banco y cuentas",
            "4. Juego de cartas",
            "5. Tienda en línea",
            "6. Animales y sonidos",
            "7. Formas geométricas y áreas",
            "8. Empleados y salarios ",
            "9. Instrumentos musicales",
            "10. Figuras en un lienzo",
            "11. Salir"
        };
        
        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción", "Menú", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        
        if (seleccion == null || seleccion.equals("11. Salir")) {
            bandera = false;
        } else {
            int opcion = Integer.parseInt(seleccion.toString().split("\\.")[0]);
            switch (opcion) {
                case 1:
                     calcularFigura.obtenerFigura();
                    break;
                case 2:
                    envioNotificacion.mostrarInformacion();
                    break;
                case 3:
                    banco.mostrarInformacion();
                    break;
                case 4:
                      juego.iniciarJuego();
                    break;
                case 5:
                    sistemaTienda.mostrarInformacion();
                    break;
                case 6:
                     obtenerAnimal.obtenerTipoAnimal();
                    break;
                case 7:
                    calcularAreaFigura.obtenerFigura();
                    break;
                case 8:
                    salarioEmpleados.mostrarInformacion();
                    break;
                case 9:
                    tocarInstrumentos.mostrarInformacion();
                    break;
                case 10:
                    lienzo.obtenerFigura();
                    break;
                default:
            }
        }
    }
}

}
