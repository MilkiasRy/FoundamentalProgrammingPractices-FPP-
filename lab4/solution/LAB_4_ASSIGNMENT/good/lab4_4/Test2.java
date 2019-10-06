package good.lab4_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2 {

	@Test
	void test() {
		Polygon[] polyogn= {new Rectangle(3,4),new Triangle(4,5,6),new Square(3)};
		for(Polygon x:polyogn) {
			String side=String.format("For this %s\n  ",x.getClass().getSimpleName());
			side+=String.format(" Number sides =%d\n ",x.getNumberofSide());
			side+=String.format("Perimeter =%.2f\n  ",x.computerPerimeter());
			System.out.println(side);
			
			
		}
	}

}
