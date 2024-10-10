package BridgePattern;

public class DrawAPI2 implements DrawShape {

	@Override
	public void drawShape(int x, int y, int radius) {
		// TODO Auto-generated method stub
		System.out.println("Vẽ hình theo cách 2: " + x + " - " + y + " - " + radius);
	}

}
