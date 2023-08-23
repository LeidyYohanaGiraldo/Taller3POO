
package PooTaller3.TiendaEnLínea;

/**
 *
 * @author Leidy Giraldo
 */
abstract public class CategoriaTecnologia implements IProductos{
    
    private String nombreCategoria;
    private String tipoTecnologia;
    
    public  String agregarTipoTecnologia(String nombreProducto){
        return nombreProducto.toUpperCase().equals("COMPUTADORES") ? "Electrónica"
                :nombreProducto.toUpperCase().equals("ASISTENTE DE VOZ") ? "Dispositivos Inteligentes"
                :"otros";
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getTipoTecnologia() {
        return tipoTecnologia;
    }

    public void setTipoTecnologia(String tipoTecnologia) {
        this.tipoTecnologia = tipoTecnologia;
    }

    
    
    
}
