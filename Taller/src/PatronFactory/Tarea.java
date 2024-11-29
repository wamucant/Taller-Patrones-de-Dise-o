package PatronFactory;
class Tarea {
    private int id;
    private String titulo;
    private String descripcion;
    private String fechaVencimiento;
    private int prioridad;
    private String estado;

    public Tarea(int id, String titulo, String descripcion, String fechaVencimiento, int prioridad, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public void marcarCompleta() {
        this.estado = "Completada";
    }

    @Override
    public String toString() {
        return "Tarea{" +
               "id=" + id +
               ", titulo='" + titulo + '\'' +
               ", estado='" + estado + '\'' +
               '}';
    }
}