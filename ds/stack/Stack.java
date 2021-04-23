package ds.stack;

public class Stack {

	private int maxSize;
	private long[] stackArray;
	private int top; // IMPORTANT *top is a pointer to the array

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1; // index position of the stack
	}

	public void push(long j) {
		if (isFull()) {
			System.out.println("Stack is full.");
		} else {
			top++; // Remember, top is at -1, so when it's incremented, it becomes 0 (The array
					// starting point)
			stackArray[top] = j; // Put the value which was passed in push
		}
	}

	public long pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return -1;
		} else {
			int oldTop = top; // Give oldTop the current index position
			top--;	// Then reduce the pointer
			return stackArray[oldTop]; // Return the value of oldTop
		}
	}

	public long peak() {
		return stackArray[top]; // Return the last item that was placed on the stack
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top); // Return whether maxSize becomes equal to top
	}
}
