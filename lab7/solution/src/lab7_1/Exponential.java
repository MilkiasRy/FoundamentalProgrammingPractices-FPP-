package Lab7.src.lab7_1;

public class Exponential {
	

		private static double power(double x, int n) {
			if (n == 0 || n == 1)
				return x;
			return x * power(x, n - 1);
		}

public static void main(String[] args) {

	System.out.println("the result: "+ power(2, 2 ));

}
}



