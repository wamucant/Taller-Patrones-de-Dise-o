package Patrones;
import java.util.List;

class VistaTablero implements VistaStrategy {
    @Override
    public void mostrarTareas(List<Tarea> tareas) {
        System.out.println("Mostrando tareas en formato tablero:");
        tareas.forEach(System.out::println); // Simplificado para ilustrar
    }
}