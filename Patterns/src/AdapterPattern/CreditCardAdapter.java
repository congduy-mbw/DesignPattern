package AdapterPattern;

public class CreditCardAdapter implements Payment {
	private final CreditCard creditCard;
	
	public CreditCardAdapter(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public void processPayment(float amount) {
		this.creditCard.payByCreditCard(amount);
	}
}
