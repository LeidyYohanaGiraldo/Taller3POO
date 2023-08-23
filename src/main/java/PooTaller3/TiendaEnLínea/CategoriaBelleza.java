package PooTaller3.TiendaEnLínea;

/**
 *
 * @author Leidy Giraldo
 */
abstract public class CategoriaBelleza implements IProductos {

    private String nombreCategoria;
    private boolean resistenteAgua;

    public String informacionAdicional(boolean resistenteAgua) {
        return resistenteAgua ? "El producto es a prueba de agua"
                : "El producto no es a prueba de agua";
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public boolean isResistenteAgua() {
        return resistenteAgua;
    }

    public void setResistenteAgua(boolean resistenteAgua) {
        this.resistenteAgua = resistenteAgua;
    }

}
