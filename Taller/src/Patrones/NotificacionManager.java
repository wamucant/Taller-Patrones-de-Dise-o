package Patrones;
import java.util.List;
import java.util.ArrayList;

class NotificacionManager {
    private List<Seguidor> seguidores = new ArrayList<>();

    public void agregarSeguidor(Seguidor seguidor) {
        seguidores.add(seguidor);
    }

    public void eliminarSeguidor(Seguidor seguidor) {
        seguidores.remove(seguidor);
    }

    public void notificarObservadores(String mensaje) {
        for (Seguidor seguidor : seguidores) {
            seguidor.enviarMensaje(mensaje);
        }
    }
}