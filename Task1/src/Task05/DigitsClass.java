package Task05;

//5. Даны три действительных числа. Возвести в квадрат те из них, 
//значения которых неотрицательны, и в четвертую степень — отрицательные.

public class DigitsClass {

	public static double[] calcArray(double[] num) {
		double res[] = new double[num.length];
		for (int i = 0; i < num.length; i++) {
			res[i] = executePow(num[i]);
		}
		return res;
	}

	public static double executePow(double a) {
		if (a >= 0) {
			return Math.pow(a, 2);
		}
		return Math.pow(a, 4);
	}
}
