
package PooTaller3.EmpleadosYSalarios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class EmpleadoContratoLaboral extends Empleado {
 
private String  tipoContrato = "Asalariado"; 
private double salarioMes = 1620000;
private List<EmpleadoContratoLaboral> empleadoContratoLaboral = new ArrayList<>();
    
    @Override
    public void calcularSalario(StringBuilder mensaje) {
     int id = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Ingrese el id del empleado para calcular el salario \n\n "
             + mensaje.toString())));
        
     int diasTrabajados = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Ingrese "
             + "la cantidad de dias trabajados")));
     
     empleadoContratoLaboral.get(id-1).setValorSalario((salarioMes/30) * diasTrabajados);
     
     JOptionPane.showMessageDialog(null, "El salario del empleado " + empleadoContratoLaboral.get(id-1)
             .getNombreEmpleado() + " es de:" + empleadoContratoLaboral.get(id-1).getValorSalario());
     
     
     
    }
    
    public StringBuilder listarEmpleados(){
    StringBuilder mensaje = new StringBuilder();
    
    for(EmpleadoContratoLaboral empleado : empleadoContratoLaboral){
                    mensaje.append(empleado.getId())
                    .append("  ")
                    .append(empleado.getNombreEmpleado())
                    .append("  ")
                    .append(empleado.getCedula())
                    .append("  ")
                    .append(empleado.getTipoContrato())
                    .append("  ")
                    .append("\n");
    }
    return mensaje;
    }
    
    public void crearEmpleados(){
        int contador = 1;
        EmpleadoContratoLaboral empleado = new EmpleadoContratoLaboral();
        empleado.setId(contador++);
        empleado.setNombreEmpleado("Yessenia Rios");
        empleado.setCedula("65437432");
        empleado.setTipoContrato("Indefinido");
        
        EmpleadoContratoLaboral empleado2 = new EmpleadoContratoLaboral();
        empleado2.setId(contador++);
        empleado2.setNombreEmpleado("Katherine Usma");
        empleado2.setCedula("65300023");
        empleado2.setTipoContrato("Término fijo");
        
        EmpleadoContratoLaboral empleado3 = new EmpleadoContratoLaboral();
        empleado3.setId(contador++);
        empleado3.setNombreEmpleado("Luis Navarro");
        empleado3.setCedula("98762843");
        empleado3.setTipoContrato("Indefinido");
        
        empleadoContratoLaboral.add(empleado);
        empleadoContratoLaboral.add(empleado2);
        empleadoContratoLaboral.add(empleado3);
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }

    public List<EmpleadoContratoLaboral> getEmpleadoContratoLaboral() {
        return empleadoContratoLaboral;
    }

    public void setEmpleadoContratoLaboral(List<EmpleadoContratoLaboral> empleadoContratoLaboral) {
        this.empleadoContratoLaboral = empleadoContratoLaboral;
    }
}
