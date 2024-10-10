package Notification_SMS_EMail_Bridge;

public class SMSNotificationSender implements NotificationSender {

	@Override
	public void sender(String typeNotification) {
		// TODO Auto-generated method stub
		System.out.println("Sender notification by sms with " + typeNotification);
	}

}
