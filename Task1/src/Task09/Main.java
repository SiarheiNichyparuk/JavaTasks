package Task09;

//9. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.

public class Main {

	public static void main(String[] args) {
		double[] array1 = { 1, 2, 3, 4, 5, 6 };
		double[] array2 = { 10, 25, 30, 35 };
		int n = 5;
		ArrayClass ac = new ArrayClass();
		System.out.println("array:");
		ac.printArray(ac.joinArrays(array1, array2, n));
	}
}
