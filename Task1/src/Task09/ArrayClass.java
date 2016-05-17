package Task09;

//9. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.

public class ArrayClass {

	public double[] joinArrays(double[] array1, double[] array2, int k) {

		double[] resultArray = new double[array1.length + array2.length];
		for (int i = 0; i < k; i++) {
			resultArray[i] = array1[i];
		}
		for (int i = k; i < (k + array2.length); i++) {
			resultArray[i] = array2[i - k];
		}
		for (int i = (k + array2.length); i < (array1.length + array2.length); i++) {
			resultArray[i] = array1[i - array2.length];
		}
		return resultArray;
	}

	public void printArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
}
