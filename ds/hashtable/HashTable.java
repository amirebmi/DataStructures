package ds.hashtable;

public class HashTable {

	String[] hashArray;
	int arraySize;
	int size = 0; // Counter for number of elements in the hash table

	public HashTable(int noOfSlots) {
		hashArray = new String[noOfSlots];
		arraySize = noOfSlots;

		if (isPrime(noOfSlots)) {
			hashArray = new String[noOfSlots];
			arraySize = noOfSlots;
		} else {
			int primeCount = getNextPrime(noOfSlots);
			hashArray = new String[primeCount];
			arraySize = noOfSlots;

			System.out.println("Hash table size give " + noOfSlots + " is not a prime!");
			System.out.println("Hash table size changed to  " + noOfSlots);
		}
	}

	private boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private int getNextPrime(int minNumber) {
		for (int i = minNumber; true; i++) {
			if (isPrime(i)) {
				return i;
			}
		}
	}

	// Return preferred index position
	private int hashFunc1(String word) {
		int hashVal = word.hashCode();
		hashVal %= arraySize;
		if (hashVal < 0) {
			hashVal += arraySize;
		}
		return hashVal; // ideal index position we'd like to insert or search in
	}

	// Return step size greater than 0
	private int hashFunc2(String word) {
		int hashVal = word.hashCode();
		hashVal %= arraySize;

		if (hashVal < 0) {
			hashVal += arraySize;
		}

		return 3 - hashVal % 3;
	}

	public void insert(String word) {
		int preferredIndex = hashFunc1(word);
		int stepSize = hashFunc2(word);

		while (hashArray[preferredIndex] != null) {
			preferredIndex += stepSize;
			preferredIndex %= arraySize;
		}

		hashArray[preferredIndex] = word;

		System.out.println("Inserted word: " + word);
		size++;
	}

	public String find(String word) {
		int preferredIndex = hashFunc1(word);
		int stepSize = hashFunc2(word);

		while (hashArray[preferredIndex] != null) {

			if (hashArray[preferredIndex].equals(word)) {
				return hashArray[preferredIndex];
			}
			preferredIndex += stepSize;
			preferredIndex %= arraySize;
		}
		return hashArray[preferredIndex];
	}
	
	public void displayTable() {
		System.out.println("Table: ");
		
		for (int i = 0 ; i < arraySize; i++) {
			if (hashArray[i] != null) {
				System.out.print(hashArray[i] + " ");
			}else {
				System.out.print("** ");
			}
			System.out.println("");
		}
	}

}
