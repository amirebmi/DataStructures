package adt;

public class Counter {
	
	String str = "";
	int value;
	
	public Counter(String str) {
		this.str = str;
	}
	
	
	public void increment() {
		value++;
	}
	
	public int getCurrentValue() {
		
		return value;
		
	}
	
	public String toString() {
		return str + " : " + value;
	}

}
