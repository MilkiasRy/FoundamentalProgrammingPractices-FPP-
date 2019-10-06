package lab4_5;

public interface Polygon {
	public double[] getArrayofSide();
    static double sum(double[]arr) {
    	double sum=0;
    	for(double side:arr) {
    		sum+=side;
    	}
		return sum;
	}
	default double computePerimeter() {
		return  sum(this.getArrayofSide());
		
	}
	

}
