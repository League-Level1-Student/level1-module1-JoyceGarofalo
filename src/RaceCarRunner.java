
public class RaceCarRunner {
	int position;
	String damageType;

	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */

		// 1. Create a RaceCar and place it in 5th position
		RaceCar racecar = new RaceCar(damageType, position);
		// 2. Print the RaceCar's position in the race
		int position = 5;
		System.out.println("racecar is in place " + position);
		// 3. Crash the RaceCar
		racecar.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.

		// 5. Help the car move into first place.

	}
}
