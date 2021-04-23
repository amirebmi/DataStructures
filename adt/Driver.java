package adt;

public class Driver {
	
	public static void main(String[] args) {
	
	Counter counter1 = new Counter("Amir");
	
	counter1.increment();
	counter1.increment();
	counter1.increment();
	counter1.increment();
	
	System.out.println(counter1.getCurrentValue());
	


	}
}
