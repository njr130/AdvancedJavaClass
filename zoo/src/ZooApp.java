
public class ZooApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Zoo z = new Zoo();
		int x = 0;
		while (x < 20) {
			z.advance();
			x++;
			Thread.sleep(1000);
		}
	}

}
