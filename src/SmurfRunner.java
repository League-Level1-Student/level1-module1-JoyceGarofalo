
public class SmurfRunner {
	/*
	 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g 2.
	 * In a Runner class, make a Handy Smurf. Use the methods below to make him eat,
	 * and print his name. 3&4 see comments in code below 5. Make a Papa Smurf and
	 * print his name, hat color and girl or boy. 6. Make a Smurfette and print her
	 * name, hat color and girl or boy.
	 */
	public static void main(String[] args) {
		Smurf Handy = new Smurf("Handy");
		System.out.println(Handy.getName());
		Handy.eat();
		Smurf Papa = new Smurf("Papa");
		System.out.println(Papa.getName());
		Papa.getHatColor();
		Papa.isGirlOrBoy();
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName());
		Smurfette.getHatColor();
		Smurfette.isGirlOrBoy();
	}
}
