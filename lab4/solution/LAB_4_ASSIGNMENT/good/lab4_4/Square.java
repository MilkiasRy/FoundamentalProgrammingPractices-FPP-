package good.lab4_4;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	private static final int NUMBER_OF_SIDE=4;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public int getNumberofSide() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double computerPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}


}
