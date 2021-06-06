package Lvl_1;

import java.util.Scanner;

public class e9_contadorDeLetras {

    public static void main(String[] args) {

        int cont = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su frase: ");
        String frase = scan.nextLine();
        System.out.println("Ingrese la letra a detectar la cantidad de repeticiones: ");
        char letra = scan.next().charAt(0);
        scan.close();

        char[] arreglo = frase.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == letra) {
                cont = cont + 1;
            }
            
        }
        System.out.println(cont);
    }
    
}
