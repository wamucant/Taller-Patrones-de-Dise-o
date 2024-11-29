package Patrones;
import java.util.List;

class Visualizador {
    private VistaStrategy estrategia;

    public void cambiarVista(VistaStrategy nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
    }

    public void mostrarTareas(List<Tarea> tareas) {
        if (estrategia != null) {
            estrategia.mostrarTareas(tareas);
        } else {
            System.out.println("No hay estrategia definida.");
        }
    }
}