package Notification_SMS_EMail_Bridge;

public class UrgentNotification extends Notification {
	
	public UrgentNotification(NotificationSender notificationSender) {
		super(notificationSender);
	}

	@Override
	public void sender() {
		// TODO Auto-generated method stub
		this.notificationSender.sender("urgent");
	}
	
}
