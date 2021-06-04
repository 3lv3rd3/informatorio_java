package Lvl_1;

import java.util.Scanner;

public class e6_potencia {

    public static void main(String[] args) {

        int res = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nro de la base de la potencia: ");
        int base = scan.nextInt();
        System.out.println("Ingrese el nro del exponente de la potencia: ");
        int exp = scan.nextInt();
        scan.close();

        for (int i = 1; i <= exp; i++) {

            res *= base;
        }
        
        System.out.println(base + " elevado a " + exp + " = " + res);

    }

}
