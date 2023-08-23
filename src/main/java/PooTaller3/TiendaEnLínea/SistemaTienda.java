package PooTaller3.TiendaEnLínea;

import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class SistemaTienda {

    ProductoBelleza productoBelleza = new ProductoBelleza();
    ProductoJuguetes productoJuguetes = new ProductoJuguetes();
    ProductoTecnologia productoTecnologia = new ProductoTecnologia();

    public void mostrarInformacion() {
        productoBelleza.crearProducto();
        productoJuguetes.crearProducto();
        productoTecnologia.crearProducto();
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a nuestra tienda virtual\n"
                    + "Ingrese el numero de la categoria que desea consultar\n\n"
                    + "1. Belleza\n"
                    + "2. Juguetes\n"
                    + "3. Tecnologia\n"
                    + "4. Salir\n"));

            switch (opcion) {
                case 1:
                    menuBelleza(productoBelleza.mostrarInfo());
                    break;
                case 2:
                    menuJuguetes(productoJuguetes.mostrarInfo());
                    break;
                case 3:
                    menuTecnologia(productoTecnologia.mostrarInfo());
                    break;
                case 4:
                    bandera = false;
                    break;
                default:

            }
        }
    }

    public void menuBelleza(int idProducto) {
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la opcion que desea realizar\n\n"
                    + "1. Mostrar informacion del producto\n"
                    + "2. Consultar Precio del Producto\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    productoBelleza.mostrarDetalles(idProducto);
                    break;
                case 2:
                    productoJuguetes.calcularPrecio(idProducto);
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }

    public void menuJuguetes(int idProducto) {
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la opcion que desea realizar\n\n"
                    + "1. Mostrar informacion del producto\n"
                    + "2. Consultar Precio del Producto\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    productoBelleza.mostrarDetalles(idProducto);
                    break;
                case 2:
                    productoJuguetes.calcularPrecio(idProducto);
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }

    public void menuTecnologia(int idProducto) {
        boolean bandera = true;
        while (bandera) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la opcion que desea realizar\n\n"
                    + "1. Mostrar informacion del producto\n"
                    + "2. Consultar Precio del Producto\n"
                    + "3. Salir\n"));

            switch (opcion) {
                case 1:
                    productoTecnologia.mostrarDetalles(idProducto);
                    break;
                case 2:
                    productoTecnologia.calcularPrecio(idProducto);
                    break;
                case 3:
                    bandera = false;
                    break;
                default:

            }
        }
    }

}
