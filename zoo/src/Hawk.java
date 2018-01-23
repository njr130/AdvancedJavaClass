
public class Hawk extends Avian {

	
	public Hawk() {
		this.legs=2;
		this.eyes=2;
		
	}
	
	@Override
	public void move() {
		this.pos[0]= this.pos[0] + 5;
		this.pos[1]= this.pos[1] + 5;

	}

}
