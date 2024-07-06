public class Main {
    public static void main(String[] args) {

        // Usando Factory Method
        NotificacionFactory factory = new NotificacionFactory();

        // Crear una instancia de EmailNotificacion usando Factory Method
        Notificacion emailNotificacion = factory.crearNotificacion("email");
        emailNotificacion.enviarMensaje("Este es un email de prueba.");

        // Crear una instancia de SMSNotificacion usando Factory Method
        Notificacion smsNotificacion = factory.crearNotificacion("sms");
        smsNotificacion.enviarMensaje("Este es un SMS de prueba.");

        // Crear una instancia de AppNotificacion usando Factory Method
        Notificacion appNotificacion = factory.crearNotificacion("app");
        appNotificacion.enviarMensaje("Este es un mensaje de aplicación de prueba.");

        // Usando Abstract Factory para notificaciones urgentes
        UrgenteNotificacionFactory urgentFactory = new UrgenteNotificacionFactory();

        // Crear instancias de EmailNotificacion, SMSNotificacion y AppNotificacion para notificaciones urgentes
        EmailNotificacion emailUrgente = urgentFactory.crearEmailNotificacion();
        SMSNotificacion smsUrgente = urgentFactory.crearSMSNotificacion();
        AppNotificacion appUrgente = urgentFactory.crearAppNotificacion();

        emailUrgente.enviarMensaje("Este es un email urgente.");
        smsUrgente.enviarMensaje("Este es un SMS urgente.");
        appUrgente.enviarMensaje("Este es un mensaje de aplicación urgente.");

        // Usando Abstract Factory para notificaciones regulares
        RegularNotificacionFactory regularFactory = new RegularNotificacionFactory();

        // Crear instancias de EmailNotificacion, SMSNotificacion y AppNotificacion para notificaciones regulares
        EmailNotificacion emailRegular = regularFactory.crearEmailNotificacion();
        SMSNotificacion smsRegular = regularFactory.crearSMSNotificacion();
        AppNotificacion appRegular = regularFactory.crearAppNotificacion();

        emailRegular.enviarMensaje("Este es un email regular.");
        smsRegular.enviarMensaje("Este es un SMS regular.");
        appRegular.enviarMensaje("Este es un mensaje de aplicación regular.");
    }
}
