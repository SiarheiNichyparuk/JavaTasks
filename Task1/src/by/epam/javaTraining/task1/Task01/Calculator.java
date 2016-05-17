package Task01;

//1. Составить линейную программу, печатающую значение true, если указанное
// высказывание является истинным, и false — в противном случае:
// Сумма двух первых цифр заданного четырехзначного числа
// равна сумме двух его последних цифр.
public class Calculator {

	public static boolean Calculation(String number) { // Checking of sum

		number = number.replaceAll("[\\-\\+\\.,]", "");
		if ((int) number.charAt(0) + (int) number.charAt(1) == (int) number
				.charAt(2) + (int) number.charAt(3)) {

			return true;

		} else {
			return false;
		}

	}

}
