package PatronFactory;
class TareaSimpleFactory implements TareaFactory {
    @Override
    public Tarea crearTarea(int id, String titulo, String descripcion, String fechaVencimiento, int prioridad) {
        return new Tarea(id, titulo, descripcion, fechaVencimiento, prioridad, "Pendiente");
    }
}