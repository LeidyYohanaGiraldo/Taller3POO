
package PooTaller3.EmpleadosYSalarios;

/**
 *
 * @author Leidy Giraldo
 */
abstract public class Empleado {
    private int id;
    private String nombreEmpleado;
    private String cedula;
    private double valorSalario;
    
    
   public abstract void calcularSalario(StringBuilder mensaje);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }
    
}
