import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci run = new Fibonacci();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the fibonacci number that you want: ");
		run.calc(scan.nextInt());
		
	}

}
