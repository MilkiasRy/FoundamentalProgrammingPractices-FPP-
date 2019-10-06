package lab4_5;



public class Square implements Polygon {
	private final double side;
	
	
	public Square(double side){
		this.side = side;
		
	}

	@Override
	public double[] getArrayofSide() {
		// TODO Auto-generated method stub
		double[] sides= {side,side,side,side};
		return sides;
	}

}
	
	



