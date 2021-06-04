package Lvl_1;

import java.util.Scanner;

public class e4_factorial {

    public static void main(String[] args) {

        int fact = 1;
        int aux = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un nro entero: ");
        int nro = scan.nextInt();
        aux = nro;
        scan.close();

        while (nro != 0) {

            fact *= nro;
            nro--;
        }
        
        System.out.println("El factorial de " + aux + " es: " + fact);
    }
}
