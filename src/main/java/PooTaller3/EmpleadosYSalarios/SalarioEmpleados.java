
package PooTaller3.EmpleadosYSalarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class SalarioEmpleados {
    
   EmpleadoContratoLaboral empleadoContratoLaboral = new EmpleadoContratoLaboral();
    EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras();
    
    public void mostrarInformacion(){
        empleadoContratoLaboral.crearEmpleados();
        empleadoPorHoras.crearEmpleados();
        
           boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la accion que desea realizar\n\n"
                    + "1. Calcular salario empleados por hora\n"
                    + "2. Calcular salario de empleados por contrato\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    empleadoPorHoras.calcularSalario(empleadoPorHoras.listarEmpleados());
                    break;
                case 2:
                    empleadoContratoLaboral.calcularSalario(empleadoContratoLaboral.listarEmpleados());
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }    
}
