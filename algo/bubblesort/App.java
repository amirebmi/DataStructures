package algo.bubblesort;

public class App {

	public static void main(String[] args) {
		int[] array = { 10, 1, 0, 6, 2, 3, 9 };

		bubbleSort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int[] bubbleSort(int[] array) {

		for (int i = 1; i < array.length; i++) { // Outer loop for number of passes
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}
