package Task05;

//5. Даны три действительных числа. Возвести в квадрат те из них, 
//значения которых неотрицательны, и в четвертую степень — отрицательные.

public class Main {

	public static void main(String[] args) {

		double[] num = { 2, 0, -2.5 };
		for (double k : DigitsClass.calcArray(num)) {
			System.out.println(k);
		}

	}
}
