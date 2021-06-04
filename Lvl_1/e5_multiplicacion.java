package Lvl_1;

import java.util.Scanner;

public class e5_multiplicacion {

    public static void main(String[] args) {

        int aux = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer nro: ");
        int nro1 = scan.nextInt();
        System.out.println("Ingrese el segundo nro: ");
        int nro2 = scan.nextInt();
        scan.close();

        if (nro1 > nro2) {

            for (int i = aux; i < nro1; i++) {

                aux += nro2;
            }

        } else {

            aux = nro2; // 0->88
            nro2 = nro1; // 88->2
            nro1 = aux; // 2->88
            aux = 0;

            for (int i = aux; i < nro1; i++) {

                aux += nro2;
            }
        }
        
        System.out.println(nro2 + " x " + nro1 + " = " + aux);
    }

}
