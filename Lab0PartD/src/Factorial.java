
public class Factorial {
	private int total = 1;
	
	public int Calc(int n) {
		if(n==1) {
			return n;
		}
		return n * Calc(n-1);
	}
}
