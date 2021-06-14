import model.Empleado;
import service.ServicioReader;
import service.ServicioReaderImp;
import util.OrdenamientoUtil;

import java.io.IOException;

import java.util.List;


public class App {
    public static void main(String[] args) throws IOException {

        ServicioReader serviceReader = new ServicioReaderImp();
        OrdenamientoUtil ordenamientoUtil = new OrdenamientoUtil();
        List<Empleado> empleados = serviceReader.obtenerTodos();
        List<Empleado> encontrados = ordenamientoUtil.buscarPorLetra(empleados, 'k');

        if (encontrados.isEmpty()) {

            System.out.println("No se encontro empleados con esa letra.");

        } else {
            System.out.println("Los Empleado son: ");
            encontrados.stream().forEach(empleado -> System.out.println(empleado.getNombreCompleto()));
        }
        System.out.println("Empleado más joven: " + ordenamientoUtil.masJoven(empleados).getNombreCompleto());
        System.out.println("Empleado más viejo: " + ordenamientoUtil.masViejo(empleados).getNombreCompleto());
        System.out.println("Empleado mejor pago: " + ordenamientoUtil.mejorPagado(empleados).getNombreCompleto());
        System.out.println("Empleado peor pago: " + OrdenamientoUtil.peorPagado(empleados).getNombreCompleto());
        System.out.println("Ordenados alfabetico: ");
        OrdenamientoUtil.ordenarAlfabetico(empleados).stream().forEach(empleado -> System.out.println(empleado.getNombreCompleto()));
    }
}
