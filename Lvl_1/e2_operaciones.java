package Lvl_1;


import java.util.Scanner;

public class e2_operaciones {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer nro entero a operar: ");
        int nro1 = scan.nextInt();
        System.out.println("Ingrese el segundo nro entero a operar: ");
        int nro2 = scan.nextInt();
        scan.close();

        System.out.println(nro1 + " + " + nro2 + " = " + (nro1 + nro2));
        System.out.println(nro1 + " - " + nro2 + " = " + (nro1 - nro2));
        System.out.println(nro1 + " * " + nro2 + " = " + (nro1 * nro2));
        System.out.println(nro1 + " / " + nro2 + " = " + (nro1 / nro2));
        System.out.println(nro1 + " % " + nro2 + " = " + (nro1 % nro2));
        
    }
    
}
