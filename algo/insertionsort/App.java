package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = insertionSort(new int[] { 25, 47, 3, 19, 8, 18 });

		for (int number : myArray) {
			System.out.print(number + " ");
		}
	}

	public static int[] insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int element = array[i]; // Element variable contains the data we intend on bringing over the sorted area
			int j = i - 1; // j variable points to the index position of the last value in the sorted area
			while (j >= 0 && array[j] > element) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = element;

		}

		return array;
	}

}
