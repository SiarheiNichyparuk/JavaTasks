package Task10;

import java.io.IOException;

//10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class MatrixClass {

	public int[][] createArray(int n) throws IOException {

		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					result[i][j] = j + 1;
				} else {
					result[i][j] = n - j;
				}
			}
		}
		return result;
	}

	public void show(int[][] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				System.out.print(mass[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}
