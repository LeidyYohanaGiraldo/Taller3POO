package PooTaller3.BancoYCuentas;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class Banco {

    CuentaAhorros ahorros = new CuentaAhorros();
    CuentaCorriente corriente = new CuentaCorriente();

    public void mostrarInformacion() {
        ahorros.cuentasBancarias();
        corriente.cuentasBancarias();
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido! Ingrese el tipo De Cuenta que desea validar\n\n"
                    + "1. Ahorros\n"
                    + "2. Corriente\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    menuAhorros();
                    break;
                case 2:
                    menuCorriente();
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }

    public void menuAhorros() {
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea realizar?\n\n"
                    + "1. Consultar Saldo\n"
                    + "2. Depositar\n"
                    + "3. Retirar\n"
                    + "4. Salir"));

            switch (opcion) {
                case 1:
                    ahorros.consultarSaldo();
                    break;
                case 2:
                    ahorros.depositarDinero();
                    break;
                case 3:
                    ahorros.retirarDinero();
                case 4:
                    bandera = false;
                    break;
                default:

            }
        }
    }

    public void menuCorriente() {
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que desea realizar?\n\n"
                    + "1. Consultar Saldo\n"
                    + "2. Depositar\n"
                    + "3. Retirar\n"
                    + "4. Salir"));

            switch (opcion) {
                case 1:
                    corriente.consultarSaldo();
                    break;
                case 2:
                    corriente.depositarDinero();
                    break;
                case 3:
                    corriente.retirarDinero();
                case 4:
                    bandera = false;
                    break;
                default:

            }
        }
    }

}
