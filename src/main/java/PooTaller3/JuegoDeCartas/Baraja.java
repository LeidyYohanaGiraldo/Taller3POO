package PooTaller3.JuegoDeCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Leidy Giraldo
 */
public class Baraja {

    private List<ICarta> cartas;
    private Random random;

    public Baraja() {
        cartas = new ArrayList<>();
        random = new Random();

        for (int i = 1; i <= 12; i++) {
            cartas.add(new Copas(i,"Copas"));
            cartas.add(new Oros(i,"Oros"));
            cartas.add(new Espadas(i, "Espadas"));
            cartas.add(new Bastos(i,"Bastos"));
        }
    }

    public void mezclarBaraja() {
        for (int i = cartas.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            ICarta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }
    public ICarta tomarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }
}
