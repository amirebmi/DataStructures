package ds.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericStack_Ex_2<E> {

	List<E> list = new ArrayList<>();

	public int getSize() {
		return list.size();
	}

	// Fetch the first elements of the stack - LIFO
	public E peek() {
		return list.get(getSize() - 1);
	}

	public void push(E o) {
		list.add(o);
	}

	// Remove the first element of the stack
	public E pop() {
		// The element that is going to be removed
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public String toString() {
		return "stack: " + list.toString();
	}

}
