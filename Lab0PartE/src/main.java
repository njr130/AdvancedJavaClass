
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		while (x!=1) {
			for (int looper = x-1; looper > 0; looper--) {
				if (looper == 1) {
					System.out.println(x+" is a prime number.");
					break;
				} else if (x%looper == 0) {
					System.out.println(x+" is not a prime number.");
					break;
				}
			}
			x--;
		}
		System.out.println(x+" is a prime number.");
	}

}
