package Task07;

import java.io.IOException;

//Составить программу для вычисления значений функции  F(x) на отрезке [а, b]
//с шагом h. Результат представить в виде таблицы, первый столбец которой
//– значения  аргумента, второй - соот¬ветствующие значения функции

public class Func {

	public double[][] calculationFunction(double a, double b, double h)
			throws IOException {

		double[][] mass = new double[(int) ((b - a) / h) + 1][2];
		double x = a;
		int i = 0;
		while (x <= b) {
			mass[i][0] = x;
			mass[i][1] = calculation(x);
			x = x + h;
			i++;
		}
		return mass;
	}

	private static double calculation(double x) {
		return (Math.pow(Math.sin(x), 2) - Math.cos(2 * x));
	}

	public void show(double[][] mass1) {
		for (int i = 0; i < mass1.length; i++) {
			for (int j = 0; j < mass1[i].length; j++) {
				System.out.printf("%10f  ", mass1[i][j]);
			}
			System.out.print("\n");
		}
	}

}
