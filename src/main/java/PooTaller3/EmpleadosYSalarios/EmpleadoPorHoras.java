
package PooTaller3.EmpleadosYSalarios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class EmpleadoPorHoras extends Empleado{
    private String  tipoContrato = "Tiempo parcial"; 
private double valorHora = 6500;
private List<EmpleadoPorHoras> empleadosPorHoras = new ArrayList<>();
    
    @Override
    public void calcularSalario(StringBuilder mensaje) {
     int id = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Ingrese id del empleado "
             + "para calcular el salario \n\n "
             + mensaje.toString())));
        
     int horasTrabajadas = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad" 
             + "horas laboradas")));
     
     empleadosPorHoras.get(id-1).setValorSalario(valorHora * horasTrabajadas);
     
     JOptionPane.showMessageDialog(null, "El salario del empleado " + empleadosPorHoras.get(id-1)
             .getNombreEmpleado() + " es de:" + empleadosPorHoras.get(id-1).getValorSalario());
     
     
     
    }
    
    public StringBuilder listarEmpleados(){
    StringBuilder mensaje = new StringBuilder();
    
    for(EmpleadoPorHoras empleado : empleadosPorHoras){
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
        EmpleadoPorHoras empleado = new EmpleadoPorHoras();
        empleado.setId(contador++);
        empleado.setNombreEmpleado("Yuliana Rodriguez");
        empleado.setCedula("23145675");
        empleado.setTipoContrato("Tiempo parcial");
        
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras();
        empleado2.setId(contador++);
        empleado2.setNombreEmpleado("Pedro Reyes");
        empleado2.setCedula("16034867");
        empleado2.setTipoContrato("Tiempo parcial");
        
        EmpleadoPorHoras empleado3 = new EmpleadoPorHoras();
        empleado3.setId(contador++);
        empleado3.setNombreEmpleado("Rafael Orozco");
        empleado3.setCedula("24642369");
        empleado3.setTipoContrato("Tiempo parcial");
        
        empleadosPorHoras.add(empleado);
        empleadosPorHoras.add(empleado2);
        empleadosPorHoras.add(empleado3);
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public List<EmpleadoPorHoras> getEmpleadosPorHoras() {
        return empleadosPorHoras;
    }

    public void setEmpleadosPorHoras(List<EmpleadoPorHoras> empleadosPorHoras) {
        this.empleadosPorHoras = empleadosPorHoras;
    }
    
    
}
