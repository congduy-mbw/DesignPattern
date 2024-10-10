package Notification_SMS_EMail_Bridge;

public class EmailNotificationSender implements NotificationSender {

	@Override
	public void sender(String typeNotification) {
		// TODO Auto-generated method stub
		System.out.println("Notification sender by email with " + typeNotification);
	}

}
