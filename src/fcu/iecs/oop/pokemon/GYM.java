package fcu.iecs.oop.pokemon;

public class GYM {

	public static void fight(Pokemon p1, Pokemon p2) {
		double temp;
		temp = (double) (Math.random());
		if (temp < 0.5) {
			System.out.printf("Winner is [name of  %s]",p1.getName());
			p1.setCp(500);
		} else if (temp > 0.5) {
			System.out.printf("Winner is [name of  %s]",p2.getName());
			p2.setCp(500);
		}
	}
	
}
