package algo.linearsearch;

public class App {
	public static void main(String[] args) {
		
		int[] array = {1,2,45,65,3,23,90};
		
		LinearSearch linearSearch = new LinearSearch();
		int result = linearSearch.search(array, 12);
		
		
		if (result == -1) {
			System.out.print("Could not find");
		}else {
			System.out.print("Found at index " + result);
		}
		
	}

}
