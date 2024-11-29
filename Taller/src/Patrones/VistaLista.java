package Patrones;
import java.util.List;

class VistaLista implements VistaStrategy {
    @Override
    public void mostrarTareas(List<Tarea> tareas) {
        System.out.println("Mostrando tareas en formato lista:");
        tareas.forEach(System.out::println);
    }
}