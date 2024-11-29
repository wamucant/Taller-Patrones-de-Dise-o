package Patrones;

class MensajeSeguidor implements Seguidor {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Notificación por mensaje: " + mensaje);
    }
}