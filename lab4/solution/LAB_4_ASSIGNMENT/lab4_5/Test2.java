package lab4_5;



public class Test2{
public static void main(String[]args) {
	Polygon[] polyogn= {new Rectangle(3,4),new Triangle(4,5,6),new Square(3)};
	for(Polygon x:polyogn) {
		String side=String.format("For this %s\n  ",x.getClass().getSimpleName());
		side+=String.format(" Number sides =%d\n ",x.getArrayofSide().length);
		side+=String.format("Perimeter =%.2f\n  ",x.computePerimeter());
		System.out.println(side);
		
		
	}
}
}
