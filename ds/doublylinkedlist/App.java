package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertHead(22);
		myList.insertHead(44);
		myList.insertHead(66);
		myList.insertTail(11);
		myList.insertTail(33);
		myList.insertTail(55);
		myList.deleteKey(55);
		myList.displayForward();
		myList.displayBackward();
		myList.deleteHead();
		myList.deleteTail();
		myList.deleteKey(11);
		myList.displayForward();
		myList.insertAfter(22, 77);
		myList.insertAfter(33, 88);
		myList.displayForward();
		

	}

}
