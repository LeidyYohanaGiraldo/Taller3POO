
package PooTaller3.TiendaEnLínea;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class ProductoBelleza extends CategoriaBelleza{
    
    private int idProducto;
    private String nombreProducto;
    private String precioProducto;
    private List<ProductoBelleza> listaProductoBelleza = new ArrayList<>();

    public void crearProducto() {
        ProductoBelleza productoBelleza = new ProductoBelleza();
        productoBelleza.setIdProducto(1);
        productoBelleza.setNombreCategoria("Belleza - Maquillaje");
        productoBelleza.setNombreProducto("Base Líquida Larga Duración 35 ml");
        productoBelleza.setPrecioProducto("$32.550");
        productoBelleza.setResistenteAgua(true);
        listaProductoBelleza.add(productoBelleza);

        ProductoBelleza productoBelleza1 = new ProductoBelleza();
        productoBelleza1.setIdProducto(2);
        productoBelleza1.setNombreCategoria("Belleza - Cuidado personal");
        productoBelleza1.setNombreProducto("Protector Solar Sunpro Continuos Hidrat Diario SPF 110 - 180 ml");
        productoBelleza1.setPrecioProducto("$38.340");
        productoBelleza1.setResistenteAgua(true);
        listaProductoBelleza.add(productoBelleza1);

        ProductoBelleza productoBelleza2 = new ProductoBelleza();
        productoBelleza2.setIdProducto(3);
        productoBelleza2.setNombreCategoria("Belleza - Maquillaje");
        productoBelleza2.setNombreProducto("Polvo Micropulverizado con Arroz Vitú 11 gr");
        productoBelleza2.setPrecioProducto("$13.550");
        productoBelleza2.setResistenteAgua(true);
        listaProductoBelleza.add(productoBelleza2);

    }

    public int mostrarInfo() {
        StringBuilder mensaje = new StringBuilder();
        for (ProductoBelleza producto : listaProductoBelleza) {

            mensaje.append(producto.getIdProducto())
                    .append("  ")
                    .append(producto.getNombreProducto())
                    .append("\n");

        }

        return Integer.parseInt(JOptionPane.showInputDialog("Estos son los productos vinculados a la categoria que seleccionaste,"
                + "ingresa el id del producto que desea validar:\n\n\n" + mensaje.toString()));
    }

    @Override
    public void calcularPrecio(int idProducto) {
        for (int i = 0; i < listaProductoBelleza.size(); i++) {

  
        }          JOptionPane.showMessageDialog(null, "El precio del " + listaProductoBelleza.get(idProducto - 1)
                    .getNombreProducto() + " es de: " + listaProductoBelleza.get(idProducto - 1).getPrecioProducto());

    }

    @Override
    public void mostrarDetalles(int idProducto) {
        StringBuilder mensaje = new StringBuilder();
 

            mensaje.append(listaProductoBelleza.get(idProducto-1).getIdProducto())
                    .append("  ")
                    .append(listaProductoBelleza.get(idProducto-1).getNombreProducto())
                    .append("  ")
                    .append("Pertenece a la categoria" + listaProductoBelleza.get(idProducto-1).getNombreCategoria())
                    .append("  ")
                    .append(informacionAdicional(listaProductoBelleza.get(idProducto-1).isResistenteAgua()))
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
    public List<ProductoBelleza> getListaProductoBelleza() {
        return listaProductoBelleza;
    }

    public void setListaProductoBelleza(List<ProductoBelleza> listaProductoBelleza) {
        this.listaProductoBelleza = listaProductoBelleza;
    }
    
}
