package ds.generics;

public class GenericMethod_Ex_4 {
	public static void main(String[] args) {
		
		Integer[] integers = {1,2,3,4,5};
		String[] strings = {"Florida", "New York", "California"};
		
		GenericMethod_Ex_4.<Integer>print(integers);
		GenericMethod_Ex_4.<String>print(strings);
		
	}
	
	public static <E> void print(E[] list) {
		for (var element : list) {
			System.out.println(element + " ");
		}
	}

}
