package good.lab4_4;

public class Rectangle extends ClosedCurve implements Polygon{
	private double width;
	private double length;
	private static final int NUMBER_OF_SIDE=4;
	@Override
	double computeArea() {
		return width*length;
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	@Override
	public int getNumberofSide() {
		// TODO Auto-generated method stub
		return NUMBER_OF_SIDE;
	}
	@Override
	public double computerPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}

}
