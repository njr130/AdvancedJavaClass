
public abstract class Avian extends Animal {

	@Override
	public void growOlder() {
		this.age++;

	}
	
	boolean canFly;
	
	public abstract void move();

}
