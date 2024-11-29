package Patrones;

class TareaManagerFacade {
    public Tarea crearTarea(TareaFactory factory, int id, String titulo, String descripcion, String fechaVencimiento, int prioridad) {
        return factory.crearTarea(id, titulo, descripcion, fechaVencimiento, prioridad);
    }

    public void eliminarTarea(Tarea tarea) {
        System.out.println("Tarea eliminada: " + tarea);
    }

    public void modificarTarea(Tarea tarea, String nuevoTitulo) {
        tarea.marcarCompleta();
        System.out.println("Tarea modificada: " + tarea);
    }
}