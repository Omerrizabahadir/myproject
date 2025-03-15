package design_patterns.factory_design_pattern_for_notification;

public class NotificationFactory {

    public static Notification getNotification(String type){
       if(type.equalsIgnoreCase("e-mail")){
          return new EmailNotification();
       }else if(type.equalsIgnoreCase("SMS")){
           return new SMSNotification();
       }
        return null;
    }
}
