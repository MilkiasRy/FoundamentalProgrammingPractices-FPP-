package lab4_5;

public class Rectangle implements Polygon{
	private double width;
	private double length;
	private static final int NUMBER_OF_SIDE=4;
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public double[] getArrayofSide() {
		// TODO Auto-generated method stub
		double[] sides= {width,length,width,length};
		return sides;
	}
	

}
