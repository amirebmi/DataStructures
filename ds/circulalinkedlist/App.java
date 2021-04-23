package ds.circulalinkedlist;

public class App {

	public static void main(String[] args) {
		
		CircularLinkedList myList = new CircularLinkedList();
		
		myList.insertHead(100);
		myList.insertHead(50);
		myList.insertHead(99);
		myList.insertHead(88);
		myList.insertTail(999999);
		
		myList.displayList();
	}

}
