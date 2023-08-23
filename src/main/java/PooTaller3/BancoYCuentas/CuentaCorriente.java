
package PooTaller3.BancoYCuentas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class CuentaCorriente extends InformacionCuenta{
    
    private int idCuenta;
    private String tipoCuenta;
    private List<CuentaAhorros> datosCuenta = new ArrayList<>();
    

    @Override
    public void cuentasBancarias() {
     CuentaAhorros corriente = new CuentaAhorros();
     corriente.setIdCuenta(1);
     corriente.setNumeroCuenta("12345678");
     corriente.setTipoCuenta("Corriente");
     corriente.setSaldoCuenta(23546789);
     corriente.setPassword("345vhvcxd");
     
     CuentaAhorros corriente2 = new CuentaAhorros();
     corriente2.setIdCuenta(2);
     corriente2.setNumeroCuenta("345678");
     corriente2.setTipoCuenta("Corriente");
     corriente2.setSaldoCuenta(456789);
     corriente2.setPassword("xzcvb654");
       
     CuentaAhorros corriente3 = new CuentaAhorros();
     corriente3.setIdCuenta(3);
     corriente3.setNumeroCuenta("12345678");
     corriente3.setTipoCuenta("Corriente");
     corriente3.setSaldoCuenta(4567890);
     corriente3.setPassword("vcx45vs");
     
     datosCuenta.add(corriente);
     datosCuenta.add(corriente2);
     datosCuenta.add(corriente3);
    }

    @Override
    public void depositarDinero() {
        boolean depositoExitoso = false;
       long valorDeposito =Long.parseLong(JOptionPane.showInputDialog("Ingrese el valor que desea depositar"));
       String cuentaDeposito = JOptionPane.showInputDialog("Ingrese numero de la cuenta donde desea depositar");
       
       for(int i = 0; i < datosCuenta.size(); i++){
       if(datosCuenta.get(i).getNumeroCuenta().equals(cuentaDeposito) && valorDeposito > 0){
       datosCuenta.get(i).setSaldoCuenta(valorDeposito + datosCuenta.get(i).getSaldoCuenta());
       depositoExitoso = true;
       JOptionPane.showMessageDialog(null, "Deposito realizado con exitoso su nuevo saldo es: " + 
               datosCuenta.get(i).getSaldoCuenta());
       break;
       }
       } if(!depositoExitoso){ 
       JOptionPane.showMessageDialog(null, "No fue posible realizar el deposito en la cuenta, verifique la informacion");
       }
       
       
    }

    @Override
    public void retirarDinero() {
        
       long valorRetirar =Long.parseLong(JOptionPane.showInputDialog("Ingrese el valor a Reitrar"));
     
     
       StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < datosCuenta.size(); i++) {
    
            mensaje.append(datosCuenta.get(i).getIdCuenta())
                    .append("  ")
                    .append(datosCuenta.get(i).getNumeroCuenta())
                    .append("\n");
        }
          int idCuentaDeposito =Integer.parseInt(JOptionPane.showInputDialog("Seleccione el id de la cuenta la cual desea retirar\n "
                  + mensaje.toString()));
          
           String contraseñaIngresada = JOptionPane.showInputDialog("Ingrese su Contraseña");
           
          if(validarRetiro(datosCuenta.get(idCuentaDeposito - 1).getPassword(), contraseñaIngresada,
                  datosCuenta.get(idCuentaDeposito - 1).getSaldoCuenta(), valorRetirar)){
          datosCuenta.get(idCuentaDeposito - 1).setSaldoCuenta(datosCuenta.get(idCuentaDeposito - 1)
                  .getSaldoCuenta() - valorRetirar);
                 JOptionPane.showMessageDialog(null, "Retiro Exitoso........\n\n\n\n"
                         + "Su nuevo saldo es de: " + datosCuenta.get(idCuentaDeposito - 1)
                  .getSaldoCuenta());
          }else{
          JOptionPane.showMessageDialog(null, "No se pudo realizar el retiro de dinero, verifique los datos ingresados");
          }
        
    }
    
    public void consultarSaldo(){
                StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < datosCuenta.size(); i++) {
    
            mensaje.append(datosCuenta.get(i).getIdCuenta())
                    .append("  ")
                    .append(datosCuenta.get(i).getNumeroCuenta())
                    .append("\n");
        }
                  int idCuenta =Integer.parseInt(JOptionPane.showInputDialog("Seleccione el id de la cuenta que desea Consultar el Saldo\n"
                  + mensaje.toString()));
                  
            informacionSaldo(datosCuenta.get(idCuenta - 1).getSaldoCuenta());
    }
    


    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public List<CuentaAhorros> getDatosCuenta() {
        return datosCuenta;
    }

    public void setDatosCuenta(List<CuentaAhorros> datosCuenta) {
        this.datosCuenta = datosCuenta;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    
}
