package Lvl_2;

import java.util.ArrayList;
import java.util.List;

public class e1_ciudades {
    public static void main(String[] args) {

        List<String> ciudades = new ArrayList<>();
        ciudades.add("Villa Carlos Paz");
        ciudades.add("Rosario");
        ciudades.add("Resistencia");
        ciudades.add("Corrientes");
        ciudades.add("Mendoza");

        for (int i = 0; i < ciudades.size(); i++) {

            System.out.println("# " + i + " - " + ciudades.get(i));

        }
    }
}
