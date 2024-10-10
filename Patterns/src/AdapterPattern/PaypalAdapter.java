package AdapterPattern;

public class PaypalAdapter implements Payment{
	private final PayPal payPal;
	
	public PaypalAdapter(PayPal payPal) {
		this.payPal = payPal;
	}

	@Override
	public void processPayment(float amount) {
		this.payPal.payWithPayPal(amount);
	}
}
