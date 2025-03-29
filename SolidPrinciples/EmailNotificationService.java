package SolidPrinciples;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String email) {
    System.out.println("Email notificaiton sent to: " + email);
    }
}