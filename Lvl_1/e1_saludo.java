package Lvl_1;

import java.util.Scanner;


public class e1_saludo {

    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el nombre de usuario: ");
    String usu = scan.nextLine();
    System.out.println("HOLA " + usu);
    scan.close();
    
    }
}
