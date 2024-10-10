package Notification_SMS_EMail_Bridge;

public abstract class Notification {
	protected NotificationSender notificationSender;
	
	public Notification(NotificationSender notificationSender) {
		this.notificationSender = notificationSender;
	}
	
	public abstract void sender();
}
