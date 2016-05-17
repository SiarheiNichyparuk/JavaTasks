package Task02;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Calc {
	private static double result;

	public static double calculate(double a, double b, double c) {

		result = (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c
				+ pow(b, -2);

		return result;
	}

}
