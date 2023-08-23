package PooTaller3.TiendaEnLínea;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class ProductoTecnologia extends CategoriaTecnologia {

    private int idProducto;
    private String nombreProducto;
    private String precioProducto;
    private List<ProductoTecnologia> listaProductoTecnologia = new ArrayList<>();

    public void crearProducto() {
    ProductoTecnologia productoTecnologia = new ProductoTecnologia();
    productoTecnologia.setIdProducto(1);
    productoTecnologia.setNombreCategoria("Electronica");
    productoTecnologia.setNombreProducto("Portatil Asus 597");
    productoTecnologia.setPrecioProducto("$2.035.000");
    productoTecnologia.setTipoTecnologia(agregarTipoTecnologia(productoTecnologia.getNombreProducto()));

    ProductoTecnologia productoTecnologia1 = new ProductoTecnologia();
    productoTecnologia1.setIdProducto(2);
    productoTecnologia1.setNombreCategoria("Dispositivos Inteligentes");
    productoTecnologia1.setNombreProducto("Hubitat Elevation - Compatible con Alexa,");
    productoTecnologia1.setPrecioProducto("$1.236.000");
    productoTecnologia1.setTipoTecnologia(agregarTipoTecnologia(productoTecnologia1.getNombreProducto()));

    ProductoTecnologia productoTecnologia2 = new ProductoTecnologia();
    productoTecnologia2.setIdProducto(3);
    productoTecnologia2.setNombreCategoria("Dispositivos Inteligentes");
    productoTecnologia2.setNombreProducto("Altavoz inteligente con audio 3D y Alexa");
    productoTecnologia2.setPrecioProducto("$1.452.000");
    productoTecnologia2.setTipoTecnologia(agregarTipoTecnologia(productoTecnologia2.getNombreProducto()));

    listaProductoTecnologia.add(productoTecnologia1);
    listaProductoTecnologia.add(productoTecnologia);
    listaProductoTecnologia.add(productoTecnologia2);

}

public int mostrarInfo() {
    StringBuilder mensaje = new StringBuilder();
    for (ProductoTecnologia producto : listaProductoTecnologia) {

        mensaje.append(producto.getIdProducto())
                .append("  ")
                .append(producto.getNombreProducto())
                .append("\n");

    }
    return Integer.parseInt(JOptionPane.showInputDialog("Estos son los productos vinculados a la categoria que seleccionaste"
            + "ingresa el id del producto que desea validar:\n\n\n" + mensaje.toString()));
}

@Override
public void calcularPrecio(int idProducto) {
    for (int i = 0; i < listaProductoTecnologia.size(); i++) {

    }
    JOptionPane.showMessageDialog(null, "El precio del " + listaProductoTecnologia.get(idProducto - 1)
            .getNombreProducto() + " es de: " + listaProductoTecnologia.get(idProducto - 1).getPrecioProducto());
}

@Override
public void mostrarDetalles(int idProducto) {
    StringBuilder mensaje = new StringBuilder();
    mensaje.append(listaProductoTecnologia.get(idProducto - 1).getIdProducto())
            .append("  ")
            .append(listaProductoTecnologia.get(idProducto - 1).getNombreProducto())
            .append("  ")
            .append("Pertenece a la categoria: " + listaProductoTecnologia.get(idProducto - 1).getNombreCategoria())
            .append("  ")
            .append("  con tecnologia: " + listaProductoTecnologia.get(idProducto - 1).getTipoTecnologia())
            .append("\n");

    JOptionPane.showMessageDialog(null, mensaje);
}

public int getIdProducto() {
    return idProducto;
}

public void setIdProducto(int idProducto) {
    this.idProducto = idProducto;
}

public String getNombreProducto() {
    return nombreProducto;
}

public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
}

public String getPrecioProducto() {
    return precioProducto;
}

public void setPrecioProducto(String precioProducto) {
    this.precioProducto = precioProducto;
}

public List<ProductoTecnologia> getListaProductoTecnologia() {
    return listaProductoTecnologia;
}

public void setListaProductoTecnologia(List<ProductoTecnologia> listaProductoTecnologia) {
    this.listaProductoTecnologia = listaProductoTecnologia;
    }
}