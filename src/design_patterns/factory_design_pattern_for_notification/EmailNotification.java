package design_patterns.factory_design_pattern_for_notification;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("E-posta gönderildi!");
    }
}
