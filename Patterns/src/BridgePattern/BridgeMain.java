package BridgePattern;

public class BridgeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle1 = new Circle(1, 1, 2, new DrawAPI1());
		circle1.draw();
		
		Shape circle2 = new Circle(2, 2, 3, new DrawAPI2());
		circle2.draw();
	}

}
