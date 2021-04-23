package ds.heap;

public class MaxHeap {

	private Node[] heapArray;
	private int maxSize; // size of the array
	private int currentSize; // Number of node in the array

	public MaxHeap(int size) {
		this.maxSize = size;
		currentSize = 0;
		this.heapArray = new Node[size]; // Create the array
	}

	public int getSize() {
		return currentSize;
	}

	public boolean isEmpty() {
		return (currentSize == 0);
	}

	public boolean insert(int key) {
		if (currentSize == maxSize) { // If array is full
			return false;
		}
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode; // Adding the node
		trickleUp(currentSize); // Move up the node -- Look at method for more details
		currentSize++; // Increase the current size of the heap
		return true;
	}

	public void trickleUp(int index) {
		int parentIndex = (index - 1) / 2; // Using (n-1)/2 formula to find the parent

		Node nodeToInsert = heapArray[index];

		// Loop as long as we haven't reached the root and key of nodeToInsert's parent
		// is less than new node
		while (index > 0 && heapArray[parentIndex].getKey() < nodeToInsert.getKey()) {
			heapArray[index] = heapArray[parentIndex]; // Move the parent down
			index = parentIndex;
			parentIndex = (parentIndex - 1) / 2; // Move up
		}
		heapArray[index] = nodeToInsert;
	}

	public Node remove() {
		Node root = heapArray[0];
		currentSize--;
		heapArray[0] = heapArray[currentSize];

		trickleDown(0);

		return root;
	}

	private void trickleDown(int index) {

		int largerChildIndex;

		Node top = heapArray[index]; // Save last node into top variable

		// Will run as long as index is not on the bottom row (At least one child)
		while (index < currentSize / 2) {
			int leftChildIndex = (2 * index) + 1; // Left child index position
			int rightChildIndex = (2 * index) + 2; // Right child index position

			// Figure out which child is larger
			if (rightChildIndex < currentSize
					&& heapArray[leftChildIndex].getKey() < heapArray[rightChildIndex].getKey()) {
				largerChildIndex = rightChildIndex;
			} else {
				largerChildIndex = leftChildIndex;
			}
			if (top.getKey() >= heapArray[largerChildIndex].getKey()) {
				// Successfully made root the largset key
				break;
			}

			heapArray[index] = heapArray[largerChildIndex];
			index = largerChildIndex; // Go down
		}

		heapArray[index] = top;
	}

	public void displayHeap() {
		System.out.println("Heap Array: ");
		for (int m = 0; m < currentSize; m++) {
			if (heapArray[m] != null) {
				System.out.print(heapArray[m].getKey() + " ");
			}
			System.out.println();

			int nBlanks = 32;
			int itemsPerRow = 1;
			int column = 0;
			int j = 0; // current item

			String dots = "...............................";
			System.out.println(dots + dots);
			while (currentSize > 0) {
				if (column == 0) {
					for (int k = 0; k < nBlanks; k++) {
						System.out.print(" ");
					}
				}
				System.out.print(heapArray[j].getKey());
				j++;
				if (j == currentSize) {
					break;
				}

				column++;
				// end of row
				if (column == itemsPerRow) {
					nBlanks = nBlanks / 2; // half the blanks
					itemsPerRow = itemsPerRow * 2; // twice the items
					column = 0;
					System.out.println();
				} else {
					for (int k = 0; k < nBlanks * 2; k++) {
						System.out.print(" ");
					}
				}

			}
			System.out.println("\n" + dots + dots);
		}

	}

}
