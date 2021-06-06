package Lvl_1;

import java.util.Scanner;

public class e8_datosPersales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = scan.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(scan.nextLine());

        System.out.print("Ingrese su dirección: ");
        String dir = scan.nextLine();

        System.out.print("Ingrese su ciudad: ");
        String ciudad = scan.nextLine();

        Persona Persona = new Persona(nombre, edad, dir, ciudad);
        System.out.println(Persona);
        scan.close();
        
    }
}

class Persona {
    String nombre;
    int edad;
    String dir;
    String ciudad;

    public Persona(String nombre, int edad, String dir, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.dir = dir;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        
        return(ciudad + " - " + dir + " - "+ edad +" - " + nombre);
    }
}
