public class AppNotificacion implements Notificacion{
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje de aplicación: " + mensaje);

    }
}
