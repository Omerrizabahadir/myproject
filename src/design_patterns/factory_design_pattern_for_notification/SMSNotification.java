package design_patterns.factory_design_pattern_for_notification;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("SMS gönderildi!");
    }
}
