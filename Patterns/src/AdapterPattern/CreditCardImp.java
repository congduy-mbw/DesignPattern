package AdapterPattern;

public class CreditCardImp implements CreditCard {

	@Override
	public void payByCreditCard(float number) {
		// TODO Auto-generated method stub
		System.out.println("Process payment credit card: " + number);
	}

}
