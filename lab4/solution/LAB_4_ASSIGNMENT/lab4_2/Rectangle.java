package lab4_2;

public class Rectangle extends ClosedCurve{
	private double width;
	private double length;
	@Override
	double computeArea() {
		return width*length;
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

}

