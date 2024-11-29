package Patrones;
import java.util.List;

class VistaCalendario implements VistaStrategy {
    @Override
    public void mostrarTareas(List<Tarea> tareas) {
        System.out.println("Mostrando tareas en formato calendario:");
        tareas.forEach(System.out::println); // Simplificado para ilustrar
    }
}