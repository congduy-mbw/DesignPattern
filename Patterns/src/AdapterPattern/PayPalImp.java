package AdapterPattern;

public class PayPalImp implements PayPal {

	@Override
	public void payWithPayPal(float amount) {
		// TODO Auto-generated method stub
		System.out.println("Process payment paypal: " + amount);
	}

}
