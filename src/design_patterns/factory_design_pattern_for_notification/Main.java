package design_patterns.factory_design_pattern_for_notification;

public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.getNotification("SMS");
        notification.notifyUser();
    }
}
