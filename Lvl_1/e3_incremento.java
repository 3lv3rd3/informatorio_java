package Lvl_1;

import java.util.Scanner;

public class e3_incremento {

    public static void main(String[] args){

       
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un nro entero: ");
        int nro = scan.nextInt();
        scan.close();

        for (int i = 0; i <= nro+1 ; i ++){

            for (int j = 1; j < i ; j++){

                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
