package ds.breadthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Node {

	int data;
	boolean visited;
	List<Node> neighbors;

	public Node(int data) {
		this.data = data;
		this.neighbors = new ArrayList<>();
	}

	public void addNeighbor(Node neighborNode) {
		this.neighbors.add(neighborNode);
	}

	public List<Node> getNeighbors() {
		return neighbors;
	}

	public void setNeighbours(List<Node> neighbors) {
		this.neighbors = neighbors;
	}

}
