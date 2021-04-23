package ds.generics;

public class Generic_Ex_3<E, T> {
	
	public String type(E e, T t) {
		return e + " is a type of " + e.getClass().getName() + " and " + t + " is a type of " + t.getClass().getName();
	}

}
