package extra;

public class Bear {
	String favoriteFood;
	String name;

	Bear(String favoriteFood, String name) {
		this.favoriteFood = favoriteFood;
		this.name = name;
	}

	void eat() {
		System.out.println(name + " is eating " + favoriteFood);
	}

	void sleep() {
		System.out.println(name + " goes to bed");
	}

	public static void main(String[] args) {
		String name = "Billy";
		String favoriteFood = "fish";
		Bear Billy = new Bear(favoriteFood, name);
		Bear bob = new Bear("tacos", "bob");
		Billy.sleep();
		Billy.eat();
		bob.eat();

	}

}
