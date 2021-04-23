package algo.mergesort;

import java.util.Scanner;

public class App {

	// Driver method
	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");

		int size = input.nextInt();

		int[] array = new int[size];

		// Generate random array
		for (int i = 0; i < size; i++) {

			int random = (int) (Math.random() * 100);

			array[i] = random;
		}

		// Display the unsorted array
		System.out.println("Before merge sort: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// Sort the array
		App mergeSort = new App();
		mergeSort.sort(array, 0, array.length - 1);

		// Display the sorted array
		System.out.println("\nSorted array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public void mergeSort(int array[], int p, int q, int r) {

		int n1 = q - p + 1;
		int n2 = r - q;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = array[p + i];
		for (int j = 0; j < n2; ++j)
			R[j] = array[q + 1 + j];

		int i = 0, j = 0;

		int k = p;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}

	public void sort(int arr[], int p, int r) {

		if (p < r) {

			int m = (p + r) / 2;

			sort(arr, p, m);
			sort(arr, m + 1, r);

			mergeSort(arr, p, m, r);
		}
	}

}