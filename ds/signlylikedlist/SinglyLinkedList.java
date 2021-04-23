package ds.signlylikedlist;

/*
 * Single directional linkedList. 
 * It only knows about its next Node
 * It cannot go backwards
 */

public class SinglyLinkedList {

	private Node first;

	public SinglyLinkedList() {

	}

	public boolean isEmpty() {
		return (first == null);
	}

	// Used to insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node(); // Create a new Node
		newNode.data = data; // Assign the new Node the data that is being passed to this method
		newNode.next = first; // newNode next field needs to be old first. It should point to the old first
		first = newNode; // Make the first field
	}

	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("List (first -- > last) ");
		Node currentNode = first;
		while (currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public void insertLast(int data) {

		Node current = first;
		while (current.next != null) {
			current = current.next; // We'll loop until current.next is NULL
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
}
