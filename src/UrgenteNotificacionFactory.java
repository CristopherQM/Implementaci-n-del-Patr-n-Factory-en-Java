public class UrgenteNotificacionFactory extends NotificacionFactory {
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion(); // Puede tener configuraciones específicas para urgentes
    }

    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion(); // Puede tener configuraciones específicas para urgentes
    }

    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion(); // Puede tener configuraciones específicas para urgentes
    }
}

