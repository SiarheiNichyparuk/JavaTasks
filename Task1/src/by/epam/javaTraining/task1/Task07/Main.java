package Task07;

import java.io.IOException;

//Составить программу для вычисления значений функции  F(x) на отрезке [а, b]
//с шагом h. Результат представить в виде таблицы, первый столбец которой
//– значения  аргумента, второй - соот¬ветствующие значения функции

public class Main {

	public static void main(String[] args)
			throws ArrayIndexOutOfBoundsException, NumberFormatException,
			IOException {

		double a = 2.0;
		double b = 40.0;
		double h = 2.0;
		Func f = new Func();
		System.out.println("\t x \t\t\t F(x)");
		f.show(f.calculationFunction(a, b, h));
	}

}
