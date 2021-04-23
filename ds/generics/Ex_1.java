package ds.generics;

import java.util.ArrayList;
import java.util.List;

public class Ex_1 {
	public static void main (String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(4);
		intList.add(22);
		intList.add(2);
		intList.add(32);
		intList.add(53);
		intList.add(27);
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("Red");
		stringList.add("Blue");
		stringList.add("Yellow");
		stringList.add("Black");
		
		// No need to cast since it's generic
		System.out.println(stringList.get(3));
		
		
	}
	

}
