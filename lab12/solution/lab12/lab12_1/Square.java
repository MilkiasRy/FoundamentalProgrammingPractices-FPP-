package lab12_1;

public class Square extends ClosedCurve {
	double side;
	public Square(int i) throws IllegalClosedCurveException {
		if(i<0)throw new IllegalClosedCurveException(" side of the square can not be negative");
		this.side=i;
	}
	
	double computeArea() {
		return(side*side);
	}

}
