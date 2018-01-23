import java.util.ArrayList;
import java.util.Random;

public class Bobcat extends Mammal {
	public Bobcat() {
		int legs = 4;
		int eyes = 2;
		String food = "meat"; //plant or meat
		boolean isFemale = true;
		double age = 0;
		double lifespan = 12;	
	}
	
	public ArrayList<Rabbit> eat(ArrayList<Rabbit> r) {
		Random rand = new Random();
		r.remove(rand.nextInt(r.size()));
		
		return r;
	}
		
	public Bobcat reproduce() {
		return new Bobcat();
	}
}

