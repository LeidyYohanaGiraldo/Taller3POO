
package PooTaller3.TiendaEnLínea;

/**
 *
 * @author Leidy Giraldo
 */
abstract public class CategoriaJuguetes implements IProductos{
    
   private String nombreCategoria;
    private boolean edadApropiada;

    public String informacionAdicional(boolean edadApropiada) {
        return edadApropiada ? "ESte juguete es apto para niños desde los 0 años de vida"
                : "ESte juguete es apto para niños mayores de 6 años";
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public boolean isEdadApropiada() {
        return edadApropiada;
    }
    public void setEdadApropiada(boolean edadApropiada) {
        this.edadApropiada = edadApropiada;
    }
    
}
