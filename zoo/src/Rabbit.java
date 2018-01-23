
public class Rabbit extends Mammal{
	public Rabbit() {
		int legs = 4;
		int eyes = 2;
		String food = "plant"; //plant or meat
		boolean isFemale = true;
		double age = 0;
		double lifespan = 3;
		offspring = 2;
	}
	
	public Rabbit reproduce() {
		
		return new Rabbit();
	}
}
