package prerequisiteOOP;

public class Earth {
	public static void main(String[] args) {
		
		Human tom;
		tom = new Human();
		tom.age = 5;
		tom.eyeColor = "brown";
		tom.heightInInches = 72;
		tom.name = "tom Zsabo";
		tom.speak();
		
		System.out.println();
		
		Human joe;
		joe = new Human();
		joe.name = "Tom Brandley";
		joe.age = 45;
		joe.eyeColor = "Red";
		joe.heightInInches = 190;
		joe.speak();
	}

}
