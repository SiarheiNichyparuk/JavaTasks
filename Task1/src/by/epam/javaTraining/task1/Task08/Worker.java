package Task08;

//8. В массив A [N] занесены натуральные числа. 
//Найти сумму тех элементов, которые кратны данному К.

public class Worker {
	private static double sum;

	public static double counting(double[] mass, double k) {
		sum = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % k == 0) {
				sum = sum + mass[i];
			}
		}
		return sum;
	}
}
