package Task01;

public class Calculator {

	// 1. Составить линейную программу, печатающую значение true, если указанное
	// высказывание является истинным, и false — в противном случае:
	// Сумма двух первых цифр заданного четырехзначного числа
	// равна сумме двух его последних цифр.

	public int number = 2240; // Our four-digit number

	public int a, b, c, d;

	String s1 = "true";

	String s2 = "false";

	public void digitsSearching() { // Method for searching digits
		d = number % 10;
		// System.out.println(d);
		number = number / 10;
		c = number % 10;
		// System.out.println(c);
		number = number / 10;
		b = number % 10;
		// System.out.println(b);
		a = number / 10;
		// System.out.println(a);
	}

	public void Calculation() { // Checking of sum

		if (a + b == c + d) {

			System.out.println(s1); // true

		} else {
			System.out.println(s2);// false
		}

	}

}
