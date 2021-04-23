package ds.linkedList;

public class App {

	public static void main(String[] args) {
		
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println(listLength(nodeA)); // 4 items in the node list
		System.out.println(listLength(nodeB)); // 3 items in the node list

	}
	
	public static int listLength(Node aNode) {
		int length = 0;
		Node currentNode = aNode;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}
	                      

}
