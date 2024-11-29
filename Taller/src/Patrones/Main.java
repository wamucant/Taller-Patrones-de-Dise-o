package Patrones;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Factory
        TareaFactory factory = new TareaSimpleFactory();
        Tarea tarea1 = factory.crearTarea(1, "Comprar materiales", "Ir al mercado", "28/11/2024", 3);

        TareaManagerFacade tareaManager = new TareaManagerFacade();
        tareaManager.crearTarea(factory, 2, "Planear viaje", "Reservar vuelos", "28/11/2024", 1);

        // Observer
        NotificacionManager notificaciones = new NotificacionManager();
        notificaciones.agregarSeguidor(new EmailSeguidor());
        notificaciones.agregarSeguidor(new MensajeSeguidor());

        notificaciones.notificarObservadores("Nueva tarea añadida: " + tarea1);

        // Strategy
        Visualizador visualizador = new Visualizador();
        visualizador.cambiarVista(new VistaLista());
        visualizador.mostrarTareas(Arrays.asList(tarea1));
    }
}