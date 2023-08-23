package PooTaller3.TiendaEnLínea;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class ProductoJuguetes extends CategoriaJuguetes {

    private int idProducto;
    private String nombreProducto;
    private String precioProducto;
    private List<ProductoJuguetes> listaProductoJuguetes = new ArrayList<>();

    public void crearProducto() {
        ProductoJuguetes productoJuguetes = new ProductoJuguetes();
        productoJuguetes.setIdProducto(1);
        productoJuguetes.setNombreCategoria("Juguetes");
        productoJuguetes.setNombreProducto("Perrito Camina Conmigo - Fisher Price");
        productoJuguetes.setPrecioProducto("$469.900");
        productoJuguetes.setEdadApropiada(true);

        ProductoJuguetes productoJuguetes2 = new ProductoJuguetes();
        productoJuguetes2.setIdProducto(2);
        productoJuguetes2.setNombreCategoria("Juguetes");
        productoJuguetes2.setNombreProducto("Juego De Mesa Monopoly - Monopoly");
        productoJuguetes2.setPrecioProducto("$ 89.900");
        productoJuguetes2.setEdadApropiada(false);

        ProductoJuguetes productoJuguetes3 = new ProductoJuguetes();
        productoJuguetes3.setIdProducto(3);
        productoJuguetes3.setNombreCategoria("Juguetes");
        productoJuguetes3.setNombreProducto("Teléfono Sonidos Divertidos - Fisher Price");
        productoJuguetes3.setPrecioProducto("$59.900");
        productoJuguetes3.setEdadApropiada(true);

        listaProductoJuguetes.add(productoJuguetes);
        listaProductoJuguetes.add(productoJuguetes2);
        listaProductoJuguetes.add(productoJuguetes3);

    }

    public int mostrarInfo() {
        StringBuilder mensaje = new StringBuilder();
        for (ProductoJuguetes producto : listaProductoJuguetes) {

            mensaje.append(producto.getIdProducto())
                    .append("  ")
                    .append(producto.getNombreProducto())
                    .append("\n");

        }
        return Integer.parseInt(JOptionPane.showInputDialog("Estos son los productos vinculados a la categoria que seleccionaste, ingresa"
                + "el id del producto que desees Gestionar:\n\n\n" + mensaje.toString()));
    }

    @Override
    public void calcularPrecio(int idProducto) {
        for (int i = 0; i < listaProductoJuguetes.size(); i++) {

        }
        JOptionPane.showMessageDialog(null, "El precio del " + listaProductoJuguetes.get(idProducto - 1)
                .getNombreProducto() + " Es de: " + listaProductoJuguetes.get(idProducto - 1).getPrecioProducto());
    }

    @Override
    public void mostrarDetalles(int idProducto) {
        StringBuilder mensaje = new StringBuilder();

        mensaje.append(listaProductoJuguetes.get(idProducto - 1).getIdProducto())
                .append("  ")
                .append(listaProductoJuguetes.get(idProducto - 1).getNombreProducto())
                .append("  ")
                .append("Pertenece a la categoria" + listaProductoJuguetes.get(idProducto - 1).getNombreCategoria())
                .append("  ")
                .append(informacionAdicional(listaProductoJuguetes.get(idProducto - 1).isEdadApropiada()))
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

    public List<ProductoJuguetes> get() {
        return listaProductoJuguetes;
    }

    public void set(List<ProductoJuguetes> listaProductoJuguetes) {
        this.listaProductoJuguetes = listaProductoJuguetes;
    }

}
