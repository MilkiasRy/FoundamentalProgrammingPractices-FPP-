package lab4_2;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		ClosedCurve[] obj= {new Triangle(4,5,6),new Square(3),new Rectangle(3,7),new Circle(3)};
		for(ClosedCurve x:obj) {
		System.out.println("The area of closed curve is:"+x.getClass().getName()+"is "+x.computeArea());
		
		
	}

	}}
