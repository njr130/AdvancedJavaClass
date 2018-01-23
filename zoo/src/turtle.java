
public class turtle extends Animal{

	@Override
	public void growOlder() {
		this.age++;
		this.lifespan++;
	}
	
	public void move() {
		this.pos[0]++;
	}
	
}
