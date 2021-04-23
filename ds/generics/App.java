package ds.generics;

public class App {
	public static void main(String[] args) {
		
		// Example 2
		GenericStack_Ex_2<String> stack1 = new GenericStack_Ex_2<>();
		System.out.println("Example 2: \n");
		stack1.push("Red");
		stack1.push("Blue");
		stack1.push("Black");
		System.out.println(stack1.toString());
		
		GenericStack_Ex_2<Integer> stack2 = new GenericStack_Ex_2<>();
		stack2.push(2);
		stack2.push(3);
		stack2.push(9);
		System.out.println(stack2.toString());
		
		// Example 3
		Generic_Ex_3<Double, String> example3 = new Generic_Ex_3<>();
		System.out.println("\nExample 3: \n");
		System.out.println(example3.type(1.5, "Amir"));
		
		
	}

}
