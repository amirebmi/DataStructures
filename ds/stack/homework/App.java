package ds.stack.homework;

public class App {
	
	public static void main(String[] args) {
		
		String reverseString = reverseString("Hello");
		System.out.println(reverseString);
	}
	
	public static String reverseString(String str) {
		
		Stack theStack = new Stack(str.length());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0 ; i < str.length(); i++) {
			theStack.push(str.charAt(i));
		}
		while (!theStack.isEmpty()) {
			sb.append(theStack.pop());
		}
		return sb.toString();
	}

}
