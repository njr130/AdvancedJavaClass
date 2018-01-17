import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number to use as the radius: ");
		double n = scan.nextDouble();
		double total = (4*Math.PI*Math.pow(n,3))/3;
		System.out.print(String.valueOf(total));
		System.out.print("is the volume of a sphere with that radius.");
	}

}
