package ds.doublylinkedlist;

public class DoublyLinkedList {

	private Node head;
	private Node tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void insertHead(int data) {
		Node newNode = new Node();
		newNode.data = data;

		// In if-else statement you define the place of the Node
		if (isEmpty()) {
			tail = newNode; // If empty, last will refer to the new Node being created
		} else {
			head.previous = newNode; // Existing head's previous field refer to NewNode
		}

		// You define the head of the list
		newNode.next = head; // You make newNode's next field as head
		this.head = newNode; // this.head refer to newNode
	}

	public void insertTail(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode; // Assigning old last to newNode
			newNode.previous = tail; // The old last will be newNode's previous field
		}

		this.tail = newNode; // Make the added tail as newNode
	}

	// Assume non-empty list
	public Node deleteHead() {
		Node temp = head;
		if (head.next == null) { // There is only one item in the list
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next; // We are assigning the reference of the Node following the old
							// first node to the first field in the linkedList object
		return temp; // Return the deleted old first Node
	}

	// Assume non-empty list
	public Node deleteTail() {
		Node temp = tail;

		if (head.next == null) { // We only have one Node in this list
			head = null;
		} else {
			tail.previous.next = null; // The last Node's previous Node's next field will point to null
		}
		tail = tail.previous;
		return temp;
	}

	// Assume non-empty list
	public boolean insertAfter(int key, int data) {
		Node current = head; // We start from the beginning of the list
		while (current.data != key) {
			current = current.next; // If it reaches to the key, it stops here. Then we we have
			if (current == null) {
				return false;
			}
		}
		Node newNode = new Node();
		newNode.data = data;

		// If the current Node is the last Node
		if (current == tail) {
			current.next = null; // Current's next field would be null
			tail = newNode; // Tail refers to newNode
		} else { // If the current Node is in the middle or somewhere else
			newNode.next = current.next; // newNode's next field should point to the Node ahead of the current one
			current.next.previous = newNode; // The node ahead of current, it's previous field should point to the
												// newNode
		}
		newNode.previous = current;
		current.next = newNode;

		return true;
	}

	// Assume non-empty list
	public Node deleteKey(int key) {
		Node current = head;
		while (head.data != key) {
			current = current.next;
			if (current == null) {
				return null;
			}
		}
		if (current == head) {
			head = current.next; // We make the first field point to the Node following current since current
									// will be deleted
		} else {
			current.previous.next = current.next;
		}

		if (current == tail) {
			tail = current.previous;
		} else {
			current.next.previous = current.previous;
		}

		return current;
	}

	public void displayForward() {
		System.out.println("List (head -- > tail) ");
		Node currentNode = head;
		while (currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public void displayBackward() {
		System.out.println("List (tail -- > head) ");
		Node currentNode = tail;
		while (currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.previous;
		}
		System.out.println();
	}
}
