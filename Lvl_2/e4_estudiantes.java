package Lvl_2;

import java.util.ArrayList;
import java.util.List;

public class e4_estudiantes {

    public static void main(String[] args) throws Exception {

        try {
            List<String> estudiantes = new ArrayList<>();

            estudiantes.add("Carlos");
            estudiantes.add("Ramiro");
            estudiantes.add("Lucia");
            estudiantes.add("Luz");
            estudiantes.add("Victoria");
            estudiantes.add("Rodrigo");
            estudiantes.add("Ana Paula");
            estudiantes.add("Luis");
            estudiantes.add("Jose");
            estudiantes.add("Gabriel");
            estudiantes.add("Micaela");
            estudiantes.add("Diego");
            System.out.println("Lista de Alumnos de todos los cursos: " + estudiantes);

            List<String> subCurso = estudiantes.subList(1, 4);
            List<String> subCurso2 = estudiantes.subList(4, 8);
            List<String> subCurso3 = estudiantes.subList(8, 10);

            System.out.println("Curso 1: " + subCurso);
            System.out.println("Curso 2: " + subCurso2);
            System.out.println("Curso 3: " + subCurso3);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error, al ingresar un indice fuera de lo establecido inicialmente: " + e);
        }

        catch (IllegalArgumentException e) {
            System.out.println("Error, al ingresar el primer indice mayor que el segundo: " + e);
        }
    }
}
