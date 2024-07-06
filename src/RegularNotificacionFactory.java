public class RegularNotificacionFactory extends NotificacionFactory {
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion(); // Configuraciones estándar para regulares
    }

    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion(); // Configuraciones estándar para regulares
    }

    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion(); // Configuraciones estándar para regulares
    }
}

