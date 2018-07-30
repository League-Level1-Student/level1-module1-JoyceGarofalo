
public class CatRunner {
	public static void main(String[] args) {

		// Create a CatRunner class with a main method that creates a Cat object.
		Cat cat = new Cat("Max");
		// 1. Make the Cat meow
		cat.meow();
		// 2. Get the Cat to print it's name
		cat.printName();
		// 3. Kill the Cat!
		cat.kill();
	}
}
