package algo.selectionSort; 

public class App {

	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] {25,47,3,19,8,18});
		
		for (int number : myArray) {
			System.out.print( number + " ");
		}

	}
	
	
	public static int[] selectionSort(int[] array) {
		for (int i = 0 ; i < array.length ; i++) {
			int minimum = i;
			for (int j = i + 1 ; j < array.length ; j++) {
				if (array[j] < array[minimum]) {	// if we find a smaller value
					minimum = j;
				}
			}
			int temp = array[i];
			array[i] = array[minimum];
			array[minimum] = temp;
		}
		return array;
	}

}
