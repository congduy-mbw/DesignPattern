package Notification_SMS_EMail_Bridge;

public class NotificationSMSEmailMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notification notificationNormal = new NormalNotification(new EmailNotificationSender());
		notificationNormal.sender();
		
		Notification notificationUrgent = new UrgentNotification(new SMSNotificationSender());
		notificationUrgent.sender();
	}

}
