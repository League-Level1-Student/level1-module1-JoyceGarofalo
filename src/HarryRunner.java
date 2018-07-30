
public class HarryRunner {
	public static void main(String[] args) {
		// Create a HarryRunner class with a main method that:
		// 1. makes harry potter
		HarryPotter harry = new HarryPotter();
		// 2. become invisible
		harry.makeInvisible(true);
		// 3. spy on Professor Snape
		harry.spyOnSnape();
		// 4. become visible again
		harry.makeInvisible(false);
		// 5. cast a “stupefy” spell
		harry.castSpell("stupefy");

	}
}
