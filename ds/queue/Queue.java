package ds.queue;

public class Queue {
	
	private int maxSize;	// Initializes the set number of slots
	private long[] queArray; 	// Slots to main the data
	private int front;	// This will be the index position for the element in the front
	private int rear;	// Going to be the index position for the element at the back of the line
	private int counter;	// Counter to maintain the number of items in our queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front  = 0; // Index position of the first slot of the array
		rear = -1; // There is not item in the array yet to be considered as the last item
		counter = 0; // We don't have element in the array yet
	}
	
	public void insert(long j) {
		if (rear == (maxSize - 1)) // Override 
			rear = -1;

		rear++;
		queArray[rear] = j;
		counter++;
		
	}
	
	public long remove() {	// Remove item from the front of the queue
		if (isEmpty()) {
			System.out.println("No element is queue to remove.");
			return -1;
		} else {
		long temp = queArray[front];
		front++;
		if (front == maxSize) {
			front = 0 ;
		}
		counter--;
		return temp;
		}
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (counter == 0);
	}
	
	public boolean isFull() {
		return (counter == maxSize);
	}
	
	public void view() {
		System.out.print("[ ");
		for (int i = 0 ; i < queArray.length ; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.print("]");
	}
	
	
	
	

}
