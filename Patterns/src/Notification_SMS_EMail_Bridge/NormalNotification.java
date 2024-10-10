package Notification_SMS_EMail_Bridge;

public class NormalNotification extends Notification {
	
	public NormalNotification(NotificationSender notification) {
		super(notification);
	}

	@Override
	public void sender() {
		// TODO Auto-generated method stub
		this.notificationSender.sender("normal");
	}

}
