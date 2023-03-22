import java.util.*;
public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operation: ");
        channel=sc.nextLine();
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
