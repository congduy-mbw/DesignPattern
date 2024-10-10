package BridgePattern;

public class Circle extends Shape {
	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawShape draw) {
		super(draw);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawShape.drawShape(this.x, this.y, this.radius);
	}
	
}
