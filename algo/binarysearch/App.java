package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {12,15,25,65,95,112,256,512}, 13));

	}

	public static int binarySearch(int[] a, int x) {

		int p = 0; // First slot of the array
		int r = a.length - 1; // Last slot of the array

		while (p <= r) {

			int q = (p + r) / 2; // Find the midpoint of the array

			if (x < a[q]) {
				r = q - 1; // Change the midpoint (Eliminate a half of the array)
			} else if (x > a[q]) {
				p = q + 1;
			} else
				return q;
		} // End while

		return -1; // Could not find x in the given array
	}

}
