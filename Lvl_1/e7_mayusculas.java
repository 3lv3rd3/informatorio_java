package Lvl_1;

import java.util.Scanner;

public class e7_mayusculas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cadena a convertir en maýusculas: ");
        String cadena = scan.nextLine();
        scan.close();

        for (int i = 0; i < cadena.length(); i++) {

            int convertir = cadena.charAt(i);

            if (convertir > 96 && convertir < 123) {
                convertir = convertir - 32;
                System.out.print((char) convertir);
            }

            if (convertir == 32) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
