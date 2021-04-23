package algo.quicksort;

public class App {
	public static void main(String[] args) {

		int[] array = { 10, 1, 0, 6, 2, 3, 9 };

		quickSort(array, 0, array.length - 1);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int partitionPoint = partition(array, start, end); // Gives index position of the correctly placed pivot value
			quickSort(array, start, (partitionPoint - 1));  // Sorts the left half of the range
			quickSort(array, (partitionPoint + 1), end);  // Sorts the right half of the range
		}
	}

	public static int partition(int[] array, int start, int end) {

		int pivot = array[end];
		
		// In the first iteration, i starts from -1
		int i = start - 1;
		
		for (int j = start; j <= end - 1; j++) {
			if (array[j] <= pivot) {
				i++;
				// Swapping
				int iValue = array[i];
				int jValue = array[j];
				array[i] = jValue;
				array[j] = iValue;
			}
		}
		// Put the pivot value in the correct slot
		int iValue = array[i + 1];
		array[end] = iValue;
		array[i + 1] = pivot;

		return i + 1;

	}

}
