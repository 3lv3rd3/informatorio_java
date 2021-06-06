package Lvl_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class e3_cartas {

    public static void main(String[] args) {

        List<Integer> cartas = new ArrayList<>();

        // Carga del ArrayList en orden
        for (int i = 0; i <= 10; i++) {

            cartas.add(i);
        }
        System.out.println("Cartas en orden: " + cartas);

        // Impresión del ArrayList en orden inverso
        Collections.reverse(cartas);
        System.out.println("Cartas en orden reverso: " + cartas);

        // Mezclar el ArrayList
        Collections.shuffle(cartas);
        System.out.println("Cartas mezcladas: " + cartas);

    }

}
