package Lvl_2;

import java.util.ArrayList;
import java.util.List;

public class e2_arreglo {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        numeros.add(0, 555);
        numeros.add(999);

        for (int i = 0; i < numeros.size(); i++) {

            System.out.println(numeros.get(i));
        }

        System.out.println("El tamaño inicial de la lista era: " + (numeros.size() - 2));
        System.out.println("El tamaño final de la lista es: " + numeros.size());
    }
}
