package ds.stack.homework;

public class Stack {

	private int maxSize;
	private char[] stackArray;
	private int top; // IMPORTANT *top is a pointer to the array

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1; // index position of the stack
	}

	public void push(char j) {
		if (isFull()) {
			System.out.println("Stack is full.");
		} else {
			top++; // Remember, top is at -1, so when it's incremented, it becomes 0 (The array
					// starting point)
			stackArray[top] = j; // Put the value which was passed in push
		}
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return '0';
		} else {
			int oldTop = top; // Give oldTop the current index position
			top--;
			return stackArray[oldTop]; // Return the value of oldTop
		}
	}

	public char peak() {
		return stackArray[top]; // Return the last item that was placed on the stack
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top); // Return whether maxSize becomes equal to top
	}
}
