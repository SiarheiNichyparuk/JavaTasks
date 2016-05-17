package Task10;

import java.io.IOException;

//10. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Main {

	public static void main(String[] args) throws IOException {
		int k = 8;
		MatrixClass mc = new MatrixClass();
		mc.show(mc.createArray(k));
	}

}
