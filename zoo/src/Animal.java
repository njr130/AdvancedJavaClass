
public abstract class Animal {
	int legs;
	int eyes;
	String food; //plant or meat
	boolean isFemale;
	double age;
	double lifespan;
	int[] pos = {0,0};
	int offspring = 1;
	
	Animal(){
		isFemale = true;
		
	}
	
	public abstract void growOlder();
	
	
	public void move() {
		this.pos[0] = this.pos[0]-5;
	}
	
	public void eat() {
		
	}
	
}
