package Task03;

//3. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.

public class Triangle {

	private static double square;
	private static double perimeter;

	public static double calculateSquare(double a, double b) {
		square = (a * b) / 2;
		return square;
	}

	public static double calculatePerimeter(double a, double b) {
		perimeter = (a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
		return perimeter;
	}

}
