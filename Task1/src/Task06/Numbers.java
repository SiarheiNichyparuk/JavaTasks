package Task06;

//6. Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Numbers {

	public static double result;

	public static double checkNumbers(double a, double b, double c) {
		if (a > b && a > c && b < a && b < c) {
			result = a + b;
			System.out.println("Сумма большего и меньшего из трех чисел = "
					+ result);

		}
		if (a > b && a > c && c < a && c < b) {
			result = a + c;
			System.out.println("Сумма большего и меньшего из трех чисел = "
					+ result);
		}
		if (b > a && b > c && c < a && c < b) {
			result = b + c;
			System.out.println("Сумма большего и меньшего из трех чисел = "
					+ result);

		}
		if (b > a && b > c && a < b && a < c) {
			result = a + b;
			System.out.println("Сумма большего и меньшего из трех чисел = "
					+ result);

		}
		if (c > a && c > b && b < a && b < c) {
			result = b + c;
			System.out.println("Сумма большего и меньшего из трех чисел = "
					+ result);
		}
		if (c > a && c > b && a < b && a < c) {
			result = a + c;
			System.out.println("Сумма большего и меньшего из трех чисел = "
					+ result);

		}
		return result;
	}
}
