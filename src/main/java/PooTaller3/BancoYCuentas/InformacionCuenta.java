
package PooTaller3.BancoYCuentas;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
abstract public class InformacionCuenta implements ISistemaBancario{
    
    private String numeroCuenta;
    private String password;
    private long saldoCuenta;

       public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String contrasenia) {
        this.password = contrasenia;
    }

    public long getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(long saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    public void informacionSaldo(Long saldoCuenta) {
        JOptionPane.showMessageDialog(null, "Su Saldo Actual es: " + saldoCuenta);
    }

    public boolean validarRetiro(String contraseniaCuenta, String contraseniaIngresada, long saldoCuenta
    ,long saldoIngresado) {

        return contraseniaCuenta.equals(contraseniaIngresada) && saldoCuenta >= saldoIngresado;
    }

 
}
