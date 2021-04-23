package ds.circulalinkedlist;

public class CircularLinkedList {

	private Node head;
	private Node tail;

	public CircularLinkedList() {
		head = null;
		tail = null;
	}

	private boolean isEmpty() {
		return (head == null);
	}

	public void insertHead(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			tail = newNode;	// We assign the end of the list to be the one and only Node that we just created
		}
		
		// Make next of new Node as head
		newNode.next = head; // newNode's next field should reference whatever old head was referencing 
		head = newNode; // head place
		
	}

	public void insertTail(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode; // The next value of the tail node will point to the new node
			tail = newNode; // We make the new node we created be the tail one in the list
		}
	}

	public int deletehead() {
		int temp = head.data;

		if (head.next == null) {
			tail = null;
		}

		head = head.next; // head will point to old's next value
		return temp;
	}

	public void displayList() {
		System.out.println("List (head -- > tail) ");
		Node currentNode = head;
		while (currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		System.out.println();
	}

}
