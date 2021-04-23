package algo.recursivebinarysearch;

public class App {

	public static void main(String[] args) {

		System.out.println(recursiveBinarySearch(new int[] { 2, 9, 12, 19, 36, 65, 85, 99, 110 }, 0, 8, 85));

	}

	public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
		System.out.println("[ " + p + "..." + r + " ]");
		if (p > r) {
			return -1;
		} else {
			int q = (p + r) / 2; // Find the midpoint of the array
			if (a[q] == x) {
				return q;
			} else if (a[q] > x) {
				return recursiveBinarySearch(a, p, q - 1, x); // Change the midpoint (Eliminate a half of the array)
			} else {
				return recursiveBinarySearch(a, q + 1, r, x);
			}
		}

	}

}
