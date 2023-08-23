
package PooTaller3.InstrumentosMusicales;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leidy Giraldo
 */
public class TocarInstrumentos {
    private List<IInstrumentos> instrumentos = new ArrayList<>();
    IInstrumentos guitarra = new Guitarra();
    IInstrumentos piano = new Piano();
    IInstrumentos violin = new Violin();

    public void mostrarInformacion() {
        instrumentos.add(guitarra);
        instrumentos.add(piano);
        instrumentos.add(violin);

        boolean bandera = true;

        while (bandera) {

            int opcionesMenu = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("Por favor ingrese una opcion\n\n"
                    + "1. Tocar Instrumentos\n"
                    + "2. Salir")));

            switch (opcionesMenu) {

                case 1:
                    tocarInstrumento();
                    break;
                case 2:
                    bandera = false;
                    break;
                default:
            }
        }
    }
    
    public void tocarInstrumento(){
    
        for(IInstrumentos instrumento : instrumentos){
        
            instrumento.tocarInstrumento();
        }
    }
    
    
}
