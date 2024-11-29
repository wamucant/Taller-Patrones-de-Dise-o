package Patrones;

class EmailSeguidor implements Seguidor {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Notificación por correo: " + mensaje);
    }
}