package BridgePattern;

public class DrawAPI1 implements DrawShape {

	@Override
	public void drawShape(int x, int y, int radius) {
		System.out.println("Vẽ theo cách 1 với: " + x + " - " + y + " - " + radius);
		
	}

}	
