package Lvl_2;

import java.util.HashSet;
import java.util.HashMap;

public class e6_empleados {
    public static void main(String[] args) {

        HashSet<Persona> empleados = new HashSet<>();

        empleados.add(new Persona("Gonzalo", "Martinez", 90122018, 40, 150));
        empleados.add(new Persona("Lucas", "Pratto", 12122122, 44, 301));
        empleados.add(new Persona("Juan Fernando", "Quintero", 33100333, 40, 250));

        HashMap<Integer, Integer> sueldoCalculado = new HashMap<>();

        for (Persona per : empleados) {
            sueldoCalculado.put(per.getDni(), (per.getHorasTrabajadas() * per.getValorPorHora()));
        }

        sueldoCalculado.forEach((k, v) -> System.out.println("DNI del Cliente: " + k + " sueldo correspondiente: " + v));
    }
}

class Persona {
    String nombre;
    String apellido;
    int dni;
    int horasTrabajadas;
    int valorPorHora;

    public Persona(String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public int getDni() {
        return dni;
    }
}
