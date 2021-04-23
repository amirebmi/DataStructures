package algo.quicksort;

public class App_String_Sort {

	public static void main(String[] args) {

		String string = "Amir Ebrahimi";

		String name = string.toLowerCase();

		int length = name.length();

		char[] chars = new char[length];

		for (int i = 0; i < length; i++) {
			chars[i] = name.charAt(i);
		}

		quickSort(chars, 0, chars.length - 1);

		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}

	}

	public static void quickSort(char[] array, int start, int end) {
		if (start < end) {
			int partitionPoint = partition(array, start, end);
			quickSort(array, start, (partitionPoint - 1));
			quickSort(array, (partitionPoint + 1), end);
		}
	}

	public static int partition(char[] array, int start, int end) {

		char pivot = array[end];
		int i = start - 1;

		for (int j = start; j <= end - 1; j++) {
			if (array[j] <= pivot) {
				i++;
				char iValue = array[i];
				char jValue = array[j];
				array[i] = jValue;
				array[j] = iValue;
			}
		}

		char iValue = array[i + 1];
		array[end] = iValue;
		array[i + 1] = pivot;

		return i + 1;

	}

}
